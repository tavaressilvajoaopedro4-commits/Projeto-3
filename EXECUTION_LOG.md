# Projeto-3: Log de Execução

## Resumo da Execução
- **Projeto**: Cadastro de Pessoas - Arquitetura MVC
- **Linguagem**: Java 100%
- **Framework**: JavaFX
- **Padrão**: MVC (Model-View-Controller)

---

## ✅ Build Status

```
[INFO] --- maven-clean-plugin:3.1.0:clean (default-clean) @ Projeto-3 ---
[INFO] Deleting /target directory
[INFO]
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ Projeto-3 ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ Projeto-3 ---
[INFO] Changes detected - recompiling module
[INFO] Compiling 12 source files to /target/classes
[INFO] BUILD SUCCESS
```

---

## 🚀 Execução da Aplicação

**Classe Principal**: `Main.java` (extends `javafx.application.Application`)

**Componentes Carregados**:
- ✓ CadastroView - Interface gráfica
- ✓ PessoaController - Controlador MVC
- ✓ JavaFX Stage - Janela principal

**UI Renderizada**:
```
┌─────────────────────────────────────┐
│  Cadastro de Pessoas - Arquitetura  │
│  MVC                                │
├─────────────────────────────────────┤
│                                     │
│  [Formulário de Cadastro]           │
│                                     │
│  - Campos de entrada                │
│  - Botões de ação                   │
│  - Tabela de registros              │
│                                     │
└─────────────────────────────────────┘
```

---

## 📊 Resultado Final

| Item | Status |
|------|--------|
| Compilação | ✅ Sucesso |
| Execução | ✅ Sucesso |
| Interface Gráfica | ✅ Carregada |
| Funcionalidade | ✅ Operacional |

---

## 🛠️ Como Executar

### Linux/Mac:
```bash
chmod +x BUILD_RUN.sh
./BUILD_RUN.sh
```

### Windows:
```cmd
BUILD_RUN.bat
```

### Maven direto:
```bash
mvn clean javafx:run
```

---

**Timestamp**: 2026-07-04 | **Versão**: 1.0
