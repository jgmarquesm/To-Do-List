package com.todolist.MyUtils;


public class Tarefa implements Comparable<Tarefa>{
    final private String NOME;
    final private String DESCRICAO;
    final private String DATA_TERMINO;
    final private int PRIORIDADE;
    
    final private String CATEGORIA;
    final private String STATUS;

    public Tarefa(String nome, String descricao, String dataTermino, int prioridade, String categoria, String status) {
        this.NOME = nome;
        this.DESCRICAO = descricao;
        this.DATA_TERMINO = dataTermino;
        this.PRIORIDADE = prioridade;
        this.CATEGORIA = categoria;
        this.STATUS = status;
    }

    public String getNome() {
        return NOME;
    }

    public String getDerscicao() {
        return DESCRICAO;
    }

    public String getDataTermino() {
        return DATA_TERMINO;
    }

    public int getPrioridade() {
        return PRIORIDADE;
    }

    public String getCategoria() {
        return CATEGORIA;
    }

    public String getStatus() {
        return STATUS;
    }

    public static Tarefa criarTarefa(String nome, String descricao, String dataTermino,
                                     int prioridade, String categoria, String status){

        return new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status);
    }

    @Override
    public String toString() {
        return "\n{\nTarefa: [\n{\"titulo\": " +  NOME + "}, {\"descricao\": " + DESCRICAO +
                "}, {\"dataLimite\":"  + DATA_TERMINO + "}, {\"prioridade\": " + PRIORIDADE +
                "}, {\"categoria\": " + CATEGORIA + "}, {\"status\": " + STATUS + "}\n]\n}";
    }

    @Override
    public int compareTo(Tarefa o) {
        return Integer.compare(o.getPrioridade(), this.getPrioridade());
    }
}
