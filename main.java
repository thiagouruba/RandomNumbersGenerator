import java.util.Random;

public class RandomNumbersGenerator {

    public static void main(String[] args){

        // We will generate a six numbers random sequence
        Integer[] numbers = new Integer[6];
        Random numRandons = new Random();

        // It starts the first one without checking if it's duplicated or not
        // because only one number cannot being duplicated
        numbers[0] = numRandons.nextInt(6)+1;
        System.out.println(numbers[0]);

            for (int i = 1; i < 6; i++){

                // We will use the value var to check each number already allocated
                int value = i;

                // It's started the second one and its successors
                numbers[i] = numRandons.nextInt(6)+1;
                do {

                    //We check each number with its predecessor
                    if (numbers[i] != numbers[value-1]){

                        //if different we check its previous and so on
                        value--;
                    } else {

                        // if we find an equal number we try again until we finish the list
                        value = i;
                        numbers[i] = numRandons.nextInt(6)+1;
                    }
                }while (value !=0);

                System.out.println(numbers[i]);
            }
    }
}
