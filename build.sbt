scalaVersion := "3.7.2"

name := "spsc-scala3"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.4.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

libraryDependencies += "org.typelevel" %% "paiges-core" % "0.4.4"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

Test / testOptions += Tests.Argument(args= "-oD")

Test / logBuffered := false

Test / parallelExecution := false
