import java.util.Random;

public class DiceRoller {

    Random random = new Random();
    int number = 0;
    DiceRoller(){
        roll();

    }

    public void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
