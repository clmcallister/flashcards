package net.charliemcallister.flashcards.dao;

import java.util.List;

import net.charliemcallister.flashcards.model.Topic;

public interface TopicDao {

	/**
	 * Return all topics from the datastore.
	 * 
	 * 	@return A list of topics
	 */
	public List<Topic> getTopics();
}
