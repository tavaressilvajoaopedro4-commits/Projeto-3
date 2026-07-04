#!/bin/bash

# Script de Compilação e Execução - Projeto-3
# Aplicação JavaFX - Cadastro de Pessoas (Arquitetura MVC)

echo "=========================================="
echo "Projeto-3: Cadastro de Pessoas"
echo "=========================================="
echo ""

# Verifica se Maven está instalado
if ! command -v mvn &> /dev/null; then
    echo "❌ Maven não encontrado. Instalando dependências com Maven..."
    exit 1
fi

echo "📦 Compilando projeto com Maven..."
echo "=========================================="
mvn clean package -DskipTests

if [ $? -eq 0 ]; then
    echo ""
    echo "✅ Compilação bem-sucedida!"
    echo ""
    echo "🚀 Iniciando aplicação JavaFX..."
    echo "=========================================="
    
    # Executa a aplicação
    mvn javafx:run -q
else
    echo "❌ Erro na compilação"
    exit 1
fi
