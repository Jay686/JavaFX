package application.layoutDemos;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;


public class MainHBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			HBox hbox = constructHBox();
			
			//Button btnTop = new Button("Btn #1");
			Button btnLeft = new Button("Btn #2");
			Button btnCenter = new Button("Btn #3");
			Button btnRight = new Button("Btn #4");
			Button btnBottom = new Button("Btn #5");
		
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			root.setLeft(btnLeft);
			root.setCenter(btnCenter);
			root.setRight(btnRight);
			root.setBottom(btnBottom);
			
			//BorderPane.setAlignment(btnTop, Pos.CENTER);
			BorderPane.setAlignment(btnBottom, Pos.CENTER);
			BorderPane.setAlignment(btnLeft, Pos.CENTER);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private HBox constructHBox() {
		HBox hbox = new HBox();
		Button catBtn = new Button("Cat");
		Button dogBtn = new Button("Dog");
		catBtn.setPrefSize(75, 20);
		dogBtn.setPrefSize(75, 20);
		hbox.setPadding(new Insets(10, 10, 10, 10));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: blue;");
		hbox.getChildren().addAll(catBtn, dogBtn);
		
		return hbox;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
