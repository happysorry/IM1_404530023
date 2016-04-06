/**
 * Easter Sunday
 * @author 404530023������
 *
 */

/**
 * �إ�EASTERTESTER CLASS�A�ŧi�ܼ�a,b,c,d,e,k,p,q,m,n
 * 
 */
public class EASTERTESTER {
	private static double a, b, c, d, e, k, p, q, m, n;

	/** �إ�method calculateEaster�A��J���D�~���A�D�Xa,b,c,d,e,k,p,q,m,n���� */
	static String calculateEaster(int ayear) {
		a = ayear % 19;
		b = ayear % 4;
		c = ayear % 7;
		//
		// �U���o�ӥΪk�O�@�ӫܤ������g�k! ���Pı��A�ۤv�dfunction���۷N! extra point +2!
		k = Math.floorDiv(ayear, 100);
		p = Math.floor((13 + 8 * k) / 25);
		q = Math.floor(k / 4);
		m = (15 - p + k - q) % 30;
		n = (4 + k - q) % 7;
		d = (19 * a + m) % 30;
		e = (2 * b + 4 * c + 6 * d + n) % 7;

		// ��ĳreturn �g�b�̫�, ���L�i�H�����P�_��.
		if (d + e < 10)/**
						 * �Yd+e<10;�^��"in"+�~��+
						 * "Easter Sunday is: month = 3 and day = "+(d+e+22)
						 */
		{
			return ("in" + ayear + "Easter Sunday is: month = 3 and day = " + (d + e + 22));
		}
		if (d + e >= 10)/**
						 * �Yd+e>=10;�^��"in"+�~��+
						 * "Easter Sunday is: month = 4 and day = "+(d+e-9)
						 */
		{
			return ("in" + ayear + "Easter Sunday is: month = 4 and day = " + (d + e - 9));
		}
		// �U��禡���ӭn��b if (d + e >= 10) ��, �_�h�L���|�����, �Q�Q��, �޿���~ -5
		if (d == 29 && e == 6)/**
								 * �Yd=22,e=6;�^��"in"+�~��+
								 * "Easter Sunday is: month = 4 and day = 19"
								 */
		{
			return ("in" + ayear + ", Easter Sunday is: month = 4 and day = 19");
		}
		if (d == 28 && e == 6
				&& (11 * m + 11) % 30 < 19)/**
											 * �Yd=28,e=6,11m+11%30<19;�^��"in"+�~��+
											 * "Easter Sunday is: month = 4 and day = 18"
											 */
		{
			return ("in" + ayear + ", Easter Sunday is: month = 4 and day = 18");
		}

		return null;

	}
}
