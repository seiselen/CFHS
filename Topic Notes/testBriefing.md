# Arrays in Java

...
...
...

## Iterating through a 1D Array

One way to iterate through the elements of a 1D Array in Java (and many other programming languages) is to use a **for loop** with an incremental behavior conditioned on the length of the array. The following snippet shows how to do this:

```java

char[] myArray = ['a','r','c','h','v','i','l','e'];

for (int i = 0; i < myArray.length; i++){
  System.out.print(myArray.charAt(i));
}
System.out.println();
```
