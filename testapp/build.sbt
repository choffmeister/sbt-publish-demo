name := "testapp"

organization := "de.choffmeister"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers += "maven.choffmeister.de" at "http://maven.choffmeister.de"

libraryDependencies += "de.choffmeister" %% "testlib" % "0.0.1-SNAPSHOT"
