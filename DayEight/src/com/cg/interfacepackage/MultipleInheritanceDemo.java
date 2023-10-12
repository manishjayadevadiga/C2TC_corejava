package com.cg.interfacepackage;

//using interface
interface Dad{
	void snoring();
}

interface Mom{
	void snoring();
}


class You implements Dad,Mom{  //multiple inheritance
	public void snoring() {
		System.out.println("My parents have the habit of snoring");
	}
}



public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		You y=new You();
		y.snoring();

	}

}
