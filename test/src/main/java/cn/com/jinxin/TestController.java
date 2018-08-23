package cn.com.jinxin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController(value="/htttp")
public class TestController {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<String> getTest(String id) {
		if(id==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Person getPerson(@RequestBody Person person) {
		return person;
	}
	
	
}
