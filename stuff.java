import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Stuff{
  private int[] arr;
  private int size;

  public Stuff (String fileName){
    loadFromFile(fileName);
  }
      private void loadFromFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));

            // First pass: count numbers
            int count = 0;
            while (scanner.hasNextInt()) {
                count++;
                scanner.nextInt();
            }
            scanner.close();

            array = new int[count];
            size = count;

            // Second pass: store numbers
            scanner = new Scanner(new File(fileName));
            int index = 0;
            while (scanner.hasNextInt()) {
                array[index++] = scanner.nextInt();
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            array = new int[0];
            size = 0;
        }
    }
  public int find(int value){
    for(int i=0; i < size; i++){
      if(arr[i] == value){
        return i;
      }
    }
  }
}

