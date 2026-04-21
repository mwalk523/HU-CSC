import java.util.Scanner;
public class Caesar 
{
    public static String encrypt(String plaintext, int shift)
    {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++)
        {
            char c = plaintext.charAt(i);
            if (Character.isUpperCase(c))
            {
                char e = (char) (((c - 'A' + shift) % 26) + 'A');
                encrypted.append(e);
            }
            else if (Character.isLowerCase(c))
            {
                char e = (char) (((c - 'a' + shift) % 26) + 'a');
                encrypted.append(e);
            }
            /*Subtracting A or a from c provides a clean index into the alphabet before the shift is added
            Modulo 26 ensures the value lies between 0-25
            A/a is added once again to make sure the index is correct*/ 
            else
            {
                encrypted.append(c);
            }
        } return encrypted.toString();
    }

    public static String decrypt (String ciphertext, int shift)
    {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++)
        {
            char c = ciphertext.charAt(i);

            if (Character.isUpperCase(c))
            {
                char e = (char) (((c - 'A' - shift + 26) % 26) + 'A');
                decrypted.append(e);
            }
            else if (Character.isLowerCase(c))
            {
                char e = (char) (((c - 'a' - shift + 26) % 26) + 'a');
                decrypted.append(e);
            }
           
            else
            {
                decrypted.append(c);
            }
        } return decrypted.toString();

    } //Algorithms designed with help from ChatGPT
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Caesar Cipher encryption tool." +
        "\nThis algorithm encrypts and decrypts messages by shifting each letter " + 
        "by a fixed number of places (determined by the key) in the alphabet.");

        //Test case
        System.out.println("\nFor example, if you encrypt 'abc' with a key of 3, the encrypted message will be 'def'" +
        "\nSimilarly, if you decrypt 'def' with a key of 3, it will return the original message 'abc'.\n");
        
        System.out.print("Let's get started! First, enter a (string) message to encrypt: ");
            String Plaintext = keyboard.nextLine();
            
            //check if input is a non string
            boolean isString = true;

            while (isString = true)
            {
               if (Plaintext.matches("[A-Za-z ]+"))
               {
                    break; //valid input
               }

               System.out.println("Invalid input. Please enter a valid (string) message");
               Plaintext = keyboard.nextLine();
            }
            
        System.out.print("Enter an integer value to use as a key: ");
            int shift = 0;
            try
            {
                shift = keyboard.nextInt();
            }
            catch (Exception e)
            {
                while (!keyboard.hasNextInt())
                {
                    keyboard.next();
                    System.out.print("Invalid input. Please enter a valid integer value to use as a key: ");
                }
                    shift = keyboard.nextInt();
            }

        //Encrypt message
        System.out.println("\nYou entered: " + Plaintext + " with a key of 3. Encrypting...");
            String encryptedMessage = encrypt(Plaintext, shift);
            System.out.println("Encrypted message: " + encryptedMessage);

        //Decrypt message
        System.out.println("Now performing the decryption sequence on the encrypted message...");
            String decryptedMessage = decrypt(encryptedMessage, shift);
            System.out.println("Decrypted message: " + decryptedMessage + "\n");
        keyboard.close();
    }
}
