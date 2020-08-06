package rentsells.login.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import rentsells.login.model.Sequence;

@Service
public class SequencesService {
	@Autowired
	private MongoOperations mongo;

	@Autowired
	public SequencesService(MongoOperations mongo) {
		this.mongo = mongo;
	}

	public long getNextSequence(String seqName) {
		System.out.println("seqName : " + seqName);
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(seqName));
		Sequence counter = mongo.findAndModify(query, new Update().inc("id", 1),
				options().returnNew(true).upsert(true), Sequence.class);
		return counter.getId();

	}
}
