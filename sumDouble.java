public class Activity__6_4 {  
    static int sumDouble(int n1, int n2) {
        int sum = n1 + n2;
        return (n1 == n2) ? (sum * 2) : sum;       
    }
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));//3
        System.out.println(sumDouble(3, 2));//5
        System.out.println(sumDouble(2, 2));//8      
    }    
}
