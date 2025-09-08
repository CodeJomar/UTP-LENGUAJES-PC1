ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "untitled",

    libraryDependencies ++= Seq(
      // Jackson (Java)
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.17.2",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.17.2",

      // Circe (Scala 3)
      "io.circe" %% "circe-core" % "0.14.6",
      "io.circe" %% "circe-parser" % "0.14.6"
    )

  )
