package MyUtils;

import javax.swing.*;
import java.util.Scanner;

public class App {

    public static void rodandoApp(){

        String controle = "";

        while(!controle.equalsIgnoreCase("sair")){

            String nome = JOptionPane.showInputDialog("Nome da tarefa: ");
            String descricao = JOptionPane.showInputDialog("Digite a descição: ");
            String dataTermino = JOptionPane.showInputDialog("(dd/mm/aaaa)Data limite: ");
            String categoria = JOptionPane.showInputDialog("Categoria: ");
            String  status = JOptionPane.showInputDialog("Status: ");
            String prioridade = JOptionPane.showInputDialog("(1 a 5)Prioridade da tarefa: ");

            Tarefa tarefa = CriarTarefa.criarTarefa(nome, descricao, dataTermino, prioridade, categoria, status);
            System.out.println(tarefa.toString());
            CriadorDeTxt.criaArquivoTxt(tarefa);

            controle = JOptionPane.showInputDialog("Para sair do cadastro de tarefas, digite 'sair'.");
        }

        System.out.println("\nTarefas cadastradas com sucesso!");
    }
}
