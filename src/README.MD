# 4.10 Similarities between the IF single-selection statement and the While iteration statement
1. For an If single-selection statement and While Iteration statement to work the condition
assigned to the statement must be true, otherwise the program will not execute or will be canceled.
   
Differences between the IF singleton statement and the While iteration statement
1. The "If" single-selection statement is a one time decision, while the "While"
iteration statement is a repeated process(loop).

# 4.11 What happens when an integer is divided by an integer in java, and how do you avoid that?
When dividing an integer by an Integer in java, the result will always be a whole number and the
fractional part(remainder) will be lost, this happens because integer data types do not recognize fractions.
To avoid losing the fractional part we have to make the division variable a double/float data type, then we 
the coding technique called type casting to change the data types when dividing.
Example code: 
public class Integer {
public static void main(String[] args) {
int x = 10;
int y = 4;
double division = (double)x/y ;
System.out.print("the division of x/y = " + division);
    }
}
The output of this code will be 2.5 the fractional part is not lost because we applied the type casting technique
by adding (double) in front of the variable x while dividing.
# Describe two ways in which control statements can be combined
1. Decision inside a loop: This can be used when you are trying to iterate a process, and you want each iteration
to match some specific conditions, that is when you can put a If or Else statement within  a Loop. in simple terms
repeat something, inside each repetition, make a decision.
2. A loop inside a decision: First, make a decision. If the condition is met, then repeat something multiple times.
If not, skip the repetition entirely. it is simply used to test if the condition given to a decision is true or false.
if it's true the loop runs, if it's false the loop does not activate.

# 4.13
1. Obtaining input until the user indicates there is no more input
   Appropriate repetition: while loop

# Reason:
This situation requires a loop that continues for an unknown number of iterations. The program does not know in advance
how many inputs the user will provide. It must keep asking for input repeatedly until the user explicitly signals that 
they are finished (e.g., by typing "quit" or pressing a specific key). A while loop is ideal for this because it 
continues to execute as long as a certain condition remains true, and that condition is checked before each iteration. 
The condition can be tied to user input, making the loop flexible and responsive to user actions.

# How it can be performed:
The program prompts the user to enter data.
It reads the input and checks whether the user has entered a specific termination value (e.g., "stop", "quit", or -1).
If the user enters the termination value, the loop ends.
If the user enters valid data, the program processes it, then loops back and prompts the user again.
This process repeats until the termination condition is met.

2. Calculating the factorial of 5 (i.e., 5!)
   Appropriate repetition: for loop

# Reason:
This situation involves a fixed and known number of iterations. The factorial of 5 requires exactly 5 multiplications: 
5 × 4 × 3 × 2 × 1. Since the number of repetitions is known in advance, a for loop is the most natural and readable
choice. A for loop is structured to handle initialization, condition checking, and variable updates in a single, clear 
statement. This makes the code compact and easy to understand for tasks that involve counting or iterating over a known
range.

# How it can be performed:
A variable is initialized to 1 to hold the result.
A loop counter starts at 5 and decreases by 1 each iteration until it reaches 1.
At each iteration, the current value of the counter is multiplied into the result variable.
After the loop finishes, the result variable contains the product of all numbers from 5 down to 1, which is the
factorial.

# If integers x and y are set to 7 and 3, what is the value of x after x = y++ and x = ++y?"

When we write x = y++;, Java looks at y first, which is 3. It gives that 3 to x, and then it adds 1 to y so y 
becomes 4. So after this, x is 3 and y is 4. Then we write x = ++y;. Now y is 4. But this time, the ++ is in
front, so Java adds 1 to y first, making it 5, and then it gives that new number 5 to x. So now x is 5 and y is 5. 
So the answer is: after x = y++, x = 3; after x = ++y, x = 5. The difference is simply whether the ++ comes before
or after the variable. If it comes after, Java uses the value first, then increases it. If it comes before, 
Java increases it first, then uses it.

 
# 4.15 The code is corrected by removing the colon, and adding the curly bracket
if (age >= 65) {
System.out.println("Age is greater than or equal to 65");
} else {
System.out.println("Age is less than 65");
}








