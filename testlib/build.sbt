name := "testlib"

organization := "de.choffmeister"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

publishMavenStyle := true

publishTo := Some(Resolver.sftp("maven.choffmeister.de", "choffmeister.de", "/var/www/maven.choffmeister.de"))
