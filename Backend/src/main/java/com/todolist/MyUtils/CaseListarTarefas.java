package com.todolist.MyUtils;

import javax.swing.*;
import java.util.Locale;

public class CaseListarTarefas {

    public static void actionListar(){

        String option = JOptionPane.showInputDialog("""
                Selecione o tipo de listagem:
                1- Por Prioridade.
                2- Por Categoria.
                3- Por Status.
                4- Para voltar.""");

        switch (option.toLowerCase(Locale.ROOT)) {
            case "1" -> LerEParsearArquivos.filtroPorAtributo("prioridade");
            case "2" -> LerEParsearArquivos.filtroPorAtributo("categoria");
            case "3" -> LerEParsearArquivos.filtroPorAtributo("status");
            case "4" -> {break;}
        }
        App.rodandoApp();
    }
}
