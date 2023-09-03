                                                Ch-09 JAVA Collection Framework

The collection in java is a framwork which provides an architecture in order to store and manipulate group of objects.
Java collections provides supports for all the operations like data insertion, data deletion, sorting, searching, and manipulation.
Java Collection means a single unit of objects.
The package which contains all the class and interface of Collection framework is java.util

                  diagram : -- Readme9dia.drawio.svg

-> In a collection framework Iterable is the parent interface from which all the other interfaces are extended.
-> The Collection interface is being extneded by three seperate interfaces :
   (1) List
   (2) Queue
   (3) Set 
-> The List interface is implemented by four different classes:
   1. ArrayList
   2. LinkedList
   3. Vector
   4. Stack
-> The Queue interface is extended by another interface called Deque; and queue interface is directly implemented by a class called PriorityQueue.
-> The Deque interface is implemented by another class called ArrayDeque.
-> The Set interface is implemented by two classes namely HashSet and LinkedHashLsit , Set interface is again extended by another interface by SortedSet; and SortedSet is implemented a class called TreeSet.

                                          List Interface
-> It is child interface of Collection Interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.
-> List Interfaces is iimplemeted  by the classes ArrayList, LinkedList, Vetor and Stack.

ArrayList :
   ArrayList class implements List Interface.
   Uses dynamic array to store the duplicate element of different data types
   ArrayList class maintains the insertion order and is non-synchronized (i.e it is not thread safe).
   Elements stored can be randomly accessed

   WAP to display use of ArrayList in Java. --arrayListImpl.java

   -- size() method is method of array which determines the total number of objects present in ArrayList.
   -- add() method is used to add elements or objects to ArrayList.
   -- remove() method is remove elements or objects from the ArrayList
   -- hasNext() method (inbuilt method of Iterator Interface) which provide a boolean value based on whether data or objects presnt inside ArrayList or not.If objects are present then returns true, otherwise returns false.
   -- The next() method of the Iterator actually picks and display actual value of ArrayList in form of objects.
   -- toString() method is used to convert any object to the corresponding String.
   -- get(i) method along with toString is used to extract the string type of value from ArrayList and display it accordingly.

LinkedList:
   LinkedList implements the Collection Interface.
   Uses a doubly linked list internally to store the elements.
   It can store duplicate eelements.
   Maintains the insertion order and is not synchronized.
   In LinkedList, the manipulation is fast because no shifting is required.

   WAP to display use of LinkedList in Java. --linkedListImpl.java

Vector :
   Vector uses a dynamic array to store the data elements.
   It is similar to ArrayList. However, it is synchronized(i.e it is thread safe)

   WAP to display use of vector in Java. --vectorImpl.java

Stack :
   It is subclass of Vector.
   It implements last-in-first-out data structure, i.e Stack.
   Stack contains all of the methods of vector class.
   Provides its methods like boolean puch(),pop() which defines its properties.

   WAP to display use of Stack in Java. --stackImpl.java

   in search() method if element is not present then it returns -1 as value of index

Queue :
   Queue interface maintains the first-in-first-out order.
   Can be defined as an ordered list that is  used to hold the elements which are about to be processed.
   It has various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

PriorityQueue :
   PriorityQueue class implements the queue interface
   Holds the elements or objects which are to be processed by their priorities.
   PriorityQueue doesn't allow null values to be stored in the queue.
   It is only ordered/sorted in the sense that the first element is the least.
   It only cares about what is in the front of the queue the rest are "ordered" when needed.

   WAP to display use of priority queue in Java. --priQueueImpl.java 

Deque Interface :
   Deque interface extends the Queue interface.
   In this, we can remove and add elements from both sides.
   Deque stands for double ended queue which enables us to perform the operations at both the ends.

ArrayDeque :
   ArrayDeque class implements the deque interface.
   It facilitates us to use the Deque.
   Unlike queue, we can add or delete the elements from both the ends.
   ArrayDeque is faster than ArrayList and Stack. 

   WAP to display use of ArrayDeque in Java. --arrDequeImpl.java 

Set Interface:
   Set interface in java is present in java.util package.
   It extends the Collection interface.
   It represents the unordered set of elements which doesn't allow us to store the duplicate items.
   We can store at most one null  value in Set.
   Set is implemented by HAshSet, LinkedHashSet, and TreeSet.

HashSet :
   HashSet class implements the Set interface.
   It represents the collection that uses a hash table for storage.
   It contains unique items.

   WAP to display use of HashSet in Java. --hashSetImpl.java

LinkedHashSet :
   LinkedHashSet class represents the LinkedList implementation of Set interface.
   Does not take dupliacte values.
   It extends the HashSet class and implements SetInterface.
   Like HashSet, it also contains unique eelements.
   Maintains the insertion order which is u nlike a HashSet and permits null elements.

   WAP to display use of LinkedHashSet in Java. --lnkdHashSetImpl.java

TreeSet :
   Java TreeSet class implements the Set Interface that uses a tree for storage.
   Like HashSet, TreeSet also contains unique elements.
   However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.

   WAP to display use of TreeSet in Java. --treeSetImpl.java