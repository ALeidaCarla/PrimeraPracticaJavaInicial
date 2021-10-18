
/**
EJERCICIO 3
Dado un numero en su representación binaria, transformarlo a un número en base decimal.
Condiciones de Contexto
• 0 ≤ N ≤ 12
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente formato:
N
1111
(1*2exp3)+(1*2exp2)+(1*2exp1)+(1*2exp0)
   8     +   4     +   2     +    1   =  15
1.-un numero binario debe analizarse digito por digito
2.-
 */
public class Eje3{
  public int convertirADecimal (int numeroBinario){
      int res =0;//respuesta decimal
      int base = 2; //numero por el cual se multiplica 
      int exp  = 0;//el exponente ira cambiando deacuerdo al numero de digitos 
      while (numeroBinario>0){
          int dig =numeroBinario%10;// ultimo digito 
          res = res + (dig*(int)Math.pow(base,exp));// utilizamos 
          exp++;// utilizamos ++ para que se incremente el digito 
          numeroBinario=numeroBinario/10;
        }
      return  res;
    }   
}
   