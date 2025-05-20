package classes;

public class ListaTarefa {
    classes.Tarefa[] listaDeTarefas;

    public ListaTarefa(int e) {
        this.listaDeTarefas = new Tarefa[e];
    }

    public boolean adicionaTarefa(Tarefa tarefa){
        for(int i = 0; i < this.listaDeTarefas.length; i++){
            if(listaDeTarefas[i] == null){
                this.listaDeTarefas[i] = tarefa;
                tarefa.setId(i);
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

}
