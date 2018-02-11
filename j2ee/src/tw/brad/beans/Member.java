package tw.brad.beans;

import java.io.Serializable;

/* Java Bean
 * 1. public class
 * (XX)2. implements Serializable 
 * 3. all fields not a public
 * 4. default constructor
 * 5. getter & setter => getXxx(), setXxx()
 */
//public class Member implements Serializable {
public class Member {
	private String id, name;
	public Member() {
		
	}
	public Member(String id, String name) {
		
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {return id;}
	public String getName() {return name;}
	public void m1() {
		System.out.println("m1()");
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
}
