
/**
 * El mundo de los números es inmenso, existen números pares, impares, primos, etc. 
En este caso vamos a enfocarnos en un grupo particular de números al cual llamaremos 
“parientes”, se dice que dos números son “parientes” cuando al menos uno de ellos, es 
múltiplo del otro. 
Por ejemplo 8 y 4 “son parientes”, si bien 4 no es múltiplo de 8. el numero 8 si es múltiplo 
de 4. Por otra parte, por ejemplo, 9 y 5 “no son parientes”.
Dados dos números, A y B, indicar si estos son o no, números parientes.
Condiciones de Contexto
• 0 < A, B < 2147483647
• A y B son números enteros 
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente orden: A  B
 * @author (Aleida Eguivar) 
 * @version (03/10/2021)
 */
public class Eje5

{ // crear el metodo , TIPO DE DATO de retorno String  , Nombre del metofo
  public String verificarDia(int dia){
      String res="";
      if (dia<10){
        res="Es un dia normal";
    }else{
        int dig1= dia%10;
        int dig2= dia/10;
        // if dig1 es par  y  dig2 es par o if dig1 es impar  y  dig2 es impar
        if (( dig1%2== 0 && dig2%2== 0 )||(dig1%2 != 0 && dig2%2 != 0 ) ){
          res="Es un dia normal";
        }else{
            res="Cruz de Daniel";
        }
    }  
     return res;
}
}
