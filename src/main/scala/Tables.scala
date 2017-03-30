import slick.jdbc.PostgresProfile.api._
import slick.lifted.{ProvenShape, ForeignKeyQuery}

// A Suppliers table with 6 columns: id, name, street, city, state, zip
class Suppliers(tag: Tag)
  extends Table[(Int, String, String, String, String, String)](tag, "suppliers") {

  // This is the primary key column:
  def id: Rep[Int] = column[Int]("SUP_ID", O.PrimaryKey)
  def name: Rep[String] = column[String]("sup_name")
  def street: Rep[String] = column[String]("street")
  def city: Rep[String] = column[String]("city")
  def state: Rep[String] = column[String]("state")
  def zip: Rep[String] = column[String]("zip")
  
  // Every table needs a * projection with the same type as the table's type parameter
  def * : ProvenShape[(Int, String, String, String, String, String)] =
    (id, name, street, city, state, zip)
}

// A Coffees table with 5 columns: name, supplier id, price, sales, total
class Coffees(tag: Tag)
  extends Table[(String, Int, Int, Int, Int)](tag, "coffees") {

  def name: Rep[String] = column[String]("cof_name", O.PrimaryKey)
  def supID: Rep[Int] = column[Int]("sup_id")
  def price: Rep[Int] = column[Int]("price")
  def sales: Rep[Int] = column[Int]("sales")
  def total: Rep[Int] = column[Int]("total")

  def * : ProvenShape[(String, Int, Int, Int, Int)] =
    (name, supID, price, sales, total)
}
