package rentsells.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import rentsells.login.model.Sequence;

@Repository
public interface SequencesRepository extends MongoRepository<Sequence, String>{

}
