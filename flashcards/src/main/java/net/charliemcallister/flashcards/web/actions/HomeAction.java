package net.charliemcallister.flashcards.web.actions;

import java.util.Map;

import net.charliemcallister.flashcards.service.TopicService;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class HomeAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 8211419944630224226L;
	
	@Autowired
	private TopicService topicService;
	
	private SessionMap<String, Object> sessionMap;
	
	public String execute() {
		
		if (sessionMap.get("topicsList") == null) {
			sessionMap.put("topicsList", topicService.getTopics());
		}
		
		return SUCCESS;
	}

	public void setTopicService(TopicService topicService) {
		this.topicService = topicService;
	}

	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap<String, Object>)map;
	}
		
}
