package listOfExceptions;

public class ListOfExceptionsTest {
    public static void main(String[]args){
        ListOfExceptions catchErrors = new ListOfExceptions();


        try{
            catchErrors.myErrors();
            System.out.println("Casted each element to an Integer");

        }
        catch (ClassCastException e){
            System.out.println("Can't cast to an Integer: " + e.getMessage());
        }

    }
}
