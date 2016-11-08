import java.io.*;
import java.util.*;

public class warmup3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];     
        long sum = 0L;
        
        String input = br.readLine();
        String number[] = input.split(" ");
        
        for (int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(number[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }
}