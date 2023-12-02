import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.timlah"
ThisBuild / organizationName := "timlah"

lazy val root = (project in file("."))
  .settings(
    name := "advent-of-code-2023",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % "test"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
