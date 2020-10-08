package com.siddhu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;

@RestController
public class HelloController {
/*   @Autowired
   @PreAuthorize("hasRole('Users')")
   @RequestMapping("/")
   public String helloWorld() {
      return "Hello World!";
   }*/
	 @Autowired
	   @PreAuthorize("hasRole('Users')")
	   @RequestMapping("/")
	   public String helloWorld() {
	      return "Hello Users!";
	   }
	   @PreAuthorize("hasRole('Group1')")
	   @RequestMapping("/Group1")
	   public String groupOne() {
	      return "Hello Group 1 Users!";
	   }
	   @PreAuthorize("hasRole('Group2')")
	   @RequestMapping("/Group2")
	   public String groupTwo() {
	      return "Hello Group 2 Users!";
	   }
}