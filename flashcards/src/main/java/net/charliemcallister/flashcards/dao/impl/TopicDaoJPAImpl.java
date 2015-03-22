package net.charliemcallister.flashcards.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import net.charliemcallister.flashcards.dao.TopicDao;
import net.charliemcallister.flashcards.model.Topic;

import org.springframework.stereotype.Repository;

@Repository
public class TopicDaoJPAImpl implements TopicDao {

	@PersistenceContext(unitName="flashCardPersistence")
	private EntityManager entityManager;
	
	public List<Topic> getTopics() {
		TypedQuery<Topic> topicQuery = entityManager.createQuery("SELECT t FROM Topic t", Topic.class);
		return topicQuery.getResultList();
	}

}
