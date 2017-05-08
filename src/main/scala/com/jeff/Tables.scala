package com.jeff

import java.sql.Timestamp
import java.util.{Date, UUID}
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.PostgresProfile
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile

  import profile.api._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(McAccount.schema, McAccountHobby.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0") def ddl = schema

  /** Entity class storing rows of table McAccount
    *
    * @param id                 Database column id SqlType(bigserial), AutoInc, PrimaryKey
    * @param createTime         Database column create_time SqlType(timestamp)
    * @param realName           Database column real_name SqlType(varchar), Length(100,true)
    * @param password           Database column password SqlType(varchar), Length(200,true)
    * @param nickName           Database column nick_name SqlType(varchar), Length(100,true)
    * @param mobile             Database column mobile SqlType(varchar), Length(100,true), Default(None)
    * @param born               Database column born SqlType(date), Default(None)
    * @param address            Database column address SqlType(varchar), Length(200,true), Default(None)
    * @param gender             Database column gender SqlType(varchar), Length(10,true), Default(None)
    * @param email              Database column email SqlType(varchar), Length(100,true), Default(None)
    * @param occupation         Database column occupation SqlType(varchar), Length(20,true), Default(None)
    * @param portrait           Database column portrait SqlType(varchar), Length(200,true), Default(None)
    * @param `type`             Database column type SqlType(varchar), Length(20,true), Default(None)
    * @param userName           Database column user_name SqlType(varchar), Length(100,true), Default(None)
    * @param userStatus         Database column user_status SqlType(varchar), Length(256,true), Default(None)
    * @param comments           Database column comments SqlType(text), Default(None)
    * @param uid                Database column uid SqlType(uuid)
    * @param statusUpdateReason Database column status_update_reason SqlType(varchar), Length(200,true), Default(None)
    * @param mobileStatus       Database column mobile_status SqlType(varchar), Length(64,true), Default(None)
    * @param passwordModifyDate Database column password_modify_date SqlType(timestamp), Default(None) */
  final case class McAccountRow(id: Long = 0,
                                createTime: Option[java.sql.Timestamp] = Some(new Timestamp(new Date().getTime)),
                                realName: String,
                                password: String,
                                nickName: String,
                                mobile: Option[String] = None,
                                born: Option[java.sql.Date] = None,
                                address: Option[String] = None,
                                gender: Option[String] = None,
                                email: Option[String] = None,
                                occupation: Option[String] = None,
                                portrait: Option[String] = None,
                                `type`: Option[String] = None,
                                userName: Option[String] = None,
                                userStatus: Option[String] = None,
                                comments: Option[String] = None,
                                uid: java.util.UUID = UUID.randomUUID,
                                statusUpdateReason: Option[String] = None,
                                mobileStatus: Option[String] = None,
                                passwordModifyDate: Option[java.sql.Timestamp] = None)

  /** GetResult implicit for fetching McAccountRow objects using plain SQL queries */
  implicit def GetResultMcAccountRow(implicit e0: GR[Long],
                                     e1: GR[Option[java.sql.Timestamp]],
                                     e2: GR[String],
                                     e3: GR[Option[String]],
                                     e4: GR[Option[java.sql.Date]],
                                     e5: GR[java.util.UUID]): GR[McAccountRow] = GR { prs =>
    import prs._
    McAccountRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Date], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.util.UUID], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }

  /** Table description of table mc_account. Objects of this class serve as prototypes for rows in queries.
    * NOTE: The following names collided with Scala keywords and were escaped: type */
  class McAccount(_tableTag: Tag) extends profile.api.Table[McAccountRow](_tableTag, "mc_account") {
    def * = (id, createTime, realName, password, nickName, mobile, born, address, gender, email, occupation, portrait, `type`, userName, userStatus, comments, uid, statusUpdateReason, mobileStatus, passwordModifyDate) <> (McAccountRow.tupled, McAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(realName), Rep.Some(password), Rep.Some(nickName), mobile, born, address, gender, email, occupation, portrait, `type`, userName, userStatus, comments, Rep.Some(uid), statusUpdateReason, mobileStatus, passwordModifyDate).shaped.<>({ r => import r._; _1.map(_ => McAccountRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17.get, _18, _19, _20))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column real_name SqlType(varchar), Length(100,true) */
    val realName: Rep[String] = column[String]("real_name", O.Length(100, varying = true))
    /** Database column password SqlType(varchar), Length(200,true) */
    val password: Rep[String] = column[String]("password", O.Length(200, varying = true))
    /** Database column nick_name SqlType(varchar), Length(100,true) */
    val nickName: Rep[String] = column[String]("nick_name", O.Length(100, varying = true))
    /** Database column mobile SqlType(varchar), Length(100,true), Default(None) */
    val mobile: Rep[Option[String]] = column[Option[String]]("mobile", O.Length(100, varying = true), O.Default(None))
    /** Database column born SqlType(date), Default(None) */
    val born: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("born", O.Default(None))
    /** Database column address SqlType(varchar), Length(200,true), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(200, varying = true), O.Default(None))
    /** Database column gender SqlType(varchar), Length(10,true), Default(None) */
    val gender: Rep[Option[String]] = column[Option[String]]("gender", O.Length(10, varying = true), O.Default(None))
    /** Database column email SqlType(varchar), Length(100,true), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Length(100, varying = true), O.Default(None))
    /** Database column occupation SqlType(varchar), Length(20,true), Default(None) */
    val occupation: Rep[Option[String]] = column[Option[String]]("occupation", O.Length(20, varying = true), O.Default(None))
    /** Database column portrait SqlType(varchar), Length(200,true), Default(None) */
    val portrait: Rep[Option[String]] = column[Option[String]]("portrait", O.Length(200, varying = true), O.Default(None))
    /** Database column type SqlType(varchar), Length(20,true), Default(None)
      * NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[String]] = column[Option[String]]("type", O.Length(20, varying = true), O.Default(None))
    /** Database column user_name SqlType(varchar), Length(100,true), Default(None) */
    val userName: Rep[Option[String]] = column[Option[String]]("user_name", O.Length(100, varying = true), O.Default(None))
    /** Database column user_status SqlType(varchar), Length(256,true), Default(None) */
    val userStatus: Rep[Option[String]] = column[Option[String]]("user_status", O.Length(256, varying = true), O.Default(None))
    /** Database column comments SqlType(text), Default(None) */
    val comments: Rep[Option[String]] = column[Option[String]]("comments", O.Default(None))
    /** Database column uid SqlType(uuid) */
    val uid: Rep[java.util.UUID] = column[java.util.UUID]("uid")
    /** Database column status_update_reason SqlType(varchar), Length(200,true), Default(None) */
    val statusUpdateReason: Rep[Option[String]] = column[Option[String]]("status_update_reason", O.Length(200, varying = true), O.Default(None))
    /** Database column mobile_status SqlType(varchar), Length(64,true), Default(None) */
    val mobileStatus: Rep[Option[String]] = column[Option[String]]("mobile_status", O.Length(64, varying = true), O.Default(None))
    /** Database column password_modify_date SqlType(timestamp), Default(None) */
    val passwordModifyDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("password_modify_date", O.Default(None))
  }

  /** Collection-like TableQuery object for table McAccount */
  lazy val McAccount = new TableQuery(tag => new McAccount(tag))

  /** Entity class storing rows of table McAccountHobby
    *
    * @param id         Database column id SqlType(bigserial), AutoInc, PrimaryKey
    * @param createTime Database column create_time SqlType(timestamp)
    * @param customerId Database column customer_id SqlType(int8), Default(None)
    * @param hobby      Database column hobby SqlType(varchar), Length(20,true), Default(None) */
  final case class McAccountHobbyRow(id: Long,
                                     createTime: Option[java.sql.Timestamp],
                                     customerId: Option[Long] = None,
                                     hobby: Option[String] = None)

  /** GetResult implicit for fetching McAccountHobbyRow objects using plain SQL queries */
  implicit def GetResultMcAccountHobbyRow(implicit e0: GR[Long],
                                          e1: GR[Option[java.sql.Timestamp]],
                                          e2: GR[Option[Long]],
                                          e3: GR[Option[String]]): GR[McAccountHobbyRow] = GR { prs =>
    import prs._
    McAccountHobbyRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[String]))
  }

  /** Table description of table mc_account_hobby. Objects of this class serve as prototypes for rows in queries. */
  class McAccountHobby(_tableTag: Tag) extends profile.api.Table[McAccountHobbyRow](_tableTag, "mc_account_hobby") {
    def * = (id, createTime, customerId, hobby) <> (McAccountHobbyRow.tupled, McAccountHobbyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, customerId, hobby).shaped.<>({ r => import r._; _1.map(_ => McAccountHobbyRow.tupled((_1.get, _2, _3, _4))) }, (_: Any) => throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
    /** Database column hobby SqlType(varchar), Length(20,true), Default(None) */
    val hobby: Rep[Option[String]] = column[Option[String]]("hobby", O.Length(20, varying = true), O.Default(None))
  }

  /** Collection-like TableQuery object for table McAccountHobby */
  lazy val McAccountHobby = new TableQuery(tag => new McAccountHobby(tag))
}
