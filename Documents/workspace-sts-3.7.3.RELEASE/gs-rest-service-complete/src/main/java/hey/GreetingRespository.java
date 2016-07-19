package hey;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GreetingRespository extends MongoRepository<Greeting, String> {
	
}
