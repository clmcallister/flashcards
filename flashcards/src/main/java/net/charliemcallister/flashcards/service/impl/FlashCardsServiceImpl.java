package net.charliemcallister.flashcards.service.impl;

import java.util.List;

import net.charliemcallister.flashcards.dao.FlashCardDao;
import net.charliemcallister.flashcards.model.FlashCard;
import net.charliemcallister.flashcards.service.FlashCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashCardsServiceImpl implements FlashCardService {

	@Autowired
	private FlashCardDao flashCardDao;
	
	public List<FlashCard> getFlashCards(long topicId) {
		return flashCardDao.getFlashCards(topicId);
	}
}
