package MyUtils;


public class Tarefa implements Comparable<Tarefa>{
    private String nome;
    private String descricao;
    private String dataTermino;
    private int prioridade;
    private String categoria;
    private String status;

    public Tarefa(String nome, String descricao, String dataTermino, int prioridade, String categoria, String status) {
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

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
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
        return "\n{\nTarefa: [\n{\"titulo\": " + nome + "}, {\"descricao\": " + descricao +
                "}, {\"dataLimite\":"  + dataTermino + "}, {\"prioridade\": " + prioridade +
                "}, {\"categoria\": " + categoria + "}, {\"status\": " + status + "}\n]\n}";
    }

    @Override
    public int compareTo(Tarefa o) {
        return Integer.compare(o.getPrioridade(), this.getPrioridade());
    }
}
