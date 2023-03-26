public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        System.out.println ("задача7-8");
        var man1 = 78.2;
        var man2 = 82.7;
        var totalWeight = man1 + man2;
        var weightDfference = man2 % man1;
        System.out.println ("Общий вес бойцов " + totalWeight + " кг");
        System.out.println ("Разница в весе " + weightDfference + " кг");

        System.out.println ("задача 8");

        var totalTime = 640;
        var quota = 8;
        var staff = totalTime / quota;
        System.out.println ("Общее время " + totalTime);
        System.out.println ("норма в день " + quota);
        System.out.println ("Всего работников в компании - " + staff + " человек");
        System.out.println ("Если работников на 94 больше, то:");
        var staffBetter = staff + 94;
        var totalTime2 = (staffBetter * quota);
        System.out.println (totalTime2 + " часов работы поделят между собой сотрудники.");









    }
}
