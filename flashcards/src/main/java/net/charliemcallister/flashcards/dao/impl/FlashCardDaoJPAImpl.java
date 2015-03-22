package net.charliemcallister.flashcards.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import net.charliemcallister.flashcards.dao.FlashCardDao;
import net.charliemcallister.flashcards.model.FlashCard;

@Repository
public class FlashCardDaoJPAImpl implements FlashCardDao {

	@PersistenceContext(unitName = "flashCardPersistence")
	private EntityManager entityManager;

	public FlashCard getFlashCardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int persistFlashCard(FlashCard flashCard) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<FlashCard> getFlashCards(long topicId) {
		
		TypedQuery<FlashCard> query = entityManager
				.createQuery("SELECT f FROM FlashCard f JOIN f.topic t WHERE t.id = :topicId", FlashCard.class);
		
		return query.setParameter("topicId", topicId).getResultList();
	}
}
