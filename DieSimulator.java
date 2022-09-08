import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        // Turtle crush = new Turtle();
        Random generator = new Random();
        
        // int penWidth = crush.getPenWidth();
        int roll = generator.nextInt(6) + 1;
        
        System.out.println(roll);
    }
}
