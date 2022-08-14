package MyUtils;

import javax.swing.*;

public class CaseCadastrarTarefa {

    public static void actionCadastrar(){

        int prioridade = 0;

        String nome = JOptionPane.showInputDialog("Nome da tarefa: ");
        String descricao = JOptionPane.showInputDialog("Digite a descição: ");
        String dataTermino = JOptionPane.showInputDialog("(dd/mm/aaaa)Data limite: ");
        String categoria = JOptionPane.showInputDialog("Categoria: ");
        String  status = JOptionPane.showInputDialog("Status: ");
        String prioridadeStr = JOptionPane.showInputDialog("(1 a 5)Prioridade da tarefa: ");
        if (prioridadeStr.equals("1")){
            prioridade = 1;
        } else if (prioridadeStr.equals("2")){
            prioridade = 2;
        } else if (prioridadeStr.equals("3")){
            prioridade = 3;
        }
        else if (prioridadeStr.equals("4")){
            prioridade = 4;
        }
        else if (prioridadeStr.equals("5")){
            prioridade = 5;
        }

        Tarefa tarefa = CriarTarefa.criarTarefa(nome, descricao, dataTermino, prioridade, categoria, status);
        ToDoList.adicionarTarefaNaLista(tarefa);
        CriadorDeTxt.criaArquivoTxt(tarefa);

        FiltroDeCategorias.filtraCategorias(tarefa);
        FiltroDeStatus.filtroStatus(tarefa);

        JOptionPane.showMessageDialog(null, "Tarefa cadastradaa com sucesso!");
        App.rodandoApp();
    }
}
