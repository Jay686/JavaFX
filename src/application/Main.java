package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	private int counter = 1;
	@Override
	public void start(Stage primaryStage) {
		try {
			Label lbl = new Label("Couont = ?");
			lbl.setFont(new Font("Arial", 28));
			
			Button btn = new Button("Count");
			
			btn.setOnAction(event -> lbl.setText("Counter = " + (counter++)));
			
//			btn.setOnAction((ActionEvent event) -> {
//				lbl.setText("Counter = " + (counter++));
//			});
			
//			btn.setOnAction(new EventHandler<ActionEvent>() {
//
//				@Override
//				public void handle(ActionEvent arg0) {
//					
//					lbl.setText("Counter = " + (counter++));
//			}
//				
//			});
			
			
			
			VBox root = new VBox();
			root.getChildren().add(lbl);
			root.getChildren().add(btn);
			
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
