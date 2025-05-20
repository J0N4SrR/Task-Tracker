package classes;

public enum Status{
    TODO("toDo"),
    INPROGRESS("inProgress"),
    DONE("done");

    String descricao;

    Status(String descricao) {
        this.descricao= descricao;
    }
    public String getDescricao(){
        return descricao;
    }
};