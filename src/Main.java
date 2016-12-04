import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();        
        for (long i = 1; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                System.out.print(i+" ");
                if((int)number/i!=i)
                    System.out.print((int)number/i+" ");
            }
        }   
    }
    
}
