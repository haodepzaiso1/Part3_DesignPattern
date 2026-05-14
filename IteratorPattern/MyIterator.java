package IteratorPattern;

public interface MyIterator {
	boolean hasNext();
    Item next();
}

interface MyCollection {
    MyIterator createStockIterator();
}