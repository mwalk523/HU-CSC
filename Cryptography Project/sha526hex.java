import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class sha526hex
{
    public static String sha256Hex(String input) 
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); //MessageDigest is Java's built-in class for hashing
            byte[] digest = md.digest(input.getBytes(StandardCharsets.UTF_8)); //Inputs bytes into hashing engine and returns hash
            
            // convert to hex
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();

        } 
        
        catch (NoSuchAlgorithmException e) 
        {
            throw new RuntimeException(e); // Ensures SHA-256 exists
        }
    }//Algorithm designed with help from ChatGPT

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        //Prompt user for input
        System.out.println("Welcome to the SHA-256 hashing tool." +
        " This converts your inputted message into a SHA-256 hash." + 
        " Note that SHA-256 is neither symmetric nor asymmetric. Rather, it is a one-way hashing algorithm.\n");

        System.out.println("As an example test case, if you enter the message abc, you would get the following hash:\n" +
        "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad\n");    

        System.out.println("To start, enter the message you wish to hash");
        String pt = keyboard.nextLine();
            System.out.println("You entered: " + pt);

        System.out.println("The SHA-256 hash of your message is:\n" + sha256Hex(pt) + "\n");
        //Algorithm was tested for accuracy against Di-Management's common SHA-256 test vectors

        System.out.println("Hashing algorithms like SHA-256 are crucial for protecting cybersecurity assets. " +
            "They provide an added layer of security to passwords and sensitive data. " +
            "Furthermore, because hashing is a one-way process, these algorithms are much harder to reverse engineer.\n");
        keyboard.close();
    }
}