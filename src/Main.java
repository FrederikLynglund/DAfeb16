

public class Main {

    public static void main(String[] args) {
        // Remember to make a check on input

       try {
           int num = Integer.parseInt(args[0]);
           for (int i = 1; i <= 10; i++) {
               int result = i * num;
               System.out.println(num + " * " + i + " is equal to " + result);
           }
       } catch (NumberFormatException e) {
           System.out.println("Input need to be an Integer");
           return;
       }





    }
}