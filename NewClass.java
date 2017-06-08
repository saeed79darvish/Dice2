
import java.util.Random;

public class NewClass {

    public static void main(String[] args) {
        Random rnd = new Random();

        int Dice;
        int Dice1;

        Dice = rnd.nextInt(6);
        Dice1 = rnd.nextInt(6);
        Dice1++;
        Dice++;

        System.out.println("Dice= " + Dice);
        System.out.println("Dice1= " + Dice1);

    }
}
