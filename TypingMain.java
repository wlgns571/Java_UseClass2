package java_day17.typing;

import java.util.Scanner;

public class TypingMain {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();

		Scanner sc = new Scanner(System.in);

		// 1970s 1월 1일부터 현재까지의 경과된 시간을
		// 밀리초 단위로 리턴
		long pastTime = System.currentTimeMillis();

		while (dictionary.countWords() > 0) {
			dictionary.showWords();

			System.out.print("입력: ");
			String inputText = sc.nextLine();

			dictionary.removeWord(inputText);
		}

		long currentTime = System.currentTimeMillis();

		long diffrentTime = currentTime - pastTime;
		double result = diffrentTime / 1000.0;

		System.out.println(result + "초 걸리셨습니다.");
	}
}
