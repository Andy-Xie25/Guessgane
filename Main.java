import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int guess; 
    

    int count = 0;

    do{
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        if(guess > x){
            System.out.println("Too high");
        }else if(guess < x){
            System.out.println("Too low");}
        count = count + 1;
    } while(guess != x);
  
    System.out.println("You got it!");
    
    System.out.println(guess);
    System.out.println(" count=" + count);
    if (count<=7){
        System.out.println("You get an imcredible score!");
    }if( count>=8 && count <= 10){
        System.out.println("You did a great job!");
    }if(count > 10){
        System.out.println("Try the divide and conquer strategy next time!");}

}
}

