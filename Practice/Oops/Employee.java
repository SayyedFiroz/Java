class Cellphone {
    public void ring(){
        System.out.println("Ringing.............");
    }

}

class Square{
    int side;
    public void calculateside(){
        System.out.println("side of Square "  + side*side);
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of Square " + 4*side);
    }

}

public class Employee {
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setSalary(int newSalary){
        salary = newSalary;
    }

    public static void main(String[] args) {

        //Problem 1
        Employee emp1 = new Employee();
        emp1.name = "Frioz";
        emp1.salary = 12000;
        emp1.setSalary(13000);
        System.out.println(emp1.getName());
        emp1.setName("Jabaz");
        System.out.println(emp1.getName() + "\n");

        //problem 2
        Cellphone Huawei = new Cellphone();
        Huawei.ring();

        //problem 3
        Square sq1 = new Square();
        sq1.side = 6;
        sq1.calculateside();
        sq1.calculatePerimeter();
    
    }
    
}
