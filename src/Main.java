public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Решение задачи 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +age+ " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " +age+ " то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Решение задачи 2");
        int tempichar = 10;
        if (tempichar >= 5) {
            System.out.println("На улице " +tempichar+ " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " +tempichar+ " градусов, нужно надеть шапку.");
        }
    }
    public static void task3() {
        System.out.println("Решение задачи 3");
        int speed = 65;
        if (speed > 60) {
            System.out.println("Если скорость " +speed+ " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " +speed+ " км?/ч, то можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Решение задачи 4");
        int age = 20;
        if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " +age+ ", то ему нужно ходить школу.");
        }
        if (age >=7 && age <= 24) {
            System.out.println("Если возраст человека равен " +age+ ", то его место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " +age+ ", то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Решение задачи 5");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " +age+ ", то он не может кататься на аттракционе.");
        }
        if (age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " +age+ ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age>=14){
            System.out.println("Если возраст ребенка равен " +age+ ", то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Решение задачи 6");
        int peapleComeTrain = 55;
        int plaseInTrain = 102;
        int seatPlace = 60;
        if (peapleComeTrain <= plaseInTrain){
            if (peapleComeTrain>=60){
                int standingRoom = plaseInTrain - peapleComeTrain;
                System.out.println("Сидячих мест нет, стоячих мест: "+standingRoom+".");}
            else {
                    int standingRoom = plaseInTrain - peapleComeTrain;
                    int seatPlace2 = seatPlace - peapleComeTrain ;{
                    System.out.println("Сидячих мест "+seatPlace2+", стоячих мест: "+standingRoom+".");
                }}
        }
        else {
            System.out.println("Свободных мест нет!");
        }
    }
    public static void task7() {
        System.out.println("Решение задачи 7");
        int one = 12;
        int two = 19;
        int three = 0;
        if (one>two && one>three){
            System.out.println("Число "+one+" больше.");
        }
        if (two>one && two>three){
            System.out.println("Число "+two+" больше.");
        }
        else {
            System.out.println("Число "+three+" больше.");
        }
    }
}