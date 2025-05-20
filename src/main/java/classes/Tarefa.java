package classes;
import java.time.LocalDateTime;

public class Tarefa {
    private int id;
    private String descricao;
    private boolean status;
    private final LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;

    public Tarefa(String descricao, boolean status) {

        this.descricao = descricao;
        this.status = status;
        this.dataCriacao = LocalDateTime.now();
        this.dataModificacao = LocalDateTime.now();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void modificaTarefa(String desc){
        this.descricao = desc;
        this.dataModificacao = LocalDateTime.now();
    }

    public void modificaTarefa(){
        this.status = !status;
        this.dataModificacao = LocalDateTime.now();
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
