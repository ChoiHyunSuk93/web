package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른가요? 물어봐서
		// 배부르다고 한 사람, 안부르다고 한 사람 몇 명 카운트
		int full = 0;
		int noFull = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1-배부름 2-안배부름");
			if (data.equals("1")) {
				full = full + 1; // full++;
			} else if (data.equals("2")) {
				noFull = noFull + 1;
			}
		}
		System.out.println("배가 부른 사람은 " + full + "명 입니다.");
		System.out.println("배가 안부른 사람은 " + noFull + "명 입니다.");

	}

}
