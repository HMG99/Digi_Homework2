public class Tasks61_70 {
    public static void main(String[] args) {

        boolean t;
        int numb = 4572;

        int a = 4568 / 1000;
        int b = (numb - (a * 1000)) / 100;
        int c = (numb - a * 1000 - b * 100) / 10;
        int d = numb % 10;

//        System.out.println(a + " " + b + " " + c + " " + d);

        //Task 61
        if (c + d == a + b) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //Task 62
        if (numb < 5000) {
            System.out.println(numb / (b + d));
        } else {
            System.out.println(numb / (a + c));
        }

        //Task 63
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        //Task 64
        char y;
        if (c + d == 5) {
            y = 's';
        } else {
            y = 'd';
        }
        System.out.println(y);

        //Task 65
        if (c * d == 12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }

        //Task 66
        if (a == 4 || d == 4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Task 67
        if (numb == Math.pow(a + b + c + d, 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Task 68
        if (d > c) {
            System.out.println(d * b);
        } else {
            System.out.println(1);
        }

        //Task 69
        int y1;
        if (a + b + c + d > 20) {
            y1 = 1;
        } else {
            y1 = 0;
        }
        System.out.println(y1);

        //Task 70
        int y2;
        if(a * b * c * d > 200) {
            y2 = 0;
        }
        else {
            y2 = 1;
        }
        System.out.println(y2);

    }
}
