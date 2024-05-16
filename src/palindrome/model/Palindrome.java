/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindrome.model;

/**
 *
 * @author Lesego Mfikoe
 */
public class Palindrome implements PalindromeInterface {

    private String palindromeText;

    public Palindrome() {
    }

    public Palindrome(String palindromeText) {
        this.palindromeText = palindromeText;
    }
    

    public String getPalindroneText() {
        return palindromeText;
    }

    public void setPalindroneText(String palindroneText) {
        this.palindromeText = palindroneText;
    }
    
    @Override
    public String swapText(String text) {
        
        StringBuilder sb = new StringBuilder(text);
        
        palindromeText = (sb.reverse()).toString();
        
        return palindromeText;
    }
    
}
