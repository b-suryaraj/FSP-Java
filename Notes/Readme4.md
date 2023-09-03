                                        Ch-3 Inheritance and Abstraction
                                                    
                                                    *INHERITANCE*
                                        
Inheritance is the mechanism by which one class accquires the features of another class.

-> extends keyword is used to inherit parent class.
-> Through Inheritance java supports the concept of code reusability.
-> Types of Inheritance:
    Inheritance can be classified into 5 types:
        1) Single Level Inheritance
        2) Multi Level Inheritance
        3) Multiple Inheritance
        4) Hierarchical Inheritance
        5) Hybrid Inheritance
Single level Inheritance:-
         ____________
        |   A       | Parent / Super / Base
        |___________|
            |
            |            
         __\|/______
        |   B       | Child/ Sub/ Derieved
        |___________|   
    Here one class is derived from another class
    
    Write a program to show single inheritance---singleInheritaance.java

Multi Level Inheritance: 
    In multi level inheritance one class is derieved from one class and from that derieved class another class is derieved.
        ____________
        |   A       | Parent of B
        |___________|   Grand parent of C
            |
            |            
         __\|/______
        |   B       | Child of A
        |___________| Parent of C
            |
            |            
         __\|/______
        |   C       | Child of C
        |___________| Grand Child of A

    Write a program to implement multi level inheritance--multiLevelInheritance.java

Multiple Inheritance:
    In multiple inheritance, we have more than two classes that are inherited in a single class.
        ____________            ____________
        |   A       |          |   B       |       
        |___________|          |___________|    
            |                           |
            |                           |
            |        ____________       |
            |------>|   C       |<------| 
                    |___________| 
           
        Here one child class is derived from more than one base class.
    In java the concept of multiple inheritance is not supported directly.
    It is supported indirectly using a concept called interface
    
Heirarchial Inheritance: 
    In Heirarchial Inheritance more than one child class is derieved from a single base case.
    The heirarchy can be represented as shown below:
                      __________
            |--------|   A      |-----| 
            |        |__________|     |
            |                         |
        ____|_______            ______|___
        |   B       |          |   C      |       
        |___________|          |__________|    
                                    

            WAP to display heirarchial inheritance in java--heirarchialInheritance.java

Hybrid Inheritance
    In java hybrid inheritance is a collection of all above inheritances except multiple inheritance.

                                                    Variable Overriding

When a child class variable has the same namea as that of the parent class variable then, the child class variable tends to hide the variable which is inherited from the parent class. This mechanism of hiding the parent class variable by the child class variable in the child class is called variable overriding.

In order to access the hidden parent class variable we have to use a keyword called super.

    Write a program to display use of variable overriding.--varOverriding.java

Through variable overloading , java supports the concept of polymorphism.

                                                        Method Overriding

In JAVA a parent class method may have the same name as that of the child class method, in such cases the child class method tends to hide the parent class method in the child class. This mechanism is called method overriding and methods are called overrided method.
If we want to access the hidden parent class method in the child class, we have to use the super keyword.

    Write a program to display method overriding in Java. --- methodOverriding.java

Through method overloading , java supports the concept of polymorphism.
                                                        
                                                    Use of super keyword
Q) What is the use of a *super* keyword in java?
    If a parent class member (variable and method) are overridden by a child class member then in order to access the parent class member from the child class we need the help of super keyword.

                                                    Use of super() Method
                                                    
A constructor of the parent class is not inherited in its child class. If we want to access the parent class constructor from the child class then we have to use super method.

Things to follo while using a super method:
    1. A super method call should always be provided inside a child class constructor
    2. This call should be the first statement inside a child class constructor

    Write a program to display super method in JAVA.---superMethod.java

                                                Use of final keyword
The final keyword has three uses in java:
    1. A final keyword is used to create a naming constant.
    2. If a variable is declared as final, then the value of the variable cannot be changed throughout the program.
    3. A final keyword if it is provided in the method of the parent class then that method will not be overrided in the child class.
        eg.-
            class A
            {
                final void disp()
                {
                    -------
                }
            }
            class B extends A{
                void disp(){     X
                    --------
                }
            }
    4. A final keyword can be used to prevent inheritance of a class.
        eg.-
            final class A{
                ------
            }
            class B extends A{      X
                -----
            }

                                                this keyword
If a instance variable has the same name as that of a local variable then the local variable tends to hide the instance variable. 
In order to resolve this naming collision, *this* keyword is used.
"this" keyword always refers to the current object.

                                                *ABSTRACTION*
                                
                                Abstract class in Java

1. An abstract class has the abstract keyword applied to it.
2. We cannot create an object of an abstract class
3. An abstract class may contain normal methods as well as abstract methods. 
4. Abstract method means a method without any definition.
5. An abstract class always act as a super class.
6. An abstract class is used in order to create a blueprint of a code.

Disadvantage:
    : As we can keep normal methods in an abstract class along with abstract methods hence an abstract class does not provide a pure blueprint of the code.

        Program to display use of abstract class in JAVA--abstractClass.java

The child class which extends the abstract class has to provide body to the abstract methods of the abstract class.
.
23/08/23
---------------------------------
NOTE: A parent class reference variable can refer to any of the child class object but vice versa is not true.
---------------------------------
NOTE: In java any object is created at runtime
---------------------------------
.
                                            Dynamic Method Dispatch
It is a  mechanism by which java supports the concept of runtime polymorphism.

    WAP to display dynamic method dispatch in java. -- dynamicMethodDispatch.java
.                                          
----------------------------
In Java if we want to create a variable which may be acting like a global variable then that variable has to declared as public, static and finite.
----------------------------

                                                            Interface
An interface is a special kind of class which may conatin variables and methods where the variables are by default static and final and the methods are by default public and abstract. 
An intrface is used for two reasons:
        1. To support the concept of multiple inheritance indirectly.
        2. In this, methods are by default public and abstract and that's why interface provide pure blueprint of code.

    WAP to display use of interface -- interfaceImplement.java

-> implements keyword is used to inherit the multiple interface.
-> Just like an abstract class we cannot create an object of an interface.
