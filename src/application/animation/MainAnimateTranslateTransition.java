package application.animation;
	
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MainAnimateTranslateTransition extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Circle cir = constructCircle();
			
			TranslateTransition tt = new TranslateTransition();
			tt.setNode(cir);
			tt.setDuration(Duration.millis(2000));
			tt.setByX(500);
			tt.setByY(200);
			tt.setCycleCount(20);
			tt.play();
	
			Group root = new Group(cir);
			
			Scene scene = new Scene(root,600,400);
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
