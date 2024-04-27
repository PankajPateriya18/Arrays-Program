package check;

public class Check_Two {

	public static void main(String[] args) {
		
		String s1 = "Taj";
		String s2 = " Mahal";
		String s3 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3);
		
		StringBuffer sb1 = new StringBuffer("Taj");
		StringBuffer sb2 = new StringBuffer(" Mahal");
		StringBuffer sb3 = sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb3);
	}
}
