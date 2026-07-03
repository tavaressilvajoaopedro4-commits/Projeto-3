package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Pessoa;

public class CadastroView {
    private Scene cena;
    private TextField txtNome = new TextField();
    private TextField txtCpf = new TextField();
    private TextField txtEmail = new TextField();
    private TextField txtTelefone = new TextField();
    
    private Button btnSalvar = new Button("Salvar");
    private Button btnCancelar = new Button("Cancelar");
    private Button btnListar = new Button("Listar");
    
    private TableView<Pessoa> tabela = new TableView<>();

    @SuppressWarnings("unchecked")
    public CadastroView() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        grid.add(new Label("Nome:"), 0, 0);
        grid.add(txtNome, 1, 0);
        
        grid.add(new Label("CPF:"), 0, 1);
        grid.add(txtCpf, 1, 1);
        
        grid.add(new Label("E-mail:"), 0, 2);
        grid.add(txtEmail, 1, 2);
        
        grid.add(new Label("Telefone:"), 0, 3);
        grid.add(txtTelefone, 1, 3);

        HBox boxBotoes = new HBox(10);
        boxBotoes.setAlignment(Pos.BOTTOM_RIGHT);
        boxBotoes.getChildren().addAll(btnSalvar, btnCancelar, btnListar);
        grid.add(boxBotoes, 1, 4);

        TableColumn<Pessoa, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        
        TableColumn<Pessoa, String> colCpf = new TableColumn<>("CPF");
        colCpf.setCellValueFactory(new PropertyValueFactory<>("cpf"));
        
        TableColumn<Pessoa, String> colEmail = new TableColumn<>("E-mail");
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        TableColumn<Pessoa, String> colTel = new TableColumn<>("Telefone");
        colTel.setCellValueFactory(new PropertyValueFactory<>("telefone"));

        tabela.getColumns().addAll(colNome, colCpf, colEmail, colTel);
        tabela.setPrefHeight(200);

        VBox layoutPrincipal = new VBox(15);
        layoutPrincipal.setPadding(new Insets(15));
        layoutPrincipal.getChildren().addAll(grid, tabela);

        this.cena = new Scene(layoutPrincipal, 500, 480);
    }

    public Scene getCena() { return cena; }
    public TableView<Pessoa> getTabela() { return tabela; }
    public String getNomeInput() { return txtNome.getText(); }
    public String getCpfInput() { return txtCpf.getText(); }
    public String getEmailInput() { return txtEmail.getText(); }
    public String getTelefoneInput() { return txtTelefone.getText(); }
    public Button getBtnSalvar() { return btnSalvar; }
    public Button getBtnCancelar() { return btnCancelar; }
    public Button getBtnListar() { return btnListar; }

    public void limparCampos() {
        txtNome.clear();
        txtCpf.clear();
        txtEmail.clear();
        txtTelefone.clear();
    }
}
