public class PuzzlingTest {
    public static void main(String[] args){
        Puzzling testData = new Puzzling();

        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        
        String[] testList = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};

        testData.sumAnd10(testArr);

        testData.shuffleStrings(testList);

        testData.shuffleAlphabet();

        testData.randomNumber();

        testData.randomNumber2();

        testData.randomString();

        testData.randomString2();
    }
}