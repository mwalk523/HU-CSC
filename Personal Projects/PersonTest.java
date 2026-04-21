import java.util.Scanner;
public class PersonTest 
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your height, age, gender, and name");
            int height = keyboard.nextInt();
            int age = keyboard.nextInt();
            keyboard.nextLine();
            String gender = keyboard.nextLine();
            String name = keyboard.nextLine();

        Person pA = new Person(height, age, gender, name);
        System.out.print(pA.profile());
    }
}
