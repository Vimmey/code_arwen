import java.io.*;
import java.util.Arrays;

class SPCANDY {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

        	String x = br.readLine();
            String len1[] = x.split(" ");

           long n = Long.parseLong(len1[0]);  
           long k = Long.parseLong(len1[1]);
           long student,teacher;    
            
            if (k!=0){
               student = n/k;
               teacher = n%k;   
            } else {            
                student = 0;
                teacher = n;
            }       

            System.out.println(student + " " + teacher);
            
        }
    }
}
            
