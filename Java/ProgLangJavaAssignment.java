import java.util.Scanner;
import java.util.Collections;

public class ProgLangJavaAssignment 
{
    public static int getArraySize(int[] array)
    {
        return array.length;
    }
    
    public static void bubbleSort(int[] array)
    {
        int n = getArraySize(array);
        
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int[] array)
    {
        for (int i = 0; i < getArraySize(array); i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

// Sorting and print methods designed with help from notes and Copilot AI. Everything else is my work. 
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner (System.in);
      
        System.out.println("The sorting algorithm used for this program is Bubble Sort.");
        System.out.println("Enter int array size (max 10): ");
            int arraysize = keyboard.nextInt();
            keyboard.nextLine();
            while (arraysize > 10 || arraysize <=0)
            {
                System.out.println("Invalid size. Please enter a size between 1 and 10: ");
                arraysize = keyboard.nextInt();
                keyboard.nextLine();
            }
        int[] array = new int[arraysize];
        System.out.println();

        for (int i = 0; i < arraysize; i++)
        {
            if (i == 0)
            {
                array[i] = 34;
            }

            if (i == 1)
            {
                array[i] = 56;
            }

            if (i == 2)
            {
                array[i] = 4;
            }

            if (i == 3)
            {
                array[i] = 10;
            }

            if (i == 4)
            {
                array[i] = 77;
            }

            if (i == 5)
            {
                array[i] = 51;
            }

            if (i == 6)
            {
                array[i] = 93;
            }

            if (i == 7)
            {
                array[i] = 30;
            }

            if (i == 8)
            {
                array[i] = 5;
            }

            if (i == 9)
            {
                array[i] = 52;
            }
        }

        System.out.println("Unsorted Array: ");
        printArray(array);
        System.out.println();

        System.out.println("Sorted Array: ");
        bubbleSort(array);
        printArray(array);

        /*
        Sourced Tools:
        - VSCode Copilot AI - Used to design BubbleSort and Print Methods. Main method was designed and tested by me.
         */
    }
}  

        