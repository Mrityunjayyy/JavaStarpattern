import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = in.nextInt() ;

        for (int i =0 ; i< n ; i++) {

            //M
            for(int j =0 ; j<n ; j ++) {
                if(j == 0 || j == n-1
                  ||  i == j && i < (n-1)/2
                  ||  i+j ==(n-1) && i <= (n-1)/2) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");


            //R
            for(int j =0 ; j<n ; j ++) {
                if(j == 0
                || i == 0 && j < (n-1)/2
                || j == (n-1)/2 && i > 0 && i < (n-1)/2
                || i == (n-1)/2 && j > 0 && j < (n-1)/2
                        || i - j == (n-1)/2

                ) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");

            //I
            for(int j =0 ; j < n ; j++) {
                if(i == 0 || i == n-1 || j == (n-1)/2) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");

            //T
            for(int j =0 ; j < n ; j++) {
                if(i ==0 || j == (n-1)/2) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");



            //Y
            for(int j =0 ; j < n ; j++) {
                if( i == j && i < (n-1)/2
                        || i + j == (n-1)   && i < (n-1)/2
                        || j == (n-1)/2 && i >= (n-1)/2


                ) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");



            //U
            for(int j =0 ; j < n ; j++) {
                if( j ==0 && i != (n-1)
                        || j ==(n-1) && i != (n-1)
                        || i == (n-1) && j > 0 && j< (n-1)
                ) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");


            //N
            for(int j =0 ; j < n ; j++) {
                if( j == 0 || j == (n-1)
                        ||i ==j
                ) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");


            //J
            for(int j =0 ; j < n ; j++) {
                if( i == 0
                        || j == (n-1)/2
                        || i-j == (n-1)/2
                ) {
                    System.out.print("* ");
                }  else{
                    System.out.print("  ");
                }
            }
            System.out.print("\t");

            //A
            for(int j = 0 ; j < n ; j ++ ) {
                if ( (i ==0 && j> 0 && j < (n-1)/2 ) ||
                        ( j == 0 && i > 0 && i <= n-1 ) ||
                        (i == (n-1)/2 && j <= (n-1)/2) ||
                        (j == (n-1)/2 && i > 0 && i <=n-1) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); }
            }
            System.out.print("\t");

            //Y
            for(int j =0 ; j < n ; j++) {
                if (i == j && i < (n - 1) / 2
                        || i + j == (n - 1) && i < (n - 1) / 2
                        || j == (n - 1) / 2 && i >= (n - 1) / 2


                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
