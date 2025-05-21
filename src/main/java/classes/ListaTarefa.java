package classes;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ListaTarefa {
    classes.Tarefa[] listaDeTarefas;

    public ListaTarefa(int e) {
        this.listaDeTarefas = new Tarefa[e];
    }

    private boolean adicionaTarefa(Tarefa tarefa){
        for(int i = 0; i < this.listaDeTarefas.length; i++){
            if(listaDeTarefas[i] == null){
                this.listaDeTarefas[i] = tarefa;
                tarefa.setId(i);
                return true;
            }
        }
        return false;
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
        return "ListaTarefa{" +
                "listaDeTarefas=" + Arrays.toString(listaDeTarefas) +
                '}';
    }
}
