package com.design.Behavioral.Visiter;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}

