import java.nio.file.Paths;

public class Tasks51_60 {
    public static void main(String[] args) {

        int numb = 547;

        int a = numb / 100;
        int b = (numb - (a * 100)) / 10;
        int c = numb % 10;
        boolean t;

        //Task 51
        if (c == a + b) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //Task 52
        if (a == b || a == c || b == c) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //Task 53
        int k1 = 876;
        if (numb > k1) {
            System.out.println(numb / (a + b + c));
        } else {
            System.out.println(c / numb);
        }

        //Task 54
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        //Task 55
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        //Task 56
        if (c > b) {
            System.out.println((a + b + c) / numb);
        } else {
            System.out.println(numb);
        }

        //Task 57
        if (numb > 300) {
            System.out.println(b / c);
        } else {
            System.out.println(a / c);
        }

        //Task 58
        char f;
        if (a + b < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);

        //Task 59
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c > a && c > b) {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {

                System.out.println(c + " " + b + " " + a);
            }
        }

        //Task 60
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {

                System.out.println(c + " " + b + " " + a);
            }
        }

    }
}
