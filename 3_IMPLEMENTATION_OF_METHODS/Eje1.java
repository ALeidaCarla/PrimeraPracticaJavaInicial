
/**
 * IMPLEMENTACIÓN DE MÉTODOS.
 * 
 * @author (Aleida Eguivar) 
 * @version (30/09/2021)
 */
public class Eje1
  /** Las estaciones del año marcan el inicio de una temporada, entre las cuatro que hay, la que 
más popular se volvió, es el inicio de la primavera. Esta estación inicia a partir del 21 de 
septiembre.
¿Cuántas horas tenemos hasta el inicio de la primavera, si son las Z en punto (notación de 
24 horas) del 19 de septiembre?
Condiciones de Contexto
• 0 ≤ Z ≤ 23
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:z */
{
  // sea z = la hora de inicio en formato 24hrs  del 19 de septiembre
  // si 24 hrs = 1dia incrementar 24 para llegar al 20 de septiembre
  // entonces restar  al numero de entrada las 24hrs para llegar a 00.00 hrs del 21
      public int hrs_hasta_inicio ( int z){
          int restar_p_00hrs= 24 - z;
          int total_hrs= 24+ restar_p_00hrs;
          return total_hrs;
      }    
}
