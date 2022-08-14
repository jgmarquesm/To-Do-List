package MyUtils;

import java.util.ArrayList;

public class Status {

    private String status;

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}
