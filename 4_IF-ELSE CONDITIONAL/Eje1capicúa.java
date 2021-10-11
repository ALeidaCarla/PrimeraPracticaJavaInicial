//
public class Eje1capicúa{
    public String verificar (int numero){
       String res ="";
       int ultDigito= numero %10;
       int primerDigito= numero /100;
        if (ultDigito ==primerDigito){
            res ="si";
        }
        else {
            res ="no";
        }
        return res;
     }
}
