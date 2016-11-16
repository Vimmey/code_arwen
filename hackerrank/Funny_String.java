import java.io.*;
import java.util.*;

public class Funny_String{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        String resultStr = "";
        
        while (t-->0) {
            String str = br.readLine();
            int len = str.length();
            int leftPtr = 0;
            int rightPtr = len - 1;
            
            resultStr = "Funny";

            
            for (int i = 0; i<len-1 ; i++) {
                if ( Math.abs((int)str.charAt(leftPtr) - (int)str.charAt(leftPtr + 1)) != 
                        Math.abs((int)str.charAt(rightPtr) - (int)str.charAt(rightPtr - 1))) {
                    resultStr = "Not Funny";
                    break;
                }
                leftPtr++;
                rightPtr--;
            }
            
            System.out.println(resultStr);

        }
     
        
        
    }
}