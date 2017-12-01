import java.util.Scanner;

public class IsoscelesTriangleDiamond {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no=scanner.nextInt();
        printAsterisks(no);

    }

    private static void printAsterisks(int n){

        int size = n+2,odd = 1, nos = size/2;

        for (int i = 1; i <= size; i++) {
            for (int k = nos; k >= 1; k--) {
                // 3,2,1,0,1,2,3 and so on
                System.out.print(" ");
            }
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < size/2+1) {
                odd += 2;
                nos -= 1;
            } else {
                odd -= 2;
                nos += 1;

            }
        }



    }
}


