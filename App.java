public class App {
    public static void main(String[] args) throws Exception {
        String Creator = "Rashidul";
        int number1,number2;
         number1 =5;
          number2 =3;
          int multiplication,addition,subtraction;
          Double division;
          
          multiplication =number1*number2;
          addition =number1+number2;
          division =(double)number1/number2;
          subtraction =number1-number2;

        System.out.println("Printer App");
        System.out.println("This app made by " + Creator);
       System.out.println("number 1");
      System.out.println("Number 1: " + number1);
      System.out.println("Number 2: "+ number2);
      System.out.println("Multiplication =" +multiplication);
      System.out.println("Addition ="+addition);
      System.out.println("Division ="+division);
      System.out.println("Subtraction ="+subtraction);

    }
}
;