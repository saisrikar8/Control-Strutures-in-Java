# Control Structures

Control structures are the mechanism by which you make the statements of a program run in a nonsequential order.

### Two Types of Control Structures:
- Decision-Making(Conditional Statements)
- Iteration

## Decision-Making Control Structures

### The `if` statement

```java 
if (/*boolean expression*/){
	//statements
}
```

The statement inside the curly braces will be executed only if the expression is true. Otherwise, the control passes over this statement.

#### Example 1:

```java
class Main {
  public static void main(String[] args) {
    int x= 5;
	if (x==3){
		System.out.println("x is equal to three");
	}
  }
}
```

This will not print out anythiing because x is not equal to three, so the boolean expression is false. Thus, the body of the `if` statement will not be executed.

#### Example 2:

```java
class Main {
  public static void main(String[] args) {
    int x= 5;
	if (x==5){
		System.out.println("x is equal to five");
	}
  }
}
```

In this example, the code will print `x is equal to five` because the boolean expression of the `if` statement is true, so the body is executed. The body is a `System.out.println()` statement that will print the output.

### The if...else statement

```java
if (/*boolean expression*/){
	//statements
}
else{
	//statements
}
```

In this statement, if the boolean expression is true, only the statement(s) inside the curly braces will be executed. If the boolean expression is false, the statemeents after the `else` statement will be executed.

#### Example:

```java
class Main {
  public static void main(String[] args) {
    int x= 5;
	if (x==3){
		System.out.println("x is equal to three");
	}
	else{
		System.out.println("x is not three");
	}
  }
}
```

This code will output `x is not three` because x is not equal to three, so the boolean expression of the `if` statement is false. Therefore 

### Extended if statement
```java
if (/*boolean expression*/){
	//statements
}
else if (/*boolean expression*/){
	// statements
}

else if (/*boolean expression*/){
	// statements
}
else{
	//statements
}

```

In this statemment, the control will start at the first `if` statement and go through the statements in the {} if the boolean expression is true. If the boolean expression is not true, the control will move on to the next boolean statement and repeat the process until there are no more boolean statements. If none of the boolean statements are true, the control will go into the statement in the else conditional statement..

#### Example:

```java
class Main{
	public static void main(String args[]){
		int age = 16;

		if (age > 20){
			System.out..println("You are old!");
		}
		else if (age< 18){
			System.out.println("WOW!")
		}
		else if (age == 16){
			System.out.println("You are 16!");
		}
		else{
			System.out.prinln("You are young!")
		}
	}
}
```

In this example, `WOW!` will be the output. This is because `age` is not greater than 20, so the `if` statement's body will not be executed. In the first `else if`, the body will be executed because `age` is less than 18. This will print `WOW!` and skip over the rest of the statements.



If you delete the first `else if` statement, the code will look like this:

```java
class Main{
	public static void main(String args[]){
		int age = 16;

		if (age > 20){
			System.out..println("You are old!");
		}
		else if (age == 16){
			System.out.println("You are 16!");
		}
		else{
			System.out.prinln("You are young!")
		}
	}
}
```

This will print `You are 16!` because the first `if` boolean expression is false. The next boolean expression is true, so the body of the `else if` will be executed.

### Relational Operators
Relationall operators are used in boolean expression that evaluate to `true` or `false`.

| Operator | Meaning | Example |
| :---: | :---: | :--- |
| ==    |  equal to                 | if(x == 3) |
| !=    |  not equal to             | if(x != 3) |
| >     |  greater than             | if(x > 3 ) |
| <     |  less than                | if(x < 3)  |
| >=    |  greater than or equal to | if(x >= 3) |
| <=    |  less than or equal to    | if(x <= 3) |

### Logical Operators
A `logical operator` is one that returns a boolean as a result

| Operator | Meaning | Example |
| :---: | :---: | :--- |
| `!`  |  NOT           | if(!found) 						|
| `&&` |  AND           | if(x > 3 && x < 10) 	|
| `||` |  OR          	| if(x > 2 `||` x < 2) 	|

Explanation:

#### NOT
```java
boolean found = true;

System.out.println(!found)
```
Explanation: If it is NOT the case that `found` is `true`, the statement will print `false`.

#### AND

```java
int x = 7;
if(x > 3 && x < 10){
	System.out.println(true);
}
```

Explanation: If `x` is greater than 3 and is less than 10, the statement inside the `if` statement will print `true`.

#### OR

```java
int x = 11;
if(x > 3 || x < 10){
	System.out.println(true);
}

```

Explanation: If `x` is greater than 3 **or** x is less than 10, the statement inside the `if` statement will return `true`. Even though `x < 10` is `false`, the expression is `true` because `x > 3` is `true`.

## Conditional Statement Tasks

1. Given a number from the user, print out "negative" if the number is negative, "positive" if the number is positive, or zero otherwise.

2. Given an integer variable x, print out "middle" if x is greater than 0 and less than 10.

3. Given a string variable, letter, find out which letter in the string "abcde" that the variable belongs to.