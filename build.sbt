name := """slick"""

scalaVersion := "2.11.8"

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0",
  "ch.qos.logback" % "logback-classic" % "1.1.6",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4",
  "redis.clients" % "jedis" % "2.8.1",
  "io.jsonwebtoken" % "jjwt" % "0.7.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

fork in run := true
