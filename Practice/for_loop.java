public class for_loop {
    public static void main(String[] args) {
        for(int i =2;i<=10;i++){
            System.out.println(2*i);
        }
        //nested loop
        for (int i=1;i<3;i++){
            for(int j=1;j<6;j++){
                System.out.println(i +" "+ j);
            }
        }
        //break and continue
        for(int i =1;i<=10;i++){
            if (i==5){
                break;
            }
            if (i==2){
                continue;
            }
            System.out.println(10*i);
        }
        
    }
    
}
