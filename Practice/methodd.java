public class methodd {
    static void hello(){
        System.out.println("Hello world");
    }
    //with parameter
    static void full_name(String fname,String lname){
        System.out.println(lname + " " + fname);
    }
    //with return value
    static String id(String name){
        return name + "@x.com";
    }
    static int sum(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        hello();
        full_name("firoz","Sayyed");
        System.out.println(id("firoz"));
        int add = sum(5,7);
        System.out.println(add);

    }


}
