# For Loops

**Prelude**

In this section, we will introduce the for-loop along with the formal definition of an “iterable”. These are another essential part of programming and saves us a lot of time and lines of code.

**Pre-Lesson Exercise**

Pretend you are at mission control before a rocket launch. The timing system has just broken and they need you to make a new one before launch! 

_Do this:_ Write a block of code which counts down from five with a new number on every line then says blast off

With your current Java knowledge, you were forced to write System.out.println() 6 times to do that simple task! By the end of this lesson, you'll be able to do it in 3!

# Syntax

The syntax for "for loops" is:

```
for (initial; condition; eachLoop) {
    // code block to be executed
}
```

An example of this is:

```
for (int i = 0; i<4; i = i+1){ //pro tip, `i = i+1` can be shortened to `i++` and `i = i-1` can be `i--`

    System.out.println("Repetition number " + i);
}
```

What is going on? If you run that code you will see:

> Repetition number 0
> Repetition number 1
> Repetition number 2
> Repetition number 3

What is happening under the hood is:

1. _int i_ is set to 0 (_i_ stands for 'iterator', more on this below)
2. The _for_ loop will continue to execute if i is less than 4
3. After running the for loop, one is added to _i_

Each bullet corresponds with a single statement inside the parenthesis. If the condition (statement #2) is met, then the code between the curly braces is run until it is no longer true.

# Your turn

_To Do:_ Write the same code you wrote before for the rocket launch using a for loop. 

# What you should have in the end:

- A countdown without a for loop
- A countdown with a for loop

**Extra:**

_**What is an iterator?**_

Our encounter with for-loops introduced the term _iterable_ - an object that can be “iterated over”.

An **iterable** is any Java object capable of returning its members one at a time. You can iterate over many data types including strings, lists and more!

