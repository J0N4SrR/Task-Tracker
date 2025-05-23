package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static classes.Status.DevolveStatus;

public class ListaTarefa {
    List<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
    File file = new File("task.json");
    private int id = 0;


    public void adicionaTarefa(Tarefa tarefa){
        this.listaDeTarefas.add(tarefa);
        id++;
        tarefa.setId(id);
        escreverListaJson();
    }

    public void modificaTarefa(int id, String desc){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setDescricao(desc);
                tarefa.setDataModificacao();
                escreverListaJson();
            }
        }
    }

    public void modificaTarefa(int id, Status status){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setStatus(status);
                tarefa.setDataModificacao();
                escreverListaJson();
            }
        }
    }

    public void removerTarefa(int id){
        listaDeTarefas.removeIf(tarefa -> tarefa.getId() == id);
        escreverListaJson();


    }

    public void criarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionaTarefa(tarefa);
    }


    public void escreverListaJson(){
        try{
            FileWriter fr = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fr);
            bw.write("{\n" + "  \"ListaDeTarefas\": [\n");
            for(Tarefa tarefa : listaDeTarefas){
                int i = listaDeTarefas.indexOf(tarefa);
                bw.write(tarefa.salvarJson());
                if(i < listaDeTarefas.size()-1) bw.write(",\n");
            }
            bw.write("\n]\n}");
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarLista(){
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println(tarefa);
        }
    }
    public void mostrarLista(String s){
        Status status = DevolveStatus(s);
        if(status != null){
        System.out.println("Lista de Tarefas - " + status.getDescricao());
        for (Tarefa tarefa : listaDeTarefas){
            if(tarefa.getStatus().getDescricao().equals(status.getDescricao())){
                System.out.print(tarefa);
            }
        }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Tarefas:\n");
        for(Tarefa tarefa: listaDeTarefas){
            sb.append(tarefa.toString());
        }
        return sb.toString();
    }
}
