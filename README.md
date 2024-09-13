# minimal-scala-with-javafx

* A minimal Scala hello-world-app using the Java FX GUI framework, without any other dependencies (such as [ScalaFX](https://github.com/scalafx/scalafx), which you don't need if you want directly use the JavaFX framework) 

* Based on https://users.scala-lang.org/t/scala-jdk-11-and-jpms/6102/19 by https://github.com/tarsa

* The only things you need on your local box:
  - Install OpenJDK 17 LTS or later (21 LTS recommended) https://adoptopenjdk.net/
  - Install latest Scala at least 3.5.0 from here: https://www.scala-lang.org/


## Build and run with the new Scala runner (from Scala 3.5.0)

* The `scala` runner use the `.scala` files to build you app. In one such file there should be so called using-directives that define versions of dependencies etc. Typically using-directives are placed in a file called `project.scala`

* Just type `scala run .` to run your app. Note the trailing `.` which means "current directory".

* If you use the `scala` runner you don't need the files `build.sbt` or `project/build.properties`

## Build and run with sbt (Scala build tool)

* If you install Scala [from the official page using cs](https://www.scala-lang.org/download/) then you will also get the Scala Build Tool sbt. You can also install sbt only from here: https://www.scala-sbt.org/

* You need the file `build.sbt` and then when you type `sbt` to start the build tool and then you can just type `run`

* The sbt version is fixed by the file `project/build.properties`

* If you use sbt you do not need the file `project.scala` 