
/**
 * Exploring the String class and its methods.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringExplorer
{
    public static void main(String[] args)
    {
        String river = new String("Mississippi");
        System.out.println(river);
        
        river.replace("i", "x");
        System.out.println(river);
        
        /*
         * The replace method returns a reference to a new String object.
         *  It does *not* change the String object on which it is invoked.
         *  The String class has no mutator methods. It is not
         *      possible to change a String object.
         *      
         *  Strings are immutable.
         */
        String riverX = river.replace("i", "x");
        System.out.println(riverX);
    }
}
