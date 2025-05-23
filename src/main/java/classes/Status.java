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

    public static Status DevolveStatus(String entrada){
        for(Status s : Status.values()){
            if(s.getDescricao().equalsIgnoreCase(entrada)){
                return s;
            }
        }
        return null;
    }
};