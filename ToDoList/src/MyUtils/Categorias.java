package MyUtils;

import java.util.ArrayList;

public class Categorias {

    private String categoria;

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Categorias(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return categoria;
    }
}
