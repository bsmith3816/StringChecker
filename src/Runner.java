public class Runner {

    public static void main(String[] args){

        CodeWordChecker newChecker = new CodeWordChecker(1, 20, "carrot");
        CodeWordChecker newChecker2 = new CodeWordChecker("dio");

        System.out.println(newChecker.isValid("car"));
        System.out.println(newChecker.isValid("badcarrots"));
        System.out.println(newChecker.isValid("kakkarots"));

        System.out.println(newChecker2.isValid("reeeeeeeeeeee"));
        System.out.println(newChecker2.isValid("bedding"));
        System.out.println(newChecker2.isValid("kono dio da"));

    }

}
