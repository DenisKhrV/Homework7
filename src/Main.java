public class Main {

    public static void main(String[] args){

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");

        int deposit = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total = total + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");

        int number = 1;
        while (number <= 10){
            System.out.print(number + " ");
            number = number + 1;
        }

        System.out.println();

        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
    }

    public static void task3(){
        System.out.println("Задача 3");

        int populationY = 12_000_000;
        int fertility = populationY / 1000 * 17;
        int mortality = populationY / 1000 * 8;
        int year = 1;
        while (year <= 10) {
            populationY = populationY + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
            year = year + 1;
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deposit = 15000;
        int month = 0;

        while (deposit < 12_0000_000){
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            System.out.println("Месяц "+month+". Накопления "+deposit+ " рублей.");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int deposit = 15000;
        int month = 0;

        while (deposit < 12_0000_000){
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            if(month % 6 == 0) {
                System.out.println("Месяц " + month + ". Накопления " + deposit + " рублей.");
            }
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        int deposit = 15000;
        int month = 0;
        int nineYear = 12 * 9;

        while (month < nineYear){
            deposit = deposit + deposit / 100 * 7;
            month = month + 1;
            if(month % 6 == 0) {
                System.out.println("Месяц " + month + ". Накопления " + deposit + " рублей.");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int day = 0;
        int friday = 6;
        int week = 7;

        while (day <= 31) {
            day = day + 1;
            if (day % week == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8(){
        System.out.println("Задача 8");
        int year = 0;
        int startYear = 1942;
        int yearComet = 79;
        int last200Year = 200;
        int next100Year = 100;
        int checkYear = startYear + next100Year;

        while (year < checkYear) {
            year = year + yearComet;
            if (year) {
                System.out.println(year);
            }
        }
    }

}