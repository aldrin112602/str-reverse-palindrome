public class Activity_6_3_isPalindrome {
    static boolean isPalindrome(String str) {
       char[] arr = str.toCharArray();
       char[] res = new char[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
          res[j] = arr[i];
          j++;
        }  
        //convert to String
        String str2 = "";
        j = 0;
        while(j < arr.length) {
            str2 += Character.toString(res[j]);
            j++;
        }
        
        if(str == str2) {
            return true;
        } else {
            return false;
        }
     }
    
    public static void main(String[] args) {    
        //Print true or false
        System.out.println(isPalindrome("And"));  
     }
    }
