import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no=scanner.nextInt();
        printAsterisks(no);

    }

    private static void printAsterisks(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
