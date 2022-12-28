
public class Allcharacter {

	public static void main(String[] args) {
		String s =""; 
		for(int i=97; i<123; i++ ) {char ch = (char)i; s=s+ch;}
		System.out.println(s);
		String str = "abcdefghijklmnopqrstuvwxzy"; str = str.toLowerCase(); System.out.println(str);
		if (str.contains(s)) System.out.println(1);

	}

}
