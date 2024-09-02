Este proyecto es una implementación de la metodología Kanban en Java. Kanban es una técnica de gestión de proyectos y flujo de trabajo que ayuda a visualizar y gestionar el progreso de las tareas. En este proyecto, se utiliza un tablero Kanban para representar las fases de un proceso y gestionar las tareas en cada fase.

Estructura del Proyecto
El proyecto está dividido en varias clases principales que representan la metodología Kanban:

Tarea: Representa una tarea individual con un título, un identificador único y una descripción.
Columna: Representa una columna en el tablero Kanban, con una fase específica (por ejemplo, "Por hacer", "En progreso", "Hecho") y una lista de tareas.
KanbanTabla: Representa el tablero Kanban completo, que contiene varias columnas.
Main: Clase principal que se utiliza para crear y gestionar las tareas, columnas y el tablero Kanban.
Instalación
Para ejecutar este proyecto, necesitarás tener Java instalado en tu máquina.

Clona el Repositorio:
bash
Copiar código
git clone https://github.com/tuusuario/kanban-project.git
Compila el Código: Navega al directorio del proyecto y ejecuta:
bash
Copiar código
javac -d bin src/*.java
Ejecuta el Proyecto: Después de compilar, ejecuta la clase Main:
bash
Copiar código
java -cp bin Main
Uso
El archivo Main.java contiene ejemplos de cómo utilizar las clases Tarea, Columna y KanbanTabla para gestionar un tablero Kanban.

Crear Tareas:

java
Copiar código
Tarea tarea1 = new Tarea("Diseñar interfaz", "1", "Diseñar la interfaz de usuario para la aplicación");
Tarea tarea2 = new Tarea("Implementar backend", "2", "Desarrollar la lógica del servidor");
Crear Columnas:

java
Copiar código
Columna porHacer = new Columna("Por hacer");
Columna enProgreso = new Columna("En progreso");
Columna hecho = new Columna("Hecho");
Agregar Tareas a Columnas:

java
Copiar código
porHacer.addTarea(tarea1);
porHacer.addTarea(tarea2);
Crear el Tablero Kanban y Mostrarlo:

java
Copiar código
KanbanTabla tablero = new KanbanTabla();
tablero.addColumna(porHacer);
tablero.addColumna(enProgreso);
tablero.addColumna(hecho);

tablero.mostrarKanban();
Mover una Tarea entre Columnas:

java
Copiar código
tablero.moverTarea(tarea1, porHacer, enProgreso);
Documentación
Para más detalles sobre cada clase y sus métodos, consulta el código fuente en el directorio src/.

Contribución
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

Haz un Fork del Repositorio.
Crea una Rama para tu Funcionalidad:
bash
Copiar código
git checkout -b feature/nueva-funcionalidad
Haz tus Cambios y Realiza un Commit:
bash
Copiar código
git commit -am 'Añadida nueva funcionalidad'
Envía un Pull Request.
