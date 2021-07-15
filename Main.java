import javax.sound.sampled.Line;

public class Main {

    public static void main(String[] args) {
        One(5, 10);
        Two(-1);
        Three(1);
        Four();
        Five(4);


    }

    // Задание 1.
    static boolean One(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    //Задание 2.
    static void Two(int a) {
        if (a >= 0) {
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }
    }

    //Задание 3.
    static boolean Three(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    //Задание 4.
    static void Four() {
        int a = 3;
        String Line;

        for (int i = 0; i < a; i++) {
            System.out.println("Line");
        }
    }

    //Задание 5.
    static boolean Five(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ;
        {
            return true;
        }


    }

}






