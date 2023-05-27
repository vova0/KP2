import java.util.Scanner;

public class Fourth {
    static Scanner sc= new Scanner(System.in);
    int fact(int n){
        int result;
        if (n==1){
            return 1;
        }else {
            result=fact(n-1)*n;
            return result;
        }
    }
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        Fourth f =new  Fourth();
        int a= sc.nextInt();
        System.out.println(f.fact(a));

    }
}

