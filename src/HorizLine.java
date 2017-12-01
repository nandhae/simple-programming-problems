import java.util.Scanner;

public class HorizLine {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int no=scanner.nextInt();
        printAsterisks(no);

    }

    private static void printAsterisks(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}
