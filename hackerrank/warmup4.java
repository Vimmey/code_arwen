import java.io.*;
import java.util.*;

public class warmup4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    
        
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][n];

        int sum1 =0, sum2 = 0;
        int diff = 0;

        

        for(int i=0; i < n; i++){
        	for(int j=0; j < n; j++){
        		String input = br.readLine();
        		String number[] = input.split(" ");
           		arr[i][j] = Integer.parseInt(number[i]);
        }
    }
        for(int i=0; i < n; i++){
        	sum1 += arr[i][i];
        }
        System.out.println(sum1);


 		for(int i=0; i<n; i++){
        	sum2 += arr[i][n-1-i];
        }
        System.out.println(sum2);

       
        diff = Math.abs(sum2-sum1);

        System.out.println(diff);
    }
}




