import java.util.Scanner;

public class work_27 {
    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);

        int x=snc.nextInt();
        if(3000<x||x<1)
         System.out.println("錯誤");
       else System.out.println(x%4==0&&x%100!=0||x%400==0);

        int y=snc.nextInt();
       if(3000<y||y<1)
            System.out.println("錯誤");
        else System.out.println(y%4==0&&y%100!=0||y%400==0);

        int z=snc.nextInt();
        if(3000<z||z<1)
            System.out.println("錯誤");
        else System.out.println(z%4==0&&z%100!=0||z%400==0);






    }
}
