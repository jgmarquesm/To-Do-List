package MyUtils;

import javax.swing.*;
import java.io.File;

public class CaseDeletarTarefas {

    public static void actionDeletar(){

        String nome = JOptionPane.showInputDialog("Digite o nome da tarefa que deseja apagar:");

        try {
            String path = "/home/notebook/Área de Trabalho/Github/Projetos/AceleraZG/ZG-Hero_Project/ToDoList/src/Tarefas/" + nome + ".txt";
            File file = new File(path);
            if (file.delete()){
                JOptionPane.showMessageDialog(null, file.getName() + " apagado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Delete falhou");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar o arquivo.");
        } finally {
            App.rodandoApp();
        }

    }
}
