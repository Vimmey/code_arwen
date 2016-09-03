    import java.io.*;
    import java.util.Arrays;

    class JOHNY{

        public static void main(String args[]) throws IOException {

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {

                int N = Integer.parseInt(br.readLine());


                String x= br.readLine();
                String rawA[] = x.split(" ");
                
                int K = Integer.parseInt(br.readLine());

                int A[] = new int[rawA.length];
            
                for (int j = 0; j < rawA.length; j++) {
                    A[j] = Integer.parseInt(rawA[j]);
                }

                int uncleLocVal = A[K-1];

                Arrays.sort(A);
                int result = -1;

                for (int k = 0; k < rawA.length; k++) {
                    if(A[k] == uncleLocVal) {
                        result = k+1;
                        break;
                    }
                }

                System.out.println(result);                    
            }


        }
    }

