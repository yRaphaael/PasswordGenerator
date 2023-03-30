import java.util.Scanner;

public class Password {
    Scanner ler = new Scanner(System.in);
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String character = "!@#$%¨&*()_+-=?}{";
    public void Generate(){
        System.out.print("Insert the quantity of characters what do you want in your password: ");
        int digit = ler.nextInt();

        String password = "";

        for(int i = 0; i< digit; i++){
            int rand = (int)(4 * Math.random());

            switch(rand){
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(lower.length() * Math.random());
                    password += String.valueOf(lower.charAt(rand));
                    break;
                case 2:
                    rand = (int)(upper.length() * Math.random());
                    password += String.valueOf(upper.charAt(rand));
                    break;
                case 3:
                    rand = (int)(character.length() * Math.random());
                    password += String.valueOf(character.charAt(rand));
                    break;
            }
        }
        System.out.println("your password is: "+password);
    }
}
