package org.jav.edu.co;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        // Crear tareas
        Tarea tarea1 = new Tarea("Diseñar interfaz", "1", "Diseñar la interfaz de usuario para la aplicación");
        Tarea tarea2 = new Tarea("Implementar backend", "2", "Desarrollar la lógica del servidor");

        // Crear columnas
        Columna porHacer = new Columna("Por hacer");
        Columna enProgreso = new Columna("En progreso");
        Columna hecho = new Columna("Hecho");

        // Agregar tareas a la columna "Por hacer"
        porHacer.addTarea(tarea1);
        porHacer.addTarea(tarea2);

        // Crear el tablero Kanban y agregar columnas
        KanbanTabla tablero = new KanbanTabla();
        tablero.addColumna(porHacer);
        tablero.addColumna(enProgreso);
        tablero.addColumna(hecho);

        // Mostrar el tablero inicial
        System.out.println("Tablero Kanban inicial:");
        tablero.mostrarKanban();

        // Mover una tarea a "En progreso"
        tablero.moverTarea(tarea1, porHacer, enProgreso);

        // Mostrar el tablero después de mover la tarea
        System.out.println("\nTablero Kanban después de mover la tarea 'Diseñar interfaz' a 'En progreso':");
        tablero.mostrarKanban();
    }
}
