                                                Package
A package may be defined as a collection of some classes, interfaces, inbuilt methods as well as other packages.

Other name od package is API.

-> Need of package :
Package in java is needed for two reasons:
    1) To create a library so that we can reuse the code.
    2) To provide security to the code.

    a,b,c,x,y,z,m,n,o are the 9 claases
        ____________
        |           | (1) import abc.*;  //only a,b,c will come to my code
        |   abc     | 
        |___________|
        /   |   \    \  
       /    |    \    \
       a    b     c     \ 
                        ____________
                        |           | (2) import abc.xyz.*; //only x,y,z come to code 
                        |    xyz    | 
                        |___________|
                        /   |   \   \
                       /    |    \   \
                       x    y    z     \
                                        ____________
                                        |           |  (3) import abc.xyz.mno.*; //m,n,o
                                        |    mno    |   // '*' represents all classes
                                        |___________|
                                            /   |   \
                                           /    |    \  
                                           m    n     o
                    import abc.xyz.y; //it will fetch only y class.

In order to get all the 9 classes we have to import all the 3 import statements together.

                                Various Ways of Package access in JAVA
In java there are 5 ways of package access:
    1. Same Package Same Class
    2. Same Package Sub Class
    3. Same Package Non-sub Class
    4. Different Package Sub Class 
    5. Different Package Non-sub Class

-> Same Package Same Class
        ___________
        |   SPSC   |
        |__________|
              | 
              | -------- control.java
        ______|____
        |    P1    |
        |__________|
              |
            Abc.java  //inside p1 folder inside package folder  

    In this case, all the variables with all the access specifiers are accessable 

-> Same Package Sub Class
         ___________
        |  SPSBC   |
        |__________|
              | 
              | -------- control.java (main() function)
        ______|____
        |    P1    |
        |__________|
              |
            Abc.java (variable) //inside p1 folder inside package folder  
              |
            Xyz.java (display function) //child of Abc

-> Same Package Non-sub Class
        ___________
        |  SPNSBC  |
        |__________|
              | 
              | -------- control.java (main() function)
        ______|____
        |    P1    |
        |__________|
              |
        ______|_____
        |           |
        Abc.java    Xyz.java
    (Variable)     (display() function)

-> Different Package Sub Class
        ___________
        |   DPSBC  |
        |__________|
              | 
              | -------- control.java (main() function)
        ______|_____
    ____|____   ____|____
    |  p1   |   |  p2    |
    |_______|   |________|
        |            |
      Abc.java-----> Xyz.java
      (Variable)       (Display Function)
//Default and private variable will not work in this case

-> Different Package Non-sub Class
        ___________
        |   DPNSBC  |
        |__________|
              | 
              | -------- control.java (main() function)
        ______|_____
    ____|____   ____|____
    |  p1   |   |  p2    |
    |_______|   |________|
        |            |
      Abc.java    Xyz.java

//public variable is only accessible in this condition.


-> If a variable has private access then that variable is only accessible by the methods which also belongs to the same class within which the variable resides.
-> If a variable has protected access then that variable is accessible by the method if any one of the condition is true:
      1. The class which contains variable and the class which contains the method are in the same package;
      2. There is a parent child relationship between the two classes which contains the variable and the method.
-> If a variable has pubic access then that variable can be called from anywhere in the program
-> If a variale does not have any access specifier then that variable is said to have a default acess or a package access. A default access variable will only be accessible by the methods if the class which contains the variable and the class which contains the method belongs to the same package.