public enum Drinks {
    PEPSİ("pepsi",2.13),
    WINE("wine",22.10),
    WATER("water",2.5),
    JUICE("juice",5.6);

    private String name;
    private double price;

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
