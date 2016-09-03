import java.io.*;

class DECSTR {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int j=0; j<t; j++)  {
            int x = Integer.parseInt(br.readLine());
            while (x>=0) {
                if(x>100) {   
                 diff =            
                 System.out.print((char)( + 97 + (x--)));
                 else
                 System.out.print((char)(97 + (x--)));


            }
            System.out.println();
         }
    }
}




// import java.io.*;

// class DECSTR {

//     public static void main(String args[]) throws IOException {

//         BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

//         int t = Integer.parseInt(br.readLine());
//         int n[] = new int[t];

//         for (int k = 0; k < t; k++) {

//            n[k] = Integer.parseInt(br.readLine());
//            }

//            for ( int j=0; j<t; j++)  {
//                 int m = n[j];
//                 int x = m;
//                 for ( int i=0; i<=x; i++)  {
            
//                   if (m>=0) {
//         	        char c = (char)(97 + m);
//         	        m--;
//         	        System.out.print(c);
//         	      }
//            }
//            System.out.println();
//          } 
        
//     }
// }