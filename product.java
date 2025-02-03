
 class product {
    private int id;
    private String name;
    private double price;
    public product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        product product1 = new product(101, "Laptop", 75000);

        product1.displayProductDetails();
    }
}
