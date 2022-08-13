package MyUtils;

public class CriarTarefa {

    public static Tarefa criarTarefa(String nome, String descricao, String dataTermino,
                                   int prioridade, String categoria, String status){

        Tarefa tarefa = new Tarefa(nome, descricao, dataTermino, prioridade, categoria, status);
        return tarefa;
    }
}
