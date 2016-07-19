package hello;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private RecordRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String Date = "2016-05-09T17:31:01.000Z";
		DateTime dt = ISODateTimeFormat.dateTime().parseDateTime(Date);
     //Date date = new Date();
    // DateTime currentTime = new DateTime(date);
		repository.deleteAll();

		// save a couple of customers
		repository.save(new Record("Tamp2",dt, "dog"));
		repository.save(new Record("Bob22",dt, "curry"));
		repository.save(new Record("bedok01",dt, "fish"));
		repository.save(new Record("bugis3",dt, "cat"));
		// fetch all customers
		System.out.println("Camera Record found with findAll():");
		System.out.println("-------------------------------");
		for (Record customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
	/*	System.out.println("Record found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Record customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}*/

	}

}
