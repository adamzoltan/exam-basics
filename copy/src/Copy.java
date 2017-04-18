public class Copy {
  public static void main(String[] args) {
    if (args.length == 1 && args[0].equals("cp")) {
      System.out.println("copy [source] [destination]");
    } else if (args.length == 2) {
      System.out.println("No destination provided");
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
}
