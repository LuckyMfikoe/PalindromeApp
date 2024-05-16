package palindromeapp;

import java.util.Scanner;
import palindrome.model.Palindrome;

/**
 *
 * @author Lesego Mfikoe
 */
public class PalindromeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Palindrome App");
        System.out.println("=====================");
        System.out.print("Your Word: ");
        String inputText = sc.nextLine();
        
        Palindrome p = new Palindrome();
        
        System.out.println("Palindrome Word: " + p.swapText(inputText));
    }
}