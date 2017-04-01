import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

object CaseClassMapping extends App {

  // the base query for the Users table
  val users = TableQuery[Users]

  val db = Database.forConfig("h2mem1")
  try {
    Await.result(db.run(DBIO.seq(
      // create the schema
      users.schema.create,

      // insert two User instances
      users += User(Some("John Doe")),
      users += User(Some("John Doe"), Some(100)),
      users += User(),

      // print the users (select * from USERS)
      users.result.map(println)
    )), Duration.Inf)
  } finally db.close
}

case class User(name: Option[String] = None,
                id: Option[Int] = None)

class Users(tag: Tag) extends Table[User](tag, "users") {
  // Auto Increment the id primary key column
  def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  // The name can't be null
  def name = column[Option[String]]("name")
  // the * projection (e.g. select * ...) auto-transforms the tupled
  // column values to / from a User
  def * = (name, id.?) <> (User.tupled, User.unapply)
}
