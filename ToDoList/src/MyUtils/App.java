package MyUtils;

import javax.swing.*;
import java.util.Locale;

public class App {

    public static void rodandoApp(){

        String option = JOptionPane.showInputDialog("""
                Selecione uma opção:
                1- Cadastrar nova tarefa.
                2- Listar tarefas já cadastradas.
                3- Deletar tarefa existente.
                4- Para sair.""");

        switch (option.toLowerCase(Locale.ROOT)){
            case "1" -> CaseCadastrarTarefa.actionCadastrar();
            case "2" -> CaseListarTarefas.actionListar();
            case "3" -> CaseDeletarTarefas.actionDeletar();
            case "4" -> {
                break;
            }
            default -> rodandoApp();
        }
    }
}
