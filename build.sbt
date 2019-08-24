scalaVersion := "2.12.8"

name := "dns-threat-hunt"
organization := "com.nhoppe"
version := "1.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.8"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

// Required according to https://github.com/sbt/sbt/issues/4103#issuecomment-509162557
resolvers in ThisBuild += "Artima Maven Repository" at "http://repo.artima.com/releases"
