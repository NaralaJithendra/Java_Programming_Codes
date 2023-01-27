package com.examples.java.collections.lists;

import java.util.ArrayList;


public class ArrayList_Final {
	ArrayList<String> arraylist = new ArrayList<>();
	
	public void add(String name) {
		arraylist.add(name);
	}
	
	public String atPosition(int number) {
		return arraylist.get(number);
	}
	
	public ArrayList<String> deleteatPosition(int number) {
		arraylist.remove(number);
		return arraylist;
	}
	
	public ArrayList<String> deletewithName(String name){
		arraylist.remove(name);
		return arraylist;
	}
	
	public ArrayList<String> getArrayList(){
		return arraylist;
	}

	public int length() {
		// TODO Auto-generated method stub
		return arraylist.size();
	}
	
	public String getatindex(int number) {
		return arraylist.get(number);
	}
	
	public String changeatIndex(int index,String name) {
		System.out.println("Before Changing:"+arraylist.get(index));
		arraylist.set(index, name);
		return arraylist.get(index);
	}
	
	public int indexOfString(String name) {
		return arraylist.indexOf(name);
	}
	
	public static void main(String[] args) {
		System.out.println(" \"ArrayList\" in \"Java Util\" Package ");
		System.out.println("Array List");
		ArrayList_Final list = new ArrayList_Final();
		String dummy[]= {"Ganesh","Shiva","Lakshmi","Durga","Saraswathi","Iron Man","Tony Stark","Thor","Captain America","Steve Rogers","Alexa","Google Assistant","Siri","Cortana","Dsp","ThaggedheLe"};
		for(String string:dummy) {
			list.arraylist.add(string);
		}
		System.out.println(list.getArrayList());
		list.arraylist.add("dummy2");
		list.arraylist.add("dummy");
		
		System.out.println("   ");
		int deleteatposition = list.length();
		System.out.println("After Deleting with Position: "+list.deleteatPosition(deleteatposition-1));
		System.out.println("   ");
		System.out.println("After Deleting with Name: "+list.deletewithName("dummy2"));
		
		System.out.println("   ");
		System.out.println("After changing the Name: "+list.changeatIndex(9,"GaneshShiva"));
		
		System.out.println("   ");
		System.out.println("Name at Index: "+list.getatindex(5));
		
		System.out.println("   ");
		System.out.println("Index of Name: "+list.indexOfString("dummy2"));
		
		System.out.println("   ");
		System.out.println("Index of Name: "+list.indexOfString("GaneshShiva"));
		/*
		 output:
		 	"ArrayList" in "Java Util" Package
		 	
		 	Array List
		 	
			[Ganesh, Shiva, Lakshmi, Durga, Saraswathi, Iron Man, Tony Stark, Thor, Captain America, Steve Rogers, Alexa, Google Assistant, Siri, Cortana, Dsp, ThaggedheLe]
			   
			After Deleting with Position: [Ganesh, Shiva, Lakshmi, Durga, Saraswathi, Iron Man, Tony Stark, Thor, Captain America, Steve Rogers, Alexa, Google Assistant, Siri, Cortana, Dsp, ThaggedheLe, dummy2]
			   
			After Deleting with Name: [Ganesh, Shiva, Lakshmi, Durga, Saraswathi, Iron Man, Tony Stark, Thor, Captain America, Steve Rogers, Alexa, Google Assistant, Siri, Cortana, Dsp, ThaggedheLe]
			   
			Before Changing:Steve Rogers
			After changing the Name: GaneshShiva
			   
			Name at Index: Iron Man
			   
			Index of Name: -1
			   
			Index of Name: 9

		 */
	}
}
