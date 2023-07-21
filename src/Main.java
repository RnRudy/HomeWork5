public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("\n" + "Задача 1" + "\n");
        int clientOs = 0 + (int) (Math.random() * 2);
        switch (clientOs) {
            case 0: {
                System.out.println("Установите приложение для iOS по ссылке.");
            }
            break;
            case 1: {
                System.out.println("Установите приложение для Android по ссылке.");
            }
            break;
        }

    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        int clientOS = (int) (Math.random() * 2);
        int clientDeviceYear = 2012 + (int) (Math.random() * 6);
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию для iOS по ссылке.");

        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");
        int year = 2304;
        /* Логика: Каждый 4-й год является високосным —> year % 4 == 0;
         * далее: каждый 100-й год не равен не является високосным —> year % 100 != 0;
         * но каждый 400-й год — високосный —> year % 400 == 0; */

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        int deliveryDistance = 0 + (int) (Math.random() * 103);
        int deliveryDays1 = 1;
        int deliveryDays2 = 2;
        int deliveryDays3 = 3;
        System.out.println("Расстояние: " + deliveryDistance + " км.");
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            System.out.println("Потребуется: " + deliveryDays1 + " день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется: " + deliveryDays2 + " дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется: " + deliveryDays3 + " дня.");
        } else {
            System.out.println("Доставка не осуществляетя.");
        }

    }

    public static void task5() {
        System.out.println("\n" + "Задача 5" + "\n");
        int monthNumber = 1 + (int) (Math.random() * 14);
        switch (monthNumber) {
            case 12:
            case 1:
            case 2: {
                System.out.println(monthNumber +"-й месяц принадлежит к сезону зима.");
            }
            break;
            case 3:
            case 4:
            case 5: {
                System.out.println(monthNumber +"-й месяц принадлежит к сезону весна.");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println(monthNumber +"-й месяц принадлежит к сезону лето.");
            }
            break;
            case 9:
            case 10:
            case 11: {
                System.out.println(monthNumber +"-й месяц принадлежит к сезону осень.");
            }
            break;
            default: {
                System.out.println(monthNumber +"-й месяц." + " Такого месяца не сущестует! Проверьте точность ведённых данных!");
            }

        }

    }

}
