package com.mifeng.acm.test;
class Link {
	private int iData;// data item
	public Link next;// next link in list
	public Link(int it){
		iData = it;
	}
	public int getKey(){
		return iData;
	}
	public void displayLink(){
		System.out.println(iData + " ");
	}
}
class SortedList{
	private Link first;
	public void SortedList(){
		first = null;
	}
	public void insert(Link theLink){
		int key = theLink.getKey();
		Link previous = null;
		Link current = first;
		while(current != null && key>current.getKey()){
			
		}
	}
}
class HashTable{
	private SortedList[] hashArray;
	private int arraySize;
}
public class hashChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
