logLevel := Level.Warn

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.1")

// @TODO I don't think we need this plugin in this project
addSbtPlugin("ch.epfl.scala" % s"sbt-scalajs-bundler" % "0.17.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")
