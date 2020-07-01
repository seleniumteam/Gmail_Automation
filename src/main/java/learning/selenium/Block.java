package learning.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Block {
	
	public void show()
	{
		ArrayList lists = new ArrayList<>();
		lists.add("bana");
		lists.add("apple");
		
		Iterator itr = lists.iterator();
		Collections.sort(lists);
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block obj = new Block();
		obj.show();
	}
}
