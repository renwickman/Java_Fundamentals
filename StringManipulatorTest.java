public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.trimAndConcat("    Coding   ", "   Dojo   Dallas    "));
        System.out.println(manipulator.trimAndConcat("    Coding   ", "   Dojo   "));
        
        char word2 = 'd';
        Integer c = manipulator.getIndexOrNull("Golds ", word2);
        System.out.println(c);

        String word = "Gym";
        Integer a = manipulator.getIndexOrNull("Golds ", word);
        System.out.println(a);

        String word3 = manipulator.concatSubstring("Welcome", 1, 2, "People!");
        System.out.println(word3);
    }
}