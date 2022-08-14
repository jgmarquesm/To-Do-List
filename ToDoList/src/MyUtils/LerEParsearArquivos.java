package MyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerEParsearArquivos {

    public static void lerArquivos(){

        File folder = new File("/home/notebook/Área de Trabalho/Github/Projetos/AceleraZG/ZG-Hero_Project/ToDoList/out/Tarefas");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> arquivos = new ArrayList<>();

        for (File file : listOfFiles) {
        String str = "";
            if (file.isFile() && file.getName().endsWith(".txt")) {

                try (FileReader fileReader = new FileReader(file);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    String line = bufferedReader.readLine();

                    while (line != null){
                        str += line + "\n";
                        line = bufferedReader.readLine();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Arquivo não encontrado.");
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    System.out.printf("Não foi possível ler o arquivo: %s.%n", file.getName());
                    throw new RuntimeException(e);
                }
            }
            arquivos.add(str);
        }
        for (String arquivo : arquivos){
            parsearArquivos(arquivo);
        }
    }

    private static void parsearArquivos(String arquivo){

        final String regex = "\"([^\"]+)\":[\"]*([^,^\\}^\"]+)";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(arquivo);

        if (matcher.find()) {
            for (int i = 2; i <= matcher.groupCount(); i += 2) {
                System.out.println(matcher.group(i));
            }
        }
    }
}
