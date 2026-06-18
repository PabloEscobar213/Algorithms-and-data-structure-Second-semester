public class Practice_5 {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum("Hello, ", "World!"));
        System.out.println(isEven(4));
        printMessage("This is a message.");
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static String sum(String a, String b){
        return a + b;
    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    public static void printMessage(String message){
        System.out.println(message);
    }
}