//> using scala 3.5.0
//> using dep "org.openjfx:javafx-base:22.0.2"
//> using dep "org.openjfx:javafx-controls:22.0.2"
//> using dep "org.openjfx:javafx-fxml:22.0.2"
//> using dep "org.openjfx:javafx-graphics:22.0.2"
//> using dep "org.openjfx:javafx-media:22.0.2"
//> using dep "org.openjfx:javafx-swing:22.0.2"
//> using dep "org.openjfx:javafx-web:22.0.2"


// See latest Scala version here:  https://www.scala-lang.org/
// See lates JavaFX version here:  https://mvnrepository.com/artifact/org.openjfx/

// You can ignore the warning "Unsupported JavaFX configuration: classes were loaded from unnamed module ..."
/* More details on the warning here: 
    https://stackoverflow.com/questions/67854139
    https://github.com/scala/scala-dev/issues/529

  If the app does not start you may need to add a classifier in each using-clauses above 
    such as classifier=win or classifier=mac or classifier=linux like so:
      //> using dep "org.openjfx:javafx-base:22.0.2,classifier=win"
    See artifact classifier for your OS here: 
      https://repo1.maven.org/maven2/org/openjfx/javafx-base/22.0.2/
    If you are on ARM then you need classifier=mac-aarch64 or classifier=linux-aarch64
*/