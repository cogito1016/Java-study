package Adaptation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*2014467김재형 
  MAP을 이용한 직원테이블 구현*/

//직원 클래스 Person 구현 
class Person
{

	/*직원의 정보필드 선언
	 *Name/Gender/Age*/
	String Name;
	String Gender;
	int Age;
	
	/*Constructor
	 *Initialization Field*/
	public Person(String inname, String ingender, int inage)
	{
		this.Name = inname;
		this.Gender = ingender;
		this.Age = inage;
	}
	

	//Getter Setter
	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public String getGender() {return Gender;}
	public void setGender(String gender) {this.Gender = gender;}
	public int getAge() {return Age;}
	public void setAge(int age) {this.Age = age;}
}

public class Employee_Map {

	public static void main(String[] args) {
		//Key = String, Value = Object Type map
		Map<String, Person> map = new HashMap<>();
		
		//Person object ArrayList
		ArrayList <Person> plist = new ArrayList<Person>();
		
		//ID=String타입 Name=Person객체타입 입니다. 총 다섯개를 add해줍니다 
		plist.add(new Person("SteveJobs","Male",12));
		plist.add(new Person("Scott McNealy","Female",14));
		plist.add(new Person("Jeff Bezos","Male",16));
		plist.add(new Person("Larry Ellison","Female",18));
		plist.add(new Person("Bill Gates","Male",92));
	
		/*Map의 Key값은 String타입으로 ID값을 지정해주고
		 *Map의 Value값은 Person객체타입으로 Value값을 지정해줍니다 총 5개를 put합니다 */
		map.put("a1234", plist.get(0));
		map.put("a1235", plist.get(1));
		map.put("a1236", plist.get(2));
		map.put("a1237", plist.get(3));
		map.put("a1238", plist.get(4));
		
		//forEach Lamda식을 사용하여 출력 
		map.forEach((k,v) -> System.out.println(k+" "+v.getName()+" "+v.getGender()+" "+v.getAge()));
	}

}
