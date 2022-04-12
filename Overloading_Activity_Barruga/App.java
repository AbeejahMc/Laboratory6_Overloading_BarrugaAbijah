public class App {
    /**
     * Laboratory Acitivity focusing on Overloading
     * Abijah McGuiller B. Barruga
     */

    // Addition with 2 parameters
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }

    // Addition with 3 parameters
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    // Returns the greater integer value
    private static int greaterValue(int num1, int num2){
        if(num1>num2){      // Conditional statement
            return num1;
        }else{
            return num2;
        }
    }

    // Returns the greater double value
    private static Double greaterValue(Double num1, Double num2){
        if(num1>num2){      // Condtional statement
            return num1;
        }else{
            return num2;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Calling the Sum Function with 2 Parameters
        System.out.println("The sum of 2 and 4 is " + computeSum(2, 4));

        // Calling the Sum Function with 3 Parameters
        System.out.println("The sum of 2, 3, and 4 is " + computeSum(2, 3, 4));
        
        // Greater Value Function with Integers
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        // Greater Value Function with Doubles
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}