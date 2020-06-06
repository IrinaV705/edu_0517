package com.company;
import java.util.Collection;
import static java.util.Collections.min;
public class Main {
            public static int min(int a, int b, int c, int d) {
                int min;
                if (a<b & a<c & a<d)
                    min =a;
                else if (b<a & b<c & b<d)
                    min =b;
                else if (c<a & c<b & c<d)
                    min =c;
                else min =d;
                return min;

            }
    public static void main(String[] args) throws Exception {

        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
            }


        }
