# Projeto 3 - Cadastro de Pessoas

Este projeto em Java demonstra uma aplicação simples de cadastro de pessoas utilizando JavaFX e arquitetura MVC (Model-View-Controller).

Estrutura do projeto:

- src/main/java/model/Pessoa.java
- src/main/java/view/CadastroView.java
- src/main/java/controller/PessoaController.java
- src/main/java/Main.java
- src/main/java/Launcher.java

Como executar (sem Maven/Gradle):
1. Certifique-se de ter o JDK 11+ e JavaFX instalado/configurado no seu sistema.
2. Compile os arquivos Java:
   javac -d out $(find src/main/java -name "*.java")
3. Execute a aplicação (ajuste o classpath do JavaFX conforme seu ambiente):
   java -cp out Main

Observações:
- Se desejar, posso converter este projeto para Maven ou Gradle e adicionar um arquivo de build (pom.xml ou build.gradle) para facilitar a compilação e execução com JavaFX.
