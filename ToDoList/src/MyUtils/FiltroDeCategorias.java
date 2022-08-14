package MyUtils;

import java.util.ArrayList;
import java.util.HashMap;

import static MyUtils.App.addedTasks;

public class FiltroDeCategorias {

    public static void filtraCategorias(Tarefa tarefa){

        HashMap<String, ArrayList<String>> addedCatergorias = new HashMap<>();
        if (addedCatergorias.containsKey(tarefa.getCategoria())){
            addedTasks.add(tarefa.getNome());
            addedCatergorias.replace(tarefa.getCategoria(), addedTasks);
        } else if (!addedCatergorias.containsKey(tarefa.getCategoria()) && addedTasks.isEmpty()){
            addedTasks.add(tarefa.getNome());
            addedCatergorias.put(tarefa.getCategoria(), addedTasks);
        } else {
            addedTasks.clear();
            addedTasks.add(tarefa.getNome());
            addedCatergorias.put(tarefa.getCategoria(), addedTasks);
        }

        System.out.println(addedCatergorias);
    }
}
