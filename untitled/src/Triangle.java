import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = in.nextInt() ;

        int rows = (n+1)/2 ;

        for (int i =1; i <= rows ; i++) {
            for(int j =1 ; j <= n ; j ++) {
                if(j >= (rows+1)-i && j <= (rows-1)+i) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
