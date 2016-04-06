/*
 * [B]84
 * [TA's Advise]
 * 1.folder name請務必正確, 並確保上傳檔案可以正常執行.
 * 2.一開始打開的時候是錯誤的, 可修正, 等第從B開始
 * 3.有在javadoc中撰寫內容, Good JOB! extra point +2.
 * 4.有部分邏輯錯誤, 請務必注意!
 * */

/** 建立class EASTER,建立MAIN方法 */
public class EASTER {
	public static void main(
			String[] args)/** 呼叫EASTERTESTER、calculateEaster方法，輸入20012012 */
	{
		// 其實你不需要宣告物件, 直接透過class name去呼叫就好了.
		EASTERTESTER ayear = new EASTERTESTER();
		System.out.println(ayear.calculateEaster(2001));
		System.out.println(ayear.calculateEaster(2012));
	}
}
