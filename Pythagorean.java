import java.lang.Math;

public class Pythagorean {
    public double Hypotenuse(int partA, int partB){
        double result = Math.sqrt(partA*partA + partB*partB);
        return result;
    }
}