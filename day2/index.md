# Comments
Comments allow us to add non code descriptions and text to help better read the code.  
```
// Single line comment  
/*  
 \* Multi  
 \* line  
 \* comment  
 \*/
``` 

# Variables
```
int iAmInt = 5;  
boolean iAmBool = true  
String iAmString = "this is a string"
```  

# Functions/Scope
Functions let use define reuseable bits of code.

function to add two numbers
```java
static int sum(int x, int y) {
    return x + y;
}
```

# Control statements

## IF
```
if(BOOLEAN_VALUE) {
    // if BOOLEAN_VALUE was true
} else {
    // if BOOLEAN_VALUE was false
}
```

## SWITCH
```
switch(expression){    
    case value1:    
        // code to be executed;    
        break;  // optional  
    case value2:    
        // code to be executed;    
        break;  // optional
    default:     
        // Any other value  
}  
``` 

# EXCEPTIONS (ERRORS)
When calling a method, sometimes it fails with an error.  In Java we call this an exception.  If we want to be able to do something with an exceptions (handle the exception), we use a try/catch block.
```java
try {
    // Code that might throw an exception
} (Exception ex) {
    // If the above had an error, we will run the code here.
}
```