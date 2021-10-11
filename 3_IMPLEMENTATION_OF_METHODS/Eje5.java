
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje5
  /** Se tienen tres números enteros de un solo digito a, b y c correspondientemente.
Organizaremos los números en el orden bca, formando así un nuevo número entero.
Tu tarea es: Encontrar la manera de formar un número entero usando los valores de a, b y c
cumpliendo el orden indicado.
Condiciones de Contexto
• 1 ≤ a, b, c ≤ 9
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: a b c */
{
  // sean int a , int b , int c = numeros enteros 
  // si cambiamos  las centenas y decenas podemos  cambiar el orden
  // entonces multiplicamos por 100 y por 10 respectivamente
      public int mostrar_numero ( int a, int b , int c){
          int respuesta = (b*100)+(c*10)+a;
          return respuesta;
      }    
}
