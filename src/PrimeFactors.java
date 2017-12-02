import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        generate(n);
    }

    private static void generate(int n){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if(n%i== 0 && isPrime(i)){
                arrayList.add(i);
            }

        }
        System.out.println(arrayList);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}

