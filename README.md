# Cfa-Automation

<h2>Este proyecto cuenta con las siguientes características:</h2>

- Lenguaje de programación: Java
- Framework de Automatización: SerenityBDD
- Patrón de diseño: Screenplay
- Framework de soporte BDD (Behavior development driver): Cucumber
- Lenguaje de BDD (Behavior development driver): Gherkin
- Constructor de proyecto: Gradle

**Nota:** Nota: El proyecto esta diseñado para ser ejecutado en maquinas Windows y navegador Firefox.

<h2>El proyecto posee la siguiente estructura:</h2>

- [ ] src/main/java/co/com/cfa/prueba/enums: Este paquete contiene todos los enums del proyecto, por ejemplo, mensajes, rutas o palabras, las cuales no son buenas quemarlas en el codigo, si no tener un lugar especifico.
- [ ] src/main/java/co/com/cfa/prueba/execptions: Este paquete contiene todas las excepciones que fueron diseñadas en el proyecto.
- [ ] src/main/java/co/com/cfa/prueba/interactions: Este paquete maneja todas las funciones de iteraciones con elementos web, por ejemplo, realizar click en un elemento web, esperar un elemento web etc.
- [ ] src/main/java/co/com/cfa/prueba/models: Este paquete contiene las clases que orquestaran toda la data necesaria para ejecutar las pruebas automatizadas.
- [ ] src/main/java/co/com/cfa/prueba/questions: Este paquete contine todas las questions o validaciones del proyecto.
- [ ] src/main/java/co/com/cfa/prueba/tasks: Este paquete maneja las tareas que va realizar el usuario para cumplir con lo esperado en la prueba automatizada, asi cumpliendo con el patrón de diseño Screenplay
- [ ] src/main/java/co/com/cfa/prueba/userinterface: En este paquete se referencian los elementos de las vistas con las que vamos interactuar, asi garantizando la reusabilidad de código.
- [ ] src/main/java/co/com/cfa/prueba/utils: En este paquete tenemos las clases que nos ayudaran a cumplir con el BDD ya sea modificando valores, obteniendo un texto, entre otros.
- [ ] src/test/java/co/com/cfa/prueba/runner: Este paquete contiene el archivo runner el cual se encarga de ejecutar las pruebas.
- [ ] src/test/java/co/com/cfa/prueba/stepdefinitios: Este paquete contiene los archivos de steps los cuales definen el paso a paso de el lado de lógica de programación.
- [ ] src/test/resources/co/com/cfa/prueba/data: Este paquete contiene los archivo de la data que vamos a manejar en las pruebas. Nota: Esto lo hago a modo personal y es por el hecho de que no me gusta tener un feature lleno de data.
- [ ] src/test/resources/co/com/cfa/prueba/features: Este paquete contiene los archivos feature los cuales definen el escenario a evaluar del lado del BDD.
- [ ] gitignore: El archivo encargado de bloquear el subir archivos no necesarios en el repositorio.
- [ ] serenity.properties: Es el archivo que ayuda a setear propiedades del Framework de Serenity.

<h2>Datos adicionales del proyecto:</h2>

- Se implemento la anotación "@Share" de serenity para compartir data entre diferentes contextos.
- Se implemento tag generico llamado "@RegressionTest" para poder ejecutar toda la suite de pruebas.

<h2>Pasos para obtener el proyecto de automation:</h2>

- Clonar el repositorio en la ubicación deseada, usando el comando: git clone https://github.com/BrayantGb/Cfa-Automation

<h2>Evidencia de ejecución</h2>
- En la carpeta raiz se encuentra un directorio llamado Video allí hay un archivo llamado "EjecucionWebCiencuadras.mp4" el cual evidencia la ejecución de la automatización.

<h2>Pasos para ejecutar el proyecto</h2>

- Se debe de tener instalado Java 8 en la maquina donde se desea ejecutar la prueba
- Se debe de tener instalado gradle que es el gestor de dependencias versión 7.2
- Se deben de tener configurado las variables de entorno tanto de Java como de Gradle
- Se debe primero realizar los pasos de la sección "Pasos para obtener el proyecto de automation"
- Abrir el proyecto en el IDE de su preferencia que soporte Java, ejecutar el archivo TestRunner, este runner por defecto esta configurado con el tag @RegressionTest para ejecutar todas las pruebas


<h2>Generación de reporte del framework</h2>
- Ejecute el proyecto, diríjase a la carpeta target/site/serenity y una vez alli abra en el navegador de su preferencia el archivo index