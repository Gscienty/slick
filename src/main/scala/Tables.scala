import slick.jdbc.PostgresProfile.api._

// A Suppliers table with 6 columns: id, name, street, city, state, zip
class Suppliers(tag: Tag)
  extends Table[(Int, String, String, String, String, String)](tag, "suppliers") {

  // This is the primary key column:
  def id = column[Int]("sup_id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("sup_name")
  def street = column[String]("street")
  def city = column[String]("city")
  def state = column[String]("state")
  def zip = column[String]("zip")
  // Every table needs a * projection with the same type as the table's type parameter
  def * = (id, name, street, city, state, zip)
}

// A Coffees table with 5 columns: name, supplier id, price, sales, total
class Coffees(tag: Tag)
  extends Table[(String, Int, Double, Int, Int)](tag, "coffees") {

  def name = column[String]("cof_name", O.PrimaryKey)
  def supID = column[Int]("sup_id")
  def price = column[Double]("price")
  def sales = column[Int]("sales")
  def total = column[Int]("total")

  def * = (name, supID, price, sales, total)
}


