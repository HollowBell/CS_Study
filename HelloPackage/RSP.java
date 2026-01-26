package HelloPackage;
import java.util.Scanner;
public class RSP {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String n1 = "철수", n2 = "영희";
		
		System.out.println("가위바위보 게임입니다. 가위, 바위 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String rsp1 = scanner.next();
		System.out.print("영희 >> ");
		String rsp2 = scanner.next();
		
		if(rsp1.equals("가위")) {
			if (rsp2.equals("가위"))
				System.out.println("비김");
			else if (rsp2.equals("바위"))
				System.out.println("영희가 이김");
			else 
				System.out.println("철수가 이김");
		}
		else if (rsp1.equals("바위")) {
			if (rsp2.equals("가위"))
				System.out.println("철수가 이김");
			else if (rsp2.equals("바위"))
				System.out.println("비김");
			else 
				System.out.println("영희가 이김");
		}
		else {
			if (rsp2.equals("가위"))
				System.out.println("영희가 이김");
			else if (rsp2.equals("바위"))
				System.out.println("철수가 이김");
			else 
				System.out.println("비김");
		}
		
	scanner.close();	
	}
}
