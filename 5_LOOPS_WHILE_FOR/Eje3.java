
/**
JERCICIO 3
Dariel tiene un alter ego, el cual se llama Danilo. Son dos personalidades totalmente 
opuestas, como si uno fuera la personalidad invertida del otro. Dariel observo que esto 
también puede pasar en los números. 
Dado un numero entero N, indicar el numero que resulta de invertir N.
Restricciones
• 1 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:  N
                                                                      
 * @author (Aleida Eguivar) 
 * @version (10/12/2021)
 */
public class Eje3{
    public int invertirNumero(int numero){
        int exp = contarDigitos(numero)-1; // que sera el exponente
        // 10 elevado al exponente se interpreta en la siguiente libreria Math.pow(base,exp) que es una clase estatica que resulve 
        int mult = (int)Math.pow(10,exp);// pero retorna un dato de tipo double,de tal manera debemos convertir antesediendo con un int
        int res = 0;
        while (numero >0){
             int dig = numero%10;
             res = res+(dig*mult);
             numero = numero/10; //actualiza el numero decrementando el ultimo digito
             mult= mult/10;
            
        }
        return res;
    }
    // el metodo es pivado que sera suficiente copiar el nombre 
    private int contarDigitos(int num){ 
         int res = 0;
         if (num==0){
            res = 1;
        }else{
            while(num != 0){
                num = num/10;
                res ++;
             }
            }
       return res;
   }
}
