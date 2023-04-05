package Seminar5;

import java.lang.reflect.InvocationHandler;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Client <-> API <-> Model
    // Client_2

    public static void main(String[] args) {
        // 1.
        // Карта с каким-то размером nxm.
        // На ней можно создать робов, указывая начальное положение.
        // Если начальное положение некорректное ИЛИ эта позиция занята другим робом, то кидаем исключение.
        // Робот имеет направление (вверх, вправо, вниз, влево). У роботов можно менять направление и передвигать их на 1 шаг вперед
        // 2.
        // Написать контроллер к этому коду, который будет выступать посредником между консолью (пользователем) и этой игрой.
        // (0,0)      ------------------            (0, m)
        // ...
        // (n, 0)    -----------------------        (n, m)

        // Robot, Map, Point

        // Домашнее задание:
        // Реализовать чтение команд с консоли и выполнить их в main методе
        // Список команд:
        // create-map 3 5 -- РЕАЛИЗОВАНО!
        // create-robot 2 7
        // move-robot id
        // change-direction id LEFT

        Scanner sc = new Scanner(System.in);
        
        // создаем карту
        System.out.println("Для создания карты введите команду 'create-map n m' где n и m размеры поля");
        RobotMap map = null;
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("create-map")) {
                String[] split = command.split(" "); // [create-map 3 5]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [3 5]

                try {
                    map = new RobotMap(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1]));
                    System.out.println("Карта размером " + Arrays.toString(arguments) + " создана" );
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("При создании карты возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }

        System.out.println("ИГРАЕМ...");
        System.out.println("Доступны следующие команды");
        System.out.println("'Q'  - выход из игры \n'createRobot x y' - создать робота в позиции x y");
        System.out.println("'changeDirection LEFT' - повернуть робота влево \n'changeDirection RIGHT' - повернуть робота вправо");
        System.out.println("'changeDirection TOP' - повернуть робота вверх \n'changeDirection BOTTOM' - повернуть робота вниз");
        System.out.println("'mmove-robot id' сделать роботомId шаг вперед");
        
        // создаем робота в позиции
        while (true) {
            String command = sc.nextLine();
            if (command.startsWith("createRobot")) {
                String[] split = command.split(" "); // [createRobot x y]
                String[] arguments = Arrays.copyOfRange(split, 1, split.length); // [x y]

                try {
                    RobotMap.Robot  robo = map.createRobot(new Point(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
                    System.out.println("Робот  " + robo + " создан" );
                    break;
                } catch (PositionException e) {
                    System.out.println("При создании робота возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        
        // поварачиваем робота
            if (command.startsWith("changeDirection")) {
                String[] split = command.split(" "); // [changeDirection xxx]
                String[] arguments = Arrays.copyOfRange(split, 0, split.length); // [xxx]

                try {
                    RobotMap.Robot  robo = map.createRobot(new Point(Integer.parseInt(arguments[0]), Integer.parseInt(arguments[1])));
                    System.out.println("Робот  " + robo + " создан" );
                    break;
                } catch (PositionException e) {
                    System.out.println("При создании робота возникло исключение: " + e.getMessage() + "." +
                            " Попробуйте еще раз");
                }
            } else {
                System.out.println("Команда не найдена. Попробуйте еще раз");
            }
        }

//        RobotMap.Robot robot1 = null;
//        RobotMap.Robot robot2 = null;
//        try {
//            robot1 = map.createRobot(new Point(2, 5));
//            robot2 = map.createRobot(new Point(4, 5));
//
//            System.out.println(robot1);
//            System.out.println(robot2);
//        } catch (PositionException e) {
//            System.out.println("Во время создания робота случилось исключение: " + e.getMessage());
//        }
//
//        if (robot2 != null) {
//            try {
//                robot2.move();
//            } catch (PositionException e) {
//                System.out.println("Не удалось переместить робота: " + e.getMessage());
//            }
//        }

        // create robot (3, 5)


    }

}
