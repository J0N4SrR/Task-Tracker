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

    public int getId() {
        return id;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus() {
        this.status = !status;
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
