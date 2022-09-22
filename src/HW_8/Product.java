package HW_8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;

public class Product implements Comparable<Product> {
    private final String type;
    private double price;
    private final boolean isDiscount;
    private final LocalDate date;

    public Product(String type, double price, boolean isDiscount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.isDiscount = isDiscount;
        this.date = date;
    }

    public static List<Product> filterByBook(List<Product> products) {
        return products.stream().filter(product -> product.getType().equals("Book") & product.getPrice() > 250).toList();
    }

    public static List<Product> filterByDiscount(List<Product> products) {
        return products.stream().filter(product -> product.getType().equals("Book") & product.isDiscount())
                .peek(product -> product.price = product.price * 0.9).collect(Collectors.toList());
    }

    public static Product getCheapestProductBook(List<Product> products) {
        String type = "Book";
        return products.stream().filter(product -> product.type.equals(type)).min(Product::compareTo)
                .orElseThrow(() -> new NotFoundProductException("Продукт категории " + type + " не найден."));
    }

    public static List<Product> getLastThreeProducts(List<Product> products) {
        return products.stream().sorted(new ProductTimeComparator().reversed()).limit(3).collect(Collectors.toList());
    }

    public static double calculateSumOfPrices(List<Product> products) {
        return products.stream().filter(product -> product.date.getYear() == LocalDate.now().getYear() & product.type.equals("Book")
                & product.price <= 75).mapToDouble(product -> product.price).sum();
    }

    public static Map<String, List<Product>> mapByType(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(this.price, product.price);
    }
}
