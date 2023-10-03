// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     /*Задача 1
Необходимо присвоить переменным разные значения.
Для решения этой задачи используйте тип переменной var.

В программе IDEA в новом созданном вами проекте присвойте:

переменной dog значение 8.0;
переменной cat значение 3.6;
переменной paper значение 763789.
     * */

        var dog=8.0;
        var cat=3.6;
        var paper=76789;
        System.out.println("dog=\t"+dog+"\ncat=\t"+cat+"\npaper=\t"+paper);
        System.out.println("======================================================");
        /*Задача 2
        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
        Для решения этой задачи используйте тип переменной var.

        Выведите в консоль новые значения переменных.
        * */
         dog+=4;
         cat+=4;
         paper+=4;
        System.out.println("dog=\t"+dog+"\ncat=\t"+cat+"\npaper=\t"+paper);
        System.out.println("======================================================");
       /* Теперь нужно уменьшить значение каждой переменной:

        dog уменьшить на 3.5;
        cat уменьшить на 1.6;
        paper уменьшить на 7639.*/
        dog-=3.5;
        cat-=1.6;
        paper-=7639;
        System.out.println("dog=\t"+dog+"\ncat=\t"+cat+"\npaper=\t"+paper);
        System.out.println("======================================================");
        /*Задача 4
    Инициализируйте (присвойте значение) переменную friend значением 19.

    Увеличьте значение переменной на 2, после чего поделите значение на 7.

    После каждой операции выводите значение переменной в консоль.
    В итоге у вас должно быть выведено 3 значения одной переменной.

    Для решения этой задачи используйте тип переменной var.*/
        var friend=19;
        System.out.println(friend);
        friend+=2;
        System.out.println(friend);
        friend/=7;
        System.out.println(friend);
        System.out.println("======================================================");
        /*Задача 5
    Инициализируйте переменную frog значением 3.5.

    Увеличьте переменную в 10 раз и поделите на 3.5.
    Добавьте к последнему значению переменной 4.

    После каждой операции выводите значение переменной в консоль.
    В итоге у вас должно быть выведено 4 значения одной переменной.*/
        var frog=3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);
        System.out.println("======================================================");
        /*В боксе перед каждым боем спортсменов взвешивают.
        Это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории и
         бой будет честным.
        Масса одного боксера — 78.2 кг.
        Масса второго боксера — 82.7 кг.
        Подсчитайте и выведите в консоль общую массу двух бойцов.
        Подсчитайте и выведите в консоль разницу между массами бойцов.
        Для решения этой задачи используйте тип переменной var.*/
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var sumBoxerWeight=firstBoxerWeight+secondBoxerWeight;
        var differenceBoxerWeight=secondBoxerWeight-firstBoxerWeight;
        System.out.println("Масса одного боксера —\t"+firstBoxerWeight+"\nМасса второго боксера — \t"+
                secondBoxerWeight+ "\nобщая масса двух бойцов-\t"+sumBoxerWeight+
                "\nразница между массами бойцов-\t"+ differenceBoxerWeight);
        System.out.println("======================================================");
        /*Задача 7
        Вычислите разницу масс спортсменов, используйте 2 способа:
        Вычитание из большей массы меньшей.
        С помощь функции остаток от деления.*/
        var differenceBoxerWeightDivision=secondBoxerWeight%firstBoxerWeight;
        System.out.println("разницу масс спортсменов->\t"+differenceBoxerWeightDivision);
        System.out.println("======================================================");
        /*Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        640 часов работы поделено между сотрудниками.
        Если каждый сотрудник посвящает работе 8 часов, то сколько всего работников в компании?
        Выведите результат задачи в консоль в формате: «Всего работников в компании — … человек».
        Посчитайте, сколько часов работы должно быть поделено между сотрудниками,
        если в компании работает на 94 человека больше.
        Выведите результат задачи в консоль в формате: «Если в компании работает … человек,
        то всего … часов работы может быть поделено между сотрудниками».*/
        var totaiWorcingTime=640;
        var worcingHours=8;
        var countWorker=totaiWorcingTime/worcingHours;
        var additionalWorkers=94;
        var allWorkers=additionalWorkers+countWorker;
        var newWorcingHours=totaiWorcingTime/allWorkers;
        System.out.println(totaiWorcingTime+"  часов работы поделено между сотрудниками\n,"+
         "Если каждый сотрудник посвящает работе по "+worcingHours+" часов ,то  всего работников в компании -"
        +countWorker+".\nесли в компании работает на " +
                additionalWorkers+" сотрудника больше,то по "+newWorcingHours+
                " часа работы ,будет поделено между сотрудниками");
        System.out.println("======================================================");

    }
}