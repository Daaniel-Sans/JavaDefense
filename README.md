**Defensa**

**Se deben incluir comentarios para explicar las partes más relevantes del código**.

**IMPORTANTE: No puede haber commits posteriores a la hora de entrega de la defensa.**

La empresa **Gamefreak** nos ha pedido crear una aplicación para gestionar **Pokémon**.

Ejercicios:

1.  Hacer un paquete **pokemon** con la siguiente clase:

    1.  **Pokemon**, con los siguientes elementos:

        1.  Atributos:

            1.  **nombre** (cadena de texto)

            2.  **nivel** (número entero)

            3.  **puntosSalud** (número entero)

            4.  **ataque** (número entero)

            5.  **tipo** (de tipo Tipo)

                1.  **Tipo** puede ser **NORMAL, FUEGO, AGUA, PLANTA, SINIESTRO, PSIQUICO**

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

            3.  Con **todos los atributos excepto tipo**, que ponga **tipo** a **NORMAL**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **debilitado()** que devuelva **true** o **false** si **puntosSalud es menor o igual que 0**

            3.  **atacar(pokemon)**, que **reste** al Pokémon que se pasa como parámetro tantos **puntos de salud** como **ataque** tiene el Pokémon atacante


_Por ejemplo: si A.atacar(B) y A tiene 5 de ataque, a B se le restan 5 puntos de salud_

1.  **toString()** que devuelva “ **(nivel )**”

2.  **Pocion**, con los siguientes elementos:

    1.  Atributos:

        1.  **puntosRestaurados** (número entero)

        2.  **precio** (número decimal)

    2.  Constructores:

        1.  **Completo**

        2.  **Vacío**

    3.  Métodos:

        1.  Todos los **getters** y **setters**

        2.  **curar(pokemon)** que **sume** al Pokémon que se pasa como parámetro tantos **puntos de salud** como **puntosRestaurados** tiene la poción


_Por ejemplo: si A.curar(B) y A tiene 5 de puntosRestaurados, a B se le suman 5 puntos de salud_

1.  **getPrecioConImpuesto(impuesto)**, que devuelva el precio tras aplicar un impuesto dado en tanto por ciento

2.  **toString()** que devuelva “**Poción: Pokédólares**”


1.  Hacer un paquete **personas** con las siguientes clases:

    1.  **Persona**, con los siguientes elementos:

        1.  Atributos:

            1.  **nombre** (cadena de texto)

            2.  **edad** (número entero)

            3.  **pokemonFavorito** (de tipo Pokemon)

            4.  **numPokemon** (número entero, representa el número de Pokémon que tiene la persona)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **saludo()** que imprima por consola “**Hola, soy y mi Pokémon favorito es** ”

            3.  **toString()** que devuelva “ **( años)**”

    2.  **Entrenador**, que hereda de **Persona**, con los siguientes elementos:

        1.  Atributos:

            1.  **medallas** (número entero)

            2.  **clase** (de tipo Clase)

                1.  **Clase** puede ser **DOMINGUERO, CAZABICHOS, MONTANYERO, PESCADOR, ORNITOLOGO**

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

            3.  Con **todos los atributos excepto medallas**, que ponga **medallas a 0**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **ganarMedallas(numMedallas)** que **sume numMedallas a medallas**

            3.  **ligaDisponible()** que devuelva **true** o **false** si **medallas es mayor o igual que 8**

            4.  **toString()** que devuelva “ **( años)**”

    3.  **LiderGimnasio**, que hereda de **Persona**, con los siguientes elementos:

        1.  Atributos:

            1.  **region** (cadena de texto)

            2.  **ciudad** (cadena de texto)

            3.  **sinDerrotar** (booleano)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **toString()** que devuelva “**LIDER , de ciudad ( años)**”


1.  En la clase **Main**:

    1.  Crear **4 Pokémon** e **imprimir sus toString**

    2.  Ejecutar **2 ataques** e **imprimir los puntos de salud restantes de los Pokémon atacados**

    3.  Crear **1 poción**, **curar a un Pokémon atacado** e **imprimir los puntos de salud restantes**

    4.  Crear **2 entrenadores** e **imprimir sus toString**

    5.  Crear **1 líder de gimnasio** e **imprimir su toString**


**Rúbrica**

_**Criterios de evaluación:**_ _RA2: a, b, c, d, e, f, g, h, i; RA4: a, b, c, d, e, f, g, h, i; RA7: a, b, c, d, e, f, g, h, i, j_

**Elementos**

**Excelente (1,5 cada una)**

**Notable (1,2 cada una)**

**Aceptable (0,8 cada una)**

**Insuficiente (0,5 cada una)**

**Clases y Main**

La clase incluye todos los atributos y métodos, y hereda de la clase apropiada.

La clase incluye al menos el 75% de los atributos y métodos, y hereda de la clase apropiada.

La clase incluye al menos el 50% de los atributos y métodos, o no hereda de la clase apropiada.

La clase incluye menos del 50% de los atributos y métodos.

**Elementos**

**Excelente (1)**

**Notable (0,75)**

**Aceptable (0,5)**

**Insuficiente (0,25)**

**Estructura y comentarios**

Todo el código está bien estructurado, cuidando la indentación y el formato. Se han incluido comentarios en todos los ejercicios y sirven para entender qué se está haciendo.

La mayor parte del código está bien estructurado, cuidando la indentación y el formato. Se han incluido comentarios en algunos ejercicios y sirven para entender qué se está haciendo.

Una pequeña parte del código está bien estructurado, cuidando la indentación y el formato. Se han incluido comentarios en algunos ejercicios pero no sirven para entender qué se está haciendo.

Casi todo el código presenta una estructura poco estructurada y cuidada. No se han incluido comentarios en casi ningún ejercicio.