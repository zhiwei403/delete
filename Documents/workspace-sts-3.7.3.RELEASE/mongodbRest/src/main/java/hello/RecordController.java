package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recordz")
public class RecordController {
  
  @Autowired
  private RecordRepository repo;
  
  @RequestMapping(value="rec",method=RequestMethod.GET)
  public List<Record> getAll() {
    return repo.findAll();
  }
  
  @RequestMapping(value="rec1",method=RequestMethod.POST)
  public Record create(@RequestBody Record record) {
    return repo.save(record);
  }
  /*
  @RequestMapping(method=RequestMethod.DELETE, value="{id}")
  public void delete(@PathVariable String cameraid) {
    repo.delete(cameraid);
  }
  
  @RequestMapping(method=RequestMethod.PUT, value="{id}")
  public Record update(@PathVariable String id, @RequestBody Record record) {
	  Record update = repo.findOne(id);
	  update.setCameraid(record.getCameraid());
	  update.setDateTime(record.getDateTime());
	  update.setFilename(record.getFilename());
	  
   
    return repo.save(update);
  }*/

}
