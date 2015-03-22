package net.charliemcallister.flashcards.service.impl;

import java.util.List;

import net.charliemcallister.flashcards.dao.TopicDao;
import net.charliemcallister.flashcards.model.Topic;
import net.charliemcallister.flashcards.service.TopicService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	private TopicDao topicDao;

	public List<Topic> getTopics() {
		return topicDao.getTopics();
	}
}
