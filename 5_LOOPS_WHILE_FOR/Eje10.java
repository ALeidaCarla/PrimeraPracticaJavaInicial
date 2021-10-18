
/**
 EJERCICIO 10
Ahora que ya sabemos transformar números en notación decimal a números en notación 
binaria, veamos algo interesante sobre estos.
Un número en notación binaria puede ser un “Numero Malvado” o un “Numero Odioso”. 
Esto dependerá de cuantos 1’s haya en su composición.
Aquellos números que tienen una cantidad par de 1’s son “Números Malvados”. Por otra 
parte, los números que tienen una cantidad impar de 1’s son “Números Odiosos”.
Dado un numero natural N (en notación decimal) indicar si, su representación binaria, es un 
“Numero Malvado” o un “Numero Odioso”
Restricciones
• 0 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:
N
Ejemplo 1
Entrada:
19
Respuesta:
“Odioso”
Ejemplo 2
Entrada:
43
Respuesta:
“Malvado”
 */
public class Eje10{
    public String verificar(int numero){
         String res ="";
         int binario = transformar (numero);
         int cantUnos = 0;
         while (binario>0){
             int dig = binario %10;
             if (dig == 1){
                 cantUnos++;
                }
                binario= binario/10;
            }
            if (cantUnos%2 ==0){
                res = "Numero Malvado";
            }else{
                res = "Numero Odioso";
            }
               return res;
            }
       private int transformar (int num) {   
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
