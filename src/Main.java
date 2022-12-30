public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 5:");
        task1(18);
        task2(7);
        task3(90);
        task4(19);
        task5(7);
        task6(70, 60);
        task7(1, 1, 1);
    }

    public static void task1(int age) {
        System.out.println("Task1:");
        if (age >= 18) {
            System.out.println(" Человек совершеннолетний.");
        } else {
            System.out.println(" Человек не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2(int temperature) {
        System.out.println("Task2:");
        if (temperature >= 5) {
            System.out.println(" Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println(" На улице холодно, нужно надеть шапку.");
        }
    }

    public static void task3(int speed) {
        System.out.println("Task3:");
        if (speed > 60) {
            System.out.println(" Скорость превышена, прийдется заплатить штраф.");
        } else {
            System.out.println(" Превышения скорости нет, можно ездить спокойно.");
        }
    }

    public static void task4(int age) {
        System.out.println("Task4:");
        if (age >= 2 && age <= 6) {
            System.out.println(" Нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println(" Нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println(" Нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println(" Нужно ходить на работу.");
        }
    }

    public static void task5(int age) {
        System.out.println("Task5:");
        if (age < 5) {
            System.out.println(" Ребенок не может кататься на атракционах.");
        } else if (age < 14) {
            System.out.println(" Ребенок может кататься только в сопровождении взрослого.");
        } else {
            System.out.println(" Ребенок может кататься без сопровождения взрослого.");
        }
    }

    public static void task6(int cntPeopleSit, int cntPeopleStay) {
        System.out.println("Task6:");
        int maxCapacitySit = 60, maxCapacityStay = 42;
        int availableSit = cntPeopleSit < maxCapacitySit ? maxCapacitySit - cntPeopleSit : 0;
        int availableStay = cntPeopleStay < maxCapacityStay ? maxCapacityStay - cntPeopleStay : 0;
        System.out.printf(" Всего доступно: %s - сидящих мест и %s - стоячих мест.\n", availableSit, availableStay);
    }

    public static void task7(int one, int two, int three) {
        System.out.println("Task7:");
        if (one > two) {
            if (one > three) {
                System.out.println(" Максимальное число - " + one);
            } else {
                System.out.println(" Максимальное число - " + three);
            }
        } else {
            if (two > three) {
                System.out.println(" Максимальное число - " + two);
            } else {
                System.out.println(" Максимальное число - " + three);
            }
        }
    }
}