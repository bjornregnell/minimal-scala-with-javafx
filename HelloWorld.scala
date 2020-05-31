import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

// must have different name than launched Application subclass
object HelloWorldLauncher {
  def main(args: Array[String]): Unit = {
    new HelloWorld().mainForwarder(args)
  }
}

class HelloWorld extends Application {
  def mainForwarder(args: Array[String]): Unit = {
    Application.launch(args: _*)
  }

  override def start(primaryStage: Stage): Unit = {
    primaryStage.setTitle("Hello World!")
    val btn = new Button
    btn.setText("Say 'Hello World'")
    btn.setOnAction((_: ActionEvent) => {
      System.out.println("Hello World!")
    })
    val root = new StackPane
    root.getChildren.add(btn)
    primaryStage.setScene(new Scene(root, 300, 250))
    primaryStage.show()
  }
}
