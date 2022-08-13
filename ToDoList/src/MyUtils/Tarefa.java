package MyUtils;

import java.util.ArrayList;

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
        return "\n{\nTarefa: [\n{\"title\": " + nome + "}, {\"description\": " + descricao +
                "}, {\"deadLine\":"  + dataTermino + "}, {\"priority\": " + prioridade +
                "}, {\"category\": " + categoria + "}, {\"status\": " + status + "}\n]\n}";
    }

    @Override
    public int compareTo(Tarefa o) {
        if (this.getPrioridade() > o.getPrioridade()){
            return -1;
        } else if (o.getPrioridade() > this.getPrioridade()) {
            return 1;
        } else return 0;
    }

//    public String compareToCategory(Tarefa o){
//
//        ArrayList<Tarefa> tarefas = new ArrayList<>();
//        for (Tarefa tarefa : tarefas) {
//            if (o.getCategoria().equalsIgnoreCase(tarefa.getCategoria())) {
//
//            }
//        }
//    }
}
