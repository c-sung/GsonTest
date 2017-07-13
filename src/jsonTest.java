import com.google.gson.Gson;
import java.util.Scanner ;
class GsonTest{
    private String name,sex;
    private String phoneNumber[] = {"type","number"};
    private int age;
    static Scanner sc = new Scanner(System.in);
    static String a1,a3,a4,a5;
    static int a2=0;
    public GsonTest(String string, int i,String sexx, String tp, String nu ){
        this.name=string;
        this.age=i;
        this.sex=sexx;
        this.phoneNumber [0]=tp;
        this.phoneNumber [1]=nu;
    }

    public static void main(String [] arge) {
        System.out.println("please enter your name");
        a1=sc.next();
        System.out.println("please enter your age");
        a2=sc.nextInt();
        System.out.println("please enter your sex");
        a3=sc.next();
        System.out.println("(家電/手機)");
        a4=sc.next();
        System.out.println("號碼");
        a5=sc.next();
        Gson gson = new Gson();
        GsonTest test_tojson = new GsonTest(a1,a2,a3,a4,a5);
        String jsonObject = gson.toJson(test_tojson);
        System.out.println(jsonObject);

    }


}