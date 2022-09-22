package HW_8;

import java.util.Comparator;

public class ProductTimeComparator implements Comparator<Product> {

    @Override
    public int compare(Product product, Product product1) {
        if (product.getDate().isAfter(product1.getDate())) return 1;
        if (product.getDate().isBefore(product1.getDate())) return -1;
        return 0;
    }
}
