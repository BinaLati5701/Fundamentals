package listOfExceptions;

import java.util.ArrayList;

//After you have set up this code, try running it. It should throw a ClassCastException.
// Change the program above to utilize exception handling to print out the error messages,
// the index of the ArrayList where the error occurred, and the value of the object that triggered the error.
// The program should continue after printing this to the console.
//
//        Objectives:
//        ● Implement exception handling.
//
//        Tasks:
//        ● Create ArrayList
//
//        ● Try to cast each element to an Integer
//
//        ● Use try/catch blocks to handle the exceptions

public class ListOfExceptions {

    public void myErrors() throws ClassCastException{
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            Integer castedValue = (Integer) myList.get(i);
            if(castedValue==(Integer) myList.get(i)){
                System.out.println(castedValue);
            }
            throw new ClassCastException();
        }
    }
}
