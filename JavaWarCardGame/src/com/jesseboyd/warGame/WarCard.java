package com.jesseboyd.warGame;

public class WarCard implements Card {

	// war cards can have a value from 1-14
	private int cardValue;
	
	public WarCard(int cardValue){
		if(cardValue < 1 || cardValue > 16 ){
			throw new IllegalArgumentException("Card Value Outside of range");
		}
		this.cardValue = cardValue;
	}

	/* (non-Javadoc)
	 * @see com.jesseboyd.warGame.Card#getValue()
	 */
	public int getValue() {
		return cardValue;
	}

}
