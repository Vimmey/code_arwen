import java.io.*;
import java.util.*;

public class stringevenodd {

    public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
           int t = Integer.parseInt(br.readLine());
           while (t-->0){
               String s = br.readLine();
               String even = "";
               String odd = "";
           
                for (int i =0; i<s.length(); i++) {
                    if (i %2 == 0) {
                        even = even + s.charAt(i);
                    } else {
                        odd = odd + s.charAt(i);
                    }  
                 }
                System.out.println(even + " " + odd);
           }        
    }
}
      