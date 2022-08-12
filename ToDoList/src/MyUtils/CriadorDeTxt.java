package MyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriadorDeTxt {

    public static void criaArquivoTxt(Tarefa tarefa) {

        String path = "/home/notebook/Documentos/" + tarefa.getNome() +".txt";
        String strFormatada = "Tarefa: " + tarefa.getNome() +
                "\nPrioridade: " + tarefa.getPrioridade() +
                "\nDescrição: " + tarefa.getDerscicao() +
                "\nStatus: " + tarefa.getStatus() +
                "\nData limite: " + tarefa.getDataTermino() +
                "\nCategoria: " + tarefa.getCategoria();
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                escreverNoArquivoTxt(file, strFormatada);
                System.out.printf("%s criado com sucesso!", file.getName());
            } else {
                System.out.printf("O arquivo %s já existe!", file.getName());
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
