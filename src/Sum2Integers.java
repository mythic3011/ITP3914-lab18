
/*
 * Copyright (c) 2023. Li Ning @samwell9624
 * All rights reserved.
 */

public class Sum2Integers {
    public static void main(String[] args) {
        int total = 0;
        String num = "";
        if (args.length == 0) {
            System.out.println("No input!");
        } else {
            for (int i = 0; i < args.length; i++) {
                total += Integer.parseInt(args[i]);
                if (!(i == args.length - 1)) {
                    num += Integer.parseInt(args[i]) + " + ";
                } else {
                    num += Integer.parseInt(args[i]);
                }
            }
            System.out.println(num + " = " + total);
        }
    }
}
