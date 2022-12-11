public class numberManipulation {
    static boolean isNegative(int num) {
        return (num >= 0) ? false : true;
    }
    
    static boolean isPositive(int num) {
        return (num >= 0) ? true : false;
    }
    
    static String odd(int num) {
        return (num % 2 != 0) ? "Yes" : "No";
    }
    
    static String even(int num) {
        return (num % 2 == 0) ? "Yes" : "No";
    }
    public static void main(String[] args) {
        System.out.println("isNegative: " + isNegative(5));
        System.out.println("isPositive: " + isPositive(5));
        System.out.println("Odd: " + odd(4));
        System.out.println("Even: " + even(4));
        
    }
    
}
