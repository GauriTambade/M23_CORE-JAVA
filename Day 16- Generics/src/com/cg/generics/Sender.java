package com.cg.generics;
//generic class
public class Sender<T> 
{
	private T message;
//getter method
	public T getMessage() {
		return message;
	}
//setter method
	public void setMessage(T message) {
		this.message = message;
	}
	public void sendMessage()
	{
		System.out.println("message type: "+getMessage().getClass());
		System.out.println("contents are: "+getMessage());

	}

}
