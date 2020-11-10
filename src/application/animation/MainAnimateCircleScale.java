package application.animation;
	
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MainAnimateCircleScale extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Circle cir = constructCircle();
			
			ScaleTransition sc = new ScaleTransition();
			sc.setNode(cir);
			sc.setDuration(Duration.millis(2000));
			sc.setByX(1.5);
			sc.setByY(2);
			sc.setCycleCount(10);
			sc.play();

			
			Group root = new Group(cir);
			
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Circle constructCircle() {
		Circle cir = new Circle();
		cir.setCenterX(200);
		cir.setCenterY(150);
		cir.setRadius(100);
		cir.setFill(Color.RED);
		return cir;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
