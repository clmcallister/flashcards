package net.charliemcallister.flashcards.service;

import java.util.List;

import net.charliemcallister.flashcards.model.Topic;

public interface TopicService {

	/**
	 * Return a list of all possible flashcard topics
	 * @return The list of topics
	 */
	public List<Topic> getTopics();
}
