name := "k_k__util"

version := "1.3.0"

organization := "k_k_"

scalaVersion := "2.10.1"

libraryDependencies += "org.scala-lang" % "jline" % "2.10.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"

scalacOptions ++= Seq( "-deprecation", "-feature" )
