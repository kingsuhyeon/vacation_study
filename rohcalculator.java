import java.util.Scanner;

public class rohcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;

        while (!quit){
            calculator();

            System.out.println("원하는 기능 선택");
            int n = input.nextInt();

            if (n<1||n>5){
                System.out.println("1부터 5까지의 숫자를 입력");
            }else{
                switch (n){
                    case 1: System.out.println("첫 번째 숫자를 입력:");
                        int plus1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int plus2 = input.nextInt();
                        int plusresult = plus(plus1, plus2);
                        System.out.println("결과: " + plusresult);
                        break;
                    case 2: System.out.println("첫 번째 숫자를 입력:");
                        int minus1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int minus2 = input.nextInt();
                        int minusresult = minus(minus1,minus2);
                        System.out.println("결과: " + minusresult);
                        break;
                    case 3: System.out.println("첫 번째 숫자를 입력:");
                        int times1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int times2 = input.nextInt();
                        int timesresult = times(times1,times2);
                        System.out.println("결과: " + timesresult);
                        break;
                    case 4:System.out.println("첫 번째 숫자를 입력:");
                        int divide1 = input.nextInt();
                        System.out.println("두 번째 숫자를 입력:");
                        int divide2 = input.nextInt();
                        int divideresult = divide(divide1,divide2);
                        System.out.println("결과: " + divideresult);
                        break;
                    case 5: exit();
                    quit=true;
                    break;

                }
            }


        }
    }

    public static void calculator() {
        System.out.println("calculator");
        System.out.println("************************");
        System.out.println("1. 더하기 \t2. 빼기");
        System.out.println("3. 곱하기 \t4. 나누기");
        System.out.println("5. 종료");
        System.out.println("************************");
    }
    public static int plus(int x , int y){
        return x+y;
    }
    public static int minus(int x, int y){
        return x-y;
    }
    public static int times(int x, int y){
        return x*y;
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static void exit(){
        System.out.println("종료");
    }
}
