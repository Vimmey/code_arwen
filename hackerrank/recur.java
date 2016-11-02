import java.io.*;
 class recur {
       public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

           int n = Integer.parseInt(br.readLine());

           int result = fact(n);

           System.out.println(result);

       }
   

   static int fact(int n) {
       
       int output;
       if (n == 1) {
           return 1;
       } 

       output = fact(n-1)* n;
       return output;
   }
}

