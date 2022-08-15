package MyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerEParsearArquivos {

    private static ArrayList<String> lerArquivos(){

        File folder = new File("/home/notebook/Área de Trabalho/Github/Projetos/AceleraZG/ZG-Hero_Project/ToDoList/src/Tarefas");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> arquivos = new ArrayList<>();

        for (File file : listOfFiles) {
        StringBuilder str = new StringBuilder();
            if (file.isFile() && file.getName().endsWith(".txt")) {

                try (FileReader fileReader = new FileReader(file);
                     BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                    String line = bufferedReader.readLine();

                    while (line != null){
                        str.append(line).append("\n");
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
            arquivos.add(str.toString());
        }
        return arquivos;
    }

    public static void printTarefas(LinkedHashSet<String> lista){

        for (String arquivo : lista){

            System.out.println(arquivo);
            System.out.println();
        }
    }

    private static ArrayList<String> filtrarVariacoesDoAtributo(String atributo){

        ArrayList<String> arquivos = lerArquivos();
        ArrayList<String> atributos = new ArrayList<>();

        final String regex = "\\\"([" + atributo + "]+)\\\":[\\\"]*([^,^\\\\\\}^\\\"]+)";

        for (String arquivo : arquivos) {

            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(arquivo);

            if (matcher.find()){
                atributos.add(matcher.group(2));
            }
        }
        return atributos;
    }

    public static void filtroPorAtributo(String atributo){

        ArrayList<String> atributos = filtrarVariacoesDoAtributo(atributo);
        LinkedHashSet<String> linkedHashSetArquivos = new LinkedHashSet<>();

        for (String a : atributos) {

        ArrayList<String> arquivos = lerArquivos();
//            Regex para filtrar atributo e tipo de atributo
//            final String regex = "\\\"([" + atributo + "]+)\\\":\\\"([" + a + "]+)\\\"";
            final String regex = "\\\"([" + atributo + "]+)\\\":[\\\"]*([^,^\\\\\\}^\\\"]+)";

            for (String arquivo : arquivos) {

                final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
                final Matcher matcher = pattern.matcher(arquivo);

                if (matcher.find() && matcher.group(2).equalsIgnoreCase(a)){
                    linkedHashSetArquivos.add(arquivo);
                }
            }
        }
        printTarefas(linkedHashSetArquivos);
    }
}
