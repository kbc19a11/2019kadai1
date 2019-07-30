package iteカフェ;

import java.util.Scanner;

public class Calculation {

    public static void calc(Item items[]) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("いらっしゃいませ！");
            System.out.println("◆◆◆ITECafeシステム◆◆◆");
            int inputQan = 0;  //数量
            int inputNum;  //入力された商品番号
            int sum = 0;
            double tax = 0.08;
            //商品名を表示
            try {
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getNo() + ":" + items[i].getName() + " " + items[i].getPrice());
                }
            } catch (NullPointerException e) {

            }

            while (true) {
                //商品番号を入力する
                System.out.println("商品番号を入力してください");

                try {
                    String inputStr;
                    inputStr = scan.next();
                    inputNum = Integer.parseInt(inputStr);
                    System.out.println("数量を入力してください");

                    try {
                        String inputSum;
                        inputSum = scan.next();//数量を入力
                        inputQan = Integer.parseInt(inputSum);
                        System.out.println(items[inputNum - 1].getNo() + ":" + items[inputNum - 1].getName() + "" + items[inputNum - 1].getPrice() * inputQan + "円が入力されました");
                    } catch (NumberFormatException e) {
                        System.out.println("入力エラー：もう1度入力してください。");
                    }
                    sum += items[inputNum - 1].getPrice() * inputQan;
                    //正しく処理されたらループを抜ける

                } catch (NumberFormatException e) {
                    System.out.println("入力エラー：もう1度入力してください。");

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("入力エラー：商品番号が設定されてない番号です。");
                } catch (NullPointerException e) {
                    System.out.println("入力エラー：商品番号が設定されてない番号"
                            + "です。");
                }
                //会計OR続き
                System.out.println("注文は以上ですか？");
                System.out.println("1:はい　2:いいえ");
                String end = new java.util.Scanner(System.in).next();
                int END;
                try {
                    END = Integer.parseInt(end);        //文字列型のendをint型に変換
                    if (END == 1) {
                        break;
                    } else {
                        continue;

                    }

                } catch (NumberFormatException e) {
                    System.out.println("正しく入力してください");

                }

            }
            sum += sum * tax;
            if (sum == 0) {
                System.out.println("エラー:代金が0円です");
                continue;
            }
            System.out.println("お会計は" + sum + "円です");
            while (true) {
                System.out.println("預かった金額を入力してください。");
                try {
                    int daikin = new java.util.Scanner(System.in).nextInt();
                    int oturi = daikin - sum;
                    if (oturi == 0) {
                        System.out.println(daikin + "円丁度お預かりします。");
                        System.out.println("ありがとうございました。");
                        break;
                    } else if (oturi < 0) {
                        System.out.println("入力エラー：金額が足りません。");

                    } else {
                        System.out.println(daikin + "円お預かりします。");
                        System.out.println(oturi + "円のお返しです。");
                        System.out.println("ありがとうございました。");
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("入力エラー：もう一度入力してください。");
                }
            }
        }

    }
}
