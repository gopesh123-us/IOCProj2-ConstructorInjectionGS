//ConstructorInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Person;
import com.nt.beans.Person1;
import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// Locate and hold spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// create IOC container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		// get TargetBean class object
		Object obj = factory.getBean("wmg");
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator) obj;
		// invoke the b.method
		String result = generator.generateWishMesage("raja");
		System.out.println("Result ::" + result);
		
		Object perObj = factory.getBean("per");
		Person person = (Person) perObj;
		System.out.println(person);
		
		Object per1Obj = factory.getBean("per1");
		Person1 person1 = (Person1) per1Obj;
		System.out.println(person1);
		
	}
}
