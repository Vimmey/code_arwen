import java.io.*;
public class stringevenodd {
       public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
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
           System.out.println (even + " " + odd);
       }
   }
