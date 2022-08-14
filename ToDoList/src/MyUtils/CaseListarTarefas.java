package MyUtils;

import javax.swing.*;
import java.util.Locale;

public class CaseListarTarefas {

    public static void actionListar(){

        String option = JOptionPane.showInputDialog("""
                Selecione o tipo de listagem:
                1- Por Prioridade.
                2- Por Categoria.
                3- Por Status.
                4- Para sair.""");

        switch (option.toLowerCase(Locale.ROOT)) {
            case "1" -> {
                try {
                    String listaDeTarefas = new ToDoList().readPorPrioridade();
                    System.out.println(listaDeTarefas + "\n");
                } finally {
                    LerEParsearArquivos.lerArquivos();
                }
                App.rodandoApp();
            }
            case "2" -> {
                String listaDeTarefasPorCategoria = new ToDoList().readPorCategoria();
                System.out.println(listaDeTarefasPorCategoria + "\n");
                App.rodandoApp();
            }
            case "3" -> {
                String listaDeTarefasPorStatus = new ToDoList().readPorStatus();
                System.out.println(listaDeTarefasPorStatus + "\n");
                App.rodandoApp();
            }
            case "4" -> {break;}
        }
    }
}
