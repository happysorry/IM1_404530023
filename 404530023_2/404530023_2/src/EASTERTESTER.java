/**
 * Easter Sunday
 * @author 404530023楊捷詠
 *
 */

/**
 * 建立EASTERTESTER CLASS，宣告變數a,b,c,d,e,k,p,q,m,n
 * 
 */
public class EASTERTESTER {
	private static double a, b, c, d, e, k, p, q, m, n;

	/** 建立method calculateEaster，輸入欲求年分，求出a,b,c,d,e,k,p,q,m,n的值 */
	static String calculateEaster(int ayear) {
		a = ayear % 19;
		b = ayear % 4;
		c = ayear % 7;
		//
		// 下面這個用法是一個很不錯的寫法! 有感覺到你自己查function的誠意! extra point +2!
		k = Math.floorDiv(ayear, 100);
		p = Math.floor((13 + 8 * k) / 25);
		q = Math.floor(k / 4);
		m = (15 - p + k - q) % 30;
		n = (4 + k - q) % 7;
		d = (19 * a + m) % 30;
		e = (2 * b + 4 * c + 6 * d + n) % 7;

		// 建議return 寫在最後, 讓他可以完全判斷完.
		if (d + e < 10)/**
						 * 若d+e<10;回傳"in"+年分+
						 * "Easter Sunday is: month = 3 and day = "+(d+e+22)
						 */
		{
			return ("in" + ayear + "Easter Sunday is: month = 3 and day = " + (d + e + 22));
		}
		if (d + e >= 10)/**
						 * 若d+e>=10;回傳"in"+年分+
						 * "Easter Sunday is: month = 4 and day = "+(d+e-9)
						 */
		{
			return ("in" + ayear + "Easter Sunday is: month = 4 and day = " + (d + e - 9));
		}
		// 下方函式應該要放在 if (d + e >= 10) 中, 否則他不會執行到, 想想看, 邏輯錯誤 -5
		if (d == 29 && e == 6)/**
								 * 若d=22,e=6;回傳"in"+年分+
								 * "Easter Sunday is: month = 4 and day = 19"
								 */
		{
			return ("in" + ayear + ", Easter Sunday is: month = 4 and day = 19");
		}
		if (d == 28 && e == 6
				&& (11 * m + 11) % 30 < 19)/**
											 * 若d=28,e=6,11m+11%30<19;回傳"in"+年分+
											 * "Easter Sunday is: month = 4 and day = 18"
											 */
		{
			return ("in" + ayear + ", Easter Sunday is: month = 4 and day = 18");
		}

		return null;

	}
}
