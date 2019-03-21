# Lab 04 - Practice Lab Test

## Due Sept. 25 at 11:59 PM

## GroundRules for In-Lab Tests

Today is a *practice* in-lab test.  Next Tuesday (Oct. 2) will have our first *real* in-lab test, but I wanted to get used to the environment this week so there will be no surprises next week. In general, in-lab tests are similar to a normal lab, but there are a few special ground rules we need to establish to make these tests fair.

1. Lab tests must represent your own work. Any copying from other students or any other source is strictly forbidden, and will result in a zero grade. Therefore, there will be no discussion between students during the lab test period.

2. Lab tests must be worked on during the lab period, and the final submission must occur before your lab period ends. If you cannot complete during the normal lab period, turn in what you have finished at the end of the period. Partial credit will be available.

3. You may use your own laptop or one of the Linux Lab machines to complete the lab test, but must work on it in the Linux Lab room.

4. You may use the internet to access the Java API documentation, and the class web page, as well as GitHub to read the directions and clone the lab test repository. Any other use of the internet is considered plaigiarism, and will result in a zero grade.

5. Students will not get the exact same test. In order to discourage cheating, slightly different tests will be assigned to different students. You will be told which repository to work from at the start of the lab period. (We won't bother with this extra step for the practice lab test, but will do so for the actual test.)

6. For the first lab test, you are not allowed to use Eclipse to write your code. You must use a text editor, and run compile and test commands from the command window. Any use of Eclipse during the test will be considered cheating, and result in a zero grade. (This will not be true for the second lab test.)

7. If your code does not compile, there will be significant deductions because the code cannot be tested. You will get a better grade if you comment out sections of code which do not compile so that we can run and test the resulting code.

8. We will provide a *basic* Tester class that enables you to get some idea of how well your code performs.  Please compile and run with this basic tester.  However, correct results from using the Tester provided do not guarantee a perfect grade. Your code will also be tested with unpublished test cases. You are encouraged to think about what kinds of alternate test cases might occur, and add those to your version of the Tester class. Please pay attention to the signatures of the methods you are asked to code so that the Tester class will compile with no errors.

9. All classes must be in package lab04. Points will be deducted otherwise.

## Tally Counter
We've all seen a tally counter that looks like the following: ![tallycounter_picture](https://github.com/Binghamton-CS140-B1-Fall-2018/images/blob/master/tallyCounter.jpg). We will model this with a class called *Counter* that contains a single private field for the value of the counter. The creator for this class should take no arguments. This class should implement methods *void click()* which should increment the value, *void reset()* which resets the value to zero, an *int getValue()* method to retrieve the value, and a *String toString()* method to return a string representation of the value (you may use the Integer.toString() method to do this.) This class should also implement the *Comparable<Counter>* library interface, and implement any methods required by that interface. (Look up *Comparable* in the Java API to see the details.) Obviously, we want to compare values.
  
## Set of Counters
Create a *CounterList* class with a single private field - an indexable list of counters. Make a creator that takes no arguments, and initializes the list to an empty list (instead of a null reference, which is the default). 

This class should support an *void add()* method to add a new counter to the list, a *int size()* method that returns the size of the list of counters. Support a *void remove(int i)* method to remove the counter and index *i*, and a *void clear()* method to remove all counters from the list.

Also, CounterList should have several methods that take an integer argument that represents the index of the counter to work on. For instance, support a *void click(int i)* method that invokes the *click()* method on the counter at index *i*. Also support *void reset(int i)*, *int getValue(int i)*, and *String toString(int i)*. If the argument *i* is not a valid index, it is OK for the code to throw a IndexOutOfBoundsException. (Hint: You shouldn't have to write any code to make this happen.) 

Provide a *void sort()* method that sorts the counters so that the counter with the lowest value should have index 0, next lowest index 1, and so on. (Hint: because Counters are Comparable, this can be a one-line invocation of library code. Check out the sort method in the Collections class.  Note that all lists are also Collections, so we can whatever we can do with collections, we can also do with lists.)

## Committing and Submitting your Results

Remember to run git add's for *Counter* and *CounterList*. Then run ```git commit -am "Finished Lab 04"```, followed by a ```git push```. Once all of that is succesful, you may do a ```git rev-parse HEAD```, and copy and paste the resulting hash code into myCourses under CS-140/content/Lab Submissions/Lab 04.

## Grading Criteria

This homework is worth 10 points. If your code does not compile, you will get an 8 point deduction. If your code gets a compiler warning, you will get a 2 point deduction. The CA's will run your lab04.Tester main function. If the tester main method does not do everything requested with correct results, you will get a 4 point deduction. The CA's will also code a Tester2 class that creates and manipulates their own accounts. If there are any problems with the Tester2 class (e.g. method names don't match, or wronge results occur), you will get up to a 3 point deduction (depending on the severity of the problem).
