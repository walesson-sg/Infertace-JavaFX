package applicationFX1;

import applicationFX2.Start1;
import applicationFX3.Start2;
import br.com.ufc.dados.Pessoa;
import br.com.ufc.dados.UserPalavraAtual;
import br.com.ufc.dadosDAO.PalavraDAO;
import br.com.ufc.dadosDAO.PessoaDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends PessoaDAO {

		Pessoa pessoa = new Pessoa();
	
    @FXML
    private Button buttonEntrar;

    @FXML
    private TextField login;
    
    @FXML
    private Text txtMSG;
    
    @FXML
    private Label label;

    @FXML
    private PasswordField senha;

    @FXML
    private Button buttonCadastro;

    @FXML
    void actionCadastro(ActionEvent event) throws Exception {
    	Start1 start2 = new Start1();
    	start2.start(new Stage());
    	
    }

    @FXML
    void actionEntrar(ActionEvent event) throws Exception{
    	arquivoLer();
    	PessoaDAO pessoa = new PessoaDAO();
    		if(pessoa.autenticar(login.getText(), senha.getText())) {
    			UserPalavraAtual.setUserAtual(login.getText());
    			Start2 start2 = new Start2();
    			start2.start(new Stage());
    			 ((Stage)buttonEntrar.getScene().getWindow()).close();
    		}else {
    			label.setVisible(true);
    			label.setText("Login ou Senha incorretos.");
    		}
    	}
    }
    



