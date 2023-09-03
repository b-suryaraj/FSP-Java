                                                Ch-7 Threads

A program in execution is called a process. 
A thread may be defined a smallest unit of that process which can run independently. 
Using threads, java supports the concept of multi tasking. 
In java a thread is implemented using a thread class. 
Every thread which we create in java has a name and prority level of thread ranges from 1-10; 1->min 10->max.
If does not mentioned priority leeveel of a threa. Then 5 is the default property, This name priority combination is unique for each thread.

In java main() method itself is a thread.
Using the currentThread() method of thread class we can check which thread is currently running.

    WAP to display the main thread. threads.java

A thread is also used to optimize the CPU performance.


                                            Ways of Creating Thread
Two ways of creating threads:
    1. By implementing Runnable Interface //Runnable in inbuilt interface
    2. By extending the thread class 

1. By implementing Runnable Interface

-> Steps of creating thread by implementing Runnable interface:
    (1) Create a class which implemets the Runnable interface
    (2) Create an object of the thread class
    (3) Call the start method 
    (4) The start method calls the run method. It is inside the run method where we have to write the code for another thread,

   WAP to display creation of thread by implementing Runnable interface. --threadRunnableInterface.java

   WAP to create four different threads including your main by implementing Runnable interface. -- mulThreadRunnableInter.java

-> Creation of a thread by implementing Runnable interface using a constructor: 
            -- constThreadRunnableInter.java
    
2. By extending the thread class 

-> Steps for creating the thread by extending the thread class:
    (1) Create a class which extends the thread class.
    (2) Call the start method.
    (3) The start method calls the run method. It is inside the run method where we have to provide the code for another thread.

    WAP to display creation of the thread by extending the thread class -- threadExtendThrdCls.java

Q.) Among two ways of creating thread which is best and why??

Ans-> If we create a thread by extending the thread class then that class will not be able to extend any other class if needed. But if we create the thread by implementing runnable interface then that class still has the option to extend any other class if needed, in this sense we can say creating a thread by implementing a Runnable interface is best.
