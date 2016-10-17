import java.io.*;
class LTM40AB {

    public static void main(String agrs[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-->0) {

            String inputs = br.readLine();
            String[] number = inputs.split(" ");
            int a = Integer.parseInt(number[0]); 
            int b = Integer.parseInt(number[1]);                 
            int c = Integer.parseInt(number[2]);                 
            int d = Integer.parseInt(number[3]); 
            long result = 0;

            if (c < a) {
                c = a+1;
            }

            if (a <= b && c <= d && c >= a && c <= b) {
                result = numOfPairs(d - a + 1)  -  numOfPairs((c-1) - a) - numOfPairs(d - (b+1));

            } else if (a <= b && c <= d && c > b) {
                if (d == c && a == b ){
                    result = 1;
                } else if (d == c){
                    result = (b-a+1);
                } else if (b == a){
                    result = (d-c+1);
                } else {
                    result = (d-c+1) * (b-a+1);
                }
            }

            if (result < 0) {
                result = 0;
            }

            System.out.println(result);
        }
    }

    public static long numOfPairs(long n) {

        long result = 0;

        if (n == 0) {
            result = 0;

        } else if (n == 1) {
            result = 1;

        } else {
            result = (n * (n-1));
            result = result / 2;
        }

        return result;
    }
}
