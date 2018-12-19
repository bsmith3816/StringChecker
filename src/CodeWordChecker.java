public class CodeWordChecker {

    int min, max;
    String word;

    public CodeWordChecker(int a, int b, String c){
        min = a;
        max = b;
        word = c;
    }

    public CodeWordChecker(String a){
        min = 6;
        max = 20;
        word = a;
    }

    public boolean isValid(String str){
        if(str.length() < min || str.length() > max){
            return false;
        }
        if(str.contains(word)){
            return false;
        }
        return true;
    }

}
