package Task1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("task1");

List<String> a1 = new ArrayList<String>();

		a1.add("Vasya");
		a1.add("Petya");
		a1.add("Masha");
		a1.add("Pasha");
		a1.add("Kolya");
		a1.add("Bodya");
		a1.add("Pasha");
		a1.add("Lida");
		a1.add("Zina");
		a1.add("Pasha");
		a1.add("Pasha");
		a1.add("Kolya");
		a1.add("Bodya");
		a1.add("Petya");
		a1.add("Masha");
		a1.add("Kolya");
		a1.add("Pasha");
		a1.add("Kolya");
		a1.add("Bodya");
		a1.add("Lida");
		a1.add("Zina");
		a1.add("Pasha");
		a1.add("Kolya");
		a1.add("Bodya");
		
		System.out.println("ArrayList Elements");
		System.out.println("\t" + a1);
		
		for (int i = 0; i < a1.size()/2; i++) {
			 if (a1.get(i).equals("Pasha")) { 
					a1.set(i,"Uvolen");
					
					}
			
			}
		System.out.println("new ArrayList Elements");
		System.out.print("\t" + a1);
	}
	}

    
