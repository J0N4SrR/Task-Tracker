package org.aplicacao;

import classes.ListaTarefa;
import classes.Status;
import classes.Tarefa;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        Tarefa teste = new Tarefa("teste");
        lista.adicionaTarefa(teste);
        Scanner scanner = new Scanner(System.in);
        int opc, idBuscado;
        String str;

        do {
            System.out.println("########## LISTA DE TAREFAS ##########");
            System.out.println("Escolha uma opção:");
            System.out.println("0 - Informações adicionais");
            System.out.println("1 - Adicionar uma nova tarefa");
            System.out.println("2 - Modificar uma tarefa existente");
            System.out.println("3 - Excluir uma tarefa existente");
            System.out.println("4 - Listar todas as tarefas");
            System.out.println("5 - Listar tarefas por status");
            System.out.println("6 - Sair");
            System.out.println("######################################\n");
            System.out.println("Digite a opção desejada:");
            opc = Integer.parseInt(scanner.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Descreva a tarefa:");
                    str = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(str);
                    lista.adicionaTarefa(tarefa);
                    System.out.println("Tarefa registrada com id: " + tarefa.getId());
                    break;


                case 2:
                    System.out.println("Entre com o id da tarefa:");
                    idBuscado = Integer.parseInt(scanner.nextLine());
                    int opcStatus;
                    System.out.println("Entre com a nova descrição (Digite / se não quiser modificar):");
                    str = scanner.nextLine();
                    if (!str.equals("/")) {
                        lista.modificaTarefa(idBuscado, str);
                        System.out.println("Descrição atualizada com Sucesso!");
                    }


                        System.out.println("Entre com o novo status (1 - TODO, 2 - INPROGRESS, 3 - DONE ou Qualquer outro número se não quiser modificar)");
                        opcStatus = Integer.parseInt(scanner.nextLine());
                        Status status;

                        switch (opcStatus) {
                            case 1:
                                status = Status.TODO;
                                lista.modificaTarefa(idBuscado, status);
                                System.out.println("Novo status: "+ status.getDescricao());
                                break;
                            case 2:
                                status = Status.INPROGRESS;
                                lista.modificaTarefa(idBuscado, status);
                                System.out.println("Novo status: "+ status.getDescricao());
                                break;
                            case 3:
                                status = Status.DONE;
                                lista.modificaTarefa(idBuscado, status);
                                System.out.println("Novo status: "+ status.getDescricao());
                                break;
                            default:
                                break;
                        }

                    break;

                case 3:
                    System.out.println("Entre com o id da tarefa:");
                    idBuscado = Integer.parseInt(scanner.nextLine());
                    lista.removerTarefa(idBuscado);
                    System.out.println("Tarefa deletada");
                    break;

                case 4:
                    lista.mostrarLista();
                    break;

                case 5:
                    System.out.println("Entre com o status que deseja filtar:");
                    String s = scanner.nextLine();
                    lista.mostrarLista(s);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;
            }

        } while(opc != 6);
    }
    }
