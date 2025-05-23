# Task Tracker CLI

Um aplicativo de linha de comando simples e eficiente para gerenciar tarefas. Permite adicionar, atualizar, excluir, listar e alterar o status de tarefas diretamente pelo terminal.

## 📌 Projeto base

Este projeto foi inspirado na proposta de desafio do [roadmap.sh](https://roadmap.sh/projects/task-tracker)

## 🛠️ Tecnologias

- Java 17+
- Maven
- Gson (para manipulação de JSON)

## 🎯 Funcionalidades

- ✅ Adicionar uma nova tarefa
- ✅ Atualizar a descrição de uma tarefa existente
- ✅ Atualizar o status de uma tarefa
- ✅ Excluir uma tarefa
- ✅ Listar todas as tarefas
- ✅ Filtrar tarefas por status:
  - A fazer (`toDo`)
  - Em andamento (`inProgress`)
  - Concluídas (`done`)
- ✅ Armazenamento persistente em JSON

## 📁 Armazenamento

As tarefas são armazenadas no arquivo `tasks.json`, criado automaticamente na raiz do projeto.

Cada tarefa inclui:
- `id`: identificador único incremental
- `description`: descrição da tarefa
- `status`: `toDo`, `inProgress`, ou `done`
- `createdAt`: data de criação da tarefa
- `updatedAt`: data da última modificação


## 📦 Como compilar e executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/task-tracker-cli.git
   cd task-tracker-cli
   mvn compile
   mvn exec:java -Dexec.mainClass="Main"



