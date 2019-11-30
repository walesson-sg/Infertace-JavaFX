package applicationFX2;

import br.com.ufc.dados.Pessoa;
import br.com.ufc.dadosDAO.PessoaDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class Controller2 extends PessoaDAO{
	Pessoa pessoa = new Pessoa();
	PessoaDAO pessoaDAO = new PessoaDAO();
	
    @FXML
    private Button buttonConfirmar;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSobrenome;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;
    
    @FXML
    private Label txtLabel;

    @FXML
    void actionConfirmar(ActionEvent event) {
    	
//    	buttonConfirmar.setOnAction(e -> {
    		pessoa.setNome(txtNome.getText());
    		pessoaDAO.arquivoGravar(txtNome.getText());
    		
        	pessoa.setSobrenome(txtSobrenome.getText());
        	pessoaDAO.arquivoGravar(txtSobrenome.getText());
        	
        	pessoa.setEmail(txtEmail.getText());
        	pessoaDAO.arquivoGravar(txtEmail.getText());
        	
        	pessoa.setSenha(txtSenha.getText());
        	pessoaDAO.arquivoGravar(txtSenha.getText());
        	
        	pessoaDAO.addPessoa(pessoa);

        	System.out.println("Cadastro realizado com sucesso.");
       	    ((Stage)buttonConfirmar.getScene().getWindow()).close();	
//    	});
    	
    }
}
