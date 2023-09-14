//public class HelloWorld {
//
////    public static void main(String[] args) {
////        System.out.println("Hello, World!");
////
////        int myFavoriteNumber = 7;
////
////        // Printing the value of the variable to the console
////        System.out.println("My favorite number is: " + myFavoriteNumber);
////
////        System.out.println("pizza");
////
////        int Yolo = 2;
////
////        System.out.println("My moto is  " + Yolo);
////    }
//
//
//
//    public static void main(String[] args) {
//        // Example usage of the sayName method
//        String message1 = sayName("Justin");
//        System.out.println(message1);
//
//        String message2 = sayName("Justin", "Reich");
//        System.out.println(message2);
//    }
//
//    public static String sayName(String firstName) {
//        return "Hi " + firstName;
//    }
//
//    public static String sayName(String firstName, String lastName) {
//        return "Hi " + firstName + " " + lastName;
//    }
//}
////
////import java.util.Scanner;
////
////public class NumberValidation {
//    public static void main(String[] args) {
//        int number = getNumberInRange(1, 100);
//        System.out.println("Valid input: " + number);
//
////
////    public static int getNumberInRange(int min, int max) {
////        Scanner scanner = new Scanner(System.in);
////        int number;
//
//        do {
//            System.out.print("Enter a number between " + min + " and " + max + ": ");
//            while (!scanner.hasNextInt()) {
//                System.out.print("Invalid input. Please enter a valid number: ");
//                scanner.next(); // Clear the invalid input from the scanner
//            }
//            number = scanner.nextInt();
//
//            if (number < min || number > max) {
//                System.out.println("Number out of range. Please try again.");
//            }
//        } while (number < min || number > max);
//
//        return number;
//    }
//}
//
//
//


//public class HelloJava {
//    public static void main(String[] args) {
//        System.out.printIn("hello,java");
//    }
//
//}
//
//
//)


//public class HelloWorld {
//    public static void main(String[] args) {
//        int x = 5 * 4 % 3;
//        System.out.println(x);
//    }
//
////    public String getName() {
//////TODO: return the person's name
////    }
//
//    public void setName(String name) {
////TODO: change the name field to the passed value
//    }
//
//    public void sayHello() {
////TODO: print a message to the console using the person's name
//    }
//}
//
//public class Persons {
//    private String name;
//
//    public Persons(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String newName) {
//        name = newName;
//    }
//
//    public void sayHello() {
//        System.out.println("Hello, my name is " + name);
//    }
//
//    public static void main(String[] args) {
//        // Creating an instance of the Person class
//        Persons person = new Persons("Alice");
//
//        // Using the getName method
//        System.out.println("Original Name: " + person.getName());
//
//        // Using the setName method
//        person.setName("Bob");
//        System.out.println("New Name: " + person.getName());
//
//        // Using the sayHello method
//        person.sayHello();
//    }
//}

//public class ControlFlowExercise{
//    public static void main(String[] args) {
//        int i = 5;  // Create an integer variable i with a value of 5
//
//        // Create a while loop that runs as long as i is less than or equal to 15
//        while (i <= 15) {
//            // Output the current value of i
//            System.out.println("Current value of i: " + i);
//
//            // Increment i by one
//            i++;
//        }
//    }
//}
