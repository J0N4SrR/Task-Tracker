package classes;

import java.util.Arrays;
import java.util.List;

public class ListaTarefa {
    List<Tarefa> listaDeTarefas;
    private int id = 0;


    private void adicionaTarefa(Tarefa tarefa){
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

    public boolean removerTarefa(int id){
        for(int i = 0; i < this.listaDeTarefas.length; i++){
            if(i == id){
                this.listaDeTarefas[i] = null;
                return true;
            }
        }
        return false;
    }

    public void criarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionaTarefa(tarefa);
    }


    @Override
    public String toString() {
        return "ListaTarefa {" + "Lista de Tarefas = " + Arrays.toString(listaDeTarefas) +'}';
    }
}
