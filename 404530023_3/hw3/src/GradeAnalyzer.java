
/**
	 * 
	 * @author User
	 *
	 */
import java.util.ArrayList;

/*�إ�class GradeAnalyzer�A�إ�ArrayList<Double> test,sum,ave,dev,square,var
	 i;
	 �إ߰}�Cgrades
 * */
public class GradeAnalyzer {
	ArrayList<Double> test = new ArrayList<Double>();
	public double sum, ave, dev, square, var;
	int i;
	double[] grades = new double[11];

	/* �إߥ��L�T�{��J�ȬO�_����0~110���� */
	boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0) {
			return true;
		} else {
			return false;
		}

	}

	void addGrade(double aGrade)/* �إ߭p�ƾ�i�A�έp�ѼƩMsum�A�N�ƭȿ�Jarraylist�ä��� */
	{
		if (isValidGrade(aGrade)) {
			i++;
			sum += aGrade;
			test.add(aGrade);
			if (aGrade >= 98)
				grades[0]++;
			else if (aGrade >= 92 && aGrade < 98)
				grades[1]++;
			else if (aGrade >= 90 && aGrade < 92)
				grades[2]++;
			else if (aGrade >= 88 && aGrade < 90)
				grades[3]++;
			else if (aGrade >= 82 && aGrade < 88)
				grades[4]++;
			else if (aGrade >= 80 && aGrade < 82)
				grades[5]++;
			else if (aGrade >= 78 && aGrade < 80)
				grades[6]++;
			else if (aGrade >= 72 && aGrade < 78)
				grades[7]++;
			else if (aGrade >= 70 && aGrade < 72)
				grades[8]++;
			else if (aGrade >= 60 && aGrade < 70)
				grades[9]++;
			else
				grades[10]++;
		}
	}

	public void analyzeGrades()/* �p�⥭����ave�B�зǮt */
	{
		ave = sum / i;
		for (int a = 0; a < i; a++) {
			var += (test.get(a) - ave) * (test.get(a) - ave);
		}
		dev = Math.sqrt(var / i);
	}

	public String toString()/* ��X */
	{
		String respound = "";
		respound += "you entered " + i + " valid grades from 0 to 110.Invalid grades are ignored! \n";
		respound += "The average = " + sum + " with a standard deviation = " + dev + "\n";
		respound += "The grade distribution is: \n" + "A+=" + grades[0] + "\n A=" + grades[1] + "\n A-=" + grades[2]
				+ "\n B+=" + grades[3] + "\n B=" + grades[4] + "\n B-=" + grades[5] + "\n C+=" + grades[6] + "\n C="
				+ grades[7] + "\n C-=" + grades[8] + "\n D=" + grades[9] + "\n F=" + grades[10];
		return respound;
	}
}
