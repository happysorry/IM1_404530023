/*
 * [A]100
 * [TA's Advise]
 * 1. �ܼƪ��R�W��ı�o�i�H�A��n�@�I, �n��i�o��Ʊ��O���O��cnt�|��n�O?
 * 2. �{���S����Ӥj���D, �ܦn.
 * */
/**
 * 
 * @author User
 *
 */

import javax.swing.JOptionPane;

/*�إ�class GradeAnalyzerTester�A�I�sGradeAnalyzer()�A�إ߿�J��ܮءA�Y��JQ ORq�h���X�j��
 * �_�h�~�����A�I�sgrades.addGrade()��J�ƭ�
 */
public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer grades = new GradeAnalyzer();

		String input;
		while (true) {
			input = JOptionPane.showInputDialog(null, "��J�@�Ӽ�");
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
							 * �Y�p�ƾ�i
							 * �j�󵥩�2�A�I�sgrades.analyzeGrades()�A��Xgrades.toString(
							 * )
							 */
		{
			grades.analyzeGrades();
			System.out.println(grades.toString());
		}
	}
}
