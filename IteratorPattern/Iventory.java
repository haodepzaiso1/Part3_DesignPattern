package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Iventory implements MyCollection {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public MyIterator createStockIterator() {
        return new StockIterator(items);
    }
}
