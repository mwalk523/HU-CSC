import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HashingPractice 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        //Adding elements
        hashTable.put("Cat ", 3);
        hashTable.put("Dog ", 2);
        hashTable.put("Bird ", 1);
      //hashTable.put("key", hashValue);
        //Displaying elements
        System.out.println("Standard Hash table elements: " + hashTable);

        //Linked Hash Map
        LinkedHashMap<String, Integer> LHash = new LinkedHashMap<>();

        //Adding elements 
        LHash.put("fish", 4);
        LHash.put("whale", 5);
        LHash.put("turtle", 6);

        //Printing Values
        System.out.println("\nLinked Hash Table elements: ");
        for (String key : LHash.keySet())
        {
            System.out.println(key);
        }

        //Linked Hash Map
        LinkedHashMap<Integer, String> LHash2 = new LinkedHashMap<>();

        //Adding elements 
        LHash2.put(4, "fish");
        LHash2.put(5, "whale");
        LHash2.put(6, "turtle");

        //Printing Values
        System.out.println("\nLinked Hash Table 2 elements: ");
        for (int key : LHash2.keySet())
        {
            System.out.println(key);
        }

        //Entering values into HashTable
        LinkedHashMap<String, Integer> InputHash = new LinkedHashMap<>();

        System.out.println("\nEnter the number of elements you want to add: ");
            int elements = keyboard.nextInt();
            keyboard.nextLine();

        System.out.println("\nNow adding elements\n");
        for (int i = 0; i < elements; i++)
        {
            System.out.println("Enter the key (String) for element " + (i + 1) + ": ");
                String key = keyboard.nextLine();
            System.out.println("Enter the hash value for element " + (i + 1) + ": ");
                int value = keyboard.nextInt();
                keyboard.nextLine();
            
            InputHash.put(key, value);
        }

        System.out.print("Hash Table elements: " + InputHash);
    }

}
