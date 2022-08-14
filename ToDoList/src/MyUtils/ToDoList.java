package MyUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ToDoList {
    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static void adicionarTarefaNaLista(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public String readTarefas(){

        String str = "";
        for (Tarefa tarefa : tarefas){
            str += tarefa.toString();
        }
        return str;
    }

    public String readPorPrioridade(){

        Collections.sort(tarefas);
        String str = "";
        for (Tarefa tarefa : tarefas) {
            str += tarefa.toString() + "\n";
        }
        return str;
    }

    public String readPorCategoria(){
        String str = "POR CATEGORIA";

        return str;
    }

    public String readPorStatus(){
        String str = "POR STATUS";

        return str;
    }
}
