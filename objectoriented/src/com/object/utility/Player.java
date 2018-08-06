package com.object.utility;

import java.util.ArrayList;

public class Player {

private static ArrayList<Pair > cards;

public static ArrayList<Pair> getCards() {
	return cards;
}

public static void setCards(ArrayList<Pair> cards) {
	Player.cards = cards;
}

	
}
