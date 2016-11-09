    import java.io.*;
    import java.util.*;

    public class warmup7{

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));    
            
            String input = br.readLine();
            String time[] = input.split(":");

            int arr[] =new int[3];
            arr[0] = Integer.parseInt(time[0]);

            if (time[2].substring(2,4) == "AM") {
             System.out.println(time[0] + ":" + time[1] + ":" + time[2].substring(0,2));     
            } else {
                if (arr[0] == 12 ) {
                     System.out.println("00" + ":" + time[1] + ":" + time[2].substring(0,2));   
                } else {
                     int hour = arr[0] + 12;
                     System.out.println(hour+ ":" + time[1] + ":" + time[2].substring(0,2));   
                }      
            }   
            
        }
   }

