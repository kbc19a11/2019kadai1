
package iteカフェ;

public class Item {

    private int no;         //商品番号
    private String name;    //商品名  
    private int price;      //価格
    private char size;      //サイズ

    public Item(int no, String name, int price) {  //コンストラクタ作成
        this.no = no;
        this.name = name;
        this.price = price;
    }
    public Item(int no,String name,int price,char size){
        this.no=no;
        this.name=name;
        this.price=price;
        this.size=size;
    }
    
    
    

    
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public int getNo(){return this.no;}
    public void setNo(int no){this.no=no;}
    public int getPrice(){return this.price;}
    public void setPrice(int price){this.price=price;}

    

}
