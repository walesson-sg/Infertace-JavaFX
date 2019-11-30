package applicationFX2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start1 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/applicationFX2/Application2.fxml"));
			
			stage.setScene(new Scene (root));
			stage.show();
			
			} catch (Exception e){
				e.printStackTrace();
			}
			
	}//Fim start
}
