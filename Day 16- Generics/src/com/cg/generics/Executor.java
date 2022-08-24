package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("Generic class Demo");
		obj.sendMessage();
		
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("skumbhalkar@tnsif.org");

		em.setTo("gauri.tambade1@gmail.com");
		em.setSubject("Java full stack");
		em.setBody("about training and placement");
		System.out.println(em.getFrom()+"\n"+em.getTo()+"\n"+ em.getSubject()+"\n"+em.getBody());
		//create a sender to send this mail
		Sender<Email>obj1=new Sender<Email>();
		obj1.setMessage(em);
		obj1.sendMessage();
	}

}


///o/p   message type: class java.lang.String
//contents are: Generic class Demo//
