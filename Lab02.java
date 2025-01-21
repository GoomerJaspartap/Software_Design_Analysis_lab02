import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab02{
    static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) throws FileNotFoundException
    {
       

    }
    public static ArrayList<Book> CSV_DATA () throws FileNotFoundException{
        ArrayList<Book> books_data = new ArrayList<Book>(); // Create an ArrayList object
        File data = new File("books.csv");
        try (Scanner file_scan = new Scanner(data)) {
            while(file_scan.hasNextLine()){
                String data_val = file_scan.nextLine();
                String[] fields = data_val.split(",");
                Book book_obj = new Book(fields[0],fields[1],fields[2],Integer.parseInt(fields[3]) ,fields[4]);
                books_data.add(book_obj);
            }

        }
return books_data;
    }
}