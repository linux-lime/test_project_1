public class Main {

    public static void main(String[] args) {
        //primitive variables in java:
        int a = 5;
        char b = 'l';
        long c = 400;
        double d = 3.2;
        //test comment

        String Yoooo = "Valorant";
        System.out.println(Yoooo.toUpperCase()); //prints string yoooo as Upper Case letter -> output: "VALORANT"
        addExclamationPoint("deez"); //calls upon a "Method" we made listed below
    }

    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

}