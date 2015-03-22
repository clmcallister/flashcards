package net.charliemcallister.flashcards.web.actions;

import java.util.List;

import net.charliemcallister.flashcards.model.FlashCard;
import net.charliemcallister.flashcards.service.FlashCardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class ShowFlashCardsAction extends ActionSupport {

	private static final long serialVersionUID = 997867792467372194L;
	
	@Autowired
	private FlashCardService flashCardService;
	
	private long topicId;
	private List<FlashCard> flashCards;
	
	public String execute() {
		flashCards = flashCardService.getFlashCards(topicId);
		return SUCCESS;
	}

	public long getTopicId() {
		return topicId;
	}

	public void setTopicId(long topicId) {
		this.topicId = topicId;
	}

	public List<FlashCard> getFlashCards() {
		return flashCards;
	}
}
