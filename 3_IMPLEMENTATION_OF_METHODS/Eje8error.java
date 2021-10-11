
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje8error
  /** Hoy veremos un poco sobre los caracteres.
Se da una letra L. Se desea saber cuál es la letra que sigue (en orden alfabético).
Condiciones de Contexto
• L es un carácter.
• L nunca será ñ ni z (mayúscula y minúscula)
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:L */
{
  // sea l = la letra de entrada
  // si la siguiente es + 1
  // entonces incrementar 1 para tener la subsecuente letra
      public char subsecuente( char letra){
         char subsecuente_letra = (char)(letra+1);
          return subsecuente_letra;
      }    
}
