
/**
 EJERCICIO 5
Dentro la suma conocemos como acarreo a lo que “se lleva” cuando sumamos 2 números.
   11                   111
   2346                 999
  +1792                +  1
  =4138               =1000

Dado dos números enteros positivos A y B respectivamente, calcular e indicar la cantidad 
de acarreos que resulta de efectuar la suma entre ambos números.
Restricciones
• 1 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato: A B
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eje5{
    public int calcularAcarreos(int num1, int num2){
         int res =0;
         int acarreo =0;
         while (num1>0 || num2>0){
            int dig1 =  num1%10;
            int dig2 = num2 %10;
            int suma = dig1+dig2+acarreo;
            if(suma>9){
            res++;
            acarreo =1;
           }else{
            acarreo=0;
           }
            num1=num1/10;
            num2=num2/10;
        }
        return res;
    }
}
