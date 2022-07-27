package com.example.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {
@Autowired
private UserRepository urepo;
@Autowired
private MailRepository mrepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Component
	public class CommandLineRunnerImpl implements CommandLineRunner {

	    @Override
	    public void run(String... args) throws Exception {

	        System.out.println("In CommandLineRunnerImpl ");
	        User u1=new User("Ankit","a@abc.com","1234");
	    	User u2=new User("Raj","r@abc.com","4321");
	    	urepo.save(u1);
	    	urepo.save(u2);
	    	
	    	Mail m1=new Mail("a@abc.com","r@abc.com","HI","All Good1");
	    	Mail m2=new Mail("a@abc.com","r@abc.com","HI","All Good2");
	    	Mail m3=new Mail("a@abc.com","r@abc.com","HI","All Good3");
	    	Mail m4=new Mail("a@abc.com","r@abc.com","HI","All Good4");
	    	Mail m5=new Mail("r@abc.com","a@abc.com","Hello","Very Nice1");
	    	Mail m6=new Mail("r@abc.com","a@abc.com","Hello","Very Nice2");
	    	Mail m7=new Mail("r@abc.com","a@abc.com","Hello","Very Nice3");
	    	Mail m8=new Mail("r@abc.com","a@abc.com","Hello","Very Nice4");
	    	mrepo.save(m1);
	    	mrepo.save(m2);
	    	mrepo.save(m3);
	    	mrepo.save(m4);
	    	mrepo.save(m5);
	    	mrepo.save(m6);
	    	mrepo.save(m7);
	    	mrepo.save(m8);
	    	

	        
	    }
	}

}
