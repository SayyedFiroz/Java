public class Car {
    String name = "Sayyedx";
    int max_speed = 100;
    String Color = "white";
    int Price = 200000;

    public void Car_specs(){
        System.out.println(name +" " +max_speed+ " " + Color +" "+ Price);
    }
    public void Change_Spec(String name,int max_speed,String Color ,int Price){
        this.name = name;
        this.max_speed = max_speed;
        this.Color = Color;
        this.Price = Price;
        System.out.println("Your cars specs has been changed!");
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.Car_specs();
        car1.Change_Spec("Sayyed27",120,"Black",100000000);
        System.out.println(car1.Price);
    }
    
}
