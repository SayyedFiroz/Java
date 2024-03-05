public class Person {
    String name;
    int age;
    int roll_no;
    public Person(String name,int age,int roll_no){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }
    public void info(){
        System.out.println(name + " " + age + " " + roll_no);
    }
    public void change_name(String name){
        this.name = name;

    }
    public static void main(String[] args) {
        Person p1 = new Person("FIROZ", 21, 96);
        System.out.println(p1.name);
        p1.info();
        p1.change_name("Sayyed");
        p1.info();
    }
    
}
