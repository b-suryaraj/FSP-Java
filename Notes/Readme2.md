                                            Ch-2 JAVA
                    
JAVA was developed by James Gosling and Pattrick Naughton at Sun Microsystem. It was initially called as Oak Language, but was later renamed JAVA.

Features of JAVA:
    1. Platform Independent.
    2. Fully Object Oriented
    3. Case Sensitive
    4. Compilated and Interpreted
    5. Strongly Typed
    6. Very Much Secure
    7. Support MultiTasking.
    8. Does not support pointers and multiple inheritance.

Q) Why JAVA is Platform independent programming language?
    When we compile a Java program, it creates a highly optimisable code, which is a byte code. This byte code can run on any computer with any hardware and software architecture.
    This is the reason why Java is called a Platform Independent Programming Language.
    It can be run on any platform that supports JVM (Java Virtual Machine).

Q)Why java is called Compilated as well as interpreted language?
    In JAVA both compiler and interpreter are required in order to compile and run a Java program, that is why it is called a compilated as well as Interpreted Languge.
         _______________                ___________                  _____________
        |               |             |             |               |            |
        |  Source Code  |  compiler   | Byte code   | Interpreter   |Executable  |
        |               |------------>|             |-------------> |    Code    |
        |               |  (javac)    |             |     (java)    |            |
        |_______________|             |_____________|      JVM      |____________|
            .java                           .class                         .exe
    
    In java once the code has been compiled to the byte code, that byte code is again recompiled by the Java Interpreter named as JVM(Java Virtual Machines) just prior to execution and its compilation is called JIT( Just In Time) compilation.

Q) Why JAVA is called strongly typed programming language?
    For any language to be strongly typed, it must follow 2 Rules:
        1. Every variable should be declared before they can be used in a program.
        2. We cannot assign mismatched datatype to one another.
            Example: int x = "Hello"; //This will give error because we are assigning string type data into integer variable.
        As JAVA follows this two rules, hence JAVA is a strongly typed programming language.
------------------------------------------
NOTE:-  JAVA was the first programming language to support the concept of multitasking, using a concept called Thread.
------------------------------------------
NOTE:-  In JAVA, the memory management is done automatically by JVM and that is why JAVA does not needs pointers to access the address of the memory.
-------------------------------------------
                                                        Tokens in JAVA
                                                    
A token may be defined as the smallest individual unit that makes up a programming language. java tokens consist of the following:
    1. Identifiers- The names given to various programming elements in JAVA.
    2. Variables
    3. Constants
    4. Keywords
    5. Separators
    6. Operators.
    7. Comments.

                                                        DataTypes in JAVA

A datatype defines the type of data which can be stored in a computer's primary memory. Apart from storing the nature of data, it also specifies how much amount of memory space a particular data occupies.
In java a datatype can be classified into following:

                                                        Datatypes in Java
                                                                |
                                                                |
                    ____________________________________________|_______________________________________
                    |                                                                                   |
                Primitive Types                                                             Non-primitive Data Types
                    |                                                                                   |
    ________________|____________________________________________                                       |--String
    |                   |               |                       |                                       |--Array
    Boolean         Character          Integer               Floating                                   |--Class
       |                |               |                        |                                      |--Interface
    Boolean:1Bit        Char: 2Bytes    |--Byte:1Byte            |--Float: 4Bytes
                                        |--Short:2Bytes          |--Double: 8Bytes
                                        |--Int: 4Bytes
                                        |--Long: 8Bytes

Q) Why character in JAVA occupies 2 bytes of memory space?
    A Unicode character set is a set of characters which represents all the characters found in all human known languages.
    As Java supports unicode character set, hence in Java, the character takes 2 bytes of memory space in order to accoodate all these characters.

                                                    Java Development Kit (JDK)

JDK stands for Java Development Kit. This JDK software contains compiler, interpreter and debugger in order to compile and run a Java program.
---------------------------------------
NOTE: Path setting is not mandatory in java and is only required if we save our java file in some other folder where compiler and interpeter are not present.
----------------------------------------
        
Structure of Java program:
1. Comment Section
2. Package Section
3. Import Section
4. Interface Section
5. Class Definition Section
6. Main() method class definition section.

                                                        Comment Section
A comment section is required in order to provide comments in a JAVA program.
A single line or multiple lines of text that are not executed by the compiler and do not affect the execution flow of any part of your code. It helps the programmer understand what he/she has written and also it makes the code more readable for other developers who will read this file.
i. Single Line Comment: 
        //........
        //.....
ii. Multi Line Comments:
        /* ............
        ...............
        ...............*/
iii. Documentation Comment:If we provide documentation comment in Java, entire comment can be transferred to a HTML file.
        /* *...........
           *...........
           *...........*/

