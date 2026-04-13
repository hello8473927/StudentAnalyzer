# StudentAnalyzer: Bonus Project
Name: Mohammad Ahmad

# Description of System:
The system is created to analyze data of student objects that are within an arraylist, it allows the user to simply use methods, and edit their parameters i nsome cases, in order to filter data and extract data to their liking from the arraylist that they may provide.

# Explanation of algorithms:

Part a: Conditional Counting
using for loops to iterate through the arraylist, and using if statments for checking if grades of students are higher than the threshold and incrementing a value to keep track of how many students are above the threshold.

part b: Safe Removal During Traversal
using for loops to iterate through the arraylist, and using if statments for checking if grades of students are lower than the threshold and removing a student object from the arraylist.

part c: Maximum with Object Return
using for loops to iterate through the arraylist, uses placeholder student object to assign it to whatever the higher value may be only if the if statement is true, the if statement checks if the placeholder is smaller than the current for loop value, and if it is smaller then the placeholder value is assigned to the value that was larger than it originally.

part d: Filtered List Construction
creates a new arralist first. using for loops to iterate through the arraylist, and using if statments for checking if grades of students are higher than or equal to the threshold and if they are then the student object is added to the newly arraylist, then is returned by the method.

part e: Nested Traversal and Duplicate Detection
uses nested, for loops, the outer loop keeps track of the specific name, the inner loop picks up the specific name and itterates by checking it using a if statments, and isequal string method, it picks up fro mthe specific point and continues checkign the indexes after, it checks if the name appears more than once, and the moment it does the method returns true, if the methos finishes the for loop fully, and never goes through the id statments within the inner loop, then the loop fully finishes and the method returns a boolean value of false because it found no duplicate names.

part f:
uses for loops, to iterate through the arraylist, i use arraylist.size() - 1 to avoid an arraylist out of boudns error because i am already checking the value ahead, the for loop houses an if statement to specifically check the indexes with one another, if the direct adjacent previous index has a value that is smaller than the value of the adjacent mark of the student ahead in the arraylist, then the mathod returns true, if it isnt that then it returns false.

part g:
uses for loops, to iterate through the arraylist, i use arraylist.size() - 1 to avoid an arraylist out of bounds error because i am already checking the marks fo the student ahead, the for loop houses an if statement to specifically check the indexes with one another, if the direct adjacent previous index has a mark value that is smaller than the value of the adjacent mark of the student ahead in the arraylist, then there is a value i increment, to keep track of how many times this if statement executes, in the end i return the final value as an int.

# Sample output

Alice - 85
Bob - 72
Charlie - 90 
Diana - 65
Eve - 88
Frank - 55 
Grace - 72 
Henry - 45 
Alice - 78
Ivy - 92 
Jack - 60

Method: countAbove(80)
Return: 4
Method: removeFailing(50)
Before: 11 students
After: 10 students
Removed: Henry
Method: findTopStudent()
Return: Ivy (92)
Method: getTopStudents(85)
Return: [Alice, Charlie, Eve, Ivy]
Method: hasDuplicateNames()
Return: true
Method: isSorted()
Return: false
Method: countImprovingPairs()
Return: 4

# Challenges faced
a lot of the challenges i faced were mainly time, and in terms of logic i seem to have a decent understanding of the code, and the algorithms that i have used. this project was overall really simple for me.
