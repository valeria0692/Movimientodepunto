# Movimientodepunto

 Lenguaje Utilizado
* Java (JDK 8 o superior)
* Apache NetBeans IDE

## Descripcion de la Solucion
Aplicacion modular desarrollada en Java orientada a objetos que gestiona el desplazamiento de un punto dentro de una matriz bidimensional de 20x20. El sistema utiliza dos clases principales (`Matriz` y `Punt`) para controlar las coordenadas cartesianas (X, Y), aplicar restricciones de limites en el tablero y mostrar graficamente la posicion actual en la consola mediante un menu interactivo.
## Estructura de Clases del Proyecto
El proyecto consta de las siguientes clases:
1. `Matriz.java` - Clase principal que gestiona el tablero, el flujo de ejecucion con bucles, la lectura de la consola mediante `Scanner` y el renderizado visual de la matriz.
2. `Punt.java` - Clase auxiliar orientada a objetos que encapsula las coordenadas (x, y) y los metodos de desplazamiento (arriba, abajo, izquierda, derecha) validando los limites del plano.

