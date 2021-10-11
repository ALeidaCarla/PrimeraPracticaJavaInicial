
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje10
  /** Tenemos un gotero que deja caer gotas de agua durante X segundos. Las gotas caen a una 
velocidad de 1 ml. por segundo. 
El gotero contiene inicialmente G ml. de agua.
¿Cuántos ml. de agua quedaran en el gotero después de X segundos?
Condiciones de Contexto
• G ≥ X ≥ 1
• G y X son números enteros
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: G  X  */
{
  // sea X =x = el tiempo en segundos y G=g = la cantidad de ml. de agua inicialmente . 
  // si  Las gotas caen a una velocidad de 1 ml. por segundo. 
  // entonces restar el tiempo en segundos a la cantidad de ml. de agua inicialmente  . 
       public int  ml_agua_quedara (int g, int x){
          int total_agua_quedar = g - x ;
          return total_agua_quedar ;
 
    }
}
