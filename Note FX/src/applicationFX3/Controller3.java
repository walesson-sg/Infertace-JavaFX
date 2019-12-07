package applicationFX3;

import applicationFX1.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import br.com.ufc.dados.UserPalavraAtual;
import br.com.ufc.dadosDAO.PalavraDAO;
import br.com.ufc.dadosDAO.PessoaDAO;

public class Controller3 extends PessoaDAO {
	
    @FXML
    private Button button1;

    @FXML
    private Label txtField1;
    
    @FXML
    private Label label;

    @FXML
    private ListView<String> list;

    @FXML
    private TextField txtField3;
    
    @FXML
    private Button buttonSair;
    
    @FXML
    private Button remover;

    @FXML
    void initialize() {   
    	list.getItems().addAll(PalavraDAO.ler(UserPalavraAtual.getUserAtual()));
    }
    
    @FXML
    void actionButton1(ActionEvent event) {	
    	if(!txtField3.getText().isEmpty()) {
    		list.getItems().add(txtField3.getText());
    		label.setVisible(false);
    		
    		PalavraDAO.addPalavra(txtField3.getText(), UserPalavraAtual.getUserAtual());
    	}
    }//Fim ActionButton1    

	@FXML
    void actionSair(ActionEvent event) {
    	Main main = new Main();
    	main.start(new Stage());
    	((Stage)buttonSair.getScene().getWindow()).close();
    }
	
	@FXML
	void removerAction(ActionEvent event) {
		int i = list.getSelectionModel().getSelectedIndex();
		if(i >= 0) {
			list.getItems().remove(i);
			label.setVisible(false);
			PalavraDAO.removerPalavra(UserPalavraAtual.getUserAtual(), i);
		}else {
			label.setVisible(true);
			label.setText("Selecione um campo para ser deletado.");
		}
	}
	

}
