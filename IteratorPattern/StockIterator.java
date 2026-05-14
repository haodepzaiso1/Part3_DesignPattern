
package IteratorPattern;

import java.util.List;

public class StockIterator implements MyIterator {
    private List<Item> items;
    private int position = 0;

    public StockIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // Tìm kiếm phần tử tiếp theo có inStock == true
        while (position < items.size()) {
            if (items.get(position).isInStock()) {
                return true;
            }
            position++; // Bỏ qua nếu hết hàng
        }
        return false;
    }

    @Override
    public Item next() {
        return items.get(position++);
    }
}
