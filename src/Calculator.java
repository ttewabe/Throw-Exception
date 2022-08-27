public class Calculator{

    public static void throwANumber(int throwMe)throws Exception{
        throw new Exception("I don't like the number " + throwMe + ", you can have it back!");
    }

    public static void catchIt(int catchMe){
        try{
            throwANumber(catchMe);
        }catch(RuntimeException ex){
            System.out.println("You'll never see this!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("I'm in the finally block");
        }
    }

    // Your code will go here
    public static void calculate(int x, int y){
        System.out.println(x/y);
    }

    public static void use(int x, int y){

        try{
            calculate(x, y);
        } catch(ArithmeticException ael){
            System.out.println("Don't divide by 0!");

        }catch(Exception ea){
            System.out.println("Some other exception");
        }finally{
            System.out.println("This will always print out");
        }


    }



}