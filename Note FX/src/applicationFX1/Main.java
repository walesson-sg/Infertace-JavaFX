package applicationFX1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/applicationFX1/Application1.fxml"));
			
			stage.setScene(new Scene (root));
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//fim start
	public static void main(String[] args) {
		launch(args);
	}//fim main

}//fim main
