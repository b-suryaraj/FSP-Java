                                    Ch-6 Exception Handling

-> JVM handles exception.

                                Types of Error in programming language
In any prog lang errors are of four types:
        1. Syntactical Error : Occurs if there,s an error in syntax.
            eg- semicolon missing(;), variables using but not declared, open brackets but ot closed; 
        2. Logical Error : Occurs if there is problem in instructions.
            eg- c = (a+b) and displaying a;
        3. Symantic Error : Defines as unnessary wastage of resources. Resourse in terms of time as well as space.
            eg-
        4. Runtime Error : Occurs if program gets stopped suddenly during execution phase or at time of execution. In java runtime error is called an EXCEPTION.

When an exception occurs in java it is the JVM which by default handles the exception. A JVM stops the execution of the program at that line which generates the exception, to prevent this from happening we the coders needs to handle the exception on our own. That's why it is called as EXCEPTION HANDLING

An exception can be handled using 5 keywords:
    1. try
    2. catch
    3. throw
    4. throws
    5. finally

                                            try and catch Block
A try is a block which contains those statements which may or may not generate a exception. A try block is always followed by atleast one catch block.

-> Syntax of try and catch block:
    try{
        ----
        ----
    }
    catch(Exceptionclassname ref){
        ----
        ----
    }

If an exception occurs in the try block then the program control comes out of the try block and goes to matching catch block. It is inside the catch block where we have to write the exception handling code.

    WAP to display the use of try and catch. --tryCatch.java
.
-----------------------------------------------
NOTE: A single try block may be followed by mutiple catch blocks. If an exception(or runtime error) occurs in try block, based on nature of exception appropriate catch block will be called.
-----------------------------------------------
    WAP to use single try and multiple catch. --tryMulCatch.java 
----------------------------------------------
Note : In case of multiple catch blocks never put the parent exception catch block before the child exception child block, because that will generate a syntax error.
    --> Unreachable catch block for Child Exception class. It is already handled by the catch block for Exception.
----------------------------------------------

                                                throw Keyword
throw is a keyword using which we can manually generate an exception.

-> Syntax of throw:
    throw Exceptionclassobject();

A throw statement should always be writen inside a try and catch block.

    WAP to display use of throw keyword. -- throwKeyword.java

                                                throws Keyword
Sometimes in Java a method does not handles the exception on its own. It must inform this behaviour to all the calling functions so that they can take appropriate precautions this can be done using throws keyword.

-> Syntax of throws:
    returntype methodname(arguement list)throws exception1, exception2, .....{
        body of the method
    }

    WAP to display use of throws keyword. -- throwsKeyword.java

                                            Exception Handling Categories
Based on the handling of the exception an exception can be classified into two categories: 
    1. Checked Exception : eg- IOException, FileNotFoundException
    2. Unchecked Excepion : eq- ArithmeticException, ArrayOutOfBoundIndexException

If an exception is Checked exceptions then the compiler checks whether you have provided try and catch block to handle that exception and if not then you have mentioned the name of those exception classes beside the throws keyword if none of these are in your code then only the compiler will generate an error.
In case of Unchecked exceptions the compiler does not check for the exceptions,rather it is advisable to use try and catch block to handle those exceptions.

                                                    finally Keyword
finally is a block which is always executed whether an exception occurs or not. A finally block is always written after try and catch block.

-> Syntax of finally :
    try{
        ---
    }catch{
        ---
    }finally{
        ---
    }

                                                User-Defined Exception
In java it is possible to create our own exception class provided that exception class name extends the exception class.

WAP to display user defined exception class. -- userDefineException.java

                                                Nested try and Catch
-> Syntax of try and catch:
    try{                            //outer try block
        ----
        ----
        try{                        //inner try block
            ----
            ----
        }catch(   ){                //inner catch block
            ----
            ----
        }
    }catch(   ){                    //outer try block
        ----
        ----
    }

In java it is possible to have an entire try and catch block inside an entire try and catch block.
    -> Any exception that occurs in the inner try block is first handled by inner catch block and if the inner catch block fails to handle the exception then only the outer catch handles the exception.
    -> If there's an excption in outer try block then thtat exception only be handled by outer catch blck but by the ineer catch block 