enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.4.2"

npmDependencies in Compile ++= Seq(
  "react" -> "16.7.0",
  "react-dom" -> "16.7.0")

name := "client"
scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true
