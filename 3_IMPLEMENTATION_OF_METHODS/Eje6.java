
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje6
  /** Tenemos tres variables A, B y C, cada una de las cuales contiene un número entero.
Ahora haremos las siguientes operaciones en orden.
• Intercambia el contenido de las variables A y B
• Intercambia el contenido de las variables A y C
Retorne como resultado, el valor que contiene cada variable en orden A, B y C.
Condiciones de Contexto
• A, B y C son números enteros.
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: A B C*/
{
  // sea aux numero de entrada inicial  num1 
  // si  num1 cambiara al num2
  // entonces  num2 se actualizara a aux  por ejemplo
      public String intercambiar ( int num1,int num2,int num3 ){
          String respuesta ="";
          int aux =num1;
          num1=num2;
          num2=aux;
          aux=num1;
          num1=num3;
          num3=aux;
          respuesta=  num1+ ""+ num2+ ""+ num3 ;
          return respuesta;
      }    
}
