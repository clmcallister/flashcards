package net.charliemcallister.flashcards.service;

import java.util.List;

import net.charliemcallister.flashcards.model.FlashCard;

public interface FlashCardService {

	/**
	 * Returns a list of flash cards from the specified topic.
	 * 
	 * @param topicId The specified topic id
	 * @return The list of flash cards
	 */
	public List<FlashCard> getFlashCards(long topicId);
}
