/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje3
  /**Calcula la circunferencia de un círculo de radio R
La fórmula para calcular la circunferencia es Diámetro*pi.
Para pi=3.14159
Condiciones de Contexto
• R ≥ 1
• R es un numero entero
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:R */
{
  // sea R=r= el  radio de un círculo
  // si el diámetro es dos veces R 
  // entonces el diámetr/ 2 =  R 
  // para tener ´recosion tratar de  mantener un solo tipo de retorno
      public double cal_circunferencia ( int r){
          double respuesta =0;
          double pi= 3.14159;
          int diametro= r*2;
          respuesta= diametro*pi;
          return respuesta;
      }    
}
