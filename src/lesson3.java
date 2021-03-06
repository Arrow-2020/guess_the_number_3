import java.util.Random;
import java.util.Scanner;
public class lesson3 {


    public static void main(String[] args)
    {
        lessonGame();

    }
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
     * каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После
     * победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    static void lessonGame()
    {
        int yourAttempts = 3;
        System.out.println("Угадайте число от 0 до 9, у вас " + yourAttempts + " попытки");
        Random random = new Random();
        int randomNumber = random.nextInt(10);



        for (int i = 1; i <= yourAttempts; i++)
        {
            Scanner scanner = new Scanner(System.in);
            int imputNumber = scanner.nextInt();

            /*if(scanner.hasNextInt())          //много было вариантов куда установить этот код но ни один
            {                                   // не верный
                imputNumber = scanner.nextInt();*/


            if  (yourAttempts == i)
            {
                System.out.println("Вы не угадали число ! У вас больше нет попыток(");
                reloadOrExit(scanner);
            } else if (randomNumber == imputNumber)
            {
                System.out.println("Вы угадали число)");
                reloadOrExit(scanner);
            }

            else if (randomNumber < imputNumber)
            {
                System.out.println("Загаданное число меньше");
            }
            else if (imputNumber < randomNumber )
            {
                System.out.println("Загаданное число больше");
            }
            else
            {
                System.out.println("Вы не угали    Осталось " + (yourAttempts - i - 1) + " попытки");
            }
        //}
        }
    }

    static void reloadOrExit(Scanner scanner)
    {
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
        if (scanner.nextInt() == 1)
        {
            lessonGame();
        } else
        {
            System.out.println("Конец Игры");
            scanner.close();
        }
    }
    }
