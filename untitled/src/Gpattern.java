import java.util.Scanner;

public class Gpattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = in.nextInt() ;

        for (int i =0 ; i< n ; i++) {
            for(int j =0 ; j<n ; j ++) {
                if(i == 0 && j > 0 && j < (n-1)/2
                || j ==0 && i >0 && i < (n-1)
                ||i == (n-1) && j> 0  && j < (n-1)/2
                || j == (n-1)/2 && i > (n-1)/2 && i != (n-1)
                || i == (n-1)/2 && j > 2 && j <= (n-1)/2) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
