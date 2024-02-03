// scala.native and scala.js version in use.
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.15.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.17")

// the things to bring support for cross compilation to sbt build.
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "1.3.2")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")

// add the support to get the build info to integrate with IDEs.
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.5.14")

// adds an sbt command that checks the versions of libraries
// and reports if they need to be updated.
addSbtPlugin("com.timushev.sbt" % "sbt-updates"  % "0.6.4")

// plugin that will read typescript type definitions from npm libraries
// and generate scala wrapper code for it.
// (it seems if downloads a bunch of aws sdk dependencies, what >.>)
addSbtPlugin("org.scalablytyped.converter" % "sbt-converter" % "1.0.0-beta44")