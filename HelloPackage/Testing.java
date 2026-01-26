package HelloPackage;
import java.util.Scanner;
public class Testing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("정수 3개 입력");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int big=0;
		
		// 삼각형 공식 두 변의 합이 가장 큰 변보다 커야한다.
		// 그럼 가장 큰 걸 찾으면 그 떨거지들로 더해 그럼 if문 3개만 만들면 됨
		
		if (n1>n2&&n1>n3)
			if (n1 <= n2+n3) System.out.println("삼각형 가능");
			else System.out.println("불가능");
		if (n2>n1&&n2>n3)
			if (n2 <= n1+n3) System.out.println("삼각형 가능");
			else System.out.println("불가능");
		if (n3>n1&&n3>n2)
			if (n3 <= n1+n2) System.out.println("삼각형 가능");
			else System.out.println("불가능");
		
		
		
		
		scanner.close();
	}
}
