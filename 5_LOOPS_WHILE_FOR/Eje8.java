
/**
 * Dado un número natural N, indicar el número que se forma de juntar su primer digito, con 
el ultimo digito, pero, de manera cambiada.
Restricciones
• 10 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:N

 * @author (Aleida Eguivar) 
 * @version (10/12/2021)
 */
public class Eje8{
    public String singularizarDigitos(int num){
       // si el numero de entrada es dividido entre 10 
       //entonces el resto del numero dividido seria el ultimo digito
       
        String res ="";
         int ultimoDig =  num%10;
         int primerDig = 0;
       while(num >10){
             num = num/10;
            primerDig = num%10;
           
            
       }
        res =ultimoDig+""+primerDig;
       return res;
   }
}
