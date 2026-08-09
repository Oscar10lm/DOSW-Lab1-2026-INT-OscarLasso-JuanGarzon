# LAB-1-DOSW-COMPANY
Evaluar los fundamentos de programación funcional en Java (Streams, Lambdas, estructuras de datos) y el manejo colaborativo de Git/GitHub 

![alt text](image.png)


![alt text](image-1.png)

Considero que deberían contratarme porque soy una persona responsable, curiosa y comprometida con aprender constantemente. Como estudiante de Ingeniería de Sistemas, he tenido la oportunidad de trabajar con diferentes lenguajes y tecnologías, pero sobre todo he aprendido a enfrentar problemas, buscar soluciones y adaptarme cuando algo no sale como esperaba. No considero que lo sepa todo, y precisamente por eso tengo la disposición de aprender, recibir retroalimentación y mejorar. Me gusta asumir retos y convertir los conocimientos que adquiero en soluciones. Sé que todavía tengo mucho por aprender, pero también sé que tengo la actitud, la disciplina y las ganas necesarias para crecer y aportar valor al equipo.

## Cuestionario teorico
1. ¿Cuál es la diferencia entre git merge y git rebase?

La diferencia principal es que *git merge* une los historiales creando un nuevo commit de combinación, mientras que *git rebase* mueve y vuelve a aplicar tus commits sobre la otra rama, lo que borra y reescribe el historial para que sea una línea recta.

2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Ocurre un conflicto de fusión (merge conflict). Git detiene el proceso de *merge automático* y debes elegir qué cambio deseas conservar antes de continuar.

3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

El comando que te permite ver el historial el historial de merges y ramas de forma grafica en consola es: *git log --graph --oneline --all*. Dibuja un diagrama ASCII con todas las ramas y uniones del repositorio.

4. Explica la diferencia entre un commit y un push.

El *commit* guarda una foto de los archivos locales del equipo, mientras que el *push* envia esa foto de los archivos locales hacia un servidor donde otras personas lo pueden ver (Github)

5. ¿Para qué sirven git stash y git stash pop?

Sirven para guardar temporalmente los cambios actuales sin la necesidad de un commit y recuperarlos más tarde, lo que permite limpiar el espacio de trabajo para cambiar de rama o solucionar un problema urgente.

El *git stash* es el que guarda los cambios, la cual almacena las modificaciones pendientes (tanto las preparadas como las no preparadas) en una zonza de memoria temporal.

El *git stash pop* es el que vuelve a aplicar los cambios que tienes guardados directamente sobre tu espacio de trabajo actual.

6. ¿Qué diferencia hay entre HashMap y HashTable?

El *HashMap* permite una sola clave nula y multiples valores nulos. Mientras que el *HashTable* no permite claves ni valores nulos. Al intentar usar uno, lanza la excepción NullPointerException.

7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?

Ofrece un código más limpio, declarativo y fácil de mantener en flujos de datos (Streams), además de permitir procesamiento paralelo de forma segura.

8. Si usas List con objetos y aplicas stream().map(), ¿qué tipo de operación estás haciendo?

Estaría haciendo una operación intermedia de tipo transformación, la cual toma cada elemento de la lista original, le aplica una función y deuvelve un nuevo *Stream* con los resultados transformados.

9. ¿Qué hace stream().filter() y qué retorna? 

Evalúa los elementos de un flujo usando una condición lógica y retorna un nuevo *Stream* que solo incluye los elementos que cumplen con dicha condición.

10. Describe el paso a paso para crear una rama desde develop para una funcionalidad nueva

- Primero, debo asegurarme que la versión local que estoy trabajando tenga los últimos cambios para evitar conflictos futuros. Esto se puede hacer cambiando de rama a develop y usar el comando *git pull origin develop*

- Segundo, creo la rama de trabajo usando el comando *git checkout -b feature/nombre-funcionalidad*, donde el nombre de la funcionalidad debería ser un texto breve y descriptivo separado por guiones.

- Tercero, subo la rama creada al servidor remodo usando el comando *git push -u origin feature/nombre-funcionalidad*. El parametro *-u* conecta la rama local a la remota, facilitando los siguientes git push o git pull.


11. ¿Cuál es la diferencia entre git branch y git checkout -b?

La diferencia principal es que *git switch* sirve solo para cambiar de rama, mientras que git checkout hace varias tareas a la vez, como cambiiar de rama y recuperar archivos.

12. ¿Por qué se recomienda usar ramas feature/ en lugar de trabajar directamente en main? 

Evita romper el código estable, permite organizar el trabajo de varias personas a la vez y facilita revisar los cambios antes de unirlos. Mantiene la rama principal limpia y lista, permitiendo hacer modificaciones en entornos aisladas que después pueden aplicarse a la misma rama principal.