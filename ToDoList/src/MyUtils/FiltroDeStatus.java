package MyUtils;

import java.util.ArrayList;
import java.util.HashMap;

import static MyUtils.App.addedTasks;

public class FiltroDeStatus {

    public static void filtroStatus(Tarefa tarefa){

        HashMap<String, ArrayList<String>> addedStatus = new HashMap<>();
        if (addedStatus.containsKey(tarefa.getStatus())){
            addedTasks.add(tarefa.getNome());
            addedStatus.replace(tarefa.getStatus(), addedTasks);
        } else if (!addedStatus.containsKey(tarefa.getStatus()) && addedTasks.isEmpty()){
            addedTasks.add(tarefa.getNome());
            addedStatus.put(tarefa.getStatus(), addedTasks);
        } else {
            addedTasks.clear();
            addedTasks.add(tarefa.getNome());
            addedStatus.put(tarefa.getStatus(), addedTasks);
        }

        System.out.println(addedStatus);
    }

}
