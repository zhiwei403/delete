package hello;

	import org.springframework.data.mongodb.repository.MongoRepository;

	
	
	public interface RecordRepository extends MongoRepository<Record, String> {


	}
