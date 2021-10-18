
/**
 * SINTAXIS 
 * EJERCICIO 1
Dado un número entero positivo N, indica la cantidad de dígitos que tiene ese número.
Restricciones
• 1 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:N
 * @author (Aleida Eguivar) 
 * @version (10/12/2021)
 */
public class Eje1{
    public int contarDigitos(int num){
       // 
         int res =0;
       while(num != 0){
             num= num/10;
             res ++;
       }
       return res;
   }
}
