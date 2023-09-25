import model.Product;
class Main {
    public static void main(String[] args) {
        // Create a new instance of the Product class
        Product product = new Product("Widget", 25.99, 10);

        // Test the newly implemented methods
        System.out.println("Product Information:");
        System.out.println(product); // This will call the overridden toString() method

        // Check if the product is out of stock
        if (product.isOutOfStock()) {
            System.out.println("Product is out of stock.");
        } else {
            System.out.println("Product is in stock.");
        }

        // Check if the price is greater than a specified value
        double targetPrice = 30.0;
        if (product.isPriceGreaterThan(targetPrice)) {
            System.out.println("Product price is greater than $" + targetPrice);
        } else {
            System.out.println("Product price is not greater than $" + targetPrice);
        }

        // Check if the price is less than or equal to a specified value
        double maxPrice = 50.0;
        if (product.isPriceLessThanOrEqualTo(maxPrice)) {
            System.out.println("Product price is less than or equal to $" + maxPrice);
        } else {
            System.out.println("Product price is greater than $" + maxPrice);
        }

        // Check if the name contains a keyword
        String keyword = "widget"; // Case-insensitive search
        if (product.containsKeyword(keyword)) {
            System.out.println("Product name contains the keyword '" + keyword + "'.");
        } else {
            System.out.println("Product name does not contain the keyword '" + keyword + "'.");
        }
    }
}