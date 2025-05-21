package classes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa {
    private int id;
    private String descricao;
    private Status status;
    private final String dataCriacao;
    private String dataModificacao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        String now = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        this.dataCriacao = now;
        this.dataModificacao = now;
        status = Status.TODO;

    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDataModificacao() {
        this.dataModificacao = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String salvarJson(){
        return String.format("{ \"id\": %d, \"descricao\": \"%s\", \"status\": \"%s\", \"dataCriacao\": \"%s\", \"dataModificacao\": \"%s\" }", id, descricao, status.getDescricao(), dataCriacao,dataModificacao );
    }



    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                '}';
    }
}
