package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Pessoa;
import view.CadastroView;

public class PessoaController {
    private CadastroView view;
    private ObservableList<Pessoa> listaPessoas;

    public PessoaController(CadastroView view) {
        this.view = view;
        this.listaPessoas = FXCollections.observableArrayList();
        this.view.getTabela().setItems(listaPessoas);
        configurarAcoes();
    }

    private void configurarAcoes() {
        view.getBtnSalvar().setOnAction(e -> {
            String nome = view.getNomeInput();
            String cpf = view.getCpfInput();
            String email = view.getEmailInput();
            String telefone = view.getTelefoneInput();

            Pessoa novaPessoa = new Pessoa(nome, cpf, email, telefone);
            listaPessoas.add(novaPessoa);
            
            System.out.println(" Cadastro salvo com sucesso: " + nome);
            view.limparCampos();
        });

        view.getBtnCancelar().setOnAction(e -> {
            view.limparCampos();
            System.out.println(" Operação cancelada. Campos limpos.");
        });

        view.getBtnListar().setOnAction(e -> {
            System.out.println("\n---  LISTA DE PESSOAS (CONSOLE) ---");
            if (listaPessoas.isEmpty()) {
                System.out.println("Nenhum registro encontrado.");
            } else {
                for (Pessoa p : listaPessoas) {
                    System.out.println(p.toString());
                }
            }
            System.out.println("---------------------------------------");
        });
    }
}
