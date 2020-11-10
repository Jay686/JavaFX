package application.eventHandling;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MainChangeCircleColor extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			
			Circle cir = constructCircle();
			
			//cir.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> cir.setFill(Color.BLUE));
			cir.addEventFilter(MouseEvent.MOUSE_ENTERED, e -> cir.setFill(Color.BLUE));
			cir.addEventFilter(MouseEvent.MOUSE_EXITED, e -> cir.setFill(Color.RED));
			
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
		cir.setCursor(Cursor.HAND);
		return cir;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
