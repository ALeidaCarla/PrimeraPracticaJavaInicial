
/**
 EJERCICIO 2
Dariel tiene un alter ego, el cual se llama Danilo. Son dos personalidades totalmente 
opuestas, como si uno fuera la personalidad invertida del otro. Dariel observo que esto 
también puede pasar en los números. 
Dado un numero entero N, indicar el número que resulta de invertir N.
Condiciones de Contexto
• 1 ≤ N
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente orden:
N C
Ejemplo 1
Entrada:
E1: 12345 E2: 4 
Respuesta:
“51234, 45123, 34512, 23451”
Ejemplo 2
Entrada:
E1: 71236 E2: 6 
Respuesta:
“67123, 36712, 23671, 12367, 71236, 67123”
Ejemplo 3
Entrada:
E1: 12 E2: 0
Respuesta:
12
  * @author (Aleida Eguivar) 
 * @version (10/17/2021)
 * 
 * 
1.-                    12345/10
                          5 | 1234      
2.-  si 5 convierto          50000
3.- sumo el cociente tengo   51234
entonces  10 exp numeroInicial -1
TENIENDO ASI                 10000 * 5(RESTO)

  
 */
public class Eje2{
     //imprimimos  con void
    public void invertirUnDigito(int numero, int numeroDeCambios){
        int exp = contarDigitos(numero)-1;//sacamos el exponente contando los digitos
        int mult = (int)Math.pow(10,exp);// multiplicamos por el exponente ej:convierto a 10000 para multiplcar por el resto 
        // aplicamos for porque tenemos una variable definida de conteo
        //variable de control local sera el numero de cambios
         //la condicion sera  que el numero de cambios es el numero de veces a  repetir 
        for( int contcambio = 0;  contcambio< numeroDeCambios;contcambio++){
             int dig = numero%10;// ultimo digito que debera ser llevado adelante 5
             numero = numero/10;// el numero menos el ultimo digito (cociente)1234
             int digmult = mult *dig ;
             numero = numero + digmult ;
             System.out.println(numero);
        }
    }
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
