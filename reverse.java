public class Activity_6_3 {
    static String reverse(String str) {
       char[] arr = str.toCharArray();
        String[] res = new String[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
          res[j] = Character.toString(arr[i]);
          j++;
        }
        String fres = "";
        j = 0;
        while(j < arr.length) {
            fres += res[j];
            j++;
        }
        return fres;
     }
    
    public static void main(String[] args) {
      //Trying reverse() method 
        //Displaying 'Hello World' in reversed 
        System.out.println(reverse("Hello World"));  
    }
    
}
