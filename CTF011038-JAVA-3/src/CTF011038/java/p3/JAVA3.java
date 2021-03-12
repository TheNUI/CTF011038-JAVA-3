package CTF011038.java.p3;

public class JAVA3 {
	public static void main(String[] args) {
//1	
		int i = 20;
	//a
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
	//b
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
//2
		float myFloat1 = 2.2f;
		float myFloat2 = 1.5f;
		if((myFloat1==2.2)&&(myFloat2==1.5))
			System.out.println("myFloat1 is 2.2 and myFloat2 is 1.5");
			else System.out.println("All of them is not 2.2 and 1.5");
//3
		char myChar1 = 'A';
		char myChar2 = 'a';
		if((myChar1=='A')||(myChar2=='a'))
			System.out.println("myChar1 is A or myChar2 is a");
			else System.out.println("myChar1 or myChar2 is not A and a");
	}
}
