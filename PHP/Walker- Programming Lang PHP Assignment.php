    <form method = "POST">
        <input type = "number" name = "myNumber">
        <button type = "submit">Submit</button>
   </form>
<?php
    #Description:
    #This program implements the Bubble Sort algorithm to sort a short integer array. The user is prompted to enter their desired array size, with a maximum size of 10 and a minimum of 1.
    #After taking user input, the program will print the original, unsorted array, followed by the sorted array.

    #Prompt the user to enter the size of the array
    $myNumber = (int)$_POST["myNumber"];
    echo $myNumber;
?>