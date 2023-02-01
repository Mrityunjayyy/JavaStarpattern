

public class ComplexPattern {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the value of 'n': ");
        int n = 19 ;

        for(int i = 0 ; i < n ; i++) {

            for(int j = 0 ; j < n ; j++) {
             if(i == j || i + j == (n-1)
                || i == n-1 || i== 0 || j == n-1 || j == 0
                || i+j == (n-1)/2
                || i-j == (n-1)/2
                || j-i == (n-1)/2
                || i+j == (1.5)*(n-1)) {
                 System.out.print("*");
             } else {
                 System.out.print(" ");
             }
            }

            System.out.print("\t\t");

            for(int j = 0 ; j < n ; j++) {
                if( i+j == (n-1)/2
                    || i-j == (n-1)/2
                    || j-i == (n-1)/2
                    || i+j == (1.5)*(n-1)

                        ||i == 0 || i ==n-1 || j==0 || j == n-1
                    ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\t\t");

            for(int j = 0 ; j < n ; j++) {
                if( i+j <= (n-1)/2
                        || i-j >= (n-1)/2
                        || j-i >= (n-1)/2
                        || i+j >= (1.5)*(n-1)

                        ||i == 0 || i ==n-1 || j==0 || j == n-1
                ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("\t\t");

            for(int j = 0 ; j < n ; j++) {
                if( i+j <= (n-1)/2
                        || i-j >= (n-1)/2
                        || j-i >= (n-1)/2
                        || i+j >= (1.5)*(n-1)

                        ||i == 0 || i ==n-1 || j==0 || j == n-1
                ){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
