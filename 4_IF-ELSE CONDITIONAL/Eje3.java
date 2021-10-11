
/**
 *El 14 de febrero, día de San Valentín, es una de muchas fechas conmemorativas en el mundo.
Esta fecha en particular es un recordatorio de vida para Dariel, ya que es prueba y manifiesto de la 
soledad que debe soportar durante su vida. Fechas como el 21 de septiembre, por ejemplo, 
también son muy tortuosos para él.
¿Qué tienen en común estas fechas? Si lo ves bien, el valor numérico del día esta, formado por un 
numero par y un numero impar.
Dado un numero D, indicar que tipo de día representa, según el siguiente criterio: si está formado 
por un numero par y un numero impar (en cualquier orden) indicar que es una “Cruz de Dariel”, 
caso contrario, indicaremos que es un “Día normal”
Condiciones de Contexto
• 1 ≤ D ≤ 31
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente orden:D
 * 
 * @author (Aleida Eguivar) 
 * @version (04/10/2021)
 */
public class Eje3
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
