import java.util.Scanner;

public class work_12 {
    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);
        System.out.println("請輸入國文成績");
        int c1=snc.nextInt();
        System.out.println("請輸入英文成績");
        int e1=snc.nextInt();
        System.out.println("請輸入數學成績");
        int m1=snc.nextInt();

        System.out.println("總分數為:"+(c1+e1+m1));
        System.out.println("平均分數為:"+(c1+e1+m1)/3);



    }
}
