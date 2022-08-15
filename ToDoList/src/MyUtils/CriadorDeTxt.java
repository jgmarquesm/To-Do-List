package MyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriadorDeTxt {

    public static void criaArquivoTxt(Tarefa tarefa) {

        String path = "/home/notebook/Área de Trabalho/Github/Projetos/AceleraZG/ZG-Hero_Project/ToDoList/src/Tarefas/" + tarefa.getNome() +".txt";
        String strFormatada = "[{\"titulo\":" + "\"" + tarefa.getNome() + "\"" + "},{\"descricao\":" + "\"" +
                tarefa.getDerscicao() + "\"" + "},{\"datLimite\":"  + "\"" + tarefa.getDataTermino() + "\"" + "}," +
                "{\"prioridade\":" + "\"" + tarefa.getPrioridade() + "\"" + "}, {\"categoria\":" + "\"" + tarefa.getCategoria()
                + "\"" + "},{\"status\":" + "\"" + tarefa.getStatus() + "\"" + "}]";
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                escreverNoArquivoTxt(file, strFormatada);
                System.out.printf("%n%s criado com sucesso!%n", file.getName());
            } else {
                System.out.printf("%nO arquivo %s já existe!%n", file.getName());
            }
        } catch (IOException ex) {
            System.out.print("Erro inesperado.");
            throw new RuntimeException(ex);
        }
    }

    public static void escreverNoArquivoTxt(File file, String str){

        try {
            FileWriter myWriter = new FileWriter(file.getPath());
            myWriter.write(str);
            myWriter.close();
            System.out.print("\nArquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.print("\nOcorreu um erro!");
            e.printStackTrace();
        }
    }
}
