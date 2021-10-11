
/**
 * Existe una familia de 5 personas… padre, madre y 3 hijos. Lo que pasa es que la señora de 
casa, tiene problemas para recordar la edad de cada hijo y por ello no tiene bien claro quién 
es el mayor, quien está en medio y quien es el menor. 
Tu tarea es ayudarle, para ello debes tener en cuenta que cada hijo tiene un nombre S y 
una edad N.
Se te pide que indiques quien de los 3 es el mayor, quien es el menor y quien es el 
hermano del medio.
Condiciones de Contexto
• Si es el nombre del i-esimo hermano
• 0 < Ni < 100
• Ni es un número entero. 
• Las edades de los 3 hermanos siempre serán de valores distintos entre ellos.
Datos de Entrada
La entrada se proporciona por parámetros, en el siguiente orden: s n

 * 
 * @author (Aleida Eguivar) 
 * @version (05/10/2021)
 */
public class Eje6
{
    //SEA S el nombre del hijo y  n su edad
    // si s es la edad del un hijo y esta es menor  a los demas es  el menor
    // si s es la edad del un hijo y esta es mayor a los demas es  el menor
    //entonces verificar que entrada es el que tenga los datos del medio
    public String edadesHijos ( String s1,int n1,String s2,int n2,String s3,int n3){

        String hermenor;
        String hermedio; 
        String hermayor;  
        String hermayorfinal;
        String hermediofinal;
        String hermenorfinal;    
        if (n1>n2 &&n1>n3){
            hermayor ="EL hermano mayor es";
            hermayorfinal = hermayor+"  "+s1;
        }else if (n2>n1 &&n2>n3){
            hermayor = "EL hermano mayor es";
            hermayorfinal = hermayor+"  "+s2;
        }else {
            hermayor ="EL hermano mayor es";
            hermayorfinal = hermayor+"  "+s3;
        }

        if (n1<n2 &&n1<n3){
            hermenor ="EL hermano menor es";
            hermenorfinal = hermenor+"  "+s1;
        }else if (n2<n1 &&n2<n3){
            hermenor ="EL hermano menor es";
            hermenorfinal = hermenor+"  "+s2;
        }else {
            hermenor ="EL hermano menor es";
            hermenorfinal = hermenor+"  "+s3;
        }
        if ( (n1>n2 && n1<n3 )||(n1>n3 && n1<n2) ){
            hermedio ="EL hermano del medio es";
            hermediofinal = hermedio +"  "+s1;
        }else if ( (n2>n1 && n2<n3 )||(n2>3 && n2<n1) ){
            hermedio ="EL hermano del medio es";
            hermediofinal = hermedio +"  "+s2;
        }else {
            hermedio ="EL hermano del medio es";
            hermediofinal = hermedio +"  "+s3;
        }
        String res = hermayorfinal +"      "+hermediofinal+"        "+  hermenorfinal;
        return res;
    }
}
