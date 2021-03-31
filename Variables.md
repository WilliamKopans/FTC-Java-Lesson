# Variables

One of the most important concepts to understand when programming are variables. Unlike most languages, Java needs you to specify what the variable is going to be assigned (A number, a letter, a string/group of letters). 

Here are a few variable types (with examples) to get you started:

```
int myAge = 30; //an integer

long phoneNumber = 4014218100L;   // `L` makes sure that Java knows it is a Long not Int

long phoneNumber = 401_4218_100L; // Identical to the first, with visual breaks

float price = 10.99f;  // `f` tells Java that `price` is a float not double (less precise than double)
```

both of these suffixes (the L and f) specify to Java that it should not choose the default and instead choose the format you indicate

```
char letter = 'A'; //Single character

String street = "Hope St.";

boolean isEligible = true; //Booleans can be either True or False
```

Notice how after every statement there is a semicolon. It is a common mistake at first to be missing a semicolon so when debugging be sure to look for them! Be mindful that you do not always want a semicolon after every line. For instance, when defining a function you do not want a semicolon. 

When you want to add a comment to your code type "`//`" Anything after it will not be run.

# Try this:

To get started, create a variable for your name and age. For now, write everything within the Main class (between the two brackets).

Although variables are great and all, just assigning variables isn't super fun, we want results! Use `System.out.println();` to print a variable to the console. If I were to do this with the speed of a motor, it would look like this:

```
float motorSpeed = 42.00f;

System.out.println(motorSpeed);
```

# What we expect to see at the end of this lesson:

- Two variables, one assigned to your name and the other your age.
- Both variables to be printed to the console

- Bonus: Can you figure out how to print a sentence to the console containing your variable? Hint, you can use a plus sign to concatenate them.

