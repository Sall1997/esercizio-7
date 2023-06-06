/* ESERCIZO 7
    Define a variable called myName and assign your name to it
    Using the if-else statement, print if the number of letters in your name is even or odd*/

public class Main {
    public static void main(String[] args) {
        String name = "Salvatore";

        if(name.length() % 2 == 0){
            System.out.println("The number of letters in your name is EVEN");

        }else {
            System.out.println("The number of letters in your name is ODD");
        }

    }
}