public class Main {

    // task1: mathematical tasks
    public static void main(String[] args)
    {
        int wynik1, wynik2, wynik3, wynik4, wynik5, wynik6;
        int l1 = 15;
        int l2 = 10;
        char letter = 'a';
        wynik1 = l1+l2;
        wynik2 = l1-l2;
        wynik3 = l1*l2;
        wynik4 = l1/l2;
        wynik5 = l1%l2;
        wynik6 = letter-l1;
        System.out.println("Wynik = " + wynik1);
        System.out.println("Wynik = " + wynik2);
        System.out.println("Wynik = " + wynik3);
        System.out.println("Wynik = " + wynik4);
        System.out.println("Wynik = " + wynik5);
        wynik5++;
        wynik5++;
        System.out.println("Wynik = " + wynik5);
        wynik1--;
        System.out.println("Wynik = " + wynik1);
        System.out.println("Wynik = " + wynik6);
        wynik6--;
        System.out.println("Wynik = " + wynik6);

        //circle field r = 47:
        float wynik7;
        float pi = 3.14f;
        int r = 47;
        wynik7 = pi * r * r;
        System.out.println("Wynik = " + wynik7);
    }
}


