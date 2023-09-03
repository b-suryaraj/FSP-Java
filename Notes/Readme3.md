                                    Ch-3 Encapsulation and Polymorphism

                                                *ENCAPSULATION*
Encapsulation is a process of wrapping the data (variables) inside an object with methods that can access or manipulate those variables ; and the methods inside a class.
                                                    Class
Class : A clas is used in order to group data(Variables) and methods in a single unit.
Syntax of a class:
class classname
{
	instance variable declaration;
	method declaration;
}
class A
{
	int a;
	void display()
	{
	.......
	}
}
			                                        Object
An object is called an instance of a class .
Creating an object of a class is a two step process:
    1. Create a reference variable of that class.
    2. Using new keyword create the object of the class and assign it to the reference variable of the class.
A ob;//refernce variable
ob=new A();
//creating an object of type A
These two lines can be combined as:

    Write a program to display classes and object- Test2
    Write a program in JAVA to take two numbers in two variables, calculate the sum and the product of those thoe variables and display the result.--Test3
    Write a program to display passing of values between classes-Test4

Q) Why the main method in java is public static void?
    : The main method is declared as public so that it can be accesible my JVM(Java Virtual Machine), which is an outside code.
    : The main method is declared as static because JVM does not have to create an object of the class within which main resides.
    : The Main method is declared as void because it does not return any value to JVM

    Program to display assigning of one reference variable to another

A particular object can have more than one reference variable but a particular refernce variable cannot point to two objects at the same time.

What do we mean by garbbage collection in JAVA?
    -> When a particular object loses its reference then that object is considered to be no longer in use. Such kinds of unreferenced objects are called as garbages in JAVA.
    JVM keeps track of such kinds of unreferenced objects and remove them from memory automatically when needed. This mechanism of automatic removal of unreferenced objects by JVM is called Grabage collection.

                                                    Constructors in JAVA

A constructor is a special method which has the same name as that of the class, within which it resides.
A constructor does not have any return type, not even void.
A constructor is called automatically when we create an object of that class.
Q->Why we need a constructor?
    A constructor is used in order to initialise an value

    WAP to display the use of constructor. -- constructor.java

Types of constructor: 
    A constructor can be classified into mainly two types.
        1. Default Constructor - A constructor which does not takes any arguement is called a default constructor.
        2. Parameterized COnstructor - A constructor which takes arguements is called a parameterized constructor.

    WAP to display use of Parameterized Constructor

22-08-2023

Q) Why a non parameterized constructor is called a default constructor?
    When we does not provide any constructor in a program, it is the compiler which actuallyprovides a non parameterized constructor by default. This non parameterized constructor is responsible for providing default values to the instance variables of the class.
    If the datatype of the instance variable is Int: Default Value: 0
                                                Float: Default Value:0.0
                                                Char: Default Value: NULL
                                                Boolean: Default Value: false
    The reason why a nonparameterized constructor is called a DefaultConstructor is that there are no parameters passed while creating objects from this class.
    
    NOTE--If we interchange the position of public and static, then also the program will run.
    But this is wrong way.

                                                *POLYMORPHISM*

                                                        Method Overloading
Method overloading means having multiple methods with the same name but different parameters or number of arguments passed during invocation.

void disp(int x, int y)
{
    .......
}

Function Declaration---> int disp(int x, int y);
Function Prototype---> It is same as Function Declaration
Function Definition---> Entire function with body
Function Signature---> Function Protoype without the Return Type
                       disp(int x,int y);

                                                    Method Overloading in Java

In Java it is possible to have multiple methods *with the same name* within the *same class* as long as they differ in their signature.
This mechanism is called as method overloading and the methods are called as overloaded methods.
Prog- polymorp.java
Using Method Overloading JAVA supports the concept of polymorphism.

    Write a program to find the area of a Square and a Rectangle by overloading the Area method.--areaSquareRectangle.java

                                                    Constructor Overloading
In Java it is possible to have more than one constructor provided they differ in their arguement list or signature.
Constructor Overloading means that multiple constructors may have the same name but different parameters.

    Write a program for constructor overloading--constOverload.java

Through constructor overloading JAVA supports Polymorphism.

                                    Naming Conventions
                                        ()-Parenthesis
                                        {}- Braces
                                        []- Brackets
                                    
Command Line Arguement:
    Sometimes we need to pass values to a program at the time of running. This can be achieved using command line arguement. When we pass values through command line. Values are passed in the form of array of strings.

    Write a program to display use of Command Line Arguement in Java.--cmdLineArgument.java
    Write a program to accept two numbers through command line and display their sum and average.--cmdAddAvg.java
    Write a program to find out the sum of n number of numbers passed through command line. -- sumNumbers.java