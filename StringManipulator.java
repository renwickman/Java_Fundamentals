import java.lang.String;
public class StringManipulator {
    
    public String trimAndConcat(String str1, String str2){
        return str1.trim()+str2.trim();
    }
    public int getIndexOrNull(String fullstring, char findstring) {
        return fullstring.indexOf(findstring);
    }
    public int getIndexOrNull(String fullstring, String substring ) {
        return fullstring.indexOf(substring);
    }
    public String concatSubstring(String str1, int start, int end, String str2) {
        String str3 = str1.substring(start, end);
        String str4 = str3 + str2;
        return str4;
    }
}
