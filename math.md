# Math in Java

So far, we have learned how to do basic addition in Java. This has been super useful since it helped us create loops that went for a specified number of times. But, as you know, there are soooo many more things you can do with math than adding one to a number. You already know most of them so we won't be reinventing the wheel but sometimes the laws of mathematics get a little messed up in Java, so be careful! Let's get started with some review.

Below is a table of Java's data types. For more information go to [https://www.w3schools.com/java/java_data_types.asp, but in summary - Data types are how Java stores numbers. They specify how much memory is allocated. ](https://www.w3schools.com/java/java_data_types.asp)

 

Let's start out with some basic integer manipulation

```
System.out.println(3 + 1);

System.out.println(4 - 7);

System.out.println(3 * 20);

System.out.println(60 / 2);
```

All of this should seem pretty normal for you, so let's step it up a notch. What do you think will result from:

```
System.out.println(5 / 2);
```

**To do:**

- Write in a comment (use //) what you think the answer will be
- Run `System.out.println(5 / 2);` and see what you get
- Write in a comment (use //) why you think you were either right or wrong

**SPOILERS Ahead (finish To-Do first)**

If you thought that the answer would be 2.5, you are not alone! What Java ends up spitting back, however, is 2. Why is that? Think back to our discussion about data types above. Currently, we are using integers so we are limited to whole numbers, no decimals! To fit within the memory restrictions Java simply takes off the decimal.

To keep the decimal, we need to specify that we want it to be a double. We can do this bu putting \`_(double)_\` before the numbers like this:

```
System.out.println((double)5 / (double)2); //you only need one (double) but a second does not hurt
```

**NEXT:**

Now that you have the basics, let's try some more advanced mathematics. 

The _Math_ package gives you access to useful methods and objects for most mathematics operations. We've imported it for you already on line 1.

To get an exponent, use Math.pow:

```
System.out.println("Four to the third power is " + Math.pow(4,3));
```

You can also take the log of numbers with Math.log10. If you just use Math.log you will get base _e_:

```
System.out.println("Log " + Math.log10(100));
```

You can take the square root of a number with Math.sqrt:

```
System.out.println(Math.sqrt(100));
```

It's also possible to chain these commands:

```
System.out.println(Math.sqrt(Math.pow(10,2)));
```

In this case you'll just get 10 back, however, as a double.

**To Do:**

- Use Google to try and figure out how to what the modulo operation (%) does and write a program that uses one
- In a comment ( // ) say why this might be useful in equations, particularly for situations such as: "X % 2"

