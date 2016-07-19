package hello;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;


	public class Record {

	
    @Id
       private long id;
	   private String cameraid;
	   private String DateTime;
	   private String fileName;
	   

	   public long getid() {
			return id;
		}

		public String getCameraid() {
			return cameraid;
		}
		
		public String getDateTime() {
			return DateTime;
		}
		
		public String getFilename() {
			return fileName;
		}

		public void setCameraid(String cameraid) {
			this.cameraid = cameraid;
		}


		public void setid(long id) {
			this.id = id;
		}
		public void setFilename(String filename) {
			this.fileName = filename;
		}


		public void setDateTime(String dateTime) {
			this.DateTime = dateTime;
		}
	}

	   