package org.jav.edu.co;

import java.util.ArrayList;
import java.util.List;

public class KanbanTabla {

    private List<Columna> kanban;

    public KanbanTabla() {
        this.kanban = new ArrayList<>();
    }

    public void addColumna(Columna columna) {
        kanban.add(columna);
    }

    public void mostrarKanban() {
        for (Columna columna : kanban) {
            System.out.println(columna);
        }
    }

    public void moverTarea(Tarea tarea, Columna columnaDesde, Columna columnaHasta) {
        if (kanban.contains(columnaDesde) && kanban.contains(columnaHasta)) {
            columnaDesde.removeTarea(tarea);
            columnaHasta.addTarea(tarea);
        } else {
            System.out.println("Una o ambas columnas no existen en el tablero.");
        }
    }
}
