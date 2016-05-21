/*
 * [A]100
 * [TA's Advise]
 * 1. 變數的命名我覺得可以再更好一點, 好比i這件事情是不是用cnt會更好呢?
 * 2. 程式沒什麼太大問題, 很好.
 * */
/**
 * 
 * @author User
 *
 */

import javax.swing.JOptionPane;

/*建立class GradeAnalyzerTester，呼叫GradeAnalyzer()，建立輸入對話框，若輸入Q ORq則跳出迴圈
 * 否則繼續執行，呼叫grades.addGrade()輸入數值
 */
public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer grades = new GradeAnalyzer();

		String input;
		while (true) {
			input = JOptionPane.showInputDialog(null, "輸入一個數");
			if (input.equals("q") || input.equals("Q")) {
				break;
			} else {
				try {
					grades.addGrade(Double.parseDouble(input));
				}

				catch (Exception e) {
					System.out.println("error");
				}
			}
		}
		if (grades.i >= 2)/*
							 * 若計數器i
							 * 大於等於2，呼叫grades.analyzeGrades()，輸出grades.toString(
							 * )
							 */
		{
			grades.analyzeGrades();
			System.out.println(grades.toString());
		}
	}
}
