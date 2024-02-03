ThisBuild / scalaVersion := "3.3.1"

lazy val slint4s = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .in(file("lib"))
  .settings()
  .jvmSettings()
  .jsSettings(
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
        .withSourceMap(false)
    },
    Compile / npmDependencies ++= Seq("slint-ui" -> "1.4.0")
  )
  .nativeSettings()
  .enablePlugins(ScalablyTypedConverterPlugin)

lazy val example = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("bin/example"))
  .settings()
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
        .withSourceMap(false)
    },
  )
  .dependsOn(slint4s)
