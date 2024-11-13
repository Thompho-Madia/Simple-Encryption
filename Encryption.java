/**
 * A simple introduction to encryption
 *
 * @author Madia Thompho
 * @version 1.0
 * @since 2024-11-12
 * @date 2024-11-13->>13:22
 */

// fix it to cater to be case sensitive

import java.util.Scanner;

public class Encryption {
    
    Scanner input = new Scanner(System.in);

    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    static Encryption obj = new Encryption();

    String[] wordArray;
    
        //convert a word to an array
        public String[] toArray(String word){
            word = word.toLowerCase();
           String[] array = word.split("");
           return array;
        }
    
        public void Input(){
            System.out.println("Enter a word to encrypt: ");
            String para = input.next();
            wordArray = obj.toArray(para);
        }

        public int letterPosition(String letter){
            for(int i = 0; i<alphabet.length; i++){
                if(alphabet[i].equals(letter)){
                    return i;
                }   
            }
            return -1;
        }

    
        public void encrypt(){
        //add 5 to the current alphabet
            for(int i = 0; i<wordArray.length; i++){
                int pos = letterPosition(wordArray[i]);
                //wordArray[i] = alphabet[pos+5];
                wordArray[i] = alphabet[(pos + 5) % alphabet.length];
            };
        }

        public void print(){
            //for each letter in wordArray, do something; print it out.
            for(String letter : wordArray){
                System.out.print(letter);
            }
        }
    
        public static void main(String[] args){
            obj.Input();
            obj.encrypt();
            obj.print();
    }
}
