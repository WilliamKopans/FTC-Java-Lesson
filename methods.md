# Methods

Methods (or functions in any other language) allow you to reuse code without the need to manually copy and paste the code each time. One way to think about it is as a recipe. You can tell your friends how to make cookies over and over verbally or you could just write it down and tell them to refer to that. 

The basic syntax is:

```
public static void methodName(int x, int y) 
{
    // body
}
```

Let's break that down piece by piece

- **_public_ -** access modifier. It means the method can be accessed from any other package or class. More info: [https://www.programiz.com/java-programming/access-modifiers](https://www.programiz.com/java-programming/access-modifiers)
- **_static_** −  It means that the method can be accessed without creating any objects. For now, we will only be writing _static_ methods. More info: [https://www.programiz.com/java-programming/static-keyword](https://www.programiz.com/java-programming/static-keyword)
- **_void_** - The method will not _return_ any value.
- **_methodName_** − the name you will use to reference the method
- **_x, y_** − arguments (inputs) into the method

An example of using a function is:

```
public static void myMethod(int age){

    if (age >= 18) {

        System.out.println("You are already an adult!");

    } else {

        int distance = 18-age;

        System.out.println("You will be an adult in " + distance + " years.");
    }
}
```

**To do:**

- Write a method that loops through a String (single word) input and prints out how many vowels were in a given word.
- Then, split up a sentence into words, and run the method for each word!

