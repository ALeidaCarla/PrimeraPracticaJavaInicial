
/**
EJERCICIO 4
Factorial de un numero N (n!) es la multiplicación de todos los números enteros positivos 
menores o iguales que N.
Existe un caso especial el cual no cumple lo mencionado anteriormente, este caso es 
cuando N es igual a cero. Para este caso (0! = 1) 
Restricciones
• 0 ≤ N ≤ 12
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:
N
Ejemplo 1
Entrada:
1
Respuesta:
1
Ejemplo 2
Entrada:
3
Respuesta:
6
Ejemplo 3
Entrada:
5
Respuesta:
120
Ejemplo 4
Entrada:
8
Respuesta:
40320

 */
public class Eje4{
    public int encontrarFactorial(int num){
        int res=1;
        if (num==0){
        res=1;
       }else{
            for (int i=1;i<=num;i++){
            res = res *i;
            }
        }
        return res;
    }
}
    

