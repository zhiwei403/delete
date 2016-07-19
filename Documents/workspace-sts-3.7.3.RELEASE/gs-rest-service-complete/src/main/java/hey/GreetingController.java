package hey;

import java.awt.Image;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.format.ISODateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;


@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Autowired
    GreetingRespository rep;
	

	
    //private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/in")
  
    public Greeting greeting(@RequestParam(required=true, value="name") String name,
    		//@RequestParam(required=true, value="image") Image image){
    		@RequestParam(required=true, value="ts") String time) {
    	 {  	
    	    		Greeting mr = new Greeting(counter.incrementAndGet(), ISODateTimeFormat.dateTime().parseDateTime(time),name);   	         
    	    		rep.save(mr);       
    	            return mr;
    	 }
    }
    
   
    	 @RequestMapping(value="out")
    	
    	    public List<Greeting> getList() {
    		
    		 List<Greeting> recordList = rep.findAll(); 
     	    
     	    for (Greeting rec : recordList)
     	    	rec.getTime();
     	    return recordList;
}
}
