sbtPlugin := true

organization := "org.jmotor.sbt"

name := "sbt-dependency-updates"

libraryDependencies ++= Dependencies.dependencies

inThisBuild(List(
  homepage := Some(url("https://github.com/aiyanbo/sbt-dependency-updates")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "aiyanbo",
      "Andy Ai",
      "yanbo.ai@gmail.com",
      url("https://aiyanbo.github.io/")
    )
  )
))

coverageScalacPluginVersion := "2.0.10"

sonatypeProfileName := "org.jmotor"
