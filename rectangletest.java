
/*
 * [A]98
 * [TA's advise]
 * 1.物件中的變數宣告為public static, public的確讓變數很好取用, 但可能會產生一些安全性上的問題(會不會不小心被其他程式碼做修改導致原本的內容不符合預期?)
 * 另外static會將該變數宣告為一份, 如果這麼做的話, 是否會產生一些問題呢?
 * 2.沒有override toString(), 此部分扣2分.
 * 3.基本上沒什麼太大問題, 可以想想看該怎麼寫得更精簡以利你後續維護, 實踐優良的程式可讀性.
 * */

import java.util.*;

//建議自行建置的class放在前面.
class rec {
	public static double width;
	
	//hight or height?
	public static double hight;
	
	//area與perimeter可以透過width和height產生, 那是否有額外宣告的必要呢?
	public static double area;
	public static double perimeter;
	
	public static double x;
	public static double y;

	public double getwidth() {
		return width;
	}

	public double gethight() {
		return hight;
	}

	public double getx() {
		return x;
	}

	public double gety() {
		return y;
	}
	
	//public String toString(){}
}

public class rectangletest {

	public static void main(String[] args) {
		try {
			rec rectangle1 = new rec();
			Scanner scanner = new Scanner(System.in);
			System.out.println("請輸入長度");
			rectangle1.width = scanner.nextDouble();
			System.out.println("請輸入寬度");
			rectangle1.hight = scanner.nextDouble();
			System.out.println("請輸入X");
			rectangle1.x = scanner.nextDouble();
			System.out.println("請輸入y");
			rectangle1.y = scanner.nextDouble();
			System.out.println("x=" + rectangle1.x);
			System.out.println("y=" + rectangle1.y);
			rectangle1.area = rectangle1.width * rectangle1.hight;
			rectangle1.perimeter = 2 * (rectangle1.width + rectangle1.hight);
			System.out.println("area=" + rectangle1.area);
			System.out.println("perimeter=" + rectangle1.perimeter);
			rec rectangle2 = new rec();
			System.out.println("請輸入長度");
			rectangle2.width = scanner.nextDouble();
			System.out.println("請輸入寬度");
			rectangle2.hight = scanner.nextDouble();
			System.out.println("請輸入X");
			rectangle2.x = scanner.nextDouble();
			System.out.println("請輸入y");
			rectangle2.y = scanner.nextDouble();
			System.out.println("x=" + rectangle2.x);
			System.out.println("y=" + rectangle2.y);
			rectangle2.area = rectangle1.width * rectangle1.hight;
			rectangle2.perimeter = 2 * (rectangle2.width + rectangle2.hight);
			System.out.println("area=" + rectangle2.area);
			System.out.println("perimeter=" + rectangle2.perimeter);

		} catch (Exception e) {
			System.exit(1);
		}

	}
}
