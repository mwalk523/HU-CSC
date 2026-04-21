//Name: Miles Walker
//Assignment: CSC 308 JavaScript Assignment
//Date: 3/20/2026

/*
Description:
This program implements the Bubble Sort algorithm to sort a short integer array. The user is prompted to enter their desired array size, with a maximum size of 10 and a minimum of 1.
After taking user input, the program will print the original, unsorted array, followed by the sorted array.
*/
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const bubbleArray = [34, 56, 4, 10, 77, 51, 93, 30, 5, 52];

//FUNCTIONS 
function getArraySize(array) {
    return array.length;
}

function bubbleSort(array) {
    let n = getArraySize(array);
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                let temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

function printArray(array) {
    console.log(array.join(" "));
}

function askForSize() 
{
    console.log("This program uses the Bubble Sort Sorting Algorithm to sort a short integer array.");
    askForValidSize();
}

function askForValidSize() {
    rl.question("Enter int array size (maximum 10, minimum 1): ", function (input) 
    {
        let arraysize = parseInt(input);

        if (isNaN(arraysize) || arraysize > 10 || arraysize <= 0) {
            console.log("Invalid size. Please enter a size between 1 and 10: ");
            askForValidSize();
        } else {
            processArray(arraysize);
        }
    });
}

function processArray(arraysize)
{
    let array = [];
    for (let i = 0; i < arraysize; i++)
    {
        array[i] = bubbleArray[i];
    }

console.log("\nUnsorted Array: ");
printArray(array);
console.log();

bubbleSort(array);

console.log("Sorted Array: ");
printArray(array);

r1.close();
}
//Functions designed with help from Claude AI

askForSize();

/*
Sourced Tools:
    Claude AI - Assisted with the design of the Bubble Sort algorithm and other functions 
*/