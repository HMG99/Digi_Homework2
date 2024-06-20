import java.nio.file.Paths;

public class Tasks31_40 {
    public static void main(String[] args) {

        int a = 50;
        int b = 22;
        int c = 35;
        int d = 62;

        //Task 31

        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        //Task 32

        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        //Task 33
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 34
        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 35
        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //Task 36
        if (a % 2 == 1 && (b % 2 == 1 || c % 2 == 1 || d % 2 == 1) ||
                b % 2 == 1 && (c % 2 == 1 || d % 2 == 1) ||
                c % 2 == 1 && d % 2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        //Task 37
        if (a - b == b - c && b - c == c - d || a - b == b - d && b - d == d - c || a - c == c - b && c - b == b - d ||
                a - c == c - d && c - d == d - b || a - d == d - c && d - c == c - b || a - d == d - b && d - b == b - c || //abcd abdc acbd acdb adcb adbc
                b - a == a - c && a - c == c - d || b - a == a - d && a - d == d - c || b - c == c - a && c - a == a - d ||
                b - c == c - d && c - d == d - c || b - d == d - a && d - a == a - c || b - d == d - c && d - c == c - a || //bacd badc bcad bcda bdac bdca
                c - a == a - b && a - b == b - d || c - a == a - c && a - c == d - b || c - b == b - a && b - a == a - d ||
                c - b == b - d && b - d == d - a || c - d == d - a && d - a == a - b || c - d == d - b && d - b == b - a || // cabd cadb cbad cbda cdab cdba
                d - a == a - b && a - b == b - c || d - a == a - c && a - c == c - b || d - b == b - a && b - a == a - c ||
                d - b == b - c && b - c == c - a || d - c == c - a && c - a == a - b || d - c == c - b && c - b == b - a) { //dabc dacb dbac dbca dcab dcba

            System.out.println(true);

        } else {
            System.out.println(false);
        }


        //Task 38
        if (a / b == b / c && b / c == c / d || a / b == b / d && b / d == d / c || a / c == c / b && c / b == b / d ||
                a / c == c / d && c / d == d / b || a / d == d / c && d / c == c / b || a / d == d / b && d / b == b / c || //abcd abdc acbd acdb adcb adbc
                b / a == a / c && a / c == c / d || b / a == a / d && a / d == d / c || b / c == c / a && c / a == a / d ||
                b / c == c / d && c / d == d / c || b / d == d / a && d / a == a / c || b / d == d / c && d / c == c / a || //bacd badc bcad bcda bdac bdca
                c / a == a / b && a / b == b / d || c / a == a / c && a / c == d / b || c / b == b / a && b / a == a / d ||
                c / b == b / d && b / d == d / a || c / d == d / a && d / a == a / b || c / d == d / b && d / b == b / a || // cabd cadb cbad cbda cdab cdba
                d / a == a / b && a / b == b / c || d / a == a / c && a / c == c / b || d / b == b / a && b / a == a / c ||
                d / b == b / c && b / c == c / a || d / c == c / a && c / a == a / b || d / c == c / b && c / b == b / a) { //dabc dacb dbac dbca dcab dcba

            System.out.println(true);

        } else {
            System.out.println(false);
        }


        //Task 39
        if (a < b && a < c && a < d) {
            if (b < c && b < d) {
                if (c < d) {
                    System.out.println(a + " " + b + " " + c + " " + d);
                } else {
                    System.out.println(a + " " + b + " " + d + " " + c);
                }
            } else if (c < b && c < d) {
                if (b < d) {
                    System.out.println(a + " " + c + " " + b + " " + d);
                } else {
                    System.out.println(a + " " + c + " " + d + " " + b);
                }
            } else if (d < b && d < c) {
                if (b < c) {
                    System.out.println(a + " " + d + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + d + " " + c + " " + b);
                }
            }
        } else if (b < a && b < c && b < d) {
            if (a < c && a < d) {
                if (c < d) {
                    System.out.println(b + " " + a + " " + c + " " + d);
                } else {
                    System.out.println(b + " " + a + " " + d + " " + c);
                }
            } else if (c < a && c < d) {
                if (a < d) {
                    System.out.println(b + " " + c + " " + a + " " + d);
                } else {
                    System.out.println(b + " " + c + " " + d + " " + a);
                }
            } else if (d < a && d < c) {
                if (a < c) {
                    System.out.println(b + " " + d + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + d + " " + c + " " + a);
                }
            }
        } else if (c < a && c < b && c < d) {
            if (a < b && a < d) {
                if (b < d) {
                    System.out.println(c + " " + a + " " + b + " " + d);
                } else {
                    System.out.println(c + " " + a + " " + d + " " + b);
                }
            } else if (b < a && b < d) {
                if (a < d) {
                    System.out.println(c + " " + b + " " + a + " " + d);
                } else {
                    System.out.println(c + " " + b + " " + d + " " + a);
                }
            } else if (d < a && d < b) {
                if (a < b) {
                    System.out.println(c + " " + d + " " + a + " " + b);
                } else {
                    System.out.println(c + " " + d + " " + b + " " + a);
                }
            }
        } else if (d < a && d < b && d < c) {
            if (a < b && a < c) {
                if (b < c) {
                    System.out.println(d + " " + a + " " + b + " " + c);
                } else {
                    System.out.println(d + " " + a + " " + c + " " + b);
                }
            }
            if (b < a && b < c) {
                if (a < c) {
                    System.out.println(d + " " + b + " " + a + " " + c);
                } else {
                    System.out.println(d + " " + b + " " + c + " " + a);
                }
            }
            if (c < a && c < b) {
                if (a < b) {
                    System.out.println(d + " " + c + " " + a + " " + b);
                } else {
                    System.out.println(d + " " + c + " " + b + " " + a);
                }
            }
        }


        //Task 40
        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                if (c > d) {
                    System.out.println(a + " " + b + " " + c + " " + d);
                } else {
                    System.out.println(a + " " + b + " " + d + " " + c);
                }
            } else if (c > b && c > d) {
                if (b > d) {
                    System.out.println(a + " " + c + " " + b + " " + d);
                } else {
                    System.out.println(a + " " + c + " " + d + " " + b);
                }
            } else if (d > b && d > c) {
                if (b > c) {
                    System.out.println(a + " " + d + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + d + " " + c + " " + b);
                }
            }
        } else if (b > a && b > c && b > d) {
            if (a > c && a > d) {
                if (c > d) {
                    System.out.println(b + " " + a + " " + c + " " + d);
                } else {
                    System.out.println(b + " " + a + " " + d + " " + c);
                }
            } else if (c > a && c > d) {
                if (a > d) {
                    System.out.println(b + " " + c + " " + a + " " + d);
                } else {
                    System.out.println(b + " " + c + " " + d + " " + a);
                }
            } else if (d > a && d > c) {
                if (a > c) {
                    System.out.println(b + " " + d + " " + a + " " + c);
                } else {
                    System.out.println(b + " " + d + " " + c + " " + a);
                }
            }
        } else if (c > a && c > b && c > d) {
            if (a > b && a > d) {
                if (b > d) {
                    System.out.println(c + " " + a + " " + b + " " + d);
                } else {
                    System.out.println(c + " " + a + " " + d + " " + b);
                }
            } else if (b > a && b > d) {
                if (a > d) {
                    System.out.println(c + " " + b + " " + a + " " + d);
                } else {
                    System.out.println(c + " " + b + " " + d + " " + a);
                }
            } else if (d > a && d > b) {
                if (a > b) {
                    System.out.println(c + " " + d + " " + a + " " + b);
                } else {
                    System.out.println(c + " " + d + " " + b + " " + a);
                }
            }
        } else if (d > a && d > b && d > c) {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.println(d + " " + a + " " + b + " " + c);
                } else {
                    System.out.println(d + " " + a + " " + c + " " + b);
                }
            }
            if (b > a && b > c) {
                if (a > c) {
                    System.out.println(d + " " + b + " " + a + " " + c);
                } else {
                    System.out.println(d + " " + b + " " + c + " " + a);
                }
            }
            if (c > a && c > b) {
                if (a > b) {
                    System.out.println(d + " " + c + " " + a + " " + b);
                } else {
                    System.out.println(d + " " + c + " " + b + " " + a);
                }
            }
        }

    }
}
