package com.company;


/*
public class Bits {
    public static void main(String[] args) {

        int n = 1011;
        int temp = n;
        int i = 0, d = 0;

        while (temp > 0) {

            int split = temp % 10;
            temp = temp / 10;
            d = d + split * (int) Math.pow(2, i++);

        }

        System.out.println(d);

    }
}

 *///bit to decimal value

/*
class Set_or_not{
    public static void main(String[] args) {
        int m, n;
        String x = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();

        while (n > 0) {
            int a = n % 2;
            x = a + x;
            n = n / 2;
        }
        System.out.println("enter position to check");
        int l = x.length();
        m = sc.nextInt();

        if ((l - m) >= 0 && (x.charAt(l - m) == '1')){
            System.out.println("1 is present :-SET");
    }
        else System.out.println("1 not present :-NOT_SET");
    }
}

 *///set or not
