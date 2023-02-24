poolobject
==========

[![Java CI](https://github.com/jfm1006/poolobject/actions/workflows/ci.yml/badge.svg)](https://github.com/jfm1006/poolobject/actions/workflows/ci.yml) [![codecov](https://codecov.io/gh/jfm1006/poolobject/branch/master/graph/badge.svg)](https://codecov.io/gh/jfm1006/poolobject)

Java code example of creational design pattern pool object

Workshop to use good practices in software developmemnt: testing and measurement.

Authors:

- Jorge Fernandez Moreno
- Alvaro Mendez Alonso

# Practica 1

## Objetivos especificos

- Comprender los objetivos de medición relacionados con la caracterización y la evaluación deproductos, procesos y recursos software
- Comprender, aplicar y analizar técnicas de medición sobre entidades de productos softwarerelacionados con conjuntos de pruebas de software
- Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos deprueba del software

## Requisitos software

- Eclipse IDE for Java Developers http://www.eclipse.org/downloads/
- Plugin Eclipse EclEmma http://www.eclemma.org/. Manual de instalación. Instalar directamente dela red http://update.eclemma.org/
- Estar registrado con el nombre usuario de la UBU en repositorio de proyectos GitHub https://github.com/
- Estar registrado con la cuenta de GitHub en Travis CI https://travis-ci.org/
- Estar registrado con la cuenta de GitHub en Codecov.io https://codecov.io/

## Requisitos Teoricos

- Conocimiento del proceso de prueba y sus tareas asociadas
- Conocimiento de métricas de producto y de proceso
- Conocimiento del patrón de diseño Pool Object
- Conocimiento de repositorios de proyectos software
- Conocimiento de sistemas de control de versiones
- Conocimiento de sistemas que permitan la ejecución de tareas del proceso de desarrollo software.
- Conocimientos de sistemas integración continua

## Requisitos Tecnicos

- Manejo de entorno de desarrollo Eclipse y componentes adicionales (plugins)
- Compilar, ejecutar pruebas y desplegar la aplicación con Apache Ant (http://ant.apache.org/)
- Desarrollo de proyectos software con el sistema de control de versiones Git: clonación derepositorios, commit, push...
- Automatización de casos de prueba con JUnit 4 (Manual de usuario http://junit.sourceforge.net/doc/cookbook/cookbook.htm)
- Cobertura del código con las pruebas usando EclEmma, JaCoCo y Codecov.io

## Enunciado

En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el productodesarrollado como el proceso seguido.

### Descripcion del producto

Dado un código de ejemplo del patrón diseño creacionalPool Object, se debe crear una batería de pruebas talque las coberturas de sus clases sean del 100%. El código de las clases se puede obtener en el repositorio https://github.com/clopezno/poolobject. La batería de pruebas JUnit debe estar contenida en la clase ubu.gii.dass.test.c01.ReuseblePoolTest.java.

### Descripcion del proceso

El proceso de desarrollo de la batería de pruebas se va a gestionar utilizando el control de versiones delsistema Git proporcionado por el repositorio de proyectos GitHub (https://github.com).Los pasos para gestionar el procesos son los siguientes:
- Cada miembro del equipo tiene que estar registrado en GitHub, Travis CI y Codecov.io.
- Uno de los miembros tiene que realizar un fork del repositoriodonde se encuentra el código que sequiere probar https://github.com/clopezno/poolobject. El nuevo repositorio tiene que ser público.
- Invitar al resto de miembros del equipo para que puedan participar en el desarrollo de las pruebas.
- Vincular el proyecto con Travis CI y Codecov.io.
- Cada nuevo test realizado ejecutar un commit/push al repositorio del grupo. El texto del commit tieneque describir el caso de prueba añadido.
- Verificar el resultado de las pruebas en el pipeline de integración continua y cómo la calidad delproducto va mejorando con las sucesivas integraciones.

# Preguntas

### ¿Se ha realizado trabajo en equipo?

El trabajo ha sido realizado conjuntamente y de manera equitativa desde el principio. Nos repartimos el trabajo cuando lo vimos por primera vez y fuimos haciendo los diferentes commits de forma alterna haciendo uso del push y pull que nos proporciona github. A parte de repartirnos el trabajo, nos hemos ayudado mutuamente en cada metodo lo que ha hecho que los dos aprendamos del Poolobject.

### ¿Tiene calidad el conjunto de pruebas disponibles?

El conjunto de pruebas tiene calidad ya que cubrimos los test que se nos proporciona al maximo, pero aun asi nos queda parte del proyecto sin cubrir, lo que hace que el porcentaje de codecov de cobertura no sea tan alto como se puede esperar. A pesar de todo consideramos que un 67% de cobertura es un buen porcentaje teniendo en cuenta que no tenemos cubiertos todas las clases del proyecto.

### ¿Cuál es el esfuerzo invertido en realizar la actividad?

El esfuerzo invertido para realizar esta actividad no ha sido excesivo, puesto que hemos podido realizar la actividad completa entre las sesiones de práctica y empleando un par de horas en casa. Sobre la dificultad de la practica, no ha sido muy alta. Hemos tenido mas problemas a la hora de configurar tanto Travis como Codecov, y el classpath y el project, antes que en realizar los test que teniamos que cubrir.

### ¿Cuál es el número de fallos encontrados en el código?

Cuando recibimos el codigo, no encontramos ningun fallo a pesar de que si que tuvimos que configurar el classpath y el project para que no nos diera problema al ejecutar en Visual Studio Code los test de JUnit y se configuraran bien todos los imports quitandose asi los errores del build que nos daban dentro del Visual Studio a pesar de que los primeros test los ejecutaba bien desde JavaCI.
