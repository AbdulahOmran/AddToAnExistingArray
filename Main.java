import java.util.Scanner; //Allows me to import scanner
// into the code, allowing me to receive user input 

class Main {
  public static void main(String[] args) {
    String[] mrBarry = new String[10];
    String[] msBenny = new String[12];

    Scanner myObj = new Scanner(System.in); // Create a Scanner object

    for (int i = 0; i <= 9; i++) {// read multiple inputs
      System.out.println("What is your name?");// question that will be answered
      mrBarry[i] = myObj.nextLine(); // Read user input
      msBenny[i] = mrBarry[i]; // Copies the roster
      System.out.println(msBenny[i]);// Prints out the roster
    }
    Scanner newObj = new Scanner(System.in);

    for (int i = 0; i < 2; i++) {
      System.out.println("What is your name?");
      msBenny[i] = newObj.nextLine();
      System.out.println(msBenny[i]);
    }
  }
}
