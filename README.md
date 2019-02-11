# CST8284_W19_Assign_1
CST8284 A SSIGNMENT 01: C OMPANY M ANAGEMENT T OOL P ROTOTYPE
Learning Outcomes: Optimal design strategies, UML diagram interpretation. Arrays, Composition, JUnit, overriden
methods toString() and equals().

PROBLEM DESCRIPTION
Develop a tool to keep track of a Company’s employees. The Company Management Prototype will be able to add employees, list
employees, and determine which employee has been employed at the Company for the longest period. Each employee’s data will
be stored in an Employee array (set maximum size for now to be 10). Every employee will have a name, an employee number, a
start employment date (day, month, year) and an annual salary.

PROGRAM DESIGN
![alt text](UML Diagram)





TESTING DESIGN
The scope of testing required will be limited to only those specified in the UML below.
 CompanyConsole contains a main method, which instantiates one Company reference and calls menu().
 NOTE 1: Only CompanyConsole interacts with the user; no other classes should use Scanner or println (etc.).
 NOTE 2: Do not use recursion for your method calls – instead use a properly coded repetition structure. You will lose marks if
recursion is used
 NOTE 3: Do not use any kind of “go-to” statement such as continue, break, System.exit(0), etc… in order to implement program
logic. Instead, use a properly coded control structure and test for continuity or true/false conditions with a boolean
expression. You will lose marks if any “go-to” statements are used. Appropriate places for “break” statements
include using them in a “switch” selection structure.
 NOTE 4: There are a number of ways in which to solve this problem. Originality is required as long as the basic program
functionality is implemented – consult with your lab instructor.
