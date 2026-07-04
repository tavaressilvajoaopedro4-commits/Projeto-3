@echo off
REM Script de Compilação e Execução - Projeto-3
REM Aplicação JavaFX - Cadastro de Pessoas (Arquitetura MVC)

echo.
echo ==========================================
echo Projeto-3: Cadastro de Pessoas
echo ==========================================
echo.

REM Verifica se Maven está instalado
mvn -v >nul 2>&1
if errorlevel 1 (
    echo. ❌ Maven não encontrado. Instale o Maven para continuar.
    exit /b 1
)

echo 📦 Compilando projeto com Maven...
echo ==========================================
mvn clean package -DskipTests

if errorlevel 1 (
    echo. ❌ Erro na compilação
    exit /b 1
)

echo.
echo ✅ Compilação bem-sucedida!
echo.
echo 🚀 Iniciando aplicação JavaFX...
echo ==========================================

REM Executa a aplicação
mvn javafx:run -q

pause
