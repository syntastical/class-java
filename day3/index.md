# Concepts

## Joining strings
Two or more strings can be joined together into one new string using the plus sign.

```java
var newString = "Hello " + "world!";
System.out.println(newString); // Outputs "Hello world!"
```

## User input
```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}
```

## Lists/arrays
Arrays and lists are data types that are used to store 0 or more values of the same type.  Imagine a grocery list of milk, eggs, and bread.  If we were to express this in Java it would look like.

```java
List.of("milk", "eggs", "bread");
```

We can assign the list to a variable and access each value like this.
```java
var myList = List.of("milk", "eggs", "bread");
myList.get(0) // milk
myList.get(1) // eggs
myList.get(2) // bread
```

# Project: Ad lib
Create a program that collections a list of user inputs for the ad lib below. Each prompt should 
ask the user for the correct input type, like `noun: USER_INPUT_HERE`.  

## Ad lib text
Spring is one of the (number) seasons. The other three seasons are (noun), (noun), and (noun). 
Spring happens early in the year if you live (direction) of the equator and late in the year if you
live (direction) of it. Spring is a time when baby (plural noun; animals) and (plural noun; animals)
are born. You should carry a (noun) to keep dry, because it tends (verb) more often in spring.