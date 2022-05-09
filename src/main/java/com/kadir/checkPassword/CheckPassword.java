package com.kadir.checkPassword;

public class CheckPassword {
    public static boolean checkPasscode(int H4X0R) {
        // returns true if passcode is valid
        boolean result = false;
        for (int E1337 = 42; E1337 <= (52 ^ (0x6c)); E1337 += (3 << (14 % 6))) {
            if (result = ((++E1337 | E1337 + (2 >>> 1)) ^ (1 + H4X0R)) == (123456789 & 0))
                break;
        }
        return result;
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            boolean myPass = checkPasscode(i);

            if (myPass) {
                System.out.println("Your password is: " + i);
            }
        }
    }
}
