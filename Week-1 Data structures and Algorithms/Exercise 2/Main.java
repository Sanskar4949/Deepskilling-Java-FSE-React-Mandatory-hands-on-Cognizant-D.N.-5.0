public class Main {
    public static void main(String[] args) {

        Product[] linearProducts = {
                new Product(105, "Headphones", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(110, "Watch", "Accessories"),
                new Product(103, "Book", "Education"),
                new Product(108, "Shoes", "Fashion")
        };

        Product[] binaryProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Book", "Education"),
                new Product(105, "Headphones", "Electronics"),
                new Product(108, "Shoes", "Fashion"),
                new Product(110, "Watch", "Accessories")
        };

        int targetId = 108;
        int linearResult = SearchAlgorithm.linearSearch(linearProducts, targetId);

        if (linearResult != -1) {
            System.out.println("Linear Search Result:");
            System.out.println(linearProducts[linearResult]);
        } else {
            System.out.println("Product not found using Linear Search.");
        }
        System.out.println();

        int binaryResult = SearchAlgorithm.binarySearch(binaryProducts, targetId);

        if (binaryResult != -1) {
            System.out.println("Binary Search Result:");
            System.out.println(binaryProducts[binaryResult]);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}