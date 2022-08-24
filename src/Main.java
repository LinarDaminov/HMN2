public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println( " Задача 1 " );
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Task 2
        System.out.println( " Задача 2 ");
        dog = dog + 4 ;
        cat = cat + 4 ;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);



        //Task 3
        System.out.println( " Задача 3 ");
        dog = dog - 3.5 ;
        cat = cat - 1.6 ;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        System.out.println( " Задача 4 ");
        var friend = 19;
        System.out.println(friend);
        friend =friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        //Task 5
        System.out.println(" Задача 5 ");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Task 6,7
        System.out.println( "Задача 6,7");
        var Man_a = 78.2;
        var Man_b = 82.7;
        var summ = Man_a + Man_b;
        System.out.println( " Общий вес спортсменов " + summ + " кг ");
        // 1 способ
        var differense = Man_b - Man_a  ;
        System.out.println(" Разница в весе " + differense + " кг " );
        // 2 способ
        var differense2 = Man_b % Man_a  ;
        System.out.println(" Разница в весе " + differense2 + " кг " );

        // 3 способ
        var differense3 = Math.abs(Man_a - Man_b ) ;
        System.out.println(" Разница в весе " + differense3 + " кг " );

        //Task 8
        System.out.println("Задача 8 ");
        var Total = 640;
        var staff = Total / 8 ;
        System.out.println("Всего работников в компании " + staff + " человек ") ;

        var bigStaff = staff + 94;
        System.out.println( "При увеличении численности персонала на 94 человека в компании будет работать "
                + bigStaff +  " человека ");
        var time = bigStaff * 8;
        System.out.println( " Если в компании работает " + bigStaff +  " человека, то всего " + time +
                " часов работы может быть поделено между сотрудниками");
}
}