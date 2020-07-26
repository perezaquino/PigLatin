
/* 
The purpose of this program is to convert any one's first and last name into PigLatin
There are no bugs that I know of in this program.
*/
// This line of code imports the classes in java under the util name
import java.util.*;

// This line is my class entitled PigLatin
public class PigLatin {
  // This is my main method
  public static void main(String[] args) {
    // Asking the user for his or her first name
    System.out.println("What is your first name?");
    // using the Scanner class to detect input from the keyboard
    Scanner console = new Scanner(System.in);
    // Storing the input from the keyboard in a String variable called first
    String first = console.next();
    // Stores the first name after it has gone through the process of PigLatination
    // via the name method
    String pigFirst = name(first);
    // Asking the user for his or her last name
    System.out.println("What is your last name");
    // Storing the input from the keyboard in a String variable called last
    String last = console.next();
    // Stores the last name after it has gone through the process of PigLatination
    // via the name method
    String pigLast = name(last);
    // Prints the final full name in PigLatin to the console
    System.out.println(pigFirst + " " + pigLast);
  }

  // This is my static method called name. It accepts parameters in order to
  // convert a string into PigLatin
  public static String name(String name) {
    // The following 9 lines is the process of PigLatination
    String lowerFirst = name.toLowerCase();
    String upperFirst = name.toUpperCase();
    char capFirst = upperFirst.charAt(1);
    char lowercaseFirst = lowerFirst.charAt(0);
    String lowerStringFirst = lowerFirst.substring(2);
    String piggy = "ay";
    String full = (capFirst + lowerStringFirst);
    full += lowercaseFirst + piggy;
    return full;
  }
}
