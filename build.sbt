
name := """slick"""

scalaVersion := "2.11.8"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
  "com.typesafe.slick" %% "slick-codegen" % "3.2.0",
  "ch.qos.logback" % "logback-classic" % "1.1.6",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4",
  "redis.clients" % "jedis" % "2.8.1",
  "io.jsonwebtoken" % "jjwt" % "0.7.0",
  "org.flywaydb" % "flyway-core" % "4.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

fork in run := true


flywayLocations := Seq("classpath:db/migration")

flywayUrl := "jdbc:postgresql://127.0.0.1:5432/mme_commerce"
flywayUser := "postgres"
flywayPassword := "111111"



// code generation task
lazy val slick = TaskKey[Seq[File]]("gen-tables")
lazy val slickCodeGenTask = (sourceManaged, dependencyClasspath in Compile, runner in Compile, streams) map { (dir,
                                                                                                               cp,
                                                                                                               r,
                                                                                                               s) =>

  val outputDir = (dir / "slick").getPath // place generated files in sbt's managed sources folder
val genArray = Array(
  "slick.jdbc.PostgresProfile",
  "org.postgresql.Driver",
  "jdbc:postgresql://127.0.0.1:5432/mme_commerce",
  outputDir,
  "com.jeff",
  "postgres",
  "111111"
)
  toError(r.run("slick.codegen.SourceCodeGenerator", cp.files, genArray, s.log))
  val fname = outputDir + "/com/jeff/Tables.scala"
  Seq(file(fname))
}

slick <<= slickCodeGenTask // register manual sbt command
//sourceGenerators in Compile <+= slickCodeGenTask // register automatic code generation on every compile, remove for only manual use

