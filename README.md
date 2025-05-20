# Task Tracker CLI

Um aplicativo de linha de comando para gerenciar tarefas simples. Permite adicionar, atualizar, excluir, listar e alterar o status de tarefas diretamente pelo terminal.

## 📌 Projeto base
Este projeto foi baseado na proposta de desafio do roadmap.sh:
https://roadmap.sh/projects/task-tracker

## 🛠️ Tecnologias

- Java
- Maven

## 🎯 Funcionalidades

- Adicionar uma nova tarefa
- Atualizar ou excluir uma tarefa existente
- Marcar tarefa como "em andamento" ou "concluída"
- Listar todas as tarefas ou filtrar por status:
  - A fazer (`todo`)
  - Em andamento (`in-progress`)
  - Concluídas (`done`)

## 📁 Armazenamento

As tarefas são salvas em um arquivo `tasks.json` na raiz do projeto. O arquivo é criado automaticamente, caso não exista.

Cada tarefa contém:
- `id`: identificador único
- `description`: descrição da tarefa
- `status`: `todo`, `in-progress`, ou `done`
- `createdAt`: data de criação
- `updatedAt`: data da última atualização

## 📦 Como compilar

Clone o repositório e compile o projeto com Maven:

```bash
git clone https://github.com/J0N4SrR/Task-Tracker.git
cd task-tracker-cli
mvn clean compile


