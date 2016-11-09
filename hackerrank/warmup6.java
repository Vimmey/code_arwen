import java.io.*;
import java.util.*;

public class warmup6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    
        
        int n = Integer.parseInt(br.readLine());

        for (int i = n; i>0 ; i--) {
        	for (int j = i-1; j>0; j--) {
        		System.out.print(" "); 
        	}
        	for (int j=i; j<=5;j++) {                      
        		System.out.print("*");                
     		}
         	 System.out.println();     
       
        }
    }
}