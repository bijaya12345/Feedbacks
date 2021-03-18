package hcl.com.feedback.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hcl.com.feedback.entity.FeedbackEntity;
import hcl.com.feedback.service.FeedbackService;

@RestController
@RequestMapping("feedback")
public class FeedbackController {

	@Autowired
	FeedbackService feedbackService;

	@PostMapping("/save")
	public String saveUserFeedback(FeedbackEntity comment) {
		feedbackService.saveOrUpdate(comment);
		// int id = comment.getId();
		return "Thanks for the feedback. ";
	}

	@GetMapping("/display/{id}")
	public Optional<FeedbackEntity> show(@PathVariable int id) {
		Optional<FeedbackEntity> comment = Optional.ofNullable(feedbackService.getFeedbackById(id));
		return comment;
	}
}
