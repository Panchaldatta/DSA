import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class checkPalindrom {

    static ArrayList<String> palindromicSubstr (String str){
        int n = str.length();

   HashSet<String> result  = new HashSet<>();
   for (int i = 0; i<n ; i++){
     int left  = i, right = i;
     while (left >=0 && right < n && str.charAt(left)==str.charAt(right)){
      result.add (str.substring(left ,right));
      left++;
      right++;

     }

   }
   for (int i =0;i<n ;i++){
    int left =i,right=i+1;
    while(left>=0 && right<n && str.charAt(left)==str.charAt(right)){
        result.add(str.substring(left, right + 1));
        left--;
        right++;
    }
   }
    ArrayList<String> ans = new ArrayList<>(result);
    return ans;

        
    }


    public static void main(String[] args) {
          String str = "Madam";
          ArrayList<String> result = palindromicSubstr(str);
          for (String s : result )
          System.out.println(s + "");
        }

}