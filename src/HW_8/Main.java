package HW_8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Book", 50, false, LocalDate.of(2022, 4, 10));
        Product product1 = new Product("Book", 75, true, LocalDate.of(2022, 12, 16));
        Product product2 = new Product("Book", 150, false, LocalDate.of(2021, 6, 5));
        Product product3 = new Product("Book", 300, true, LocalDate.of(2021, 11, 21));
        Product product4 = new Product("Book", 251, false, LocalDate.of(2022, 1, 13));
        Product product5 = new Product("Toy", 250, true, LocalDate.of(2022, 8, 25));

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        Product.filterByBook(productList);
        Product.filterByDiscount(productList);
        Product.getCheapestProductBook(productList);
        Product.getLastThreeProducts(productList);
        Product.calculateSumOfPrices(productList);
        Product.mapByType(productList);
    }
}