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
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;


public class MainDrawComplex extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			MoveTo startPoint = new MoveTo(108, 71);
			LineTo line1 = new LineTo(321, 161);
			LineTo line2 = new LineTo(126, 232);
			LineTo line3 = new LineTo(232, 52);
			LineTo line4 = new LineTo(269, 250);
			LineTo line5 = new LineTo(108, 71);
			
			Path path = new Path();
			path.getElements().addAll(startPoint, line1, line2, line3, line4, line5);
			
			Group root = new Group(path);
			
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
