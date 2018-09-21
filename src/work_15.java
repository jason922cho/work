import java.util.Scanner;

public class work_15 {
    public static void main(String[] args) {
        Scanner snc=new Scanner(System.in);

        System.out.println("請輸入身高(cm):");
        float cm=snc.nextFloat();

        System.out.println("請輸入體重(kg):");
        float kg=snc.nextFloat();

        float i=cm*(1/2.54f);
        float b=kg*(1/0.454f);

        System.out.println("身高(吋):"+i);
        System.out.println("體重(磅):"+b);


    }
}
