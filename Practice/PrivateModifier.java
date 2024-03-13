class PrivateEmployee{
  //private cannot access directly it need getter and setter for security and validation
    private int id ;
    private String name;
    public void setId(int i){
        id = i;
        System.out.println("Your id is " + id);
    }
    public int getId(){

        return id;

    }
}
    
public class PrivateModifier {
    public static void main(String[] args) {
        PrivateEmployee emp1 = new PrivateEmployee();
        //Cannot define directly will show error
        //emp1.id = 1;
        emp1.setId(10);
        System.out.println(emp1.getId());
        
    }
}
