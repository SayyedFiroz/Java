public class Oops_method {
    //global/Static method
    static void global_static_method(){
        System.out.println("This is Static/Global method");
    
    }
    //class_method
    public void class_method(){
        System.out.println("This is Class method");
    }
    //Global and Class_method both
    public static void static_class_method(){
        System.out.println("This is both the method");
    }
    public static void main(String[] args) {
        global_static_method();

        Oops_method obj1 = new Oops_method();
        obj1.class_method();
        obj1.static_class_method();

        static_class_method();

        
    }
    
}
