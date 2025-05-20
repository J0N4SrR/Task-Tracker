package classes;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ListaTarefa {
    classes.Tarefa[] listaDeTarefas;
    private int cont = 0;

    public ListaTarefa(int e) {
        this.listaDeTarefas = new Tarefa[e];
    }

    public boolean adicionaTarefa(Tarefa tarefa){
        for(int i = 0; i < this.listaDeTarefas.length; i++){
            if(listaDeTarefas[i] == null){
                this.listaDeTarefas[i] = tarefa;
                tarefa.setId(i);
                cont++;
                return true;
            }
        }
        return false;
    }

    public boolean modificaTarefa(int id, String desc){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setDescricao(desc);
                tarefa.setDataModificacao(LocalDateTime.now());
                return true;
            }
        }
        return false;
    }

    public boolean modificaTarefa(int id){
        for(Tarefa tarefa : listaDeTarefas) {
            if(tarefa.getId() == id){
                tarefa.setStatus();
                tarefa.setDataModificacao(LocalDateTime.now());
                return true;
            }
        }
        return false;
    }

    public boolean removeTarefa(int id){
        for(int i = 0; i < this.listaDeTarefas.length; i++){
            if(i == id){
                this.listaDeTarefas[i] = null;
                return true;
            }
        }
        return false;
    }

    public void criaTarefa(String descricao, boolean status){
        Tarefa tarefa = new Tarefa(descricao,status);
        adicionaTarefa(tarefa);
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "listaDeTarefas=" + Arrays.toString(listaDeTarefas) +
                '}';
    }
}
