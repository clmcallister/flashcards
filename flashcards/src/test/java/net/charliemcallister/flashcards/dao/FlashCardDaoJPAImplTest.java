package net.charliemcallister.flashcards.dao;

import static org.junit.Assert.*;
import net.charliemcallister.flashcards.model.FlashCard;
import net.charliemcallister.flashcards.model.Topic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-application-context-dao.xml")
@Transactional
public class FlashCardDaoJPAImplTest {

	@Autowired
	private FlashCardDao dao;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetFlashCardById() {
		FlashCard card = dao.getFlashCardById(1);
		assertEquals("What is ham?", card.getQuestion());
		assertEquals("Ham is meat from a pig", card.getAnswer());
		assertNotNull(card.getTopic());
		assertEquals(1, card.getTopic().getId());
		assertEquals("Food", card.getTopic().getName());
	}

	@Test
	public void testPersistFlashCard() {
		FlashCard card = new FlashCard();
		card.setQuestion("What is eggs?");
		card.setAnswer("Eggs are baby chickens");
		
		Topic topic = new Topic();
		topic.setId(1);
		topic.setName("Food");
		card.setTopic(topic);
		
		dao.persistFlashCard(card);
		
		FlashCard cardFromDB = dao.getFlashCardById(2);
		assertEquals(card, cardFromDB);
	}

}
