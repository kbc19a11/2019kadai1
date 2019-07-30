package iteカフェ;

import static java.lang.System.exit;

public class Pass {

    public static void passWord() {
        int i = 1;
        for (; i < 6;) {
            System.out.println("パスワードを入力してください");
            String input = new java.util.Scanner(System.in).nextLine();
            if (input.equals("p")) {
                break;
            } else {
                System.out.println("パスワードが違います。("+i+")");
                i++;
            }
        }
        if (i == 6) {
            System.out.println("システムを終了します。");
            exit(0);
        }
    }

}
