package application.layoutDemos;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class MainBorderPane extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
	
			Button btnTop = new Button("Btn #1");
			Button btnLeft = new Button("Btn #2");
			Button btnCenter = new Button("Btn #3");
			Button btnRight = new Button("Btn #4");
			Button btnBottom = new Button("Btn #5");
		
			BorderPane root = new BorderPane();
			root.setTop(btnTop);
			root.setLeft(btnLeft);
			root.setCenter(btnCenter);
			root.setRight(btnRight);
			root.setBottom(btnBottom);
			
			BorderPane.setAlignment(btnTop, Pos.CENTER);
			BorderPane.setAlignment(btnBottom, Pos.CENTER);
			BorderPane.setAlignment(btnLeft, Pos.CENTER);
			
			Scene scene = new Scene(root,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
