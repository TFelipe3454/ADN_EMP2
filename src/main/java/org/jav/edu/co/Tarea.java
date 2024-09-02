package org.jav.edu.co;

public class Tarea {

    private String titulo;
    private String id;
    private String descripcion;

    public Tarea (String titulo, String id ,String descripcion){
        this.titulo = titulo;
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

