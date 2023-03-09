
//1.Вычислить n-ое треугольного число
//(сумма чисел от 1 до n), 
//а так же n! (произведение чисел от 1 до n)
//Ввод:5
//Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//n! 1 * 2 * 3 * 4 * 5 = 120


// package java_home;

// import java.util.Scanner;
// public class job_1 {

//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in, "Cp866");
//         System.out.println("Введите число: ");
//         int result = iScanner.nextInt();
//             long sum = 0;
//             long proiz = 1;
            
//         for (int i = 1; i <= result; i++) {
//         sum += i;
//         } 
//         System.out.println(sum);
//         for (int i = 1; i <= result; i++) {
//             proiz*= i;
//             } 
//         System.out.println(proiz);
//     }
// }




//2.Вывести все простые числа от 1 до 1000
// package java_home;

/**
 Простое число — это число, 
 которое делится только на 1 или на себя.
 */
// public class job_1 {

// public static void main(String[] args) {
//     for(int i = 2; i <= 1000; i++){
//         boolean isPrime = true;
//         for(int j = 2; j < i; j++)
//         if(i % j == 0) {
//             isPrime = false;
//             break;
//         }
//         if(isPrime) {
//             System.out.println(i);
//         }
//     }
// }}


//3.Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

// package java_home;
// import java.util.Scanner;

// /**
//  * job_1
//  */
// public class job_1 {
//     static Scanner scanner = new Scanner(System.in, "Cp866");
//     public static void main(String[] args) {
//         int num1 = getInt();
//         int num2 = getInt();
//         char operation = getOperation();
//         int result = calc(num1, num2, operation);
//         System.out.println("Результат операции: " + result);
//     }    

//     public static int getInt() {
//         System.out.println("Введите число: ");
//         int num;
//         if (scanner.hasNextInt()){
//             num = scanner.nextInt();
//         }else {
//             System.out.println("Попробуйте еще раз: ");
//             scanner.next();
//             num = getInt();
//         }
//         return num;
//     } 
//     public static char getOperation() {
//         System.out.println("Введите знак: ");
//         char operation;
//         if(scanner.hasNext()){
//             operation = scanner.next().charAt(0);
//         }else {
//             System.out.println("Ошибка.Попробуйте еще раз! ");
//             scanner.next();
//             operation = getOperation();
//         }
//         return operation;
//     } 
    
//     public static int calc (int num1, int num2, char operation) {
//         int result;
//         switch (operation) {
//             case '+':
//                 result = num1 + num2;
//                 break;       
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.println();
//                 result = calc(num1, num2, getOperation());
//         }
//         return result;
//     } 
// }           