package org.fao.smartforms.web;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
public class HelloWorldController {

	@RequestMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<?> helloWorld(){
		return ResponseEntity.ok(new HelloWorld("Greetings", "Hello World"));
	}
	
	
}
class HelloWorld{
	private String title;
	private String message;
	
	public HelloWorld(String title, String message) {
		super();
		this.title = title;
		this.message = message;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}