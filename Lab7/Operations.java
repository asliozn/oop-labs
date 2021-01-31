package Lab7;
public class Operations {

    public double value1;

    public Operations(double value1) {
       this.value1=value1;

    }
    public double addition(double value2){
        double add=value1+value2;
        return add;
    }
    public double subtraction(double value2){

        double sub=value1-value2;
          return sub;

    }

    public double division(double value2){

        double div= value1/value2;
        return div;
    }
    public double multiplication(double value2){
        double mul= value1*value2;
        return mul;

    }
    public boolean isGreaterThan(double value2){
          boolean result=false;
          if(value1>value2){
              result=true;
              return result;
          }
        return result;

    }
    public boolean isLessThan(double value2){
        boolean result=false;
        if(value1<value2){
            result=true;
            return result;
        }
        return result;
    }

    public boolean isEqual(double value2){
         boolean result=false;
        if(value1==value2){
            result=true;
            return result;
        }
        return result;
    }




}
