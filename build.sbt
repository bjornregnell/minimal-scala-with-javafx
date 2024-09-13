name := "javafx-in-scala"

version := "0.1"

scalaVersion := "3.5.0"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Wunused:all", "-Wvalue-discard", "-Wsafe-init")

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true

// Determine OS version of JavaFX binaries
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux") => "linux"
  case n if n.startsWith("Mac") => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}

lazy val fxVersion = "21.0.4"

// Add JavaFX dependencies
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
libraryDependencies ++= javaFXModules.map( m => 
    "org.openjfx" % s"javafx-$m" % fxVersion classifier osName
)
