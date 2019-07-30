package iteカフェ;

public class Instance {

    public static Item[] ins() {
        //準備
        Item hotcoffee = new Item(1, "ホットコーヒー", 200);           //ホットコーヒーインスタンス作成
        Item tea = new Item(2, "紅茶", 260);                 //紅茶インスタンス作成
        Item iceCoffee = new Item(3, "アイスコーヒー", 200);
        Item iceTea = new Item(4, "アイスティー", 260);
        Item shortCake = new Item(5, "ショートケーキ", 400);
        Item cheeseCake = new Item(6, "チーズケーキ", 400);
        Item chocolateCake = new Item(7, "チョコレートケーキ", 450);
        Item chocobananaParfait = new Item(8, "チョコバナナパパフェ", 390);
        Item strawberryParfait = new Item(9, "イチゴパフェ", 390);

        //配列作成
        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = iceCoffee;
        items[3] = iceTea;
        items[4] = shortCake;
        items[5] = cheeseCake;
        items[6] = chocolateCake;
        items[7] = chocobananaParfait;
        items[8] = strawberryParfait;
        return items;
    }
}
