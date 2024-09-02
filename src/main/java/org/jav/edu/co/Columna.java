package org.jav.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Columna {

    private String fase;
    private List<Tarea> tareas;

    // Constructor que acepta fase y una lista de tareas
    public Columna(String fase, List<Tarea> tareas) {
        this.fase = fase;
        this.tareas = tareas;
    }

    // Constructor que solo acepta fase y crea una lista de tareas vacía
    public Columna(String fase) {
        this.fase = fase;
        this.tareas = new ArrayList<>();
    }

    // Getters y Setters
    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    // Método para agregar una tarea
    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    // Método para eliminar una tarea
    public void removeTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    @Override
    public String toString() {
        return "Columna{" +
                "fase='" + fase + '\'' +
                ", tareas=" + tareas +
                '}';
    }
}
