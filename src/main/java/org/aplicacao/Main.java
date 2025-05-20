package org.aplicacao;

import classes.Tarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tarefa task0 = new Tarefa(1,"Reunião de Migração",false);
        System.out.println(task0);
        Tarefa task1 = new Tarefa(2,"Relatório 014",false);
        System.out.println(task1);

        task0.modificaTarefa("mudança");
        task0.modificaTarefa();
        System.out.println(task0);

        }
    }
