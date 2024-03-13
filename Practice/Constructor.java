public class Constructor {
    int id;
    String name;

    //default
    public Constructor(){
        id  = 0;
        name = null;
    }

    //constructor overloading
    public Constructor(int id ,String name){
        this.id = id;
        this.name = name;
    }
    public void details(){
        System.out.println("id " + this.id + " name " + this.name);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        c1.details();
        Constructor c2 = new Constructor(1,"ELON");
        c2.details();
    }
    
}
