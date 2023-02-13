package AmazonCoding;

public class SimpleCalculator {

    public static void main(String[] args) {

        SimpleCalculator calculator =  new SimpleCalculator();

        calculator.setFirstNumber(2);
        calculator.setSecondNumber(2);

        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());


        System.out.println(calculator.getAdditionResult());

    }

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }



     public  double getAdditionResult(){
         return  firstNumber + secondNumber;
     }

     public  double getSubtractionResult(){
         return   secondNumber - firstNumber;
     }

     public  double getMultiplicationResult(){
         return   firstNumber * secondNumber;
     }

     public  double getDivisionResult(){

         if(secondNumber== 0){
             return 0;
         }
         return     firstNumber/secondNumber;
     }
 }


