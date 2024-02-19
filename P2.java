package Third_term;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for triangle and 2 for inverted triangle: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter the number of terms: ");
                int n = sc.nextInt();
                for  (int i=1; i<=n; i++){
                    for (int j=1; j<=i; j++){
                        System.out.print(i);
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.print("Enter the number of terms: ");
                int num = sc.nextInt();
                for (int i1=num; i1>=1; i1--){
                    for (int j1=1; j1<=i1; j1++){
                        System.out.print(i1);
                    }
                    System.out.println("");
                }
                break;
            default:
                System.out.println("Wrong Choice! Try again.");
        }
    }
}
