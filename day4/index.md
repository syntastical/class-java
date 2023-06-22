# Concepts

## Math expressions
Many times in a program you'll need to modify an existing variable and to do this the express 
looks like `x = x + 1`. This expression evaulates everything on the right hand first, then assigns 
the value to the variable on the left hand side of the equals. There is a shorter version of this that 
only works when your expression uses an existing variable and one other value.  The expression looks 
like `x += 1`, this is the same as `x = x + 1`.  It's important to note that if you need a more
complex expression like `x = x * 2 + 1` then the shorthand no longer works.

example
```java
x = x - 2;    // subtract by 2
x -= 2        // subtract by 2
x = x * 2;    // multiply by 2
x *= 2;       // multiply by 2
x = x / 2;    // divide by 2
x /= 2;       // divide by 2
```

There is one other shorthand to be aware of, if you want to increment/decrement a variable by 1, you 
can use `x++` for adding one and `x--` for subtracting 1.

## Loops
Loops are used to repeat a set of actions until some condition is met. There are two types of loops 
we will be learning about today.

### For Loops
The first uses a counter and has the syntax `for(INITIALIZER; EVALUATION; INCREMENTER)`.
```java
class Main {
  public static void main(String[] args) {
      var myList = List.of("a", "b");
      for (int i = 0; i < 10; i++) {
          System.out.println(myList.get(i));
      }
  }
}
```

The second gets items directly from the list and assigns it to a new variable.  The syntax looks like `for(String NEWV_VARIABLE_NAME: LIST_VARIABLE_NAME`.
```java
import java.util.*;

class Main {
  public static void main(String[] args) {
    var myList = List.of("a", "b");
    
    for(String item: myList) {
      System.out.println(item);
    }
  }
}
```

### While Loops

While loops are simpler and only evaulate one expression.  If it's true, then the loop continues.  If it's false, then the loop ends.

Example: syntax `while BOOLEAN {}`
```java
int a = 0;
while(a < 10) {
    a++;
} 
```

# Error handling (try/catch)
Some functions can cause errors, and in Java these are called `exceptions`. We can detect when an 
error happens with a `try/catch` block.  In Java when a function has an error, you would say the 
function threw an exception.

Take for example, parsing a number from a string
```java
Integer.parseInt("5");     // returns 5  with no error
Integer.parseInt("five");  // throws
```

We can use a try/catch block to handle the error above
```java
try {
    Integer.parseInt("five");
} catch(Exception ex) {
    System.out.println("detected the following exception")
    System.out.println(ex.getMessage())
}
```

# Project: Ad lib continued
Continue to work on the ad lib project from day 3.  If you finish, go back and add error detection
for the number input by the user.  If they input anything other than a number, tell them that the 
input is invalid and prompt them to input the number again.