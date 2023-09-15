public class Main {

    public static void main(String[] args) {
        int check = 350;
        int input = 500;
        int bonus = input / 100;

        int result;
        if (input >= 1000) {
            result = bonus + check + input;
        } else {
            result = check + input;
        }
        System.out.println( "Итоговый счет: " + result);
    }
}