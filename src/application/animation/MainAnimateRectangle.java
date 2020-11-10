package application.animation;
	
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class MainAnimateRectangle extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Rectangle rec = constructRectangle();
			
			RotateTransition rt = new RotateTransition();
			rt.setNode(rec);
			rt.setDuration(Duration.millis(2000));
			rt.setByAngle(360);
			rt.setCycleCount(10);
			rt.play();

			
			Group root = new Group(rec);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	


	private Rectangle constructRectangle() {
		Rectangle rec = new Rectangle();
		rec.setX(100);
		rec.setY(150);
		rec.setWidth(200);
		rec.setHeight(100);
		rec.setFill(Color.RED);
		return rec;
	}



	public static void main(String[] args) {
		launch(args);
	}
}
