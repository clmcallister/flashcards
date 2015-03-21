package net.charliemcallister.flashcards.dao;

import net.charliemcallister.flashcards.model.FlashCard;

public interface FlashCardDao {

	/**
	 * Answers an instance of <code>FlashCard</code> from the datastore that is identified by <code>id</code>.
	 * 
	 * @param id The identifier of the instance as stored in the datastore
	 * @return The <code>FlashCard</code> instance
	 */
	public FlashCard getFlashCardById(int id);
	
	/**
	 * Persist an <code>FlashCard</code> instance to the datastore and returns its identifier as stored in the datastore.
	 *  
	 * @param flashCard The <code>FlashCard</code> instance to persist.
	 * @return The identifier of the stored <code>FlashCard</code> instance
	 */
	public int persistFlashCard(FlashCard flashCard);
}
