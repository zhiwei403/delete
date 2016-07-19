package hey;




import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class Greeting {

    private final long id;
    private final String content;
    
    @JsonSerialize(using=CustomDateTimeSerializer.class)
    private final DateTime time;

    public Greeting(long id, DateTime time, String content) {
        this.id = id;
        this.content = content;
        this.time = time;
    }


	public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    public DateTime getTime() {
        return time;
    }
}
