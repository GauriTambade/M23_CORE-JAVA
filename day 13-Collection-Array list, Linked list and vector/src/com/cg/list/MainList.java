package com.cg.list;

import java.util.Iterator;
import java.util.List;


class Address
{
	private int plotNo;
	private String Street;
	private String area;
	private String city;
	private String state;
	public Address(int plotNo, String street, String area, String city, String state) {
		super();
		this.plotNo = plotNo;
		Street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return String.format("Address [plotNo=%s, Street=%s, area=%s, city=%s, state=%s]", plotNo, Street, area, city,
				state);
	}
}
public class MainList {

	public static void main(String[] args) {
		List<Address>obj=new LinkedList();
		//add elements to LL
		obj.add(new Address(121,"Lane no 2","Airoli","NAvi Mumbai","Maharashtra"));
		obj.add(new Address(544,"Lane no52","Vishrantwadi","Pune","Maharashtra"));
		 Iterator i=obj.iterator();
		 while(i.hasNext())
		 {
			 Object elem=i.next();
			 System.out.println(elem+"\n");
		 }
		 System.out.println();
	}

}
