import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fizz Buzz Exercise!!!");

        System.out.println("Look what number of the list below is divisible by three or five or both");
        System.out.println("Fizz divisible by 3, Buzz divisible by 5 and FizzBuzz divisible by 3 and 5");
        System.out.println("Introduce the top number of the list");

        int numL = scanner.nextInt();
        
        int[] numbers = new int[numL];

        System.out.println("-------------");

        for(int i = 0; i < numL; i++){
            numbers[i]= i+1;
            // System.out.println(numbers[i]);
            if(numbers[i]%3 == 0 && numbers[i]%5 == 0){
                System.out.print(numbers[i]);
                System.out.println(" FizzBuzz");
            }else if(numbers[i]%3 == 0){
                System.out.print(numbers[i]);
                System.out.println(" Fizz");
            }else if(numbers[i]%5 == 0){
                System.out.print(numbers[i]);
                System.out.println(" Buzz");
            }else{
                System.out.println(numbers[i]);
            }
        }
        System.out.println("-------------");
        
        // for(int j = 0; j < numbers.length; j++){
        //     if(numbers[j]%3 == 0 && numbers[j]%5 == 0){
        //         System.out.print(numbers[j]);
        //         System.out.println(" FizzBuzz");
        //     }else if(numbers[j]%3 == 0){
        //         System.out.print(numbers[j]);
        //         System.out.println(" Fizz");
        //     }else if(numbers[j]%5 == 0){
        //         System.out.print(numbers[j]);
        //         System.out.println(" Buzz");
        //     }else{
        //         System.out.println(numbers[j]);
        //     }  
        // }

        scanner.close();
        
    }
}
