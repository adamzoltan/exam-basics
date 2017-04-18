import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Copy {
  private static String file_name1 = "";
  private static String file_name2 = "";

  public static void main(String[] args) {
    if (args.length == 1 && args[0].equals("cp")) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 2) {
      System.out.println("No destination provided");
    } else if (args.length == 3) {
      file_name1 = args[1];
      file_name2 = args[2];
      writeToFile(readLinesFromFile());
    }


    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination
  }

  private static List<String> readLinesFromFile() {
    Path path = Paths.get(file_name1);
    List<String> rawLines;
    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      rawLines = new ArrayList<>();
    }
    return rawLines;
  }

  private static void writeToFile(List<String> newFile) {
    Path path = Paths.get(file_name2);
    try {
      Files.write(path, newFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
