
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje9
  /** La UnicornioApp es una red social nueva, entre sus particularidades, están el control sobre 
la cantidad de personas que un usuario puede seguir.
Como máximo, un usuario puede seguir 3x (el número de usuarios que te siguen) 
Actualmente una cantidad A de usuarios te están siguiendo y estás siguiendo a B usuarios.
Como máximo, ¿cuántos usuarios adicionales puedes seguir ahora?
Condiciones de Contexto
• A ≥ B
• A y B serán números enteros.
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: A B*/
{
  // sean A=a el número de usuarios que te siguen , B =b  numero que tu estás siguiendo
  // si un usuario puede seguir 3x (el número de usuarios que te siguen) 
  // entonces multiplicamos el número de usuarios que te siguen menos los que ya sigues
     public int calcular_seguidores(int a, int b){
         int total_seguidores=0;
         int cant_max= 3* a;
         total_seguidores= cant_max - b;
           return total_seguidores;
 
      }
}
