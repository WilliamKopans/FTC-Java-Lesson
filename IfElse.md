# Prelude

When planning your day, you have a lot of choices. Should you wear a coat? Do you need sunscreen? Short sleeves or long sleeves? When making these decisions you look at your surroundings. You would never wear a coat when it's 70[° ](https://www.degreesymbol.net/)outside! You can make your programs 'think' in a similar way.

# If Statement Syntax

```
if (condition) {

  // What will happen

}
```

_Note: There is no semicolon after if statements, only what is inside the if statement_

**Conditionals**

Conditionals are used inside the parentheses of an if statement. Here are a few basic ones:

```
int a = 2;
int b = 8;

System.out.println(a < b); // a is less than b

System.out.println(a > b); // a is greater than b

System.out.println(a <= 4); // a less or equal to 4

System.out.println(b >= 6); // b greater or equal to 6

System.out.println(a == b); // a is equal to b - single = is assignment whereas double checks for equality

System.out.println(3 < a && a < 6); //&& means and so this is saying a is greater than 3 and less than six

System.out.println(a != b); // ! means 'not'
```

Here is an example of an if statement with a conditional:

```
int hoursOfHomework = 5;

if (hoursOfHomework > 6) {

   System.out.println("That's a lot of homework!");

}
```

Now let's try to write our own! You can see that we have a few weather variables already declared in our code panel. We are going to write a program that helps us get ready in the morning.

# **What to do**

- Write an if statement that reminds you to wear a coat if it is under 30[°](https://www.degreesymbol.net/)
- Write another if statement that reminds you to put on sunscreen if it is over 60° **and** sunOut is true.

# **Else and Else If Statements**

Since all of the conditions we wrote are about the weather, we can consolidate the two if statements. This is done with else and else if statements. Here is an example of the syntax:

```
if (condition){
    System.out.println("First condition met");
} 
else if (anotherCondition) {
    System.out.println("Second condition met (but not first)");
} 
else{
    System.out.println("Neither first nor second were met");
}
```

Each of these has its own role. The first _if_ statement gets priority and evaluated first. If it is not fulfilled then Java goes down to the _else if_ statement. If both the _if_ and _else if_ statements are invalid then the _else_ takes place. You do not need an _else if_ or _else_ statement but they can be very useful parts of a program.

# **What to do**

- Condense your current _if_ statements into an _if_ statement with an _else if_ statement.
- Add an _else_ condition

# What you should have in the end:

- An _if_ statement that reminds you to wear a coat if it is under 30[°](https://www.degreesymbol.net/)
- An _else if_ statement that reminds you to put on sunscreen if it is over 60° **and** sunOut is true.
- An _else_ condition of your choosing

