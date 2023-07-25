package JAVA13_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            calculatorform();

            System.out.println("원하는 기능 선택");
            int n = input.nextInt();

           
                switch (n) {
                    case 1:
                        System.out.println("첫 번째 숫자를 입력:");
                        int plus1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int plus2 = input.nextInt();
                        int plusresult = plus(plus1, plus2);
                        System.out.println("결과: " + plusresult);
                        break;

                    case 2:
                        System.out.println("첫 번째 숫자를 입력:");
                        int minus1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int minus2 = input.nextInt();
                        int minusresult = minus(minus1, minus2);
                        System.out.println("결과: " + minusresult);
                        break;

                    case 3:
                        System.out.println("첫 번째 숫자를 입력:");
                        int multiplication1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int multiplication2 = input.nextInt();
                        int multiplicationresult = multiplication(multiplication1, multiplication2);
                        System.out.println("결과: " + multiplicationresult);
                        break;

                    case 4:
                        System.out.println("첫 번째 숫자를 입력:");
                        int divide1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int divide2 = input.nextInt();
                        try {
                            int divideresult = divide(divide1, divide2);
                            System.out.println("결과: " + divideresult);
                        } catch (ArithmeticException e) {
                            System.out.println("0으로는 나눌 수 없음");
                        }
                        break;

                    case 5:
                        exit();
                        quit = true;
                        break;
                        
                    default: 
                    	System.out.println("1부터 5까지의 숫자를 입력해주세요");
                }
            }
        }
    

    public static void calculatorform() {
        System.out.println("calculator");
        System.out.println("************************");
        System.out.println("1. 더하기 \t2. 빼기");
        System.out.println("3. 곱하기 \t4. 나누기");
        System.out.println("5. 종료");
        System.out.println("************************");
    }

    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static void exit() {
        System.out.println("종료");
    }
}
