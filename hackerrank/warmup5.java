import java.io.*;
import java.util.*;

public class warmup5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    
        
        int n = Integer.parseInt(br.readLine());

        int zeroNum =0, negNum = 0, posNum = 0;

        String input = br.readLine();
		String number[] = input.split(" ");
        int arr[] = new int[n];	

        for(int i=0; i < n; i++){
   			arr[i] = Integer.parseInt(number[i]);
   			if (arr[i] == 0) {
   				zeroNum++;
   			}else if (arr[i] < 0) {
   				negNum++;
   			}else {
   				posNum++;
   			}
   		}      

   		float fracZero = zeroNum / ((float)n);
   		float fracNeg = negNum/((float)n);
   		float fracPos = posNum/((float)n);

        System.out.println(fracPos);
        System.out.println(fracNeg);
        System.out.println(fracZero);
       
    }
}


