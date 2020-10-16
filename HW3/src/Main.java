import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
//		String a = "abcde";
//		System.out.println(a.substring(0, a.length()));
//		System.out.println(a);
		System.out.println("Please type: URL Keyword(chinese is avaliable if the web is encoded by utf-8)");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
		    String urlStr = sc.next();
		    String keyword = sc.next();
		   
		    WordCounter counter = new WordCounter(urlStr);
		    System.out.println(counter.countKeyword(keyword));
		}
	}
}