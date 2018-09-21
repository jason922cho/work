import java.util.Scanner;

public class work_24 {
    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);
        int a=snc.nextInt();
        int b=snc.nextInt();
        int c=snc.nextInt();

       System.out.println(a>0&b>0&c>0&&a<=b&&b<=c&&c<(a+b));




    }
}
