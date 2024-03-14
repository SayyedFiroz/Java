import java.util.Scanner;
import java.util.Random;
public class guess_the_number {
    int id;
    String name;
    int rndNumber;
    int guessNumber;
    int attempts;

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    

    public guess_the_number(){
        System.out.println("Enter your id in number");
        this.id = sc.nextInt();
        System.out.println("Enter your name");
        this.name=sc.next();
        playerDetails();
    }
    public void playerDetails(){
        System.out.println("Your id is "+ id + " Your name is " + name);
    }
    public void startGame(){
        System.out.println("Enter the range in which you want to guess");
        int range = sc.nextInt();
        rndNumber = rand.nextInt(range);
        System.out.println("Number of try you want to take to guess");
        attempts = sc.nextInt();
    
        while (attempts >0) {
        System.out.println("Enter the number");
        guessNumber = sc.nextInt();

        if (guessNumber == rndNumber) {
            System.out.println("You won in " + attempts + " attempts");
            break;
        }
        else if (guessNumber > rndNumber){
            System.out.println("Too High remaining attempt is " + (attempts-1));
            attempts -=1;
        }
        else {
            System.out.println("Too Low remaining attempt is " + (attempts-1));
            attempts -=1;
        
        }
        if (attempts ==0){
            System.out.println("Better luck try next time !");
        }
    }

    }

    public static void main(String[] args) {
        guess_the_number player1 = new guess_the_number();
        player1.startGame();

    }
    
}
