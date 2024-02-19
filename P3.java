package Third_term;

public class P3 {
    public static void main(String[] args) {
        //Program (A):
        char ch = 'A';
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
//        Program (B):
        int k = 0;
        for (int a=1; a<=5; a++){
            for (int b=1; b<=a; b++){
                k++;
                if(k%2!=0){
                    System.out.print("*");
                }else {
                    System.out.print("~");
                }
            }
            System.out.println("");
        }
    }
}
