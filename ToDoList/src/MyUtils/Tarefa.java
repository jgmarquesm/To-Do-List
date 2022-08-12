package MyUtils;

public class Tarefa {
    private String nome;
    private String descricao;
    private String dataTermino;
    private String prioridade;
    private String categoria;
    private String status;

    public Tarefa(String nome, String descricao, String dataTermino, String prioridade, String categoria, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.prioridade = prioridade;
        this.categoria = categoria;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDerscicao() {
        return descricao;
    }

    public void setDerscicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyUtils.Tarefa{" + "nome='" + nome + '\'' + ", descricao='" + descricao + '\'' +
                ", dataTermino='" + dataTermino + '\'' + ", prioridade=" + prioridade +
                ", categoria='" + categoria + '\'' + ", status='" + status + '\'' + '}';
    }
}
