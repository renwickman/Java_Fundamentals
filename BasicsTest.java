public class BasicsTest {
    public static void main(String[] args){
        Basics testNum = new Basics();

        testNum.print1To255();

        testNum.printOdd1To255();

        testNum.printSum();

        int[] testArr = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.iterateArray(testArr);

        int[] testArr2 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.findMax(testArr2);

        int[] testArr3 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.getAverage(testArr3);

        int[] testArr4 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.greaterThanY(testArr4, 3);

        int[] testArr5 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.squareTheValues(testArr5);

        int[] testArr6 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.noNegatives(testArr6);

        int[] testArr7 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.maxMinAvg(testArr7);

        int[] testArr8 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.shiftingValues(testArr8);

        int[] testArr9 = {-9, -7, -5, -3, -1, 0, 1, 3, 5, 7, 9};
        testNum.noNegatives(testArr9);

    }
}