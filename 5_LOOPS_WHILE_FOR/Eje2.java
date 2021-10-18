
/**
 Dado un número entero positivo N, indicar si es, un número primo o un número
compuesto.
Un número se considera primo cuando tiene, únicamente, dos divisores distintos, siendo 
estos: el número uno y el propio número N.
Por otro lado, se considera numero compuesto a cualquier numero natural que tenga algún 
divisor más, aparte del 1 y el propio N.
Restricciones
• 1 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:N
 * @author (Aleida Eguivar) 
 * @version (10/12/2021)
 */
public class Eje2{
    public String verificarNumero (int numero){
        boolean esPrimo= true;
        // se usa cuando tiene el numero de it4eraciones
        //for ( variableDeControlLocal; condicion(es);variacion)
        for(int div = 2;div<=(numero/2)&& (esPrimo== true) ; div++){
            if (numero% div ==0){
                esPrimo= true;
                 
            }
            
        }
        String res;
        if (esPrimo== true){
            if (numero== 1){
               res=" El numero  es Compuesto";
            }else{
                res=" El numero es primo";
            }
            res=" El numero es primo";
        }else{
            res=" El numero  es Compuesto";
        }
         return res;
    } 
}

