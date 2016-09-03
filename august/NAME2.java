import java.io.*;
class NAME2 {

    public static void main(String agrs[]) throws IOException {
     
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i=0; i<t; i++) {

            String x1 = br.readLine();
            String inputs[] = x1.split(" "); 

            int mlen = inputs[0].length();
            int wlen = inputs[1].length();
            String shortStr, longStr;
            int shortStrLen, longStrLen;
            boolean matchedFlag = false;

            if (mlen <  wlen) {
                shortStr = inputs[0];
                longStr = inputs[1];
                shortStrLen = mlen;
                longStrLen = wlen;

            } else {
                shortStr = inputs[1];
                longStr = inputs[0];
                shortStrLen = wlen;
                longStrLen = mlen;
            }         


            int shortPtr = 0;
            int longPtr = 0;

            for (longPtr = 0; longPtr < longStrLen; longPtr++) {

                if (longStr.charAt(longPtr) == shortStr.charAt(shortPtr)) {
                    shortPtr++;
                    if (shortPtr >= shortStrLen) {
                        matchedFlag = true;
                        break;
                    }
                }
            }

            if (matchedFlag) {
                System.out.println("YES");
            } else {          
                System.out.println("NO");
            }

         }
    }
}





            