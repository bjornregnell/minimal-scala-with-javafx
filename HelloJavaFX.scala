package hellojavafx

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

// must have different name than launched Application subclass
object HelloLauncher:
  def main(args: Array[String]): Unit = HelloJavaFX().mainForwarder(args)

class HelloJavaFX extends Application:
  def mainForwarder(args: Array[String]): Unit = Application.launch(args*)

  override def start(primaryStage: Stage): Unit = 
    primaryStage.setTitle("Hello JavaFX!")

    val btn = Button()
    btn.setText("Say 'Hello JavaFX' in terminal")
    btn.setOnAction: event => 
      System.out.println(s"Hello JavaFX in terminal! $event")
    
    val root = StackPane()
    root.getChildren.add(btn)
    primaryStage.setScene(Scene(root, 300, 250))
    println("Opening app window. Click close to exit.")
    primaryStage.show()
  end start

end HelloJavaFX