import java.util.Random;

public class RandomNumbersGenerator {

    //we create a method that takes two variables as parameters
    //amount is do quantity of the numbers and range is the distance between
    //the number 1 and whatever you choose.
    static void RandomNumbers (int amount, int range){

        // We will generate a six numbers random sequence
        Integer[] numbers = new Integer[amount];
        Random numRandoms = new Random();

        // It starts the first one without checking if it's duplicated or not
        // because only one number cannot being duplicated
        numbers[0] = numRandoms.nextInt(range)+1;
        System.out.println(numbers[0]);

        for (int i = 1; i < amount; i++){

            // We will use the value var to check each number already allocated
            int value = i;

            // It's started the second one and its successors
            numbers[i] = numRandoms.nextInt(range)+1;
            do {

                //We check each number with its predecessor
                if (numbers[i] != numbers[value-1]){

                    //if different we check its previous and so on
                    value--;
                } else {

                    // if we find an equal number we try again until we finish the list
                    value = i;
                    numbers[i] = numRandoms.nextInt(range)+1;
                }
            }while (value !=0);
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args){

        RandomNumbers(6, 60);

    }
}
