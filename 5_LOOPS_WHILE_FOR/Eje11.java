
/**
 EJERCICIO 11
La multiplicación es una de las operaciones aritméticas mas conocidas y estamos 
acostumbrados a calcularla de manera directa, sin embargo, hoy recordaremos cual es la 
idea de una multiplicación, explicada de manera clásica.
Como se puede observar en la imagen, la multiplicación no es mas que la suma de un factor 
consigo mismo una cantidad determinada de veces.
De manera general, una multiplicación consta de dos factores, el multiplicando y el 
multiplicador. El producto de una multiplicación sale de sumar consigo mismo el 
multiplicando la cantidad de veces que indique el multiplicador.
En este ejemplo en particular podríamos decir que la instrucción es como decir (4 veces 6).
Dado dos números enteros positivos N y M respectivamente, indica cual es el resultado de 
la multiplicación, pero no de forma directa, si no, aplicando el calculo de la respuesta 
mediante sumas sucesivas.
Restricciones
• 1 ≤ N, M
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:
N M
 */
public class Eje11
{
   public int multiplicar (int num , int multiplicador){
       int res =0;
       for(int cont =1;cont<=multiplicador;cont++){
           res = res+ num;
        }
        return res;
    }
}
