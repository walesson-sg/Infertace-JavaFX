package applicationFX3;

import applicationFX1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller3 {

    @FXML
    private Button button1;

    @FXML
    private Label txtField1;

    @FXML
    private VBox vBox;

    @FXML
    private TextField txtField3;

    @FXML
    private Button buttonCadastro;
    
    @FXML
    private Button buttonSair;

    @FXML
    void actionButton1(ActionEvent event) {
    	Button button2 = new Button(txtField3.getText());
    	button2.setOnAction(e -> {
	
    		System.out.println(vBox.getChildren().indexOf(button2)); // indexOf retorna o número do indice
    		
    		});
     	
    	vBox.getChildren().add(button2); //lista
    
    }//Fim ActionButton1    
    

    @FXML
    void actionCadastrar(ActionEvent event) {

    }
    
    @FXML
    void actionSair(ActionEvent event) {
    	((Stage)buttonSair.getScene().getWindow()).close();
    	Main main = new Main();
    	main.start(new Stage());
    }

}
