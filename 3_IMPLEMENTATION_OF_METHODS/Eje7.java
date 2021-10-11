
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje7
  /**Se dice que los números son infinitos…pueden seguir creciendo y creciendo…cada vez con 
más dígitos…pero ¿Cuál es limite actual? ¿Cuál es la esquirla de un número? 
Dado un numero entero N debes indicar el primer digito de este número (leer de izquierda 
a derecha). Asumir que el número de entrada siempre será un numero con 3 dígitos.
Restricciones
• 100 ≤ N ≤ 999
• N es un número entero
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: N*/
{
  // sea N =n= el numero de 3 digitos
  // si elimonamos las decenas y unidades  tenemos el primer digito
  // entonces dividimos entre 100 el numero de entrada
      public int invertir_orden_numero ( int n){
          int respuesta = n/100;
          return  respuesta;
      }    
}
