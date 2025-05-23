package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTarefa {
    List<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
    File file = new File("/home/jrr/Documents/Estudo_Otimização/teste/RoadmapJava/Task Tracker/Task Tracker/task.json");
    private int id = 0;


    public void adicionaTarefa(Tarefa tarefa){
        this.listaDeTarefas.add(tarefa);
        id++;
        tarefa.setId(id);
    }

    public boolean modificaTarefa(int id, String desc){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setDescricao(desc);
                tarefa.setDataModificacao();
                return true;
            }
        }
        return false;
    }

    public boolean modificaTarefa(int id, Status status){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setStatus(status);
                tarefa.setDataModificacao();
                return true;
            }
        }
        return false;
    }

    public void removerTarefa(int id){
        listaDeTarefas.remove(id);
    }

    public void criarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionaTarefa(tarefa);
    }


    public void escreverListaJson(){
        try{
            FileWriter fr = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "lista de Tarefas = " + listaDeTarefas +
                '}';
    }
}
