import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Puzzling{
    public void sumAnd10(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }

    public void shuffleStrings(String[] arr){
        ArrayList<String> newArray = new ArrayList<String>();
        ArrayList<String> newArray5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newArray5.add(arr[i]);
            }
            newArray.add(arr[i]);
        }
        Collections.shuffle(newArray);
        System.out.println(newArray);
        System.out.println(newArray5);
    }

    public void shuffleAlphabet(){
        ArrayList<String> alphaArr = new ArrayList<String>();
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){
            alphaArr.add(Character.toString(alpha));
        }
        System.out.println(alphaArr);
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);

        System.out.println("First letter of the shuffled array: " + alphaArr.get(0));
        System.out.println("Last letter of the shuffled array: " + alphaArr.get(25));
        String sample = alphaArr.get(0);

            if("AEIOU".indexOf(sample) > 0){
                System.out.println("This letter is a vowel! ");
            }
        }

    public void randomNumber(){
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 101);
                randNums.add(num);
            }
        System.out.println(randNums);
    }

    public void randomNumber2(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randNums2);
        System.out.println(randNums2);
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);
    }

    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
            String newString = randString.toString();
            System.out.println(newString);
    }


    public void randomString2(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String newString = randString.toString();
            randList.add(newString);
            randString.setLength(0);
        }
        System.out.println(randList);
    }

}