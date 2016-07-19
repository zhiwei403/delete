package hello;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;


public class Record {

    @Id
    private String cameraid;

    private DateTime DateTime;
    private String fileName;

    public Record() {}

    public Record(String cameraid, DateTime DateTime, String fileName) {
        this.cameraid = cameraid;
        this.DateTime = DateTime;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return String.format(
                "Record[Camera id=%s, Date&Time='%s', File Name='%s']",
                cameraid, DateTime, fileName);
    }

}

