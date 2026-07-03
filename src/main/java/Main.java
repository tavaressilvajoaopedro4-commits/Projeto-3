import controller.PessoaController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CadastroView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        CadastroView view = new CadastroView();
        new PessoaController(view);

        primaryStage.setTitle("Cadastro de Pessoas - Arquitetura MVC");
        primaryStage.setScene(view.getCena());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
