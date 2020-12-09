import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        if(a!=0){
            double solution = -b/a;
            System.out.printf("the solution is: %f!", solution);
        } else{
            if(b==0){
                System.out.println("The solution is all x!");
            } else{
                System.out.println("No solution!");
            }
        }
    }
}
