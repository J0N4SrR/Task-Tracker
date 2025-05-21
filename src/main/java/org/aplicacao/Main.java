package org.aplicacao;

import classes.ListaTarefa;
import classes.Status;
import classes.Tarefa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa(5);
        Tarefa ta = new Tarefa("teste");
        int opc;
        Scanner scanner = new Scanner(System.in);

//        System.out.println("########## LISTA DE TAREFAS ##########\n");
//        System.out.println("Escolha uma opção:");
//        System.out.println("1 - Adicionar uma nova tarefa");
//        System.out.println("2 - Modificar uma tarefa existente");
//        System.out.println("3 - Excluir uma tarefa existente");
//        System.out.println("4 - Listar todas as tarefas");


        System.out.println(ta.salvarJson());










        }
    }
