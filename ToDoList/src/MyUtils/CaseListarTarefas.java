package MyUtils;

import javax.swing.*;

public class CaseListarTarefas {

    public static void actionListar(){

        String listaDeTarefas = new ToDoList().readPorPrioridade();
        System.out.println(listaDeTarefas + "\n");
        App.rodandoApp();
    }
}
