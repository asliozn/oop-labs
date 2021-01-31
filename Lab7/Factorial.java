package Lab7;
public class Factorial {
    private int value;
    private int result;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public void calculate(){
        int factorial = 1;
        for( int i = 1; i<= value; i++){
            Operations result= new Operations(factorial);
            factorial = (int) result.multiplication(i);
        }
        result=factorial;

    }
    public void printToScreen(){
        System.out.print("Factorial of "+value+" is "+ result+"\n");

    }





}
