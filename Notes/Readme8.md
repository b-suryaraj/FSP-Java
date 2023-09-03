                                                Ch-08  STRINGs

A string may  be defined as a sequence of character which is terminated by a null character "\0". In java a string is implemented by using two classes:
    (1) String class
    (2) StringBuffer class

                                                String class
A String is an immutable class i.e any changes made to particular String object does not change the value of original String object, rather with the change it actually creates a new separate object.
This String contains multiple methods using which we can manipulate a particular string :
    
    : length() - Responsible for determining the number of characters present in given string.
        WAP to display use of length method.  -- stringLength.java
    : concat() - Using concat method we can join two strings together.
        syntax : String s = "String 1";
                 s =  s.concat(" String 2 " ); //output- String 1 String 2
    : charAt() - Used to extract a particular character from a string based on the index position.
        syntax : String s = "String 1";
                 char res = s.charAt(n); // print the character at nth index (or (n+1)th position)
    : compareTo() - Responsible for comparing two strings and returns a integer value. 
        If the value returned is 0 i.e both string are equal.
        ascii value comparison of respective index of strings are compared if different found the difference in ascii value will be returned.
    : endsWith() - Used to check whether a particular String ends with a given string or not. 
        syntax : -- stringEndsWith.java  //It returns boolean value
    : startsWith - check whether a particular string start with a given string or not.
        syntax : -- stringStartsWith.java
    : equals() - Responsible for comparing two strings and return a boolean value.
        syntax : -- stringEquals.java
    : equalsIgnoreCase() - Used to compare two strings by ignoring the case.
        //works same as .equals() methods it just ignores the case
    : indexOf() - Used to determine the index position of given character in a string.
        //if character not present, then value returned is -1;
        //it checks from left hand side
        syntax : -- stringIndexOf.java
    : lastIndexOf() - The character is searched from right hand side of the string.
        syntax : -- stringLastIndexOf.java
    : replace() - Used in order to replace a particular character in a string by another character in a sring by another character.
        syntax : -- stringReplace.java
    : substring() - Used to extract a particular string from a given string based on index position.
        syntax : -- stringSubstring.java
    : toLowerCase() - Used to convert a corresponding string to lower case.
    : toUpperCase() - Used to convert a corresponding string to upper case.
    : trim() - Used to in order to remove any leading or trailing spaces in a string.
        syntax : -- stringTrim.java

                                            StringBuffer class
StringBuffer is a mutable class, i.e any changes made to a string is reflected in the original string object itself.
This StringBuffer class also contains some methods to manipulate the string:
    : append() - Used to concatenate two strings together.
        syntax : -- strBufferAppend.java
    : insert() - Used to insert a particular string within a given string at given position.
        syntax : -- strBufferInsert.java
    : replace() - Used to replace a particular string by a given string based on the starting and ending index position. 
        syntax : -- strBufferReplace.java
    : delete() - Used to delete contents from a string based on the index position.
        syntax : -- strBufferDelete.java

    WAP to accept a string from a user and delete characters from that string where the starting and ending index position are taken from user. -- strQuestion1.java

    : reverse() - used to reverse the content of a particular string.
        syntax : sb.reverse();

    WAP to accept a string from a user and display it in reverse form. -- strQuestion2.java
