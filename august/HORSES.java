import java.util.Scanner;

        class HORSES
        {
            public static void main(String args[])
            {

                Scanner scn = new Scanner(System.in);

                int i = lowerIndex;

        int j = higherIndex;
        
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
            
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }