import java.io.*;
import java.util.Arrays;
class LEXOPAL {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
     
        for (int i=0; i<t; i++) {

            String inputs = br.readLine();
            int strLen = inputs.length();
            String palin1 = "";
            String palin2 = "";
            char[] a,b;
            char[] inputsArr = inputs.toCharArray();
            
            boolean success = true;
            boolean midExists = false;
            char midChar = 'a';

            if ( strLen%2==0) {
                a = inputs.substring(0,strLen/2).toCharArray();
                b = inputs.substring(strLen/2,strLen).toCharArray();
             

            } else {
                a = inputs.substring(0,strLen/2).toCharArray();
                b = inputs.substring((strLen/2)+1,strLen).toCharArray();
                midExists = true;
                midChar = inputs.charAt(strLen/2);
                 
            }  
            int aLen = a.length;         
            int bLen = b.length;
            int ptr = bLen-1;
            
     
         
            for (int j=0; j<aLen; j++) {
                if (b[ptr] == '.'&& a[j] == '.') {
                   
                    palin1 = palin1 + 'a';
                    palin2 = 'a' + palin2 ;
                    ptr--;
 
                } else if (a[j] == b[ptr]) {
                    palin1 = palin1 + a[j];
                    palin2 = b[ptr] + palin2 ;
                    ptr--;


                } else if (a[j] == '.') {
                    a[j] = b[ptr];
                    palin1 = palin1 + a[j];
                    palin2 = a[j] + palin2 ;
                    ptr--;
                 

                } else if (b[ptr] == '.') {
                    b[ptr] = a[j];
                    palin1 = palin1 + b[ptr];
                    palin2 = b[ptr] + palin2 ;
                    ptr--;
 
                } else{
                    success = false;
                    break;                  

                }
            }
            
            if (!success) {
                System.out.println("-1"); 
            } else if (midExists){
                if (midChar == '.') {
                    midChar = 'a';
                }
                System.out.println((palin1.concat(midChar + "")).concat(palin2));
                
            } else {
                System.out.println(palin1.concat(palin2));
            }

        }
}
}






