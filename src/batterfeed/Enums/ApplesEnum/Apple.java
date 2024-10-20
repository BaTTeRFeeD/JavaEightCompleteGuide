package batterfeed.Enums.ApplesEnum;

public enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple(int price){ this.price = price; }
    Apple(){price = -1;}

    int getPrice(){return price;}
}
