
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje4
  /** Hoy es un día muy ajetreado en las oficinas de UnicornioRecursivo SRL. 
Se ha encargado al asistente de planta que imprima un documento de N páginas, pero 
usando el anverso y reverso de las hojas. Es decir que en cada hoja se pueden imprimir dos 
páginas de un documento.
Dicho esto, ¿cuántas hojas se necesitarán para imprimir todo un documento de N paginas?
Condiciones de Contexto
• N ≥ 1
• N es un numero entero
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:N */
{
  // sea n = numero de páginas
  // si 2 páginas = 1hoja
  // entonces dividir  numero de paginas en 2 para convertir en hojas  
      public int calcular_numero_hojas ( int n){
          
          int dividirhojas_pag = n/2;
          int reciduo = n%2;
          int total_hojas = dividirhojas_pag +reciduo; 
          return total_hojas;
      }    
}
