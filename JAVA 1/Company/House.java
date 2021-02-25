package Company;

public enum House {
    House101(900000),House103(150000),House105(5000000),House111(356000),House114(1000002);
    int price;
    House(int p)
    {
        price = p;
    }
    int getPrice()
    {
        return price;
    }
}

