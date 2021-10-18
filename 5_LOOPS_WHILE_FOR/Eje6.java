
/**
 EJERCICIO 6
Se dice “Numero Perfecto” a todo número natural N, que es igual a la suma de sus divisores 
propios (es decir, todos sus divisores excepto el propio número). Por ejemplo, 6 es un 
número perfecto ya que sus divisores propios son 1, 2, y 3 cumpliendo así que: 1+2+3=6.
¿Pero… que pasa con aquellos números cuya suma de divisores propios es mayor o menor 
que el propio número?
En caso que la suma de divisores propios sea mayor que el propio número N, se dice que es 
un “Numero Abundante”. Por ejemplo, 12 es abundante ya que sus divisores son 1, 2, 3, 4 
y 6 y se cumple que 1+2+3+4+6=16, que es mayor que el propio 12.
En caso que la suma de divisores propios sea menor que el propio número N, se dice que es 
un “Numero Defectivo”. Por ejemplo, 16 es un número deficiente ya que sus divisores 
propios son 1, 2, 4 y 8 y se cumple que 1+2+4+8=15, que es menor que 16.
Restricciones
• 2 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:N
 */
public class Eje6{
    public String veroficarTipo(int numero){
        String res = "";
        int sumatoriaDiv = calcularSumatoriaDiv(numero);
        if(sumatoriaDiv==numero){
            res= "Numero Perfecto";        
        }else{
            if (sumatoriaDiv>numero){
                res= "Numero Abundante";
            }else{
                res= "Numero Defectivo";
            }
        }
        return res;
    }
    
    private int calcularSumatoriaDiv(int num){
        int res =0;
        for (int div =1; div <=(num/2);div++){
            if (num% div== 0){
                res = res + div;
            }
        }
        return res;
    
    }
}
