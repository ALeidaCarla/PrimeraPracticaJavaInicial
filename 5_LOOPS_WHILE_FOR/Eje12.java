
/**
 * Write a description of class Eje11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eje12
{
    public int division (int division ,int divisor){
        int res=0;
        while (division>=divisor){
            division=division-divisor;
            res++;
        }
        return res;
    }
}
