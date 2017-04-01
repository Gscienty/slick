package com.jeff
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.PostgresProfile
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(McAccount.schema, McAccountHobby.schema, McAccountInterestedClass.schema, McAccountOwnModel.schema, McAccountRole.schema, McCacheAudit.schema, McConfiguration.schema, McContent.schema, McContentPro.schema, McDealer.schema, McDealerComment.schema, McDealerUser.schema, McDirection.schema, McDistrict.schema, McFavourite.schema, McFinancialData.schema, McGift.schema, McJobAudit.schema, McLedgerRequest.schema, McOrder.schema, McOrderHistory.schema, McPayment.schema, McPdp.schema, McPdpItem.schema, McPdpItemProd.schema, McProduct.schema, McProductGift.schema, McProductOptionalPackage.schema, McProductSingleOption.schema, McRole.schema, McRolePermission.schema, McStock.schema, McStyleExteriorColour.schema, McStyleFeature.schema, McStyleInteriorColour.schema, McStyleWheel.schema, McSystemCity.schema, McSystemMenuFooter.schema, McSystemMenuNavigator.schema, McTestDriveCar.schema, McTestDriveComment.schema, McTestDriveOrder.schema, McTestDriveTime.schema, McVehicleClass.schema, McVehicleFeatureExteriorColours.schema, McVehicleFeatureInteriorColours.schema, McVehicleFeatureOptionalPackages.schema, McVehicleFeatureSingleOptions.schema, McVehicleFeatureWheels.schema, McVehicleModel.schema, McVehicleModelArgs.schema, McVehicleModelExteriorColor.schema, McVehicleModelGift.schema, McVehicleModelInteriorColor.schema, McVehicleModelOptionalPackage.schema, McVehicleModelSingleOption.schema, McVehicleModelWheel.schema, McVehicleStyle.schema, McVin.schema, McWarehouses.schema, SchemaVersion.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table McAccount
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param realName Database column real_name SqlType(varchar), Length(100,true)
   *  @param password Database column password SqlType(varchar), Length(200,true)
   *  @param nickName Database column nick_name SqlType(varchar), Length(100,true)
   *  @param mobile Database column mobile SqlType(varchar), Length(100,true), Default(None)
   *  @param born Database column born SqlType(date), Default(None)
   *  @param address Database column address SqlType(varchar), Length(200,true), Default(None)
   *  @param gender Database column gender SqlType(varchar), Length(10,true), Default(None)
   *  @param email Database column email SqlType(varchar), Length(100,true), Default(None)
   *  @param occupation Database column occupation SqlType(varchar), Length(20,true), Default(None)
   *  @param portrait Database column portrait SqlType(varchar), Length(200,true), Default(None)
   *  @param `type` Database column type SqlType(varchar), Length(20,true), Default(None)
   *  @param userName Database column user_name SqlType(varchar), Length(100,true), Default(None)
   *  @param userStatus Database column user_status SqlType(varchar), Length(256,true), Default(None)
   *  @param comments Database column comments SqlType(text), Default(None)
   *  @param uid Database column uid SqlType(uuid)
   *  @param statusUpdateReason Database column status_update_reason SqlType(varchar), Length(200,true), Default(None)
   *  @param mobileStatus Database column mobile_status SqlType(varchar), Length(64,true), Default(None)
   *  @param passwordModifyDate Database column password_modify_date SqlType(timestamp), Default(None) */
  final case class McAccountRow(id: Long, createTime: Option[java.sql.Timestamp], realName: String, password: String, nickName: String, mobile: Option[String] = None, born: Option[java.sql.Date] = None, address: Option[String] = None, gender: Option[String] = None, email: Option[String] = None, occupation: Option[String] = None, portrait: Option[String] = None, `type`: Option[String] = None, userName: Option[String] = None, userStatus: Option[String] = None, comments: Option[String] = None, uid: java.util.UUID, statusUpdateReason: Option[String] = None, mobileStatus: Option[String] = None, passwordModifyDate: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching McAccountRow objects using plain SQL queries */
  implicit def GetResultMcAccountRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[java.sql.Date]], e5: GR[java.util.UUID]): GR[McAccountRow] = GR{
    prs => import prs._
    McAccountRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<?[String], <<?[java.sql.Date], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[java.util.UUID], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mc_account. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class McAccount(_tableTag: Tag) extends profile.api.Table[McAccountRow](_tableTag, "mc_account") {
    def * = (id, createTime, realName, password, nickName, mobile, born, address, gender, email, occupation, portrait, `type`, userName, userStatus, comments, uid, statusUpdateReason, mobileStatus, passwordModifyDate) <> (McAccountRow.tupled, McAccountRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(realName), Rep.Some(password), Rep.Some(nickName), mobile, born, address, gender, email, occupation, portrait, `type`, userName, userStatus, comments, Rep.Some(uid), statusUpdateReason, mobileStatus, passwordModifyDate).shaped.<>({r=>import r._; _1.map(_=> McAccountRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17.get, _18, _19, _20)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column real_name SqlType(varchar), Length(100,true) */
    val realName: Rep[String] = column[String]("real_name", O.Length(100,varying=true))
    /** Database column password SqlType(varchar), Length(200,true) */
    val password: Rep[String] = column[String]("password", O.Length(200,varying=true))
    /** Database column nick_name SqlType(varchar), Length(100,true) */
    val nickName: Rep[String] = column[String]("nick_name", O.Length(100,varying=true))
    /** Database column mobile SqlType(varchar), Length(100,true), Default(None) */
    val mobile: Rep[Option[String]] = column[Option[String]]("mobile", O.Length(100,varying=true), O.Default(None))
    /** Database column born SqlType(date), Default(None) */
    val born: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("born", O.Default(None))
    /** Database column address SqlType(varchar), Length(200,true), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(200,varying=true), O.Default(None))
    /** Database column gender SqlType(varchar), Length(10,true), Default(None) */
    val gender: Rep[Option[String]] = column[Option[String]]("gender", O.Length(10,varying=true), O.Default(None))
    /** Database column email SqlType(varchar), Length(100,true), Default(None) */
    val email: Rep[Option[String]] = column[Option[String]]("email", O.Length(100,varying=true), O.Default(None))
    /** Database column occupation SqlType(varchar), Length(20,true), Default(None) */
    val occupation: Rep[Option[String]] = column[Option[String]]("occupation", O.Length(20,varying=true), O.Default(None))
    /** Database column portrait SqlType(varchar), Length(200,true), Default(None) */
    val portrait: Rep[Option[String]] = column[Option[String]]("portrait", O.Length(200,varying=true), O.Default(None))
    /** Database column type SqlType(varchar), Length(20,true), Default(None)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[String]] = column[Option[String]]("type", O.Length(20,varying=true), O.Default(None))
    /** Database column user_name SqlType(varchar), Length(100,true), Default(None) */
    val userName: Rep[Option[String]] = column[Option[String]]("user_name", O.Length(100,varying=true), O.Default(None))
    /** Database column user_status SqlType(varchar), Length(256,true), Default(None) */
    val userStatus: Rep[Option[String]] = column[Option[String]]("user_status", O.Length(256,varying=true), O.Default(None))
    /** Database column comments SqlType(text), Default(None) */
    val comments: Rep[Option[String]] = column[Option[String]]("comments", O.Default(None))
    /** Database column uid SqlType(uuid) */
    val uid: Rep[java.util.UUID] = column[java.util.UUID]("uid")
    /** Database column status_update_reason SqlType(varchar), Length(200,true), Default(None) */
    val statusUpdateReason: Rep[Option[String]] = column[Option[String]]("status_update_reason", O.Length(200,varying=true), O.Default(None))
    /** Database column mobile_status SqlType(varchar), Length(64,true), Default(None) */
    val mobileStatus: Rep[Option[String]] = column[Option[String]]("mobile_status", O.Length(64,varying=true), O.Default(None))
    /** Database column password_modify_date SqlType(timestamp), Default(None) */
    val passwordModifyDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("password_modify_date", O.Default(None))
  }
  /** Collection-like TableQuery object for table McAccount */
  lazy val McAccount = new TableQuery(tag => new McAccount(tag))

  /** Entity class storing rows of table McAccountHobby
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param customerId Database column customer_id SqlType(int8), Default(None)
   *  @param hobby Database column hobby SqlType(varchar), Length(20,true), Default(None) */
  final case class McAccountHobbyRow(id: Long, createTime: Option[java.sql.Timestamp], customerId: Option[Long] = None, hobby: Option[String] = None)
  /** GetResult implicit for fetching McAccountHobbyRow objects using plain SQL queries */
  implicit def GetResultMcAccountHobbyRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[McAccountHobbyRow] = GR{
    prs => import prs._
    McAccountHobbyRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[String]))
  }
  /** Table description of table mc_account_hobby. Objects of this class serve as prototypes for rows in queries. */
  class McAccountHobby(_tableTag: Tag) extends profile.api.Table[McAccountHobbyRow](_tableTag, "mc_account_hobby") {
    def * = (id, createTime, customerId, hobby) <> (McAccountHobbyRow.tupled, McAccountHobbyRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, customerId, hobby).shaped.<>({r=>import r._; _1.map(_=> McAccountHobbyRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
    /** Database column hobby SqlType(varchar), Length(20,true), Default(None) */
    val hobby: Rep[Option[String]] = column[Option[String]]("hobby", O.Length(20,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McAccountHobby */
  lazy val McAccountHobby = new TableQuery(tag => new McAccountHobby(tag))

  /** Entity class storing rows of table McAccountInterestedClass
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param customerId Database column customer_id SqlType(int8), Default(None)
   *  @param vehicleClass Database column vehicle_class SqlType(varchar), Length(20,true), Default(None) */
  final case class McAccountInterestedClassRow(id: Long, createTime: Option[java.sql.Timestamp], customerId: Option[Long] = None, vehicleClass: Option[String] = None)
  /** GetResult implicit for fetching McAccountInterestedClassRow objects using plain SQL queries */
  implicit def GetResultMcAccountInterestedClassRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[McAccountInterestedClassRow] = GR{
    prs => import prs._
    McAccountInterestedClassRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[String]))
  }
  /** Table description of table mc_account_interested_class. Objects of this class serve as prototypes for rows in queries. */
  class McAccountInterestedClass(_tableTag: Tag) extends profile.api.Table[McAccountInterestedClassRow](_tableTag, "mc_account_interested_class") {
    def * = (id, createTime, customerId, vehicleClass) <> (McAccountInterestedClassRow.tupled, McAccountInterestedClassRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, customerId, vehicleClass).shaped.<>({r=>import r._; _1.map(_=> McAccountInterestedClassRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
    /** Database column vehicle_class SqlType(varchar), Length(20,true), Default(None) */
    val vehicleClass: Rep[Option[String]] = column[Option[String]]("vehicle_class", O.Length(20,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McAccountInterestedClass */
  lazy val McAccountInterestedClass = new TableQuery(tag => new McAccountInterestedClass(tag))

  /** Entity class storing rows of table McAccountOwnModel
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param customerId Database column customer_id SqlType(int8), Default(None)
   *  @param modelName Database column model_name SqlType(varchar), Length(50,true), Default(None) */
  final case class McAccountOwnModelRow(id: Long, createTime: Option[java.sql.Timestamp], customerId: Option[Long] = None, modelName: Option[String] = None)
  /** GetResult implicit for fetching McAccountOwnModelRow objects using plain SQL queries */
  implicit def GetResultMcAccountOwnModelRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[McAccountOwnModelRow] = GR{
    prs => import prs._
    McAccountOwnModelRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[Long], <<?[String]))
  }
  /** Table description of table mc_account_own_model. Objects of this class serve as prototypes for rows in queries. */
  class McAccountOwnModel(_tableTag: Tag) extends profile.api.Table[McAccountOwnModelRow](_tableTag, "mc_account_own_model") {
    def * = (id, createTime, customerId, modelName) <> (McAccountOwnModelRow.tupled, McAccountOwnModelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, customerId, modelName).shaped.<>({r=>import r._; _1.map(_=> McAccountOwnModelRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
    /** Database column model_name SqlType(varchar), Length(50,true), Default(None) */
    val modelName: Rep[Option[String]] = column[Option[String]]("model_name", O.Length(50,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McAccountOwnModel */
  lazy val McAccountOwnModel = new TableQuery(tag => new McAccountOwnModel(tag))

  /** Entity class storing rows of table McAccountRole
   *  @param accountId Database column account_id SqlType(int8)
   *  @param roleId Database column role_id SqlType(int8) */
  final case class McAccountRoleRow(accountId: Long, roleId: Long)
  /** GetResult implicit for fetching McAccountRoleRow objects using plain SQL queries */
  implicit def GetResultMcAccountRoleRow(implicit e0: GR[Long]): GR[McAccountRoleRow] = GR{
    prs => import prs._
    McAccountRoleRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table mc_account_role. Objects of this class serve as prototypes for rows in queries. */
  class McAccountRole(_tableTag: Tag) extends profile.api.Table[McAccountRoleRow](_tableTag, "mc_account_role") {
    def * = (accountId, roleId) <> (McAccountRoleRow.tupled, McAccountRoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(accountId), Rep.Some(roleId)).shaped.<>({r=>import r._; _1.map(_=> McAccountRoleRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column account_id SqlType(int8) */
    val accountId: Rep[Long] = column[Long]("account_id")
    /** Database column role_id SqlType(int8) */
    val roleId: Rep[Long] = column[Long]("role_id")

    /** Primary key of McAccountRole (database name pk_mc_account_role) */
    val pk = primaryKey("pk_mc_account_role", (accountId, roleId))
  }
  /** Collection-like TableQuery object for table McAccountRole */
  lazy val McAccountRole = new TableQuery(tag => new McAccountRole(tag))

  /** Entity class storing rows of table McCacheAudit
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param cacheKey Database column cache_key SqlType(varchar), Length(255,true), Default(None) */
  final case class McCacheAuditRow(id: Long, createTime: java.sql.Timestamp, cacheKey: Option[String] = None)
  /** GetResult implicit for fetching McCacheAuditRow objects using plain SQL queries */
  implicit def GetResultMcCacheAuditRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]]): GR[McCacheAuditRow] = GR{
    prs => import prs._
    McCacheAuditRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table mc_cache_audit. Objects of this class serve as prototypes for rows in queries. */
  class McCacheAudit(_tableTag: Tag) extends profile.api.Table[McCacheAuditRow](_tableTag, "mc_cache_audit") {
    def * = (id, createTime, cacheKey) <> (McCacheAuditRow.tupled, McCacheAuditRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), cacheKey).shaped.<>({r=>import r._; _1.map(_=> McCacheAuditRow.tupled((_1.get, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column cache_key SqlType(varchar), Length(255,true), Default(None) */
    val cacheKey: Rep[Option[String]] = column[Option[String]]("cache_key", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McCacheAudit */
  lazy val McCacheAudit = new TableQuery(tag => new McCacheAudit(tag))

  /** Entity class storing rows of table McConfiguration
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param configKey Database column config_key SqlType(varchar), Length(100,true)
   *  @param configValue Database column config_value SqlType(varchar), Length(2000,true) */
  final case class McConfigurationRow(id: Long, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, configKey: String, configValue: String)
  /** GetResult implicit for fetching McConfigurationRow objects using plain SQL queries */
  implicit def GetResultMcConfigurationRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[McConfigurationRow] = GR{
    prs => import prs._
    McConfigurationRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table mc_configuration. Objects of this class serve as prototypes for rows in queries. */
  class McConfiguration(_tableTag: Tag) extends profile.api.Table[McConfigurationRow](_tableTag, "mc_configuration") {
    def * = (id, createTime, updateTime, configKey, configValue) <> (McConfigurationRow.tupled, McConfigurationRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(updateTime), Rep.Some(configKey), Rep.Some(configValue)).shaped.<>({r=>import r._; _1.map(_=> McConfigurationRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column config_key SqlType(varchar), Length(100,true) */
    val configKey: Rep[String] = column[String]("config_key", O.Length(100,varying=true))
    /** Database column config_value SqlType(varchar), Length(2000,true) */
    val configValue: Rep[String] = column[String]("config_value", O.Length(2000,varying=true))
  }
  /** Collection-like TableQuery object for table McConfiguration */
  lazy val McConfiguration = new TableQuery(tag => new McConfiguration(tag))

  /** Entity class storing rows of table McContent
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param contentType Database column content_type SqlType(varchar), Length(16,true)
   *  @param content Database column content SqlType(text)
   *  @param contentStatus Database column content_status SqlType(varchar), Length(100,true), Default(Some(UNPUBLISHED))
   *  @param lastPublishTime Database column last_publish_time SqlType(timestamp), Default(None) */
  final case class McContentRow(id: Long, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, contentType: String, content: String, contentStatus: Option[String] = Some("UNPUBLISHED"), lastPublishTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching McContentRow objects using plain SQL queries */
  implicit def GetResultMcContentRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[java.sql.Timestamp]]): GR[McContentRow] = GR{
    prs => import prs._
    McContentRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mc_content. Objects of this class serve as prototypes for rows in queries. */
  class McContent(_tableTag: Tag) extends profile.api.Table[McContentRow](_tableTag, "mc_content") {
    def * = (id, createTime, updateTime, contentType, content, contentStatus, lastPublishTime) <> (McContentRow.tupled, McContentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(updateTime), Rep.Some(contentType), Rep.Some(content), contentStatus, lastPublishTime).shaped.<>({r=>import r._; _1.map(_=> McContentRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column content_type SqlType(varchar), Length(16,true) */
    val contentType: Rep[String] = column[String]("content_type", O.Length(16,varying=true))
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
    /** Database column content_status SqlType(varchar), Length(100,true), Default(Some(UNPUBLISHED)) */
    val contentStatus: Rep[Option[String]] = column[Option[String]]("content_status", O.Length(100,varying=true), O.Default(Some("UNPUBLISHED")))
    /** Database column last_publish_time SqlType(timestamp), Default(None) */
    val lastPublishTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("last_publish_time", O.Default(None))
  }
  /** Collection-like TableQuery object for table McContent */
  lazy val McContent = new TableQuery(tag => new McContent(tag))

  /** Entity class storing rows of table McContentPro
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param contentType Database column content_type SqlType(varchar), Length(16,true)
   *  @param content Database column content SqlType(text) */
  final case class McContentProRow(id: Long, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, contentType: String, content: String)
  /** GetResult implicit for fetching McContentProRow objects using plain SQL queries */
  implicit def GetResultMcContentProRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[McContentProRow] = GR{
    prs => import prs._
    McContentProRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table mc_content_pro. Objects of this class serve as prototypes for rows in queries. */
  class McContentPro(_tableTag: Tag) extends profile.api.Table[McContentProRow](_tableTag, "mc_content_pro") {
    def * = (id, createTime, updateTime, contentType, content) <> (McContentProRow.tupled, McContentProRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(updateTime), Rep.Some(contentType), Rep.Some(content)).shaped.<>({r=>import r._; _1.map(_=> McContentProRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column content_type SqlType(varchar), Length(16,true) */
    val contentType: Rep[String] = column[String]("content_type", O.Length(16,varying=true))
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
  }
  /** Collection-like TableQuery object for table McContentPro */
  lazy val McContentPro = new TableQuery(tag => new McContentPro(tag))

  /** Entity class storing rows of table McDealer
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param city Database column city SqlType(varchar), Length(255,true), Default(None)
   *  @param address Database column address SqlType(varchar), Length(255,true), Default(None)
   *  @param telephone Database column telephone SqlType(varchar), Length(255,true), Default(None)
   *  @param rating Database column rating SqlType(int4), Default(Some(5))
   *  @param comments Database column comments SqlType(int4), Default(Some(0))
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param latitude Database column latitude SqlType(varchar), Length(255,true), Default(None)
   *  @param longitude Database column longitude SqlType(varchar), Length(255,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(50,true), Default(None)
   *  @param cityName Database column city_name SqlType(varchar), Length(32,true), Default(None)
   *  @param dealerStatus Database column dealer_status SqlType(varchar), Length(64,true), Default(Some(NORMAL))
   *  @param namePinYin Database column name_pin_yin SqlType(varchar), Length(200,true), Default(None)
   *  @param statusUpdateReason Database column status_update_reason SqlType(varchar), Length(200,true), Default(None) */
  final case class McDealerRow(id: Long, name: Option[String] = None, picture: Option[String] = None, city: Option[String] = None, address: Option[String] = None, telephone: Option[String] = None, rating: Option[Int] = Some(5), comments: Option[Int] = Some(0), createTime: java.sql.Timestamp, latitude: Option[String] = None, longitude: Option[String] = None, code: Option[String] = None, cityName: Option[String] = None, dealerStatus: Option[String] = Some("NORMAL"), namePinYin: Option[String] = None, statusUpdateReason: Option[String] = None)
  /** GetResult implicit for fetching McDealerRow objects using plain SQL queries */
  implicit def GetResultMcDealerRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[java.sql.Timestamp]): GR[McDealerRow] = GR{
    prs => import prs._
    McDealerRow.tupled((<<[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[Int], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_dealer. Objects of this class serve as prototypes for rows in queries. */
  class McDealer(_tableTag: Tag) extends profile.api.Table[McDealerRow](_tableTag, "mc_dealer") {
    def * = (id, name, picture, city, address, telephone, rating, comments, createTime, latitude, longitude, code, cityName, dealerStatus, namePinYin, statusUpdateReason) <> (McDealerRow.tupled, McDealerRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, city, address, telephone, rating, comments, Rep.Some(createTime), latitude, longitude, code, cityName, dealerStatus, namePinYin, statusUpdateReason).shaped.<>({r=>import r._; _1.map(_=> McDealerRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9.get, _10, _11, _12, _13, _14, _15, _16)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column city SqlType(varchar), Length(255,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(255,varying=true), O.Default(None))
    /** Database column address SqlType(varchar), Length(255,true), Default(None) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(255,varying=true), O.Default(None))
    /** Database column telephone SqlType(varchar), Length(255,true), Default(None) */
    val telephone: Rep[Option[String]] = column[Option[String]]("telephone", O.Length(255,varying=true), O.Default(None))
    /** Database column rating SqlType(int4), Default(Some(5)) */
    val rating: Rep[Option[Int]] = column[Option[Int]]("rating", O.Default(Some(5)))
    /** Database column comments SqlType(int4), Default(Some(0)) */
    val comments: Rep[Option[Int]] = column[Option[Int]]("comments", O.Default(Some(0)))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column latitude SqlType(varchar), Length(255,true), Default(None) */
    val latitude: Rep[Option[String]] = column[Option[String]]("latitude", O.Length(255,varying=true), O.Default(None))
    /** Database column longitude SqlType(varchar), Length(255,true), Default(None) */
    val longitude: Rep[Option[String]] = column[Option[String]]("longitude", O.Length(255,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(50,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(50,varying=true), O.Default(None))
    /** Database column city_name SqlType(varchar), Length(32,true), Default(None) */
    val cityName: Rep[Option[String]] = column[Option[String]]("city_name", O.Length(32,varying=true), O.Default(None))
    /** Database column dealer_status SqlType(varchar), Length(64,true), Default(Some(NORMAL)) */
    val dealerStatus: Rep[Option[String]] = column[Option[String]]("dealer_status", O.Length(64,varying=true), O.Default(Some("NORMAL")))
    /** Database column name_pin_yin SqlType(varchar), Length(200,true), Default(None) */
    val namePinYin: Rep[Option[String]] = column[Option[String]]("name_pin_yin", O.Length(200,varying=true), O.Default(None))
    /** Database column status_update_reason SqlType(varchar), Length(200,true), Default(None) */
    val statusUpdateReason: Rep[Option[String]] = column[Option[String]]("status_update_reason", O.Length(200,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McDealer */
  lazy val McDealer = new TableQuery(tag => new McDealer(tag))

  /** Entity class storing rows of table McDealerComment
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param customerId Database column customer_id SqlType(int8)
   *  @param dealerId Database column dealer_id SqlType(int8)
   *  @param content Database column content SqlType(text)
   *  @param rating Database column rating SqlType(int4)
   *  @param orderId Database column order_id SqlType(int8), Default(None)
   *  @param reservationId Database column reservation_id SqlType(varchar), Length(255,true), Default(None)
   *  @param realName Database column real_name SqlType(varchar), Length(100,true), Default(None)
   *  @param mobile Database column mobile SqlType(varchar), Length(100,true), Default(None)
   *  @param status Database column status SqlType(varchar), Length(100,true), Default(None)
   *  @param reply Database column reply SqlType(varchar), Length(255,true), Default(None) */
  final case class McDealerCommentRow(id: Long, createTime: java.sql.Timestamp, customerId: Long, dealerId: Long, content: String, rating: Int, orderId: Option[Long] = None, reservationId: Option[String] = None, realName: Option[String] = None, mobile: Option[String] = None, status: Option[String] = None, reply: Option[String] = None)
  /** GetResult implicit for fetching McDealerCommentRow objects using plain SQL queries */
  implicit def GetResultMcDealerCommentRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String], e3: GR[Int], e4: GR[Option[Long]], e5: GR[Option[String]]): GR[McDealerCommentRow] = GR{
    prs => import prs._
    McDealerCommentRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[Long], <<[Long], <<[String], <<[Int], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_dealer_comment. Objects of this class serve as prototypes for rows in queries. */
  class McDealerComment(_tableTag: Tag) extends profile.api.Table[McDealerCommentRow](_tableTag, "mc_dealer_comment") {
    def * = (id, createTime, customerId, dealerId, content, rating, orderId, reservationId, realName, mobile, status, reply) <> (McDealerCommentRow.tupled, McDealerCommentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(customerId), Rep.Some(dealerId), Rep.Some(content), Rep.Some(rating), orderId, reservationId, realName, mobile, status, reply).shaped.<>({r=>import r._; _1.map(_=> McDealerCommentRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column customer_id SqlType(int8) */
    val customerId: Rep[Long] = column[Long]("customer_id")
    /** Database column dealer_id SqlType(int8) */
    val dealerId: Rep[Long] = column[Long]("dealer_id")
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
    /** Database column rating SqlType(int4) */
    val rating: Rep[Int] = column[Int]("rating")
    /** Database column order_id SqlType(int8), Default(None) */
    val orderId: Rep[Option[Long]] = column[Option[Long]]("order_id", O.Default(None))
    /** Database column reservation_id SqlType(varchar), Length(255,true), Default(None) */
    val reservationId: Rep[Option[String]] = column[Option[String]]("reservation_id", O.Length(255,varying=true), O.Default(None))
    /** Database column real_name SqlType(varchar), Length(100,true), Default(None) */
    val realName: Rep[Option[String]] = column[Option[String]]("real_name", O.Length(100,varying=true), O.Default(None))
    /** Database column mobile SqlType(varchar), Length(100,true), Default(None) */
    val mobile: Rep[Option[String]] = column[Option[String]]("mobile", O.Length(100,varying=true), O.Default(None))
    /** Database column status SqlType(varchar), Length(100,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(100,varying=true), O.Default(None))
    /** Database column reply SqlType(varchar), Length(255,true), Default(None) */
    val reply: Rep[Option[String]] = column[Option[String]]("reply", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McDealerComment */
  lazy val McDealerComment = new TableQuery(tag => new McDealerComment(tag))

  /** Entity class storing rows of table McDealerUser
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param dealerId Database column dealer_id SqlType(int8), Default(None)
   *  @param userId Database column user_id SqlType(int8), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp), Default(None) */
  final case class McDealerUserRow(id: Long, dealerId: Option[Long] = None, userId: Option[Long] = None, createTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching McDealerUserRow objects using plain SQL queries */
  implicit def GetResultMcDealerUserRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[java.sql.Timestamp]]): GR[McDealerUserRow] = GR{
    prs => import prs._
    McDealerUserRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mc_dealer_user. Objects of this class serve as prototypes for rows in queries. */
  class McDealerUser(_tableTag: Tag) extends profile.api.Table[McDealerUserRow](_tableTag, "mc_dealer_user") {
    def * = (id, dealerId, userId, createTime) <> (McDealerUserRow.tupled, McDealerUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), dealerId, userId, createTime).shaped.<>({r=>import r._; _1.map(_=> McDealerUserRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column dealer_id SqlType(int8), Default(None) */
    val dealerId: Rep[Option[Long]] = column[Option[Long]]("dealer_id", O.Default(None))
    /** Database column user_id SqlType(int8), Default(None) */
    val userId: Rep[Option[Long]] = column[Option[Long]]("user_id", O.Default(None))
    /** Database column create_time SqlType(timestamp), Default(None) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time", O.Default(None))
  }
  /** Collection-like TableQuery object for table McDealerUser */
  lazy val McDealerUser = new TableQuery(tag => new McDealerUser(tag))

  /** Entity class storing rows of table McDirection
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param styleId Database column style_id SqlType(int8)
   *  @param defaultOption Database column default_option SqlType(int4)
   *  @param direction Database column direction SqlType(int8), Default(None) */
  final case class McDirectionRow(id: Long, createTime: Option[java.sql.Timestamp], styleId: Long, defaultOption: Int, direction: Option[Long] = None)
  /** GetResult implicit for fetching McDirectionRow objects using plain SQL queries */
  implicit def GetResultMcDirectionRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[Option[Long]]): GR[McDirectionRow] = GR{
    prs => import prs._
    McDirectionRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<[Int], <<?[Long]))
  }
  /** Table description of table mc_direction. Objects of this class serve as prototypes for rows in queries. */
  class McDirection(_tableTag: Tag) extends profile.api.Table[McDirectionRow](_tableTag, "mc_direction") {
    def * = (id, createTime, styleId, defaultOption, direction) <> (McDirectionRow.tupled, McDirectionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(styleId), Rep.Some(defaultOption), direction).shaped.<>({r=>import r._; _1.map(_=> McDirectionRow.tupled((_1.get, _2, _3.get, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column style_id SqlType(int8) */
    val styleId: Rep[Long] = column[Long]("style_id")
    /** Database column default_option SqlType(int4) */
    val defaultOption: Rep[Int] = column[Int]("default_option")
    /** Database column direction SqlType(int8), Default(None) */
    val direction: Rep[Option[Long]] = column[Option[Long]]("direction", O.Default(None))
  }
  /** Collection-like TableQuery object for table McDirection */
  lazy val McDirection = new TableQuery(tag => new McDirection(tag))

  /** Entity class storing rows of table McDistrict
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param cityId Database column city_id SqlType(int8), Default(None)
   *  @param name Database column name SqlType(varchar), Length(32,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(16,true), Default(None) */
  final case class McDistrictRow(id: Long, createTime: java.sql.Timestamp, cityId: Option[Long] = None, name: Option[String] = None, code: Option[String] = None)
  /** GetResult implicit for fetching McDistrictRow objects using plain SQL queries */
  implicit def GetResultMcDistrictRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[McDistrictRow] = GR{
    prs => import prs._
    McDistrictRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[Long], <<?[String], <<?[String]))
  }
  /** Table description of table mc_district. Objects of this class serve as prototypes for rows in queries. */
  class McDistrict(_tableTag: Tag) extends profile.api.Table[McDistrictRow](_tableTag, "mc_district") {
    def * = (id, createTime, cityId, name, code) <> (McDistrictRow.tupled, McDistrictRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), cityId, name, code).shaped.<>({r=>import r._; _1.map(_=> McDistrictRow.tupled((_1.get, _2.get, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column city_id SqlType(int8), Default(None) */
    val cityId: Rep[Option[Long]] = column[Option[Long]]("city_id", O.Default(None))
    /** Database column name SqlType(varchar), Length(32,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(32,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(16,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(16,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McDistrict */
  lazy val McDistrict = new TableQuery(tag => new McDistrict(tag))

  /** Entity class storing rows of table McFavourite
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(int8)
   *  @param content Database column content SqlType(text)
   *  @param updateTime Database column update_time SqlType(timestamp) */
  final case class McFavouriteRow(id: Long, userId: Long, content: String, updateTime: java.sql.Timestamp)
  /** GetResult implicit for fetching McFavouriteRow objects using plain SQL queries */
  implicit def GetResultMcFavouriteRow(implicit e0: GR[Long], e1: GR[String], e2: GR[java.sql.Timestamp]): GR[McFavouriteRow] = GR{
    prs => import prs._
    McFavouriteRow.tupled((<<[Long], <<[Long], <<[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table mc_favourite. Objects of this class serve as prototypes for rows in queries. */
  class McFavourite(_tableTag: Tag) extends profile.api.Table[McFavouriteRow](_tableTag, "mc_favourite") {
    def * = (id, userId, content, updateTime) <> (McFavouriteRow.tupled, McFavouriteRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(userId), Rep.Some(content), Rep.Some(updateTime)).shaped.<>({r=>import r._; _1.map(_=> McFavouriteRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(int8) */
    val userId: Rep[Long] = column[Long]("user_id")
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
  }
  /** Collection-like TableQuery object for table McFavourite */
  lazy val McFavourite = new TableQuery(tag => new McFavourite(tag))

  /** Entity class storing rows of table McFinancialData
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param content Database column content SqlType(text) */
  final case class McFinancialDataRow(id: Long, createTime: java.sql.Timestamp, content: String)
  /** GetResult implicit for fetching McFinancialDataRow objects using plain SQL queries */
  implicit def GetResultMcFinancialDataRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[McFinancialDataRow] = GR{
    prs => import prs._
    McFinancialDataRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[String]))
  }
  /** Table description of table mc_financial_data. Objects of this class serve as prototypes for rows in queries. */
  class McFinancialData(_tableTag: Tag) extends profile.api.Table[McFinancialDataRow](_tableTag, "mc_financial_data") {
    def * = (id, createTime, content) <> (McFinancialDataRow.tupled, McFinancialDataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(content)).shaped.<>({r=>import r._; _1.map(_=> McFinancialDataRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
  }
  /** Collection-like TableQuery object for table McFinancialData */
  lazy val McFinancialData = new TableQuery(tag => new McFinancialData(tag))

  /** Entity class storing rows of table McGift
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param startTime Database column start_time SqlType(timestamp), Default(None)
   *  @param endTime Database column end_time SqlType(timestamp), Default(None)
   *  @param status Database column status SqlType(varchar), Length(64,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param totalNum Database column total_num SqlType(int4), Default(None)
   *  @param usedNum Database column used_num SqlType(int4), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp), Default(None)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param deleted Database column deleted SqlType(bool), Default(Some(false)) */
  final case class McGiftRow(id: Long, name: Option[String] = None, picture: Option[String] = None, startTime: Option[java.sql.Timestamp] = None, endTime: Option[java.sql.Timestamp] = None, status: Option[String] = None, description: Option[String] = None, totalNum: Option[Int] = None, usedNum: Option[Int] = None, createTime: Option[java.sql.Timestamp] = None, updateTime: Option[java.sql.Timestamp] = None, deleted: Option[Boolean] = Some(false))
  /** GetResult implicit for fetching McGiftRow objects using plain SQL queries */
  implicit def GetResultMcGiftRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Int]], e4: GR[Option[Boolean]]): GR[McGiftRow] = GR{
    prs => import prs._
    McGiftRow.tupled((<<[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Boolean]))
  }
  /** Table description of table mc_gift. Objects of this class serve as prototypes for rows in queries. */
  class McGift(_tableTag: Tag) extends profile.api.Table[McGiftRow](_tableTag, "mc_gift") {
    def * = (id, name, picture, startTime, endTime, status, description, totalNum, usedNum, createTime, updateTime, deleted) <> (McGiftRow.tupled, McGiftRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, startTime, endTime, status, description, totalNum, usedNum, createTime, updateTime, deleted).shaped.<>({r=>import r._; _1.map(_=> McGiftRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column start_time SqlType(timestamp), Default(None) */
    val startTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("start_time", O.Default(None))
    /** Database column end_time SqlType(timestamp), Default(None) */
    val endTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("end_time", O.Default(None))
    /** Database column status SqlType(varchar), Length(64,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(64,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column total_num SqlType(int4), Default(None) */
    val totalNum: Rep[Option[Int]] = column[Option[Int]]("total_num", O.Default(None))
    /** Database column used_num SqlType(int4), Default(None) */
    val usedNum: Rep[Option[Int]] = column[Option[Int]]("used_num", O.Default(None))
    /** Database column create_time SqlType(timestamp), Default(None) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time", O.Default(None))
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column deleted SqlType(bool), Default(Some(false)) */
    val deleted: Rep[Option[Boolean]] = column[Option[Boolean]]("deleted", O.Default(Some(false)))
  }
  /** Collection-like TableQuery object for table McGift */
  lazy val McGift = new TableQuery(tag => new McGift(tag))

  /** Entity class storing rows of table McJobAudit
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param jvmId Database column jvm_id SqlType(varchar), Length(255,true), Default(None) */
  final case class McJobAuditRow(id: Long, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, jvmId: Option[String] = None)
  /** GetResult implicit for fetching McJobAuditRow objects using plain SQL queries */
  implicit def GetResultMcJobAuditRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[String]]): GR[McJobAuditRow] = GR{
    prs => import prs._
    McJobAuditRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table mc_job_audit. Objects of this class serve as prototypes for rows in queries. */
  class McJobAudit(_tableTag: Tag) extends profile.api.Table[McJobAuditRow](_tableTag, "mc_job_audit") {
    def * = (id, createTime, updateTime, jvmId) <> (McJobAuditRow.tupled, McJobAuditRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(updateTime), jvmId).shaped.<>({r=>import r._; _1.map(_=> McJobAuditRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column jvm_id SqlType(varchar), Length(255,true), Default(None) */
    val jvmId: Rep[Option[String]] = column[Option[String]]("jvm_id", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McJobAudit */
  lazy val McJobAudit = new TableQuery(tag => new McJobAudit(tag))

  /** Entity class storing rows of table McLedgerRequest
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param orderReservationId Database column order_reservation_id SqlType(varchar), Length(255,true), Default(None)
   *  @param status Database column status SqlType(varchar), Length(16,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp) */
  final case class McLedgerRequestRow(id: Long, orderReservationId: Option[String] = None, status: Option[String] = None, createTime: java.sql.Timestamp)
  /** GetResult implicit for fetching McLedgerRequestRow objects using plain SQL queries */
  implicit def GetResultMcLedgerRequestRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[McLedgerRequestRow] = GR{
    prs => import prs._
    McLedgerRequestRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp]))
  }
  /** Table description of table mc_ledger_request. Objects of this class serve as prototypes for rows in queries. */
  class McLedgerRequest(_tableTag: Tag) extends profile.api.Table[McLedgerRequestRow](_tableTag, "mc_ledger_request") {
    def * = (id, orderReservationId, status, createTime) <> (McLedgerRequestRow.tupled, McLedgerRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), orderReservationId, status, Rep.Some(createTime)).shaped.<>({r=>import r._; _1.map(_=> McLedgerRequestRow.tupled((_1.get, _2, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column order_reservation_id SqlType(varchar), Length(255,true), Default(None) */
    val orderReservationId: Rep[Option[String]] = column[Option[String]]("order_reservation_id", O.Length(255,varying=true), O.Default(None))
    /** Database column status SqlType(varchar), Length(16,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(16,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
  }
  /** Collection-like TableQuery object for table McLedgerRequest */
  lazy val McLedgerRequest = new TableQuery(tag => new McLedgerRequest(tag))

  /** Row type of table McOrder */
  type McOrderRow = HCons[Long,HCons[Option[String],HCons[Option[String],HCons[Option[Long],HCons[Option[Long],HCons[Option[Long],HCons[Option[Long],HCons[Option[Long],HCons[java.sql.Timestamp,HCons[scala.math.BigDecimal,HCons[scala.math.BigDecimal,HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[java.sql.Timestamp],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[scala.math.BigDecimal],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for McOrderRow providing default values if available in the database schema. */
  def McOrderRow(id: Long, reservationId: Option[String] = None, orderStatus: Option[String] = None, productId: Option[Long] = None, customerId: Option[Long] = None, dealerId: Option[Long] = None, giftId: Option[Long] = None, paymentId: Option[Long] = None, createTime: java.sql.Timestamp, totalAmount: scala.math.BigDecimal, intentionFee: scala.math.BigDecimal, mentionCarTime: Option[java.sql.Timestamp] = None, contactName: Option[String] = None, contactMobile: Option[String] = None, updateTime: Option[java.sql.Timestamp] = None, vid: Option[String] = None, warehouseType: Option[String] = None, warehouseId: Option[Int] = None, memo: Option[String] = None, carType: Option[String] = None, contactAddress: Option[String] = None, contactEmail: Option[String] = None, cancelReason: Option[String] = None, snapshot: Option[String] = None, carTypeMemo: Option[String] = None, financialPlanCode: Option[String] = None, financialPlanName: Option[String] = None, financialPlanTerm: Option[Int] = None, financialPlanDownpayment: Option[scala.math.BigDecimal] = None, financialPlanBalloonpayment: Option[scala.math.BigDecimal] = None, financialPlanMonthlyPayment: Option[scala.math.BigDecimal] = None, redeemCode: Option[String] = None, commentStatus: Option[String] = None): McOrderRow = {
    id :: reservationId :: orderStatus :: productId :: customerId :: dealerId :: giftId :: paymentId :: createTime :: totalAmount :: intentionFee :: mentionCarTime :: contactName :: contactMobile :: updateTime :: vid :: warehouseType :: warehouseId :: memo :: carType :: contactAddress :: contactEmail :: cancelReason :: snapshot :: carTypeMemo :: financialPlanCode :: financialPlanName :: financialPlanTerm :: financialPlanDownpayment :: financialPlanBalloonpayment :: financialPlanMonthlyPayment :: redeemCode :: commentStatus :: HNil
  }
  /** GetResult implicit for fetching McOrderRow objects using plain SQL queries */
  implicit def GetResultMcOrderRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp], e4: GR[scala.math.BigDecimal], e5: GR[Option[java.sql.Timestamp]], e6: GR[Option[Int]], e7: GR[Option[scala.math.BigDecimal]]): GR[McOrderRow] = GR{
    prs => import prs._
    <<[Long] :: <<?[String] :: <<?[String] :: <<?[Long] :: <<?[Long] :: <<?[Long] :: <<?[Long] :: <<?[Long] :: <<[java.sql.Timestamp] :: <<[scala.math.BigDecimal] :: <<[scala.math.BigDecimal] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[java.sql.Timestamp] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[scala.math.BigDecimal] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table mc_order. Objects of this class serve as prototypes for rows in queries. */
  class McOrder(_tableTag: Tag) extends profile.api.Table[McOrderRow](_tableTag, "mc_order") {
    def * = id :: reservationId :: orderStatus :: productId :: customerId :: dealerId :: giftId :: paymentId :: createTime :: totalAmount :: intentionFee :: mentionCarTime :: contactName :: contactMobile :: updateTime :: vid :: warehouseType :: warehouseId :: memo :: carType :: contactAddress :: contactEmail :: cancelReason :: snapshot :: carTypeMemo :: financialPlanCode :: financialPlanName :: financialPlanTerm :: financialPlanDownpayment :: financialPlanBalloonpayment :: financialPlanMonthlyPayment :: redeemCode :: commentStatus :: HNil

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column reservation_id SqlType(varchar), Length(255,true), Default(None) */
    val reservationId: Rep[Option[String]] = column[Option[String]]("reservation_id", O.Length(255,varying=true), O.Default(None))
    /** Database column order_status SqlType(varchar), Length(20,true), Default(None) */
    val orderStatus: Rep[Option[String]] = column[Option[String]]("order_status", O.Length(20,varying=true), O.Default(None))
    /** Database column product_id SqlType(int8), Default(None) */
    val productId: Rep[Option[Long]] = column[Option[Long]]("product_id", O.Default(None))
    /** Database column customer_id SqlType(int8), Default(None) */
    val customerId: Rep[Option[Long]] = column[Option[Long]]("customer_id", O.Default(None))
    /** Database column dealer_id SqlType(int8), Default(None) */
    val dealerId: Rep[Option[Long]] = column[Option[Long]]("dealer_id", O.Default(None))
    /** Database column gift_id SqlType(int8), Default(None) */
    val giftId: Rep[Option[Long]] = column[Option[Long]]("gift_id", O.Default(None))
    /** Database column payment_id SqlType(int8), Default(None) */
    val paymentId: Rep[Option[Long]] = column[Option[Long]]("payment_id", O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column total_amount SqlType(numeric) */
    val totalAmount: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("total_amount")
    /** Database column intention_fee SqlType(numeric) */
    val intentionFee: Rep[scala.math.BigDecimal] = column[scala.math.BigDecimal]("intention_fee")
    /** Database column mention_car_time SqlType(timestamp), Default(None) */
    val mentionCarTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("mention_car_time", O.Default(None))
    /** Database column contact_name SqlType(varchar), Length(20,true), Default(None) */
    val contactName: Rep[Option[String]] = column[Option[String]]("contact_name", O.Length(20,varying=true), O.Default(None))
    /** Database column contact_mobile SqlType(varchar), Length(32,true), Default(None) */
    val contactMobile: Rep[Option[String]] = column[Option[String]]("contact_mobile", O.Length(32,varying=true), O.Default(None))
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column vid SqlType(varchar), Length(32,true), Default(None) */
    val vid: Rep[Option[String]] = column[Option[String]]("vid", O.Length(32,varying=true), O.Default(None))
    /** Database column warehouse_type SqlType(varchar), Length(16,true), Default(None) */
    val warehouseType: Rep[Option[String]] = column[Option[String]]("warehouse_type", O.Length(16,varying=true), O.Default(None))
    /** Database column warehouse_id SqlType(int4), Default(None) */
    val warehouseId: Rep[Option[Int]] = column[Option[Int]]("warehouse_id", O.Default(None))
    /** Database column memo SqlType(text), Default(None) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Default(None))
    /** Database column car_type SqlType(varchar), Length(255,true), Default(None) */
    val carType: Rep[Option[String]] = column[Option[String]]("car_type", O.Length(255,varying=true), O.Default(None))
    /** Database column contact_address SqlType(varchar), Length(255,true), Default(None) */
    val contactAddress: Rep[Option[String]] = column[Option[String]]("contact_address", O.Length(255,varying=true), O.Default(None))
    /** Database column contact_email SqlType(varchar), Length(255,true), Default(None) */
    val contactEmail: Rep[Option[String]] = column[Option[String]]("contact_email", O.Length(255,varying=true), O.Default(None))
    /** Database column cancel_reason SqlType(varchar), Length(255,true), Default(None) */
    val cancelReason: Rep[Option[String]] = column[Option[String]]("cancel_reason", O.Length(255,varying=true), O.Default(None))
    /** Database column snapshot SqlType(jsonb), Length(2147483647,false), Default(None) */
    val snapshot: Rep[Option[String]] = column[Option[String]]("snapshot", O.Length(2147483647,varying=false), O.Default(None))
    /** Database column car_type_memo SqlType(varchar), Length(255,true), Default(None) */
    val carTypeMemo: Rep[Option[String]] = column[Option[String]]("car_type_memo", O.Length(255,varying=true), O.Default(None))
    /** Database column financial_plan_code SqlType(varchar), Length(100,true), Default(None) */
    val financialPlanCode: Rep[Option[String]] = column[Option[String]]("financial_plan_code", O.Length(100,varying=true), O.Default(None))
    /** Database column financial_plan_name SqlType(varchar), Length(100,true), Default(None) */
    val financialPlanName: Rep[Option[String]] = column[Option[String]]("financial_plan_name", O.Length(100,varying=true), O.Default(None))
    /** Database column financial_plan_term SqlType(int4), Default(None) */
    val financialPlanTerm: Rep[Option[Int]] = column[Option[Int]]("financial_plan_term", O.Default(None))
    /** Database column financial_plan_downpayment SqlType(numeric), Default(None) */
    val financialPlanDownpayment: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("financial_plan_downpayment", O.Default(None))
    /** Database column financial_plan_balloonpayment SqlType(numeric), Default(None) */
    val financialPlanBalloonpayment: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("financial_plan_balloonpayment", O.Default(None))
    /** Database column financial_plan_monthly_payment SqlType(numeric), Default(None) */
    val financialPlanMonthlyPayment: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("financial_plan_monthly_payment", O.Default(None))
    /** Database column redeem_code SqlType(varchar), Length(64,true), Default(None) */
    val redeemCode: Rep[Option[String]] = column[Option[String]]("redeem_code", O.Length(64,varying=true), O.Default(None))
    /** Database column comment_status SqlType(varchar), Length(50,true), Default(None) */
    val commentStatus: Rep[Option[String]] = column[Option[String]]("comment_status", O.Length(50,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McOrder */
  lazy val McOrder = new TableQuery(tag => new McOrder(tag))

  /** Entity class storing rows of table McOrderHistory
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param userName Database column user_name SqlType(varchar), Length(100,true), Default(None)
   *  @param userType Database column user_type SqlType(varchar), Length(32,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param mcOrderId Database column mc_order_id SqlType(int8)
   *  @param operationType Database column operation_type SqlType(varchar), Length(100,true), Default(None)
   *  @param newValue Database column new_value SqlType(varchar), Length(256,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None) */
  final case class McOrderHistoryRow(id: Long, userName: Option[String] = None, userType: Option[String] = None, createTime: java.sql.Timestamp, mcOrderId: Long, operationType: Option[String] = None, newValue: Option[String] = None, description: Option[String] = None)
  /** GetResult implicit for fetching McOrderHistoryRow objects using plain SQL queries */
  implicit def GetResultMcOrderHistoryRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[McOrderHistoryRow] = GR{
    prs => import prs._
    McOrderHistoryRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[Long], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_order_history. Objects of this class serve as prototypes for rows in queries. */
  class McOrderHistory(_tableTag: Tag) extends profile.api.Table[McOrderHistoryRow](_tableTag, "mc_order_history") {
    def * = (id, userName, userType, createTime, mcOrderId, operationType, newValue, description) <> (McOrderHistoryRow.tupled, McOrderHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), userName, userType, Rep.Some(createTime), Rep.Some(mcOrderId), operationType, newValue, description).shaped.<>({r=>import r._; _1.map(_=> McOrderHistoryRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_name SqlType(varchar), Length(100,true), Default(None) */
    val userName: Rep[Option[String]] = column[Option[String]]("user_name", O.Length(100,varying=true), O.Default(None))
    /** Database column user_type SqlType(varchar), Length(32,true), Default(None) */
    val userType: Rep[Option[String]] = column[Option[String]]("user_type", O.Length(32,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column mc_order_id SqlType(int8) */
    val mcOrderId: Rep[Long] = column[Long]("mc_order_id")
    /** Database column operation_type SqlType(varchar), Length(100,true), Default(None) */
    val operationType: Rep[Option[String]] = column[Option[String]]("operation_type", O.Length(100,varying=true), O.Default(None))
    /** Database column new_value SqlType(varchar), Length(256,true), Default(None) */
    val newValue: Rep[Option[String]] = column[Option[String]]("new_value", O.Length(256,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McOrderHistory */
  lazy val McOrderHistory = new TableQuery(tag => new McOrderHistory(tag))

  /** Entity class storing rows of table McPayment
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param payTime Database column pay_time SqlType(timestamp), Default(None)
   *  @param payId Database column pay_id SqlType(varchar), Length(255,true), Default(None)
   *  @param payStatus Database column pay_status SqlType(varchar), Length(6,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param payChannel Database column pay_channel SqlType(varchar), Length(20,true)
   *  @param requestAmount Database column request_amount SqlType(numeric), Default(None)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param amount Database column amount SqlType(numeric), Default(None) */
  final case class McPaymentRow(id: Long, payTime: Option[java.sql.Timestamp] = None, payId: Option[String] = None, payStatus: Option[String] = None, createTime: java.sql.Timestamp, payChannel: String, requestAmount: Option[scala.math.BigDecimal] = None, updateTime: Option[java.sql.Timestamp] = None, amount: Option[scala.math.BigDecimal] = None)
  /** GetResult implicit for fetching McPaymentRow objects using plain SQL queries */
  implicit def GetResultMcPaymentRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[java.sql.Timestamp], e4: GR[String], e5: GR[Option[scala.math.BigDecimal]]): GR[McPaymentRow] = GR{
    prs => import prs._
    McPaymentRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[String], <<?[scala.math.BigDecimal], <<?[java.sql.Timestamp], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table mc_payment. Objects of this class serve as prototypes for rows in queries. */
  class McPayment(_tableTag: Tag) extends profile.api.Table[McPaymentRow](_tableTag, "mc_payment") {
    def * = (id, payTime, payId, payStatus, createTime, payChannel, requestAmount, updateTime, amount) <> (McPaymentRow.tupled, McPaymentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), payTime, payId, payStatus, Rep.Some(createTime), Rep.Some(payChannel), requestAmount, updateTime, amount).shaped.<>({r=>import r._; _1.map(_=> McPaymentRow.tupled((_1.get, _2, _3, _4, _5.get, _6.get, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column pay_time SqlType(timestamp), Default(None) */
    val payTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("pay_time", O.Default(None))
    /** Database column pay_id SqlType(varchar), Length(255,true), Default(None) */
    val payId: Rep[Option[String]] = column[Option[String]]("pay_id", O.Length(255,varying=true), O.Default(None))
    /** Database column pay_status SqlType(varchar), Length(6,true), Default(None) */
    val payStatus: Rep[Option[String]] = column[Option[String]]("pay_status", O.Length(6,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column pay_channel SqlType(varchar), Length(20,true) */
    val payChannel: Rep[String] = column[String]("pay_channel", O.Length(20,varying=true))
    /** Database column request_amount SqlType(numeric), Default(None) */
    val requestAmount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("request_amount", O.Default(None))
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column amount SqlType(numeric), Default(None) */
    val amount: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("amount", O.Default(None))
  }
  /** Collection-like TableQuery object for table McPayment */
  lazy val McPayment = new TableQuery(tag => new McPayment(tag))

  /** Entity class storing rows of table McPdp
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param vehicleClassId Database column vehicle_class_id SqlType(int8)
   *  @param isDirty Database column is_dirty SqlType(bool), Default(Some(false)) */
  final case class McPdpRow(id: Long, createTime: java.sql.Timestamp, updateTime: Option[java.sql.Timestamp] = None, vehicleClassId: Long, isDirty: Option[Boolean] = Some(false))
  /** GetResult implicit for fetching McPdpRow objects using plain SQL queries */
  implicit def GetResultMcPdpRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Boolean]]): GR[McPdpRow] = GR{
    prs => import prs._
    McPdpRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Long], <<?[Boolean]))
  }
  /** Table description of table mc_pdp. Objects of this class serve as prototypes for rows in queries. */
  class McPdp(_tableTag: Tag) extends profile.api.Table[McPdpRow](_tableTag, "mc_pdp") {
    def * = (id, createTime, updateTime, vehicleClassId, isDirty) <> (McPdpRow.tupled, McPdpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), updateTime, Rep.Some(vehicleClassId), isDirty).shaped.<>({r=>import r._; _1.map(_=> McPdpRow.tupled((_1.get, _2.get, _3, _4.get, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column vehicle_class_id SqlType(int8) */
    val vehicleClassId: Rep[Long] = column[Long]("vehicle_class_id")
    /** Database column is_dirty SqlType(bool), Default(Some(false)) */
    val isDirty: Rep[Option[Boolean]] = column[Option[Boolean]]("is_dirty", O.Default(Some(false)))
  }
  /** Collection-like TableQuery object for table McPdp */
  lazy val McPdp = new TableQuery(tag => new McPdp(tag))

  /** Entity class storing rows of table McPdpItem
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param category Database column category SqlType(varchar), Length(20,true), Default(None)
   *  @param name Database column name SqlType(varchar), Length(100,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param link Database column link SqlType(varchar), Length(255,true), Default(None)
   *  @param status Database column status SqlType(varchar), Length(20,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param sortIndex Database column sort_index SqlType(int4), Default(None)
   *  @param pdpId Database column pdp_id SqlType(int8) */
  final case class McPdpItemRow(id: Long, createTime: java.sql.Timestamp, updateTime: Option[java.sql.Timestamp] = None, category: Option[String] = None, name: Option[String] = None, picture: Option[String] = None, link: Option[String] = None, status: Option[String] = None, description: Option[String] = None, sortIndex: Option[Int] = None, pdpId: Long)
  /** GetResult implicit for fetching McPdpItemRow objects using plain SQL queries */
  implicit def GetResultMcPdpItemRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[McPdpItemRow] = GR{
    prs => import prs._
    McPdpItemRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<[Long]))
  }
  /** Table description of table mc_pdp_item. Objects of this class serve as prototypes for rows in queries. */
  class McPdpItem(_tableTag: Tag) extends profile.api.Table[McPdpItemRow](_tableTag, "mc_pdp_item") {
    def * = (id, createTime, updateTime, category, name, picture, link, status, description, sortIndex, pdpId) <> (McPdpItemRow.tupled, McPdpItemRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), updateTime, category, name, picture, link, status, description, sortIndex, Rep.Some(pdpId)).shaped.<>({r=>import r._; _1.map(_=> McPdpItemRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column category SqlType(varchar), Length(20,true), Default(None) */
    val category: Rep[Option[String]] = column[Option[String]]("category", O.Length(20,varying=true), O.Default(None))
    /** Database column name SqlType(varchar), Length(100,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column link SqlType(varchar), Length(255,true), Default(None) */
    val link: Rep[Option[String]] = column[Option[String]]("link", O.Length(255,varying=true), O.Default(None))
    /** Database column status SqlType(varchar), Length(20,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(20,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column sort_index SqlType(int4), Default(None) */
    val sortIndex: Rep[Option[Int]] = column[Option[Int]]("sort_index", O.Default(None))
    /** Database column pdp_id SqlType(int8) */
    val pdpId: Rep[Long] = column[Long]("pdp_id")
  }
  /** Collection-like TableQuery object for table McPdpItem */
  lazy val McPdpItem = new TableQuery(tag => new McPdpItem(tag))

  /** Entity class storing rows of table McPdpItemProd
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param category Database column category SqlType(varchar), Length(20,true), Default(None)
   *  @param name Database column name SqlType(varchar), Length(100,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param link Database column link SqlType(varchar), Length(255,true), Default(None)
   *  @param status Database column status SqlType(varchar), Length(20,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param sortIndex Database column sort_index SqlType(int4), Default(None)
   *  @param pdpId Database column pdp_id SqlType(int8) */
  final case class McPdpItemProdRow(id: Long, createTime: java.sql.Timestamp, updateTime: Option[java.sql.Timestamp] = None, category: Option[String] = None, name: Option[String] = None, picture: Option[String] = None, link: Option[String] = None, status: Option[String] = None, description: Option[String] = None, sortIndex: Option[Int] = None, pdpId: Long)
  /** GetResult implicit for fetching McPdpItemProdRow objects using plain SQL queries */
  implicit def GetResultMcPdpItemProdRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[McPdpItemProdRow] = GR{
    prs => import prs._
    McPdpItemProdRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<[Long]))
  }
  /** Table description of table mc_pdp_item_prod. Objects of this class serve as prototypes for rows in queries. */
  class McPdpItemProd(_tableTag: Tag) extends profile.api.Table[McPdpItemProdRow](_tableTag, "mc_pdp_item_prod") {
    def * = (id, createTime, updateTime, category, name, picture, link, status, description, sortIndex, pdpId) <> (McPdpItemProdRow.tupled, McPdpItemProdRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), updateTime, category, name, picture, link, status, description, sortIndex, Rep.Some(pdpId)).shaped.<>({r=>import r._; _1.map(_=> McPdpItemProdRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column category SqlType(varchar), Length(20,true), Default(None) */
    val category: Rep[Option[String]] = column[Option[String]]("category", O.Length(20,varying=true), O.Default(None))
    /** Database column name SqlType(varchar), Length(100,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column link SqlType(varchar), Length(255,true), Default(None) */
    val link: Rep[Option[String]] = column[Option[String]]("link", O.Length(255,varying=true), O.Default(None))
    /** Database column status SqlType(varchar), Length(20,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(20,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column sort_index SqlType(int4), Default(None) */
    val sortIndex: Rep[Option[Int]] = column[Option[Int]]("sort_index", O.Default(None))
    /** Database column pdp_id SqlType(int8) */
    val pdpId: Rep[Long] = column[Long]("pdp_id")
  }
  /** Collection-like TableQuery object for table McPdpItemProd */
  lazy val McPdpItemProd = new TableQuery(tag => new McPdpItemProd(tag))

  /** Entity class storing rows of table McProduct
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param vehicleModelId Database column vehicle_model_id SqlType(int8), Default(None)
   *  @param vehicleExteriorColourId Database column vehicle_exterior_colour_id SqlType(int8), Default(None)
   *  @param vehicleInteriorColourId Database column vehicle_interior_colour_id SqlType(int8), Default(None)
   *  @param vehicleWheelId Database column vehicle_wheel_id SqlType(int8), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param price Database column price SqlType(numeric), Default(None) */
  final case class McProductRow(id: Long, vehicleModelId: Option[Long] = None, vehicleExteriorColourId: Option[Long] = None, vehicleInteriorColourId: Option[Long] = None, vehicleWheelId: Option[Long] = None, createTime: Option[java.sql.Timestamp], code: Option[String] = None, price: Option[scala.math.BigDecimal] = None)
  /** GetResult implicit for fetching McProductRow objects using plain SQL queries */
  implicit def GetResultMcProductRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[String]], e4: GR[Option[scala.math.BigDecimal]]): GR[McProductRow] = GR{
    prs => import prs._
    McProductRow.tupled((<<[Long], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table mc_product. Objects of this class serve as prototypes for rows in queries. */
  class McProduct(_tableTag: Tag) extends profile.api.Table[McProductRow](_tableTag, "mc_product") {
    def * = (id, vehicleModelId, vehicleExteriorColourId, vehicleInteriorColourId, vehicleWheelId, createTime, code, price) <> (McProductRow.tupled, McProductRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), vehicleModelId, vehicleExteriorColourId, vehicleInteriorColourId, vehicleWheelId, createTime, code, price).shaped.<>({r=>import r._; _1.map(_=> McProductRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column vehicle_model_id SqlType(int8), Default(None) */
    val vehicleModelId: Rep[Option[Long]] = column[Option[Long]]("vehicle_model_id", O.Default(None))
    /** Database column vehicle_exterior_colour_id SqlType(int8), Default(None) */
    val vehicleExteriorColourId: Rep[Option[Long]] = column[Option[Long]]("vehicle_exterior_colour_id", O.Default(None))
    /** Database column vehicle_interior_colour_id SqlType(int8), Default(None) */
    val vehicleInteriorColourId: Rep[Option[Long]] = column[Option[Long]]("vehicle_interior_colour_id", O.Default(None))
    /** Database column vehicle_wheel_id SqlType(int8), Default(None) */
    val vehicleWheelId: Rep[Option[Long]] = column[Option[Long]]("vehicle_wheel_id", O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
  }
  /** Collection-like TableQuery object for table McProduct */
  lazy val McProduct = new TableQuery(tag => new McProduct(tag))

  /** Entity class storing rows of table McProductGift
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param vehicleModelId Database column vehicle_model_id SqlType(int4)
   *  @param code Database column code SqlType(varchar), Length(255,true), Default(None)
   *  @param startTime Database column start_time SqlType(timestamp), Default(None)
   *  @param endTime Database column end_time SqlType(timestamp), Default(None)
   *  @param status Database column status SqlType(varchar), Length(64,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param totalNum Database column total_num SqlType(int4), Default(None)
   *  @param usedNum Database column used_num SqlType(int4), Default(None) */
  final case class McProductGiftRow(id: Long, name: Option[String] = None, picture: Option[String] = None, createTime: java.sql.Timestamp, vehicleModelId: Int, code: Option[String] = None, startTime: Option[java.sql.Timestamp] = None, endTime: Option[java.sql.Timestamp] = None, status: Option[String] = None, description: Option[String] = None, totalNum: Option[Int] = None, usedNum: Option[Int] = None)
  /** GetResult implicit for fetching McProductGiftRow objects using plain SQL queries */
  implicit def GetResultMcProductGiftRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Int], e4: GR[Option[java.sql.Timestamp]], e5: GR[Option[Int]]): GR[McProductGiftRow] = GR{
    prs => import prs._
    McProductGiftRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp], <<[Int], <<?[String], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[Int], <<?[Int]))
  }
  /** Table description of table mc_product_gift. Objects of this class serve as prototypes for rows in queries. */
  class McProductGift(_tableTag: Tag) extends profile.api.Table[McProductGiftRow](_tableTag, "mc_product_gift") {
    def * = (id, name, picture, createTime, vehicleModelId, code, startTime, endTime, status, description, totalNum, usedNum) <> (McProductGiftRow.tupled, McProductGiftRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, Rep.Some(createTime), Rep.Some(vehicleModelId), code, startTime, endTime, status, description, totalNum, usedNum).shaped.<>({r=>import r._; _1.map(_=> McProductGiftRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column vehicle_model_id SqlType(int4) */
    val vehicleModelId: Rep[Int] = column[Int]("vehicle_model_id")
    /** Database column code SqlType(varchar), Length(255,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(255,varying=true), O.Default(None))
    /** Database column start_time SqlType(timestamp), Default(None) */
    val startTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("start_time", O.Default(None))
    /** Database column end_time SqlType(timestamp), Default(None) */
    val endTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("end_time", O.Default(None))
    /** Database column status SqlType(varchar), Length(64,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(64,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column total_num SqlType(int4), Default(None) */
    val totalNum: Rep[Option[Int]] = column[Option[Int]]("total_num", O.Default(None))
    /** Database column used_num SqlType(int4), Default(None) */
    val usedNum: Rep[Option[Int]] = column[Option[Int]]("used_num", O.Default(None))
  }
  /** Collection-like TableQuery object for table McProductGift */
  lazy val McProductGift = new TableQuery(tag => new McProductGift(tag))

  /** Entity class storing rows of table McProductOptionalPackage
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param productId Database column product_id SqlType(int8)
   *  @param optionalPackageId Database column optional_package_id SqlType(int8) */
  final case class McProductOptionalPackageRow(id: Long, productId: Long, optionalPackageId: Long)
  /** GetResult implicit for fetching McProductOptionalPackageRow objects using plain SQL queries */
  implicit def GetResultMcProductOptionalPackageRow(implicit e0: GR[Long]): GR[McProductOptionalPackageRow] = GR{
    prs => import prs._
    McProductOptionalPackageRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table mc_product_optional_package. Objects of this class serve as prototypes for rows in queries. */
  class McProductOptionalPackage(_tableTag: Tag) extends profile.api.Table[McProductOptionalPackageRow](_tableTag, "mc_product_optional_package") {
    def * = (id, productId, optionalPackageId) <> (McProductOptionalPackageRow.tupled, McProductOptionalPackageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(productId), Rep.Some(optionalPackageId)).shaped.<>({r=>import r._; _1.map(_=> McProductOptionalPackageRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product_id SqlType(int8) */
    val productId: Rep[Long] = column[Long]("product_id")
    /** Database column optional_package_id SqlType(int8) */
    val optionalPackageId: Rep[Long] = column[Long]("optional_package_id")
  }
  /** Collection-like TableQuery object for table McProductOptionalPackage */
  lazy val McProductOptionalPackage = new TableQuery(tag => new McProductOptionalPackage(tag))

  /** Entity class storing rows of table McProductSingleOption
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param productId Database column product_id SqlType(int8)
   *  @param singleOptionId Database column single_option_id SqlType(int8) */
  final case class McProductSingleOptionRow(id: Long, productId: Long, singleOptionId: Long)
  /** GetResult implicit for fetching McProductSingleOptionRow objects using plain SQL queries */
  implicit def GetResultMcProductSingleOptionRow(implicit e0: GR[Long]): GR[McProductSingleOptionRow] = GR{
    prs => import prs._
    McProductSingleOptionRow.tupled((<<[Long], <<[Long], <<[Long]))
  }
  /** Table description of table mc_product_single_option. Objects of this class serve as prototypes for rows in queries. */
  class McProductSingleOption(_tableTag: Tag) extends profile.api.Table[McProductSingleOptionRow](_tableTag, "mc_product_single_option") {
    def * = (id, productId, singleOptionId) <> (McProductSingleOptionRow.tupled, McProductSingleOptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(productId), Rep.Some(singleOptionId)).shaped.<>({r=>import r._; _1.map(_=> McProductSingleOptionRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column product_id SqlType(int8) */
    val productId: Rep[Long] = column[Long]("product_id")
    /** Database column single_option_id SqlType(int8) */
    val singleOptionId: Rep[Long] = column[Long]("single_option_id")
  }
  /** Collection-like TableQuery object for table McProductSingleOption */
  lazy val McProductSingleOption = new TableQuery(tag => new McProductSingleOption(tag))

  /** Entity class storing rows of table McRole
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param name Database column name SqlType(varchar), Length(64,true)
   *  @param userType Database column user_type SqlType(varchar), Length(64,true) */
  final case class McRoleRow(id: Long, createTime: java.sql.Timestamp, updateTime: java.sql.Timestamp, name: String, userType: String)
  /** GetResult implicit for fetching McRoleRow objects using plain SQL queries */
  implicit def GetResultMcRoleRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[McRoleRow] = GR{
    prs => import prs._
    McRoleRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[java.sql.Timestamp], <<[String], <<[String]))
  }
  /** Table description of table mc_role. Objects of this class serve as prototypes for rows in queries. */
  class McRole(_tableTag: Tag) extends profile.api.Table[McRoleRow](_tableTag, "mc_role") {
    def * = (id, createTime, updateTime, name, userType) <> (McRoleRow.tupled, McRoleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(updateTime), Rep.Some(name), Rep.Some(userType)).shaped.<>({r=>import r._; _1.map(_=> McRoleRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column name SqlType(varchar), Length(64,true) */
    val name: Rep[String] = column[String]("name", O.Length(64,varying=true))
    /** Database column user_type SqlType(varchar), Length(64,true) */
    val userType: Rep[String] = column[String]("user_type", O.Length(64,varying=true))
  }
  /** Collection-like TableQuery object for table McRole */
  lazy val McRole = new TableQuery(tag => new McRole(tag))

  /** Entity class storing rows of table McRolePermission
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param roleId Database column role_id SqlType(int8)
   *  @param permission Database column permission SqlType(varchar), Length(64,true) */
  final case class McRolePermissionRow(id: Long, createTime: java.sql.Timestamp, roleId: Long, permission: String)
  /** GetResult implicit for fetching McRolePermissionRow objects using plain SQL queries */
  implicit def GetResultMcRolePermissionRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[String]): GR[McRolePermissionRow] = GR{
    prs => import prs._
    McRolePermissionRow.tupled((<<[Long], <<[java.sql.Timestamp], <<[Long], <<[String]))
  }
  /** Table description of table mc_role_permission. Objects of this class serve as prototypes for rows in queries. */
  class McRolePermission(_tableTag: Tag) extends profile.api.Table[McRolePermissionRow](_tableTag, "mc_role_permission") {
    def * = (id, createTime, roleId, permission) <> (McRolePermissionRow.tupled, McRolePermissionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), Rep.Some(roleId), Rep.Some(permission)).shaped.<>({r=>import r._; _1.map(_=> McRolePermissionRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column role_id SqlType(int8) */
    val roleId: Rep[Long] = column[Long]("role_id")
    /** Database column permission SqlType(varchar), Length(64,true) */
    val permission: Rep[String] = column[String]("permission", O.Length(64,varying=true))
  }
  /** Collection-like TableQuery object for table McRolePermission */
  lazy val McRolePermission = new TableQuery(tag => new McRolePermission(tag))

  /** Entity class storing rows of table McStock
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param status Database column status SqlType(varchar), Length(255,true), Default(None)
   *  @param warehouseId Database column warehouse_id SqlType(int8), Default(None)
   *  @param productId Database column product_id SqlType(int8), Default(None)
   *  @param updateTime Database column update_time SqlType(timestamp)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param vinId Database column vin_id SqlType(int8), Default(None)
   *  @param version Database column version SqlType(int8), Default(Some(0)) */
  final case class McStockRow(id: Long, status: Option[String] = None, warehouseId: Option[Long] = None, productId: Option[Long] = None, updateTime: java.sql.Timestamp, createTime: Option[java.sql.Timestamp], vinId: Option[Long] = None, version: Option[Long] = Some(0L))
  /** GetResult implicit for fetching McStockRow objects using plain SQL queries */
  implicit def GetResultMcStockRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[Long]], e3: GR[java.sql.Timestamp], e4: GR[Option[java.sql.Timestamp]]): GR[McStockRow] = GR{
    prs => import prs._
    McStockRow.tupled((<<[Long], <<?[String], <<?[Long], <<?[Long], <<[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[Long], <<?[Long]))
  }
  /** Table description of table mc_stock. Objects of this class serve as prototypes for rows in queries. */
  class McStock(_tableTag: Tag) extends profile.api.Table[McStockRow](_tableTag, "mc_stock") {
    def * = (id, status, warehouseId, productId, updateTime, createTime, vinId, version) <> (McStockRow.tupled, McStockRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), status, warehouseId, productId, Rep.Some(updateTime), createTime, vinId, version).shaped.<>({r=>import r._; _1.map(_=> McStockRow.tupled((_1.get, _2, _3, _4, _5.get, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column status SqlType(varchar), Length(255,true), Default(None) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(255,varying=true), O.Default(None))
    /** Database column warehouse_id SqlType(int8), Default(None) */
    val warehouseId: Rep[Option[Long]] = column[Option[Long]]("warehouse_id", O.Default(None))
    /** Database column product_id SqlType(int8), Default(None) */
    val productId: Rep[Option[Long]] = column[Option[Long]]("product_id", O.Default(None))
    /** Database column update_time SqlType(timestamp) */
    val updateTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("update_time")
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column vin_id SqlType(int8), Default(None) */
    val vinId: Rep[Option[Long]] = column[Option[Long]]("vin_id", O.Default(None))
    /** Database column version SqlType(int8), Default(Some(0)) */
    val version: Rep[Option[Long]] = column[Option[Long]]("version", O.Default(Some(0L)))

    /** Foreign key referencing McVin (database name mc_stock_vin_id_fkey) */
    lazy val mcVinFk = foreignKey("mc_stock_vin_id_fkey", vinId, McVin)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table McStock */
  lazy val McStock = new TableQuery(tag => new McStock(tag))

  /** Entity class storing rows of table McStyleExteriorColour
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param styleId Database column style_id SqlType(int8)
   *  @param colourId Database column colour_id SqlType(int8)
   *  @param defaultOption Database column default_option SqlType(int4)
   *  @param colourRgb Database column colour_rgb SqlType(varchar), Length(7,true), Default(None) */
  final case class McStyleExteriorColourRow(id: Long, createTime: Option[java.sql.Timestamp], styleId: Long, colourId: Long, defaultOption: Int, colourRgb: Option[String] = None)
  /** GetResult implicit for fetching McStyleExteriorColourRow objects using plain SQL queries */
  implicit def GetResultMcStyleExteriorColourRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[Option[String]]): GR[McStyleExteriorColourRow] = GR{
    prs => import prs._
    McStyleExteriorColourRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<[Long], <<[Int], <<?[String]))
  }
  /** Table description of table mc_style_exterior_colour. Objects of this class serve as prototypes for rows in queries. */
  class McStyleExteriorColour(_tableTag: Tag) extends profile.api.Table[McStyleExteriorColourRow](_tableTag, "mc_style_exterior_colour") {
    def * = (id, createTime, styleId, colourId, defaultOption, colourRgb) <> (McStyleExteriorColourRow.tupled, McStyleExteriorColourRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(styleId), Rep.Some(colourId), Rep.Some(defaultOption), colourRgb).shaped.<>({r=>import r._; _1.map(_=> McStyleExteriorColourRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column style_id SqlType(int8) */
    val styleId: Rep[Long] = column[Long]("style_id")
    /** Database column colour_id SqlType(int8) */
    val colourId: Rep[Long] = column[Long]("colour_id")
    /** Database column default_option SqlType(int4) */
    val defaultOption: Rep[Int] = column[Int]("default_option")
    /** Database column colour_rgb SqlType(varchar), Length(7,true), Default(None) */
    val colourRgb: Rep[Option[String]] = column[Option[String]]("colour_rgb", O.Length(7,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McStyleExteriorColour */
  lazy val McStyleExteriorColour = new TableQuery(tag => new McStyleExteriorColour(tag))

  /** Entity class storing rows of table McStyleFeature
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param styleId Database column style_id SqlType(int8), Default(None)
   *  @param leftOffset Database column left_offset SqlType(int8), Default(None)
   *  @param topOffset Database column top_offset SqlType(int8), Default(None)
   *  @param direction Database column direction SqlType(int8), Default(None)
   *  @param featureType Database column feature_type SqlType(varchar), Length(20,true), Default(None)
   *  @param url Database column url SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param title Database column title SqlType(varchar), Length(100,true), Default(None)
   *  @param description Database column description SqlType(text), Default(None)
   *  @param actionType Database column action_type SqlType(varchar), Length(20,true), Default(None) */
  final case class McStyleFeatureRow(id: Long, createTime: java.sql.Timestamp, styleId: Option[Long] = None, leftOffset: Option[Long] = None, topOffset: Option[Long] = None, direction: Option[Long] = None, featureType: Option[String] = None, url: Option[String] = None, picture: Option[String] = None, title: Option[String] = None, description: Option[String] = None, actionType: Option[String] = None)
  /** GetResult implicit for fetching McStyleFeatureRow objects using plain SQL queries */
  implicit def GetResultMcStyleFeatureRow(implicit e0: GR[Long], e1: GR[java.sql.Timestamp], e2: GR[Option[Long]], e3: GR[Option[String]]): GR[McStyleFeatureRow] = GR{
    prs => import prs._
    McStyleFeatureRow.tupled((<<[Long], <<[java.sql.Timestamp], <<?[Long], <<?[Long], <<?[Long], <<?[Long], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_style_feature. Objects of this class serve as prototypes for rows in queries. */
  class McStyleFeature(_tableTag: Tag) extends profile.api.Table[McStyleFeatureRow](_tableTag, "mc_style_feature") {
    def * = (id, createTime, styleId, leftOffset, topOffset, direction, featureType, url, picture, title, description, actionType) <> (McStyleFeatureRow.tupled, McStyleFeatureRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(createTime), styleId, leftOffset, topOffset, direction, featureType, url, picture, title, description, actionType).shaped.<>({r=>import r._; _1.map(_=> McStyleFeatureRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column style_id SqlType(int8), Default(None) */
    val styleId: Rep[Option[Long]] = column[Option[Long]]("style_id", O.Default(None))
    /** Database column left_offset SqlType(int8), Default(None) */
    val leftOffset: Rep[Option[Long]] = column[Option[Long]]("left_offset", O.Default(None))
    /** Database column top_offset SqlType(int8), Default(None) */
    val topOffset: Rep[Option[Long]] = column[Option[Long]]("top_offset", O.Default(None))
    /** Database column direction SqlType(int8), Default(None) */
    val direction: Rep[Option[Long]] = column[Option[Long]]("direction", O.Default(None))
    /** Database column feature_type SqlType(varchar), Length(20,true), Default(None) */
    val featureType: Rep[Option[String]] = column[Option[String]]("feature_type", O.Length(20,varying=true), O.Default(None))
    /** Database column url SqlType(varchar), Length(255,true), Default(None) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column title SqlType(varchar), Length(100,true), Default(None) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(100,varying=true), O.Default(None))
    /** Database column description SqlType(text), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Default(None))
    /** Database column action_type SqlType(varchar), Length(20,true), Default(None) */
    val actionType: Rep[Option[String]] = column[Option[String]]("action_type", O.Length(20,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McStyleFeature */
  lazy val McStyleFeature = new TableQuery(tag => new McStyleFeature(tag))

  /** Entity class storing rows of table McStyleInteriorColour
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param styleId Database column style_id SqlType(int8)
   *  @param colourId Database column colour_id SqlType(int8)
   *  @param defaultOption Database column default_option SqlType(int4)
   *  @param colourRgb Database column colour_rgb SqlType(varchar), Length(7,true), Default(None)
   *  @param panoramaPicture Database column panorama_picture SqlType(varchar), Length(255,true), Default(None) */
  final case class McStyleInteriorColourRow(id: Long, createTime: Option[java.sql.Timestamp], styleId: Long, colourId: Long, defaultOption: Int, colourRgb: Option[String] = None, panoramaPicture: Option[String] = None)
  /** GetResult implicit for fetching McStyleInteriorColourRow objects using plain SQL queries */
  implicit def GetResultMcStyleInteriorColourRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[Option[String]]): GR[McStyleInteriorColourRow] = GR{
    prs => import prs._
    McStyleInteriorColourRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<[Long], <<[Int], <<?[String], <<?[String]))
  }
  /** Table description of table mc_style_interior_colour. Objects of this class serve as prototypes for rows in queries. */
  class McStyleInteriorColour(_tableTag: Tag) extends profile.api.Table[McStyleInteriorColourRow](_tableTag, "mc_style_interior_colour") {
    def * = (id, createTime, styleId, colourId, defaultOption, colourRgb, panoramaPicture) <> (McStyleInteriorColourRow.tupled, McStyleInteriorColourRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(styleId), Rep.Some(colourId), Rep.Some(defaultOption), colourRgb, panoramaPicture).shaped.<>({r=>import r._; _1.map(_=> McStyleInteriorColourRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column style_id SqlType(int8) */
    val styleId: Rep[Long] = column[Long]("style_id")
    /** Database column colour_id SqlType(int8) */
    val colourId: Rep[Long] = column[Long]("colour_id")
    /** Database column default_option SqlType(int4) */
    val defaultOption: Rep[Int] = column[Int]("default_option")
    /** Database column colour_rgb SqlType(varchar), Length(7,true), Default(None) */
    val colourRgb: Rep[Option[String]] = column[Option[String]]("colour_rgb", O.Length(7,varying=true), O.Default(None))
    /** Database column panorama_picture SqlType(varchar), Length(255,true), Default(None) */
    val panoramaPicture: Rep[Option[String]] = column[Option[String]]("panorama_picture", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McStyleInteriorColour */
  lazy val McStyleInteriorColour = new TableQuery(tag => new McStyleInteriorColour(tag))

  /** Entity class storing rows of table McStyleWheel
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param styleId Database column style_id SqlType(int8)
   *  @param wheelId Database column wheel_id SqlType(int8)
   *  @param defaultOption Database column default_option SqlType(int4) */
  final case class McStyleWheelRow(id: Long, createTime: Option[java.sql.Timestamp], styleId: Long, wheelId: Long, defaultOption: Int)
  /** GetResult implicit for fetching McStyleWheelRow objects using plain SQL queries */
  implicit def GetResultMcStyleWheelRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int]): GR[McStyleWheelRow] = GR{
    prs => import prs._
    McStyleWheelRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<[Long], <<[Int]))
  }
  /** Table description of table mc_style_wheel. Objects of this class serve as prototypes for rows in queries. */
  class McStyleWheel(_tableTag: Tag) extends profile.api.Table[McStyleWheelRow](_tableTag, "mc_style_wheel") {
    def * = (id, createTime, styleId, wheelId, defaultOption) <> (McStyleWheelRow.tupled, McStyleWheelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(styleId), Rep.Some(wheelId), Rep.Some(defaultOption)).shaped.<>({r=>import r._; _1.map(_=> McStyleWheelRow.tupled((_1.get, _2, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column style_id SqlType(int8) */
    val styleId: Rep[Long] = column[Long]("style_id")
    /** Database column wheel_id SqlType(int8) */
    val wheelId: Rep[Long] = column[Long]("wheel_id")
    /** Database column default_option SqlType(int4) */
    val defaultOption: Rep[Int] = column[Int]("default_option")
  }
  /** Collection-like TableQuery object for table McStyleWheel */
  lazy val McStyleWheel = new TableQuery(tag => new McStyleWheel(tag))

  /** Entity class storing rows of table McSystemCity
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(varchar), Length(50,true), Default(Some(NORMAL))
   *  @param country Database column country SqlType(varchar), Length(100,true), Default(None)
   *  @param area Database column area SqlType(varchar), Length(100,true), Default(None)
   *  @param province Database column province SqlType(varchar), Length(100,true), Default(None)
   *  @param city Database column city SqlType(varchar), Length(100,true), Default(None)
   *  @param name Database column name SqlType(varchar), Length(100,true), Default(None)
   *  @param lat Database column lat SqlType(numeric), Default(None)
   *  @param lng Database column lng SqlType(numeric), Default(None)
   *  @param code Database column code SqlType(varchar), Length(16,true), Default(None) */
  final case class McSystemCityRow(id: Long, createTime: Option[java.sql.Timestamp], status: Option[String] = Some("NORMAL"), country: Option[String] = None, area: Option[String] = None, province: Option[String] = None, city: Option[String] = None, name: Option[String] = None, lat: Option[scala.math.BigDecimal] = None, lng: Option[scala.math.BigDecimal] = None, code: Option[String] = None)
  /** GetResult implicit for fetching McSystemCityRow objects using plain SQL queries */
  implicit def GetResultMcSystemCityRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[scala.math.BigDecimal]]): GR[McSystemCityRow] = GR{
    prs => import prs._
    McSystemCityRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table mc_system_city. Objects of this class serve as prototypes for rows in queries. */
  class McSystemCity(_tableTag: Tag) extends profile.api.Table[McSystemCityRow](_tableTag, "mc_system_city") {
    def * = (id, createTime, status, country, area, province, city, name, lat, lng, code) <> (McSystemCityRow.tupled, McSystemCityRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, status, country, area, province, city, name, lat, lng, code).shaped.<>({r=>import r._; _1.map(_=> McSystemCityRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(varchar), Length(50,true), Default(Some(NORMAL)) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(50,varying=true), O.Default(Some("NORMAL")))
    /** Database column country SqlType(varchar), Length(100,true), Default(None) */
    val country: Rep[Option[String]] = column[Option[String]]("country", O.Length(100,varying=true), O.Default(None))
    /** Database column area SqlType(varchar), Length(100,true), Default(None) */
    val area: Rep[Option[String]] = column[Option[String]]("area", O.Length(100,varying=true), O.Default(None))
    /** Database column province SqlType(varchar), Length(100,true), Default(None) */
    val province: Rep[Option[String]] = column[Option[String]]("province", O.Length(100,varying=true), O.Default(None))
    /** Database column city SqlType(varchar), Length(100,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(100,varying=true), O.Default(None))
    /** Database column name SqlType(varchar), Length(100,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true), O.Default(None))
    /** Database column lat SqlType(numeric), Default(None) */
    val lat: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("lat", O.Default(None))
    /** Database column lng SqlType(numeric), Default(None) */
    val lng: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("lng", O.Default(None))
    /** Database column code SqlType(varchar), Length(16,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(16,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McSystemCity */
  lazy val McSystemCity = new TableQuery(tag => new McSystemCity(tag))

  /** Entity class storing rows of table McSystemMenuFooter
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(int4), Default(0)
   *  @param name Database column name SqlType(varchar), Length(100,true)
   *  @param link Database column link SqlType(varchar), Length(200,true), Default(None)
   *  @param icon Database column icon SqlType(varchar), Length(200,true), Default(None)
   *  @param parentId Database column parent_id SqlType(int4), Default(0) */
  final case class McSystemMenuFooterRow(id: Long, createTime: Option[java.sql.Timestamp], status: Int = 0, name: String, link: Option[String] = None, icon: Option[String] = None, parentId: Int = 0)
  /** GetResult implicit for fetching McSystemMenuFooterRow objects using plain SQL queries */
  implicit def GetResultMcSystemMenuFooterRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[String], e4: GR[Option[String]]): GR[McSystemMenuFooterRow] = GR{
    prs => import prs._
    McSystemMenuFooterRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Int], <<[String], <<?[String], <<?[String], <<[Int]))
  }
  /** Table description of table mc_system_menu_footer. Objects of this class serve as prototypes for rows in queries. */
  class McSystemMenuFooter(_tableTag: Tag) extends profile.api.Table[McSystemMenuFooterRow](_tableTag, "mc_system_menu_footer") {
    def * = (id, createTime, status, name, link, icon, parentId) <> (McSystemMenuFooterRow.tupled, McSystemMenuFooterRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(name), link, icon, Rep.Some(parentId)).shaped.<>({r=>import r._; _1.map(_=> McSystemMenuFooterRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(int4), Default(0) */
    val status: Rep[Int] = column[Int]("status", O.Default(0))
    /** Database column name SqlType(varchar), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column link SqlType(varchar), Length(200,true), Default(None) */
    val link: Rep[Option[String]] = column[Option[String]]("link", O.Length(200,varying=true), O.Default(None))
    /** Database column icon SqlType(varchar), Length(200,true), Default(None) */
    val icon: Rep[Option[String]] = column[Option[String]]("icon", O.Length(200,varying=true), O.Default(None))
    /** Database column parent_id SqlType(int4), Default(0) */
    val parentId: Rep[Int] = column[Int]("parent_id", O.Default(0))
  }
  /** Collection-like TableQuery object for table McSystemMenuFooter */
  lazy val McSystemMenuFooter = new TableQuery(tag => new McSystemMenuFooter(tag))

  /** Entity class storing rows of table McSystemMenuNavigator
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(int4), Default(0)
   *  @param name Database column name SqlType(varchar), Length(100,true)
   *  @param link Database column link SqlType(varchar), Length(200,true), Default(None)
   *  @param icon Database column icon SqlType(varchar), Length(200,true), Default(None)
   *  @param parentId Database column parent_id SqlType(int4), Default(Some(0)) */
  final case class McSystemMenuNavigatorRow(id: Long, createTime: Option[java.sql.Timestamp], status: Int = 0, name: String, link: Option[String] = None, icon: Option[String] = None, parentId: Option[Int] = Some(0))
  /** GetResult implicit for fetching McSystemMenuNavigatorRow objects using plain SQL queries */
  implicit def GetResultMcSystemMenuNavigatorRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[String], e4: GR[Option[String]], e5: GR[Option[Int]]): GR[McSystemMenuNavigatorRow] = GR{
    prs => import prs._
    McSystemMenuNavigatorRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Int], <<[String], <<?[String], <<?[String], <<?[Int]))
  }
  /** Table description of table mc_system_menu_navigator. Objects of this class serve as prototypes for rows in queries. */
  class McSystemMenuNavigator(_tableTag: Tag) extends profile.api.Table[McSystemMenuNavigatorRow](_tableTag, "mc_system_menu_navigator") {
    def * = (id, createTime, status, name, link, icon, parentId) <> (McSystemMenuNavigatorRow.tupled, McSystemMenuNavigatorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(name), link, icon, parentId).shaped.<>({r=>import r._; _1.map(_=> McSystemMenuNavigatorRow.tupled((_1.get, _2, _3.get, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(int4), Default(0) */
    val status: Rep[Int] = column[Int]("status", O.Default(0))
    /** Database column name SqlType(varchar), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column link SqlType(varchar), Length(200,true), Default(None) */
    val link: Rep[Option[String]] = column[Option[String]]("link", O.Length(200,varying=true), O.Default(None))
    /** Database column icon SqlType(varchar), Length(200,true), Default(None) */
    val icon: Rep[Option[String]] = column[Option[String]]("icon", O.Length(200,varying=true), O.Default(None))
    /** Database column parent_id SqlType(int4), Default(Some(0)) */
    val parentId: Rep[Option[Int]] = column[Option[Int]]("parent_id", O.Default(Some(0)))
  }
  /** Collection-like TableQuery object for table McSystemMenuNavigator */
  lazy val McSystemMenuNavigator = new TableQuery(tag => new McSystemMenuNavigator(tag))

  /** Entity class storing rows of table McTestDriveCar
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param plateNumber Database column plate_number SqlType(varchar), Length(100,true)
   *  @param plateFirstNumber Database column plate_first_number SqlType(varchar), Length(2,true)
   *  @param plateLastNumber Database column plate_last_number SqlType(varchar), Length(2,true)
   *  @param status Database column status SqlType(varchar), Length(20,true)
   *  @param vehicleModelId Database column vehicle_model_id SqlType(int8)
   *  @param cityCode Database column city_code SqlType(varchar), Length(16,true) */
  final case class McTestDriveCarRow(id: Long, createTime: Option[java.sql.Timestamp], plateNumber: String, plateFirstNumber: String, plateLastNumber: String, status: String, vehicleModelId: Long, cityCode: String)
  /** GetResult implicit for fetching McTestDriveCarRow objects using plain SQL queries */
  implicit def GetResultMcTestDriveCarRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String]): GR[McTestDriveCarRow] = GR{
    prs => import prs._
    McTestDriveCarRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String], <<[Long], <<[String]))
  }
  /** Table description of table mc_test_drive_car. Objects of this class serve as prototypes for rows in queries. */
  class McTestDriveCar(_tableTag: Tag) extends profile.api.Table[McTestDriveCarRow](_tableTag, "mc_test_drive_car") {
    def * = (id, createTime, plateNumber, plateFirstNumber, plateLastNumber, status, vehicleModelId, cityCode) <> (McTestDriveCarRow.tupled, McTestDriveCarRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(plateNumber), Rep.Some(plateFirstNumber), Rep.Some(plateLastNumber), Rep.Some(status), Rep.Some(vehicleModelId), Rep.Some(cityCode)).shaped.<>({r=>import r._; _1.map(_=> McTestDriveCarRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column plate_number SqlType(varchar), Length(100,true) */
    val plateNumber: Rep[String] = column[String]("plate_number", O.Length(100,varying=true))
    /** Database column plate_first_number SqlType(varchar), Length(2,true) */
    val plateFirstNumber: Rep[String] = column[String]("plate_first_number", O.Length(2,varying=true))
    /** Database column plate_last_number SqlType(varchar), Length(2,true) */
    val plateLastNumber: Rep[String] = column[String]("plate_last_number", O.Length(2,varying=true))
    /** Database column status SqlType(varchar), Length(20,true) */
    val status: Rep[String] = column[String]("status", O.Length(20,varying=true))
    /** Database column vehicle_model_id SqlType(int8) */
    val vehicleModelId: Rep[Long] = column[Long]("vehicle_model_id")
    /** Database column city_code SqlType(varchar), Length(16,true) */
    val cityCode: Rep[String] = column[String]("city_code", O.Length(16,varying=true))
  }
  /** Collection-like TableQuery object for table McTestDriveCar */
  lazy val McTestDriveCar = new TableQuery(tag => new McTestDriveCar(tag))

  /** Entity class storing rows of table McTestDriveComment
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param testDriveOrderId Database column test_drive_order_id SqlType(int8)
   *  @param content Database column content SqlType(text) */
  final case class McTestDriveCommentRow(id: Long, createTime: Option[java.sql.Timestamp], testDriveOrderId: Long, content: String)
  /** GetResult implicit for fetching McTestDriveCommentRow objects using plain SQL queries */
  implicit def GetResultMcTestDriveCommentRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String]): GR[McTestDriveCommentRow] = GR{
    prs => import prs._
    McTestDriveCommentRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[Long], <<[String]))
  }
  /** Table description of table mc_test_drive_comment. Objects of this class serve as prototypes for rows in queries. */
  class McTestDriveComment(_tableTag: Tag) extends profile.api.Table[McTestDriveCommentRow](_tableTag, "mc_test_drive_comment") {
    def * = (id, createTime, testDriveOrderId, content) <> (McTestDriveCommentRow.tupled, McTestDriveCommentRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(testDriveOrderId), Rep.Some(content)).shaped.<>({r=>import r._; _1.map(_=> McTestDriveCommentRow.tupled((_1.get, _2, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column test_drive_order_id SqlType(int8) */
    val testDriveOrderId: Rep[Long] = column[Long]("test_drive_order_id")
    /** Database column content SqlType(text) */
    val content: Rep[String] = column[String]("content")
  }
  /** Collection-like TableQuery object for table McTestDriveComment */
  lazy val McTestDriveComment = new TableQuery(tag => new McTestDriveComment(tag))

  /** Entity class storing rows of table McTestDriveOrder
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param testDriveCarId Database column test_drive_car_id SqlType(int8), Default(None)
   *  @param testDriveTimeId Database column test_drive_time_id SqlType(int8)
   *  @param status Database column status SqlType(varchar), Length(20,true)
   *  @param testDriveAddress Database column test_drive_address SqlType(varchar), Length(500,true)
   *  @param testDriveDate Database column test_drive_date SqlType(timestamp)
   *  @param vehicleModelId Database column vehicle_model_id SqlType(int8), Default(None)
   *  @param customerName Database column customer_name SqlType(varchar), Length(20,true)
   *  @param customerMobile Database column customer_mobile SqlType(varchar), Length(20,true)
   *  @param dealerId Database column dealer_id SqlType(int4), Default(None)
   *  @param customerId Database column customer_id SqlType(int4), Default(None)
   *  @param cityCode Database column city_code SqlType(varchar), Length(16,true)
   *  @param memo Database column memo SqlType(text), Default(None)
   *  @param cityName Database column city_name SqlType(varchar), Length(32,true), Default(None)
   *  @param districtCode Database column district_code SqlType(varchar), Length(16,true), Default(None)
   *  @param districtName Database column district_name SqlType(varchar), Length(32,true), Default(None)
   *  @param reservationId Database column reservation_id SqlType(varchar), Length(255,true), Default(None)
   *  @param testDriveNumber Database column test_drive_number SqlType(varchar), Length(255,true), Default(None) */
  final case class McTestDriveOrderRow(id: Long, createTime: Option[java.sql.Timestamp], testDriveCarId: Option[Long] = None, testDriveTimeId: Long, status: String, testDriveAddress: String, testDriveDate: java.sql.Timestamp, vehicleModelId: Option[Long] = None, customerName: String, customerMobile: String, dealerId: Option[Int] = None, customerId: Option[Int] = None, cityCode: String, memo: Option[String] = None, cityName: Option[String] = None, districtCode: Option[String] = None, districtName: Option[String] = None, reservationId: Option[String] = None, testDriveNumber: Option[String] = None)
  /** GetResult implicit for fetching McTestDriveOrderRow objects using plain SQL queries */
  implicit def GetResultMcTestDriveOrderRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[Long]], e3: GR[String], e4: GR[java.sql.Timestamp], e5: GR[Option[Int]], e6: GR[Option[String]]): GR[McTestDriveOrderRow] = GR{
    prs => import prs._
    McTestDriveOrderRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[Long], <<[Long], <<[String], <<[String], <<[java.sql.Timestamp], <<?[Long], <<[String], <<[String], <<?[Int], <<?[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_test_drive_order. Objects of this class serve as prototypes for rows in queries. */
  class McTestDriveOrder(_tableTag: Tag) extends profile.api.Table[McTestDriveOrderRow](_tableTag, "mc_test_drive_order") {
    def * = (id, createTime, testDriveCarId, testDriveTimeId, status, testDriveAddress, testDriveDate, vehicleModelId, customerName, customerMobile, dealerId, customerId, cityCode, memo, cityName, districtCode, districtName, reservationId, testDriveNumber) <> (McTestDriveOrderRow.tupled, McTestDriveOrderRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, testDriveCarId, Rep.Some(testDriveTimeId), Rep.Some(status), Rep.Some(testDriveAddress), Rep.Some(testDriveDate), vehicleModelId, Rep.Some(customerName), Rep.Some(customerMobile), dealerId, customerId, Rep.Some(cityCode), memo, cityName, districtCode, districtName, reservationId, testDriveNumber).shaped.<>({r=>import r._; _1.map(_=> McTestDriveOrderRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7.get, _8, _9.get, _10.get, _11, _12, _13.get, _14, _15, _16, _17, _18, _19)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column test_drive_car_id SqlType(int8), Default(None) */
    val testDriveCarId: Rep[Option[Long]] = column[Option[Long]]("test_drive_car_id", O.Default(None))
    /** Database column test_drive_time_id SqlType(int8) */
    val testDriveTimeId: Rep[Long] = column[Long]("test_drive_time_id")
    /** Database column status SqlType(varchar), Length(20,true) */
    val status: Rep[String] = column[String]("status", O.Length(20,varying=true))
    /** Database column test_drive_address SqlType(varchar), Length(500,true) */
    val testDriveAddress: Rep[String] = column[String]("test_drive_address", O.Length(500,varying=true))
    /** Database column test_drive_date SqlType(timestamp) */
    val testDriveDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("test_drive_date")
    /** Database column vehicle_model_id SqlType(int8), Default(None) */
    val vehicleModelId: Rep[Option[Long]] = column[Option[Long]]("vehicle_model_id", O.Default(None))
    /** Database column customer_name SqlType(varchar), Length(20,true) */
    val customerName: Rep[String] = column[String]("customer_name", O.Length(20,varying=true))
    /** Database column customer_mobile SqlType(varchar), Length(20,true) */
    val customerMobile: Rep[String] = column[String]("customer_mobile", O.Length(20,varying=true))
    /** Database column dealer_id SqlType(int4), Default(None) */
    val dealerId: Rep[Option[Int]] = column[Option[Int]]("dealer_id", O.Default(None))
    /** Database column customer_id SqlType(int4), Default(None) */
    val customerId: Rep[Option[Int]] = column[Option[Int]]("customer_id", O.Default(None))
    /** Database column city_code SqlType(varchar), Length(16,true) */
    val cityCode: Rep[String] = column[String]("city_code", O.Length(16,varying=true))
    /** Database column memo SqlType(text), Default(None) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Default(None))
    /** Database column city_name SqlType(varchar), Length(32,true), Default(None) */
    val cityName: Rep[Option[String]] = column[Option[String]]("city_name", O.Length(32,varying=true), O.Default(None))
    /** Database column district_code SqlType(varchar), Length(16,true), Default(None) */
    val districtCode: Rep[Option[String]] = column[Option[String]]("district_code", O.Length(16,varying=true), O.Default(None))
    /** Database column district_name SqlType(varchar), Length(32,true), Default(None) */
    val districtName: Rep[Option[String]] = column[Option[String]]("district_name", O.Length(32,varying=true), O.Default(None))
    /** Database column reservation_id SqlType(varchar), Length(255,true), Default(None) */
    val reservationId: Rep[Option[String]] = column[Option[String]]("reservation_id", O.Length(255,varying=true), O.Default(None))
    /** Database column test_drive_number SqlType(varchar), Length(255,true), Default(None) */
    val testDriveNumber: Rep[Option[String]] = column[Option[String]]("test_drive_number", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McTestDriveOrder */
  lazy val McTestDriveOrder = new TableQuery(tag => new McTestDriveOrder(tag))

  /** Entity class storing rows of table McTestDriveTime
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(varchar), Length(20,true)
   *  @param beginTime Database column begin_time SqlType(int4)
   *  @param endTime Database column end_time SqlType(int4) */
  final case class McTestDriveTimeRow(id: Long, createTime: Option[java.sql.Timestamp], status: String, beginTime: Int, endTime: Int)
  /** GetResult implicit for fetching McTestDriveTimeRow objects using plain SQL queries */
  implicit def GetResultMcTestDriveTimeRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Int]): GR[McTestDriveTimeRow] = GR{
    prs => import prs._
    McTestDriveTimeRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[Int], <<[Int]))
  }
  /** Table description of table mc_test_drive_time. Objects of this class serve as prototypes for rows in queries. */
  class McTestDriveTime(_tableTag: Tag) extends profile.api.Table[McTestDriveTimeRow](_tableTag, "mc_test_drive_time") {
    def * = (id, createTime, status, beginTime, endTime) <> (McTestDriveTimeRow.tupled, McTestDriveTimeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(beginTime), Rep.Some(endTime)).shaped.<>({r=>import r._; _1.map(_=> McTestDriveTimeRow.tupled((_1.get, _2, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(varchar), Length(20,true) */
    val status: Rep[String] = column[String]("status", O.Length(20,varying=true))
    /** Database column begin_time SqlType(int4) */
    val beginTime: Rep[Int] = column[Int]("begin_time")
    /** Database column end_time SqlType(int4) */
    val endTime: Rep[Int] = column[Int]("end_time")
  }
  /** Collection-like TableQuery object for table McTestDriveTime */
  lazy val McTestDriveTime = new TableQuery(tag => new McTestDriveTime(tag))

  /** Entity class storing rows of table McVehicleClass
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(varchar), Length(50,true)
   *  @param name Database column name SqlType(varchar), Length(200,true)
   *  @param picture Database column picture SqlType(varchar), Length(200,true)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param rank Database column rank SqlType(int4), Default(None)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None) */
  final case class McVehicleClassRow(id: Long, createTime: Option[java.sql.Timestamp], status: String, name: String, picture: String, description: Option[String] = None, rank: Option[Int] = None, code: Option[String] = None, updateTime: Option[java.sql.Timestamp] = None)
  /** GetResult implicit for fetching McVehicleClassRow objects using plain SQL queries */
  implicit def GetResultMcVehicleClassRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[Int]]): GR[McVehicleClassRow] = GR{
    prs => import prs._
    McVehicleClassRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<?[String], <<?[Int], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mc_vehicle_class. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleClass(_tableTag: Tag) extends profile.api.Table[McVehicleClassRow](_tableTag, "mc_vehicle_class") {
    def * = (id, createTime, status, name, picture, description, rank, code, updateTime) <> (McVehicleClassRow.tupled, McVehicleClassRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(name), Rep.Some(picture), description, rank, code, updateTime).shaped.<>({r=>import r._; _1.map(_=> McVehicleClassRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7, _8, _9)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(varchar), Length(50,true) */
    val status: Rep[String] = column[String]("status", O.Length(50,varying=true))
    /** Database column name SqlType(varchar), Length(200,true) */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true))
    /** Database column picture SqlType(varchar), Length(200,true) */
    val picture: Rep[String] = column[String]("picture", O.Length(200,varying=true))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column rank SqlType(int4), Default(None) */
    val rank: Rep[Option[Int]] = column[Option[Int]]("rank", O.Default(None))
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleClass */
  lazy val McVehicleClass = new TableQuery(tag => new McVehicleClass(tag))

  /** Entity class storing rows of table McVehicleFeatureExteriorColours
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param color Database column color SqlType(varchar), Length(32,true), Default(None) */
  final case class McVehicleFeatureExteriorColoursRow(id: Long, name: Option[String] = None, picture: Option[String] = None, createTime: java.sql.Timestamp, code: Option[String] = None, description: Option[String] = None, color: Option[String] = None)
  /** GetResult implicit for fetching McVehicleFeatureExteriorColoursRow objects using plain SQL queries */
  implicit def GetResultMcVehicleFeatureExteriorColoursRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[McVehicleFeatureExteriorColoursRow] = GR{
    prs => import prs._
    McVehicleFeatureExteriorColoursRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_vehicle_feature_exterior_colours. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleFeatureExteriorColours(_tableTag: Tag) extends profile.api.Table[McVehicleFeatureExteriorColoursRow](_tableTag, "mc_vehicle_feature_exterior_colours") {
    def * = (id, name, picture, createTime, code, description, color) <> (McVehicleFeatureExteriorColoursRow.tupled, McVehicleFeatureExteriorColoursRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, Rep.Some(createTime), code, description, color).shaped.<>({r=>import r._; _1.map(_=> McVehicleFeatureExteriorColoursRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column color SqlType(varchar), Length(32,true), Default(None) */
    val color: Rep[Option[String]] = column[Option[String]]("color", O.Length(32,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleFeatureExteriorColours */
  lazy val McVehicleFeatureExteriorColours = new TableQuery(tag => new McVehicleFeatureExteriorColours(tag))

  /** Entity class storing rows of table McVehicleFeatureInteriorColours
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param color Database column color SqlType(varchar), Length(32,true), Default(None) */
  final case class McVehicleFeatureInteriorColoursRow(id: Long, name: Option[String] = None, picture: Option[String] = None, createTime: java.sql.Timestamp, code: Option[String] = None, description: Option[String] = None, color: Option[String] = None)
  /** GetResult implicit for fetching McVehicleFeatureInteriorColoursRow objects using plain SQL queries */
  implicit def GetResultMcVehicleFeatureInteriorColoursRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp]): GR[McVehicleFeatureInteriorColoursRow] = GR{
    prs => import prs._
    McVehicleFeatureInteriorColoursRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_vehicle_feature_interior_colours. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleFeatureInteriorColours(_tableTag: Tag) extends profile.api.Table[McVehicleFeatureInteriorColoursRow](_tableTag, "mc_vehicle_feature_interior_colours") {
    def * = (id, name, picture, createTime, code, description, color) <> (McVehicleFeatureInteriorColoursRow.tupled, McVehicleFeatureInteriorColoursRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, Rep.Some(createTime), code, description, color).shaped.<>({r=>import r._; _1.map(_=> McVehicleFeatureInteriorColoursRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column color SqlType(varchar), Length(32,true), Default(None) */
    val color: Rep[Option[String]] = column[Option[String]]("color", O.Length(32,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleFeatureInteriorColours */
  lazy val McVehicleFeatureInteriorColours = new TableQuery(tag => new McVehicleFeatureInteriorColours(tag))

  /** Entity class storing rows of table McVehicleFeatureOptionalPackages
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(varchar), Length(255,true), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param price Database column price SqlType(numeric), Default(None)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param dependence Database column dependence SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None) */
  final case class McVehicleFeatureOptionalPackagesRow(id: Long, code: Option[String] = None, name: Option[String] = None, price: Option[scala.math.BigDecimal] = None, description: Option[String] = None, dependence: Option[String] = None, createTime: Option[java.sql.Timestamp], picture: Option[String] = None)
  /** GetResult implicit for fetching McVehicleFeatureOptionalPackagesRow objects using plain SQL queries */
  implicit def GetResultMcVehicleFeatureOptionalPackagesRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]]): GR[McVehicleFeatureOptionalPackagesRow] = GR{
    prs => import prs._
    McVehicleFeatureOptionalPackagesRow.tupled((<<[Long], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table mc_vehicle_feature_optional_packages. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleFeatureOptionalPackages(_tableTag: Tag) extends profile.api.Table[McVehicleFeatureOptionalPackagesRow](_tableTag, "mc_vehicle_feature_optional_packages") {
    def * = (id, code, name, price, description, dependence, createTime, picture) <> (McVehicleFeatureOptionalPackagesRow.tupled, McVehicleFeatureOptionalPackagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), code, name, price, description, dependence, createTime, picture).shaped.<>({r=>import r._; _1.map(_=> McVehicleFeatureOptionalPackagesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(varchar), Length(255,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(255,varying=true), O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column dependence SqlType(varchar), Length(255,true), Default(None) */
    val dependence: Rep[Option[String]] = column[Option[String]]("dependence", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleFeatureOptionalPackages */
  lazy val McVehicleFeatureOptionalPackages = new TableQuery(tag => new McVehicleFeatureOptionalPackages(tag))

  /** Entity class storing rows of table McVehicleFeatureSingleOptions
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param code Database column code SqlType(varchar), Length(255,true), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param price Database column price SqlType(numeric), Default(None)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param dependence Database column dependence SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None) */
  final case class McVehicleFeatureSingleOptionsRow(id: Long, code: Option[String] = None, name: Option[String] = None, price: Option[scala.math.BigDecimal] = None, description: Option[String] = None, dependence: Option[String] = None, createTime: Option[java.sql.Timestamp], picture: Option[String] = None)
  /** GetResult implicit for fetching McVehicleFeatureSingleOptionsRow objects using plain SQL queries */
  implicit def GetResultMcVehicleFeatureSingleOptionsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[Option[scala.math.BigDecimal]], e3: GR[Option[java.sql.Timestamp]]): GR[McVehicleFeatureSingleOptionsRow] = GR{
    prs => import prs._
    McVehicleFeatureSingleOptionsRow.tupled((<<[Long], <<?[String], <<?[String], <<?[scala.math.BigDecimal], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[String]))
  }
  /** Table description of table mc_vehicle_feature_single_options. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleFeatureSingleOptions(_tableTag: Tag) extends profile.api.Table[McVehicleFeatureSingleOptionsRow](_tableTag, "mc_vehicle_feature_single_options") {
    def * = (id, code, name, price, description, dependence, createTime, picture) <> (McVehicleFeatureSingleOptionsRow.tupled, McVehicleFeatureSingleOptionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), code, name, price, description, dependence, createTime, picture).shaped.<>({r=>import r._; _1.map(_=> McVehicleFeatureSingleOptionsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column code SqlType(varchar), Length(255,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(255,varying=true), O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column dependence SqlType(varchar), Length(255,true), Default(None) */
    val dependence: Rep[Option[String]] = column[Option[String]]("dependence", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleFeatureSingleOptions */
  lazy val McVehicleFeatureSingleOptions = new TableQuery(tag => new McVehicleFeatureSingleOptions(tag))

  /** Entity class storing rows of table McVehicleFeatureWheels
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param price Database column price SqlType(numeric), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None) */
  final case class McVehicleFeatureWheelsRow(id: Long, name: Option[String] = None, picture: Option[String] = None, createTime: java.sql.Timestamp, code: Option[String] = None, price: Option[scala.math.BigDecimal] = None, description: Option[String] = None)
  /** GetResult implicit for fetching McVehicleFeatureWheelsRow objects using plain SQL queries */
  implicit def GetResultMcVehicleFeatureWheelsRow(implicit e0: GR[Long], e1: GR[Option[String]], e2: GR[java.sql.Timestamp], e3: GR[Option[scala.math.BigDecimal]]): GR[McVehicleFeatureWheelsRow] = GR{
    prs => import prs._
    McVehicleFeatureWheelsRow.tupled((<<[Long], <<?[String], <<?[String], <<[java.sql.Timestamp], <<?[String], <<?[scala.math.BigDecimal], <<?[String]))
  }
  /** Table description of table mc_vehicle_feature_wheels. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleFeatureWheels(_tableTag: Tag) extends profile.api.Table[McVehicleFeatureWheelsRow](_tableTag, "mc_vehicle_feature_wheels") {
    def * = (id, name, picture, createTime, code, price, description) <> (McVehicleFeatureWheelsRow.tupled, McVehicleFeatureWheelsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, picture, Rep.Some(createTime), code, price, description).shaped.<>({r=>import r._; _1.map(_=> McVehicleFeatureWheelsRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(varchar), Length(255,true), Default(None) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("create_time")
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleFeatureWheels */
  lazy val McVehicleFeatureWheels = new TableQuery(tag => new McVehicleFeatureWheels(tag))

  /** Entity class storing rows of table McVehicleModel
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(varchar), Length(50,true)
   *  @param name Database column name SqlType(varchar), Length(200,true)
   *  @param price Database column price SqlType(varchar), Length(200,true)
   *  @param monthlyPayment Database column monthly_payment SqlType(varchar), Length(200,true)
   *  @param mcVehicleStyleId Database column mc_vehicle_style_id SqlType(int4)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(200,true), Default(None)
   *  @param intentionFee Database column intention_fee SqlType(varchar), Length(200,true), Default(None)
   *  @param modelArgsId Database column model_args_id SqlType(int8), Default(None) */
  final case class McVehicleModelRow(id: Long, createTime: Option[java.sql.Timestamp], status: String, name: String, price: String, monthlyPayment: String, mcVehicleStyleId: Int, code: Option[String] = None, picture: Option[String] = None, intentionFee: Option[String] = None, modelArgsId: Option[Long] = None)
  /** GetResult implicit for fetching McVehicleModelRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Int], e4: GR[Option[String]], e5: GR[Option[Long]]): GR[McVehicleModelRow] = GR{
    prs => import prs._
    McVehicleModelRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[String], <<[String], <<[Int], <<?[String], <<?[String], <<?[String], <<?[Long]))
  }
  /** Table description of table mc_vehicle_model. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModel(_tableTag: Tag) extends profile.api.Table[McVehicleModelRow](_tableTag, "mc_vehicle_model") {
    def * = (id, createTime, status, name, price, monthlyPayment, mcVehicleStyleId, code, picture, intentionFee, modelArgsId) <> (McVehicleModelRow.tupled, McVehicleModelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(name), Rep.Some(price), Rep.Some(monthlyPayment), Rep.Some(mcVehicleStyleId), code, picture, intentionFee, modelArgsId).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6.get, _7.get, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(varchar), Length(50,true) */
    val status: Rep[String] = column[String]("status", O.Length(50,varying=true))
    /** Database column name SqlType(varchar), Length(200,true) */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true))
    /** Database column price SqlType(varchar), Length(200,true) */
    val price: Rep[String] = column[String]("price", O.Length(200,varying=true))
    /** Database column monthly_payment SqlType(varchar), Length(200,true) */
    val monthlyPayment: Rep[String] = column[String]("monthly_payment", O.Length(200,varying=true))
    /** Database column mc_vehicle_style_id SqlType(int4) */
    val mcVehicleStyleId: Rep[Int] = column[Int]("mc_vehicle_style_id")
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(200,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(200,varying=true), O.Default(None))
    /** Database column intention_fee SqlType(varchar), Length(200,true), Default(None) */
    val intentionFee: Rep[Option[String]] = column[Option[String]]("intention_fee", O.Length(200,varying=true), O.Default(None))
    /** Database column model_args_id SqlType(int8), Default(None) */
    val modelArgsId: Rep[Option[Long]] = column[Option[Long]]("model_args_id", O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleModel */
  lazy val McVehicleModel = new TableQuery(tag => new McVehicleModel(tag))

  /** Entity class storing rows of table McVehicleModelArgs
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param arg1 Database column arg1 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg2 Database column arg2 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg3 Database column arg3 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg4 Database column arg4 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg5 Database column arg5 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg6 Database column arg6 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg7 Database column arg7 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg8 Database column arg8 SqlType(varchar), Length(2048,true), Default(None)
   *  @param arg9 Database column arg9 SqlType(varchar), Length(2048,true), Default(None) */
  final case class McVehicleModelArgsRow(id: Long, createTime: Option[java.sql.Timestamp], arg1: Option[String] = None, arg2: Option[String] = None, arg3: Option[String] = None, arg4: Option[String] = None, arg5: Option[String] = None, arg6: Option[String] = None, arg7: Option[String] = None, arg8: Option[String] = None, arg9: Option[String] = None)
  /** GetResult implicit for fetching McVehicleModelArgsRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelArgsRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]]): GR[McVehicleModelArgsRow] = GR{
    prs => import prs._
    McVehicleModelArgsRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table mc_vehicle_model_args. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelArgs(_tableTag: Tag) extends profile.api.Table[McVehicleModelArgsRow](_tableTag, "mc_vehicle_model_args") {
    def * = (id, createTime, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) <> (McVehicleModelArgsRow.tupled, McVehicleModelArgsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelArgsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column arg1 SqlType(varchar), Length(2048,true), Default(None) */
    val arg1: Rep[Option[String]] = column[Option[String]]("arg1", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg2 SqlType(varchar), Length(2048,true), Default(None) */
    val arg2: Rep[Option[String]] = column[Option[String]]("arg2", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg3 SqlType(varchar), Length(2048,true), Default(None) */
    val arg3: Rep[Option[String]] = column[Option[String]]("arg3", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg4 SqlType(varchar), Length(2048,true), Default(None) */
    val arg4: Rep[Option[String]] = column[Option[String]]("arg4", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg5 SqlType(varchar), Length(2048,true), Default(None) */
    val arg5: Rep[Option[String]] = column[Option[String]]("arg5", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg6 SqlType(varchar), Length(2048,true), Default(None) */
    val arg6: Rep[Option[String]] = column[Option[String]]("arg6", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg7 SqlType(varchar), Length(2048,true), Default(None) */
    val arg7: Rep[Option[String]] = column[Option[String]]("arg7", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg8 SqlType(varchar), Length(2048,true), Default(None) */
    val arg8: Rep[Option[String]] = column[Option[String]]("arg8", O.Length(2048,varying=true), O.Default(None))
    /** Database column arg9 SqlType(varchar), Length(2048,true), Default(None) */
    val arg9: Rep[Option[String]] = column[Option[String]]("arg9", O.Length(2048,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleModelArgs */
  lazy val McVehicleModelArgs = new TableQuery(tag => new McVehicleModelArgs(tag))

  /** Entity class storing rows of table McVehicleModelExteriorColor
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param modelId Database column model_id SqlType(int8)
   *  @param exteriorColorId Database column exterior_color_id SqlType(int8)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None) */
  final case class McVehicleModelExteriorColorRow(id: Long, modelId: Long, exteriorColorId: Long, picture: Option[String] = None)
  /** GetResult implicit for fetching McVehicleModelExteriorColorRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelExteriorColorRow(implicit e0: GR[Long], e1: GR[Option[String]]): GR[McVehicleModelExteriorColorRow] = GR{
    prs => import prs._
    McVehicleModelExteriorColorRow.tupled((<<[Long], <<[Long], <<[Long], <<?[String]))
  }
  /** Table description of table mc_vehicle_model_exterior_color. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelExteriorColor(_tableTag: Tag) extends profile.api.Table[McVehicleModelExteriorColorRow](_tableTag, "mc_vehicle_model_exterior_color") {
    def * = (id, modelId, exteriorColorId, picture) <> (McVehicleModelExteriorColorRow.tupled, McVehicleModelExteriorColorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(modelId), Rep.Some(exteriorColorId), picture).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelExteriorColorRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column exterior_color_id SqlType(int8) */
    val exteriorColorId: Rep[Long] = column[Long]("exterior_color_id")
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleModelExteriorColor */
  lazy val McVehicleModelExteriorColor = new TableQuery(tag => new McVehicleModelExteriorColor(tag))

  /** Entity class storing rows of table McVehicleModelGift
   *  @param modelId Database column model_id SqlType(int8)
   *  @param giftId Database column gift_id SqlType(int8) */
  final case class McVehicleModelGiftRow(modelId: Long, giftId: Long)
  /** GetResult implicit for fetching McVehicleModelGiftRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelGiftRow(implicit e0: GR[Long]): GR[McVehicleModelGiftRow] = GR{
    prs => import prs._
    McVehicleModelGiftRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table mc_vehicle_model_gift. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelGift(_tableTag: Tag) extends profile.api.Table[McVehicleModelGiftRow](_tableTag, "mc_vehicle_model_gift") {
    def * = (modelId, giftId) <> (McVehicleModelGiftRow.tupled, McVehicleModelGiftRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(modelId), Rep.Some(giftId)).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelGiftRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column gift_id SqlType(int8) */
    val giftId: Rep[Long] = column[Long]("gift_id")

    /** Primary key of McVehicleModelGift (database name pk_mc_vehicle_model_gift) */
    val pk = primaryKey("pk_mc_vehicle_model_gift", (modelId, giftId))
  }
  /** Collection-like TableQuery object for table McVehicleModelGift */
  lazy val McVehicleModelGift = new TableQuery(tag => new McVehicleModelGift(tag))

  /** Entity class storing rows of table McVehicleModelInteriorColor
   *  @param modelId Database column model_id SqlType(int8)
   *  @param interiorColorId Database column interior_color_id SqlType(int8) */
  final case class McVehicleModelInteriorColorRow(modelId: Long, interiorColorId: Long)
  /** GetResult implicit for fetching McVehicleModelInteriorColorRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelInteriorColorRow(implicit e0: GR[Long]): GR[McVehicleModelInteriorColorRow] = GR{
    prs => import prs._
    McVehicleModelInteriorColorRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table mc_vehicle_model_interior_color. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelInteriorColor(_tableTag: Tag) extends profile.api.Table[McVehicleModelInteriorColorRow](_tableTag, "mc_vehicle_model_interior_color") {
    def * = (modelId, interiorColorId) <> (McVehicleModelInteriorColorRow.tupled, McVehicleModelInteriorColorRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(modelId), Rep.Some(interiorColorId)).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelInteriorColorRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column interior_color_id SqlType(int8) */
    val interiorColorId: Rep[Long] = column[Long]("interior_color_id")

    /** Primary key of McVehicleModelInteriorColor (database name pk_mc_vehicle_model_interior_color) */
    val pk = primaryKey("pk_mc_vehicle_model_interior_color", (modelId, interiorColorId))
  }
  /** Collection-like TableQuery object for table McVehicleModelInteriorColor */
  lazy val McVehicleModelInteriorColor = new TableQuery(tag => new McVehicleModelInteriorColor(tag))

  /** Entity class storing rows of table McVehicleModelOptionalPackage
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param modelId Database column model_id SqlType(int8)
   *  @param optionalPackageId Database column optional_package_id SqlType(int8)
   *  @param price Database column price SqlType(numeric), Default(None)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(255,true), Default(None) */
  final case class McVehicleModelOptionalPackageRow(id: Long, modelId: Long, optionalPackageId: Long, price: Option[scala.math.BigDecimal] = None, description: Option[String] = None, picture: Option[String] = None)
  /** GetResult implicit for fetching McVehicleModelOptionalPackageRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelOptionalPackageRow(implicit e0: GR[Long], e1: GR[Option[scala.math.BigDecimal]], e2: GR[Option[String]]): GR[McVehicleModelOptionalPackageRow] = GR{
    prs => import prs._
    McVehicleModelOptionalPackageRow.tupled((<<[Long], <<[Long], <<[Long], <<?[scala.math.BigDecimal], <<?[String], <<?[String]))
  }
  /** Table description of table mc_vehicle_model_optional_package. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelOptionalPackage(_tableTag: Tag) extends profile.api.Table[McVehicleModelOptionalPackageRow](_tableTag, "mc_vehicle_model_optional_package") {
    def * = (id, modelId, optionalPackageId, price, description, picture) <> (McVehicleModelOptionalPackageRow.tupled, McVehicleModelOptionalPackageRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(modelId), Rep.Some(optionalPackageId), price, description, picture).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelOptionalPackageRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column optional_package_id SqlType(int8) */
    val optionalPackageId: Rep[Long] = column[Long]("optional_package_id")
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(255,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(255,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table McVehicleModelOptionalPackage */
  lazy val McVehicleModelOptionalPackage = new TableQuery(tag => new McVehicleModelOptionalPackage(tag))

  /** Entity class storing rows of table McVehicleModelSingleOption
   *  @param modelId Database column model_id SqlType(int8)
   *  @param singleOptionId Database column single_option_id SqlType(int8) */
  final case class McVehicleModelSingleOptionRow(modelId: Long, singleOptionId: Long)
  /** GetResult implicit for fetching McVehicleModelSingleOptionRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelSingleOptionRow(implicit e0: GR[Long]): GR[McVehicleModelSingleOptionRow] = GR{
    prs => import prs._
    McVehicleModelSingleOptionRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table mc_vehicle_model_single_option. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelSingleOption(_tableTag: Tag) extends profile.api.Table[McVehicleModelSingleOptionRow](_tableTag, "mc_vehicle_model_single_option") {
    def * = (modelId, singleOptionId) <> (McVehicleModelSingleOptionRow.tupled, McVehicleModelSingleOptionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(modelId), Rep.Some(singleOptionId)).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelSingleOptionRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column single_option_id SqlType(int8) */
    val singleOptionId: Rep[Long] = column[Long]("single_option_id")

    /** Primary key of McVehicleModelSingleOption (database name pk_mc_vehicle_model_single_option) */
    val pk = primaryKey("pk_mc_vehicle_model_single_option", (modelId, singleOptionId))
  }
  /** Collection-like TableQuery object for table McVehicleModelSingleOption */
  lazy val McVehicleModelSingleOption = new TableQuery(tag => new McVehicleModelSingleOption(tag))

  /** Entity class storing rows of table McVehicleModelWheel
   *  @param modelId Database column model_id SqlType(int8)
   *  @param wheelId Database column wheel_id SqlType(int8) */
  final case class McVehicleModelWheelRow(modelId: Long, wheelId: Long)
  /** GetResult implicit for fetching McVehicleModelWheelRow objects using plain SQL queries */
  implicit def GetResultMcVehicleModelWheelRow(implicit e0: GR[Long]): GR[McVehicleModelWheelRow] = GR{
    prs => import prs._
    McVehicleModelWheelRow.tupled((<<[Long], <<[Long]))
  }
  /** Table description of table mc_vehicle_model_wheel. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleModelWheel(_tableTag: Tag) extends profile.api.Table[McVehicleModelWheelRow](_tableTag, "mc_vehicle_model_wheel") {
    def * = (modelId, wheelId) <> (McVehicleModelWheelRow.tupled, McVehicleModelWheelRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(modelId), Rep.Some(wheelId)).shaped.<>({r=>import r._; _1.map(_=> McVehicleModelWheelRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column model_id SqlType(int8) */
    val modelId: Rep[Long] = column[Long]("model_id")
    /** Database column wheel_id SqlType(int8) */
    val wheelId: Rep[Long] = column[Long]("wheel_id")

    /** Primary key of McVehicleModelWheel (database name pk_mc_vehicle_model_wheel) */
    val pk = primaryKey("pk_mc_vehicle_model_wheel", (modelId, wheelId))
  }
  /** Collection-like TableQuery object for table McVehicleModelWheel */
  lazy val McVehicleModelWheel = new TableQuery(tag => new McVehicleModelWheel(tag))

  /** Entity class storing rows of table McVehicleStyle
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp)
   *  @param status Database column status SqlType(varchar), Length(50,true)
   *  @param name Database column name SqlType(varchar), Length(100,true)
   *  @param mcVehicleClassId Database column mc_vehicle_class_id SqlType(int4)
   *  @param icon Database column icon SqlType(varchar), Length(200,true), Default(None)
   *  @param picture Database column picture SqlType(varchar), Length(200,true), Default(None)
   *  @param link Database column link SqlType(varchar), Length(200,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true), Default(None)
   *  @param rank Database column rank SqlType(int4), Default(None)
   *  @param code Database column code SqlType(varchar), Length(64,true), Default(None)
   *  @param interactivePath Database column interactive_path SqlType(varchar), Length(255,true), Default(None)
   *  @param pattern Database column pattern SqlType(varchar), Length(255,true), Default(None)
   *  @param existDemonstration Database column exist_demonstration SqlType(bool), Default(Some(false)) */
  final case class McVehicleStyleRow(id: Long, createTime: Option[java.sql.Timestamp], status: String, name: String, mcVehicleClassId: Int, icon: Option[String] = None, picture: Option[String] = None, link: Option[String] = None, description: Option[String] = None, rank: Option[Int] = None, code: Option[String] = None, interactivePath: Option[String] = None, pattern: Option[String] = None, existDemonstration: Option[Boolean] = Some(false))
  /** GetResult implicit for fetching McVehicleStyleRow objects using plain SQL queries */
  implicit def GetResultMcVehicleStyleRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Int], e4: GR[Option[String]], e5: GR[Option[Int]], e6: GR[Option[Boolean]]): GR[McVehicleStyleRow] = GR{
    prs => import prs._
    McVehicleStyleRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<[String], <<[String], <<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[Boolean]))
  }
  /** Table description of table mc_vehicle_style. Objects of this class serve as prototypes for rows in queries. */
  class McVehicleStyle(_tableTag: Tag) extends profile.api.Table[McVehicleStyleRow](_tableTag, "mc_vehicle_style") {
    def * = (id, createTime, status, name, mcVehicleClassId, icon, picture, link, description, rank, code, interactivePath, pattern, existDemonstration) <> (McVehicleStyleRow.tupled, McVehicleStyleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, Rep.Some(status), Rep.Some(name), Rep.Some(mcVehicleClassId), icon, picture, link, description, rank, code, interactivePath, pattern, existDemonstration).shaped.<>({r=>import r._; _1.map(_=> McVehicleStyleRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10, _11, _12, _13, _14)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
    /** Database column status SqlType(varchar), Length(50,true) */
    val status: Rep[String] = column[String]("status", O.Length(50,varying=true))
    /** Database column name SqlType(varchar), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column mc_vehicle_class_id SqlType(int4) */
    val mcVehicleClassId: Rep[Int] = column[Int]("mc_vehicle_class_id")
    /** Database column icon SqlType(varchar), Length(200,true), Default(None) */
    val icon: Rep[Option[String]] = column[Option[String]]("icon", O.Length(200,varying=true), O.Default(None))
    /** Database column picture SqlType(varchar), Length(200,true), Default(None) */
    val picture: Rep[Option[String]] = column[Option[String]]("picture", O.Length(200,varying=true), O.Default(None))
    /** Database column link SqlType(varchar), Length(200,true), Default(None) */
    val link: Rep[Option[String]] = column[Option[String]]("link", O.Length(200,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(200,varying=true), O.Default(None))
    /** Database column rank SqlType(int4), Default(None) */
    val rank: Rep[Option[Int]] = column[Option[Int]]("rank", O.Default(None))
    /** Database column code SqlType(varchar), Length(64,true), Default(None) */
    val code: Rep[Option[String]] = column[Option[String]]("code", O.Length(64,varying=true), O.Default(None))
    /** Database column interactive_path SqlType(varchar), Length(255,true), Default(None) */
    val interactivePath: Rep[Option[String]] = column[Option[String]]("interactive_path", O.Length(255,varying=true), O.Default(None))
    /** Database column pattern SqlType(varchar), Length(255,true), Default(None) */
    val pattern: Rep[Option[String]] = column[Option[String]]("pattern", O.Length(255,varying=true), O.Default(None))
    /** Database column exist_demonstration SqlType(bool), Default(Some(false)) */
    val existDemonstration: Rep[Option[Boolean]] = column[Option[Boolean]]("exist_demonstration", O.Default(Some(false)))
  }
  /** Collection-like TableQuery object for table McVehicleStyle */
  lazy val McVehicleStyle = new TableQuery(tag => new McVehicleStyle(tag))

  /** Entity class storing rows of table McVin
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param createTime Database column create_time SqlType(timestamp), Default(None)
   *  @param updateTime Database column update_time SqlType(timestamp), Default(None)
   *  @param vid Database column vid SqlType(varchar), Length(64,true), Default(None)
   *  @param configuration Database column configuration SqlType(text), Default(None)
   *  @param manufactureDate Database column manufacture_date SqlType(date), Default(None)
   *  @param modelCode Database column model_code SqlType(varchar), Length(64,true), Default(None)
   *  @param exteriorColourCode Database column exterior_colour_code SqlType(varchar), Length(64,true), Default(None)
   *  @param interiorColourCode Database column interior_colour_code SqlType(varchar), Length(64,true), Default(None)
   *  @param goId Database column go_id SqlType(varchar), Length(64,true), Default(None)
   *  @param price Database column price SqlType(numeric), Default(None) */
  final case class McVinRow(id: Long, createTime: Option[java.sql.Timestamp] = None, updateTime: Option[java.sql.Timestamp] = None, vid: Option[String] = None, configuration: Option[String] = None, manufactureDate: Option[java.sql.Date] = None, modelCode: Option[String] = None, exteriorColourCode: Option[String] = None, interiorColourCode: Option[String] = None, goId: Option[String] = None, price: Option[scala.math.BigDecimal] = None)
  /** GetResult implicit for fetching McVinRow objects using plain SQL queries */
  implicit def GetResultMcVinRow(implicit e0: GR[Long], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[Option[java.sql.Date]], e4: GR[Option[scala.math.BigDecimal]]): GR[McVinRow] = GR{
    prs => import prs._
    McVinRow.tupled((<<[Long], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<?[String], <<?[java.sql.Date], <<?[String], <<?[String], <<?[String], <<?[String], <<?[scala.math.BigDecimal]))
  }
  /** Table description of table mc_vin. Objects of this class serve as prototypes for rows in queries. */
  class McVin(_tableTag: Tag) extends profile.api.Table[McVinRow](_tableTag, "mc_vin") {
    def * = (id, createTime, updateTime, vid, configuration, manufactureDate, modelCode, exteriorColourCode, interiorColourCode, goId, price) <> (McVinRow.tupled, McVinRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), createTime, updateTime, vid, configuration, manufactureDate, modelCode, exteriorColourCode, interiorColourCode, goId, price).shaped.<>({r=>import r._; _1.map(_=> McVinRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column create_time SqlType(timestamp), Default(None) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time", O.Default(None))
    /** Database column update_time SqlType(timestamp), Default(None) */
    val updateTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_time", O.Default(None))
    /** Database column vid SqlType(varchar), Length(64,true), Default(None) */
    val vid: Rep[Option[String]] = column[Option[String]]("vid", O.Length(64,varying=true), O.Default(None))
    /** Database column configuration SqlType(text), Default(None) */
    val configuration: Rep[Option[String]] = column[Option[String]]("configuration", O.Default(None))
    /** Database column manufacture_date SqlType(date), Default(None) */
    val manufactureDate: Rep[Option[java.sql.Date]] = column[Option[java.sql.Date]]("manufacture_date", O.Default(None))
    /** Database column model_code SqlType(varchar), Length(64,true), Default(None) */
    val modelCode: Rep[Option[String]] = column[Option[String]]("model_code", O.Length(64,varying=true), O.Default(None))
    /** Database column exterior_colour_code SqlType(varchar), Length(64,true), Default(None) */
    val exteriorColourCode: Rep[Option[String]] = column[Option[String]]("exterior_colour_code", O.Length(64,varying=true), O.Default(None))
    /** Database column interior_colour_code SqlType(varchar), Length(64,true), Default(None) */
    val interiorColourCode: Rep[Option[String]] = column[Option[String]]("interior_colour_code", O.Length(64,varying=true), O.Default(None))
    /** Database column go_id SqlType(varchar), Length(64,true), Default(None) */
    val goId: Rep[Option[String]] = column[Option[String]]("go_id", O.Length(64,varying=true), O.Default(None))
    /** Database column price SqlType(numeric), Default(None) */
    val price: Rep[Option[scala.math.BigDecimal]] = column[Option[scala.math.BigDecimal]]("price", O.Default(None))
  }
  /** Collection-like TableQuery object for table McVin */
  lazy val McVin = new TableQuery(tag => new McVin(tag))

  /** Entity class storing rows of table McWarehouses
   *  @param id Database column id SqlType(bigserial), AutoInc, PrimaryKey
   *  @param dealerId Database column dealer_id SqlType(int8), Default(None)
   *  @param city Database column city SqlType(varchar), Length(255,true), Default(None)
   *  @param `type` Database column type SqlType(varchar), Length(255,true), Default(None)
   *  @param createTime Database column create_time SqlType(timestamp) */
  final case class McWarehousesRow(id: Long, dealerId: Option[Long] = None, city: Option[String] = None, `type`: Option[String] = None, createTime: Option[java.sql.Timestamp])
  /** GetResult implicit for fetching McWarehousesRow objects using plain SQL queries */
  implicit def GetResultMcWarehousesRow(implicit e0: GR[Long], e1: GR[Option[Long]], e2: GR[Option[String]], e3: GR[Option[java.sql.Timestamp]]): GR[McWarehousesRow] = GR{
    prs => import prs._
    McWarehousesRow.tupled((<<[Long], <<?[Long], <<?[String], <<?[String], <<?[java.sql.Timestamp]))
  }
  /** Table description of table mc_warehouses. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class McWarehouses(_tableTag: Tag) extends profile.api.Table[McWarehousesRow](_tableTag, "mc_warehouses") {
    def * = (id, dealerId, city, `type`, createTime) <> (McWarehousesRow.tupled, McWarehousesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), dealerId, city, `type`, createTime).shaped.<>({r=>import r._; _1.map(_=> McWarehousesRow.tupled((_1.get, _2, _3, _4, _5)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(bigserial), AutoInc, PrimaryKey */
    val id: Rep[Long] = column[Long]("id", O.AutoInc, O.PrimaryKey)
    /** Database column dealer_id SqlType(int8), Default(None) */
    val dealerId: Rep[Option[Long]] = column[Option[Long]]("dealer_id", O.Default(None))
    /** Database column city SqlType(varchar), Length(255,true), Default(None) */
    val city: Rep[Option[String]] = column[Option[String]]("city", O.Length(255,varying=true), O.Default(None))
    /** Database column type SqlType(varchar), Length(255,true), Default(None)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[Option[String]] = column[Option[String]]("type", O.Length(255,varying=true), O.Default(None))
    /** Database column create_time SqlType(timestamp) */
    val createTime: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_time")
  }
  /** Collection-like TableQuery object for table McWarehouses */
  lazy val McWarehouses = new TableQuery(tag => new McWarehouses(tag))

  /** Entity class storing rows of table SchemaVersion
   *  @param installedRank Database column installed_rank SqlType(int4), PrimaryKey
   *  @param version Database column version SqlType(varchar), Length(50,true), Default(None)
   *  @param description Database column description SqlType(varchar), Length(200,true)
   *  @param `type` Database column type SqlType(varchar), Length(20,true)
   *  @param script Database column script SqlType(varchar), Length(1000,true)
   *  @param checksum Database column checksum SqlType(int4), Default(None)
   *  @param installedBy Database column installed_by SqlType(varchar), Length(100,true)
   *  @param installedOn Database column installed_on SqlType(timestamp)
   *  @param executionTime Database column execution_time SqlType(int4)
   *  @param success Database column success SqlType(bool) */
  final case class SchemaVersionRow(installedRank: Int, version: Option[String] = None, description: String, `type`: String, script: String, checksum: Option[Int] = None, installedBy: String, installedOn: java.sql.Timestamp, executionTime: Int, success: Boolean)
  /** GetResult implicit for fetching SchemaVersionRow objects using plain SQL queries */
  implicit def GetResultSchemaVersionRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[Int]], e4: GR[java.sql.Timestamp], e5: GR[Boolean]): GR[SchemaVersionRow] = GR{
    prs => import prs._
    SchemaVersionRow.tupled((<<[Int], <<?[String], <<[String], <<[String], <<[String], <<?[Int], <<[String], <<[java.sql.Timestamp], <<[Int], <<[Boolean]))
  }
  /** Table description of table schema_version. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class SchemaVersion(_tableTag: Tag) extends profile.api.Table[SchemaVersionRow](_tableTag, "schema_version") {
    def * = (installedRank, version, description, `type`, script, checksum, installedBy, installedOn, executionTime, success) <> (SchemaVersionRow.tupled, SchemaVersionRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(installedRank), version, Rep.Some(description), Rep.Some(`type`), Rep.Some(script), checksum, Rep.Some(installedBy), Rep.Some(installedOn), Rep.Some(executionTime), Rep.Some(success)).shaped.<>({r=>import r._; _1.map(_=> SchemaVersionRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column installed_rank SqlType(int4), PrimaryKey */
    val installedRank: Rep[Int] = column[Int]("installed_rank", O.PrimaryKey)
    /** Database column version SqlType(varchar), Length(50,true), Default(None) */
    val version: Rep[Option[String]] = column[Option[String]]("version", O.Length(50,varying=true), O.Default(None))
    /** Database column description SqlType(varchar), Length(200,true) */
    val description: Rep[String] = column[String]("description", O.Length(200,varying=true))
    /** Database column type SqlType(varchar), Length(20,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(20,varying=true))
    /** Database column script SqlType(varchar), Length(1000,true) */
    val script: Rep[String] = column[String]("script", O.Length(1000,varying=true))
    /** Database column checksum SqlType(int4), Default(None) */
    val checksum: Rep[Option[Int]] = column[Option[Int]]("checksum", O.Default(None))
    /** Database column installed_by SqlType(varchar), Length(100,true) */
    val installedBy: Rep[String] = column[String]("installed_by", O.Length(100,varying=true))
    /** Database column installed_on SqlType(timestamp) */
    val installedOn: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("installed_on")
    /** Database column execution_time SqlType(int4) */
    val executionTime: Rep[Int] = column[Int]("execution_time")
    /** Database column success SqlType(bool) */
    val success: Rep[Boolean] = column[Boolean]("success")
  }
  /** Collection-like TableQuery object for table SchemaVersion */
  lazy val SchemaVersion = new TableQuery(tag => new SchemaVersion(tag))
}
