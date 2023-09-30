package RuntimeOrUncheckedExceptions;

public class Client {
    public static void main(String[] args) {
        ExceptionsDemo exceptionsDemo = new ExceptionsDemo();

        try{
            exceptionsDemo.print();
        }
        catch (ArithmeticException exceptionObj){
            exceptionObj.printStackTrace();
        }
        finally {
            System.out.println("This is finally block!!!");
        }
    }
}


/*
        in the hierarchy tht topmost class is Object -> then Throwable
                                                Throwable
                                                    |
                                     Errors                 Exceptions

       Errors - errors are the one which we can not handle. It basically occurs due to JVM issues
                and we get errors like OutOfMemoryError and StackOverflowError

       Exceptions - It is basically an event that occurs during the execution of a program and it disrupts the normal
                       flow of out program.
                    It creates an Exception object that contains information about - Type of Exceptions and Message
                    It also contains information about Stack Trace.
                    The Runtime system uses this object to find the class which can handle it.

       Exceptions are of two types 1) Runtime Exceptions / Unchecked Exceptions
                                   2) Compiletime Exceptions / Checked Exceptions.

       Unchecked exceptions - these are the one that occur at runtime and compiler do not force us to handle them. The
                            code get compiled but give exception at the time of running.
       Checked exceptions - these are the one that occur at compiletime and compiler forces us to handle them else
                        the code will not get compiled.


        throw keyword - it is used to create new exceptions and throw it.
                        It also re-throw the exception.

        throws keyword -  it is used with the method, and it tells that a particular method might throw an exception (or might not)
                            sot the class which is calling this method need to handle it appropriately.

         Exception handling is done by try and catch block

 */
