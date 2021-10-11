/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje2
  /** Se sabe que el área de un dodecágono regular inscrito en un círculo de radio r es 3*r2.
Dado un número entero r, calcule el área de un dodecágono regular inscrito en un círculo 
de radio r.
Condiciones de Contexto
• 1 ≤ r ≤ 15445
• r es un número entero
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: r */
{
  // sea 3*r2= el área de un dodecágono regular
  // si r = radio (número entero)
  // entonces realizar el siguiente ejercicio 3*r2
      public int area_dodecágono ( int r){
          int total_area=  3*r*r;
          return total_area;
      }    
}
