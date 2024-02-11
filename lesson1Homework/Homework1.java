package lesson1Homework;

public class Homework1 {
    public static void main(String[] args) {
        //task 1
        //---------------------------------------
        System.out.println("The first task");
        byte a = 5;
        short b = 32000;
        int c = 2_114_454_825;
        long d = 10_985_545_512L;
        float e = 5.58f;
        double f = 458.45;
        boolean g = true;
        char h = '?';
        String firstName = "Roman";
        String lastName = "Zakharyan";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println("My first name is:" + firstName);
        System.out.println("My surname is:" + lastName);
        System.out.println("----------------------------------------------------------------");
        //task 2
        //---------------------------------------------------------
        System.out.println("The second task");
        int priceOfA = 1000;
        int priceOfB = 500;
        int discount = 100;
        int totalPrice = priceOfA + priceOfB - discount;
        System.out.println("Discount:" + discount);
        System.out.println("Total price:" + totalPrice);
        System.out.println("----------------------------------------------------------------------");
        //task 3
        //
        System.out.println("The third task");
        int a1 = 0;
        int a2 = 1;
        int a3 = 2;
        int a4 = 3;
        int a5 = 4;
        int a6 = 5;
        int a7 = 6;
        int a8 = 7;
        int a9 = 8;
        int a10 = 9;
        int sum = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
        int arithmeticAverage = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10) / 10;
        System.out.println("The sum:" + sum);
        System.out.println("The arithmetc average:" + arithmeticAverage);
        System.out.println("The amount left out by the programme:" + 0.5);
        System.out.println("-------------------------------------------------------------------------");

        //task 4
        //
        System.out.println("The forth task");

        int initialAmountOfMoney = 1250;
        double percentageOfYear = 0.035;
        double moneyInOneYear = initialAmountOfMoney + initialAmountOfMoney * percentageOfYear;
        double moneyInTwoYears = moneyInOneYear + moneyInOneYear * percentageOfYear;
        double moneyInThreeYears = moneyInTwoYears + moneyInTwoYears * percentageOfYear;
        double moneyInFourYears = moneyInThreeYears + moneyInThreeYears * percentageOfYear;
        double moneyInFiveYears = moneyInFourYears + moneyInFourYears * percentageOfYear;
        System.out.println("The amount of money in five years:" + moneyInFiveYears);
        System.out.println("---------------------------------------------------------------");
        //Task 5
        //
        System.out.println("The fifth task");
        int k = 548;
        int firstNumber = k / 100;
        int secondNumber = (k - k / 100 * 100) / 10;
        int thirdNumber = k % 10;
        System.out.println("The first:" + firstNumber);
        System.out.println("The second:" + secondNumber);
        System.out.println("The third:" + thirdNumber);


    }
}
