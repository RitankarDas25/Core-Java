package regex_demo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
//Java program to check if an email address
//is valid using Regex
public class RegexDemo {
  
    // Method to check if the email is valid
    public static boolean isValid(String email) {
      
        // Regular expression to match valid email formats
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    
        // Compile the regex
        Pattern p = Pattern.compile(emailRegex);
      
        // Check if email matches the pattern
        return email != null && p.matcher(email).matches();
    }

    public static void main(String[] args) {
      
        // List of email addresses to validate
        ArrayList<String> e = new ArrayList<>();
        e.add("review-team@geeksforgeeks.org");
        e.add("writing.geeksforgeeks.org");    

        // Loop through emails and validate each
        for (String email : e) {
            System.out.println(email + ": " + (isValid(email) ? "Yes" : "No"));
        }
    }
}
