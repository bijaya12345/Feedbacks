package hcl.com.feedback.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hcl.com.feedback.entity.FeedbackEntity;

@Repository
public interface FeedbackCrudRepository extends CrudRepository<FeedbackEntity, Integer> {

}
