package assignment;

public class StringInsert {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("He110 " ) ;
		sb.insert(1, "Java"); // now original string is changed
		System.out.println(sb);//prints HJavae110
	}

}
