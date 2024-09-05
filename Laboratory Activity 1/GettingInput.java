import java.util.Scanner;
class GettingInput {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Year: ");
    int year = input.nextInt();
    
    Scanner string = new Scanner(System.in);
    System.out.print("Enter the genre: ");
    String genre = string.next();
    System.out.print("Enter the album: ");
    String album = string.next();
    System.out.print("Enter the title: ");
    String title = string.next();
    System.out.print("Enter the artist: ");
    String artist = string.next();
    System.out.println("-----------------------");
    System.out.println("SONG DETAILS");
    System.out.println("-----------------------");
    System.out.println("Year Released: " + year);
    System.out.println("Genre: " + genre);
    System.out.println("Album: " + album);
    System.out.println("Title: " + title);
    System.out.println("Artist: " + artist);
    input.close();
    }
}
    
  