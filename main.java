import java.util.*;

class Main{
    public static boolean pair(int number){
        return number%2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour je suis un message");
        System.out.println("Votre nombre :");
        int number = sc.nextInt();

        if(pair(number)) System.out.println("je suis pair");
        else System.out.println("Je ne suis pas pair");
    }
}