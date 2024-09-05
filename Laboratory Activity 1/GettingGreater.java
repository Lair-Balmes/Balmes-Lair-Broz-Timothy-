import java.util.Scanner;

class code {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char first = input.next().charAt(0);
        int ch1 = (int)first;
        System.out.print("Enter second character: ");
        char second = input.next().charAt(0);
        int ch2 = (int)second;
        System.out.println("-------------------------------------------");
        System.out.println("The character with the greater value is: "+(char)Math.max(ch1, ch2));
        System.out.println("-------------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(first + ":"  + ch1);
        System.out.println(second + ":" + ch2 );
    }
}