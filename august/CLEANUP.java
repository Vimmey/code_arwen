    import java.io.*;

    class CLEANUP {

        public static void main(String args[]) throws IOException {

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            for (int i = 0; i < t; i++) {

                String x= br.readLine();
                String job[] = x.split(" ");

                int n = Integer.parseInt(job[0]);
                int m = Integer.parseInt(job[1]);

                int diff = n-m;
                String chef = "";
                String asst = "";
                
                int flag=0;

                String mStr[]= br.readLine().split(" ");

                boolean njob[] = new boolean[n]; 
                int mjob[] = new int[m]; 

                for (int j = 0; j < m; j++) {
                    mjob[j] = Integer.parseInt(mStr[j]);
                    njob[mjob[j]-1] = true;
                }

                for (int k=0; k < n; k++) {
                    
                    if (njob[k] == false) {
                        if (flag % 2 == 0) {                                                 
                            chef = chef + (k+1) + " "; 

                        } else {
                            asst = asst + (k+1) + " ";
                        }
                        flag++;
                    }
                }

                System.out.println(chef.trim());                    
                System.out.println(asst.trim());                    
            }


        }
    }

