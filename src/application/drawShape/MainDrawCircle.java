package application.drawShape;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;


public class MainDrawCircle extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Circle cir = new Circle();
			cir.setCenterX(200);
			cir.setCenterY(150);
			cir.setRadius(100);
			cir.setFill(Color.RED);
			
			Group root = new Group(cir);
			
			Scene scene = new Scene(root,600,400);
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
