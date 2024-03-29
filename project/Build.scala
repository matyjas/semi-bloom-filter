import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "dojo",
      organization := "lsug",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.1"
      // add other settings here
    )
  )
}
