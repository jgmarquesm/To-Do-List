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

    public String getDerscicao() {
        return descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getStatus() {
        return status;
    }

    public static Tarefa criarTarefa(String nome, String descricao, String dataTermino,
                                     int prioridade, String categoria, String status){

        return new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status);
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
