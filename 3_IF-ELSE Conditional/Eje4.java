/**
 * SENTENCIA IF ELSE.
 * Los semáforos juegan un papel muy importante dentro la ciudad, es conocido por todos, que los semáforos 
tienen 3 estados, un estado “rojo” donde no se puede pasar, un estado “amarillo” el cual indica que debes 
detenerte, un estado “verde” que significa que puedes pasar.
Pero algo mucho más interesante, que el significado de sus colores, es la transición de estados.
• De estado “rojo”, cambia a estado “verde”
• De estado “verde”, cambia a estado “amarillo”
• De estado “amarillo”, cambia a estado “rojo”
Entonces si tienes un semáforo con un estado actual X y este cambia N veces, ¿en qué estado se encuentra 
el semáforo después de los N cambios?
Condiciones de Contexto
• X es un String que puede tener como valor “rojo”, “amarillo” o “verde”.
• N es un numero entero que indica la cantidad de transiciones que tendrá el semáforo. 
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente orden:
 * @author (Aleida Eguivar) 
 * @version (03/10/2021)
 */
public class Eje4{
    // si X es el color de inicio y n el numero de repeticiones
    // entonces se debe responder en el orden 0verde>1amarillo>2rojo
    public String estadoFinal ( String colorInicio,int ncambios ){
       String res ="";
       int valorActual;
       //== se utiliza solo para datos int 
        // siendo String  utiliza  .equals
        if ( colorInicio .equals ("verde")){
            valorActual = 0;
        }else {
            if ( colorInicio .equals("amarillo")){
               valorActual = 1;
           }else {
               valorActual = 2;
           }
        }
        int estadoFinal = ( valorActual+ ncambios)%3;
        if(estadoFinal == 0){
            res = "verde";
        }else {
               if(estadoFinal == 1){
                 res = "amarillo";
               }else{
                res = "rojo";
            }
        }
         return res;
    }
}
