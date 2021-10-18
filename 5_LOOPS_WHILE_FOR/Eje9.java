
/**
 EJERCICIO 9
Dado un número natural N, en notación decimal (base 10), se te pide transformarlo a un 
número en notación binaria (base2).
Se debe dividir el numero entre dos y repetir esto con cada resultado mientras este no sea 
cero. Llegado al final, se debe ir formando el numero binario con los residuos de cada 
división, pero desde la última a la primera (abajo hacia arriba).
Restricciones
• 0 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: N
 */
public class Eje9{
    public int transformar(int num){
         int res =0;
       int mult= 1;
        // divido el numero hasta que sea cero
        while (num >0){
            int residuo =num %2;
            res = res +(residuo *mult);
            num = num/2;
            mult= mult *10;
        }
        return res;
   }
}
