package hcl.com.feedback.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hcl.com.feedback.entity.FeedbackEntity;
import hcl.com.feedback.repository.FeedbackCrudRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackCrudRepository fedRepo;

	public void saveOrUpdate(FeedbackEntity comment) {
		fedRepo.save(comment);
	}

	public void update(FeedbackEntity comment, int id) {
		fedRepo.save(comment);
	}

	public List<FeedbackEntity> findAllFeedback() {
		List<FeedbackEntity> comment = new ArrayList<FeedbackEntity>();
		fedRepo.findAll().forEach(feedback1 -> comment.add(feedback1));
		return comment;
	}

	public FeedbackEntity getFeedbackById(int id) {
		return fedRepo.findById(id).get();
	}

}
