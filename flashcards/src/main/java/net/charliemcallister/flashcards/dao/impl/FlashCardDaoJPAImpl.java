package net.charliemcallister.flashcards.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import net.charliemcallister.flashcards.dao.FlashCardDao;
import net.charliemcallister.flashcards.model.FlashCard;

@Repository
public class FlashCardDaoJPAImpl implements FlashCardDao {

	@PersistenceContext(unitName="flashCardPersistence")
	private EntityManager entityManager;
	
	public FlashCard getFlashCardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int persistFlashCard(FlashCard flashCard) {
		// TODO Auto-generated method stub
		return 0;
	}

}
