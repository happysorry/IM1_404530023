
/*
 * [A]98
 * [TA's advise]
 * 1.���󤤪��ܼƫŧi��public static, public���T���ܼƫܦn����, ���i��|���ͤ@�Ǧw���ʤW�����D(�|���|���p�߳Q��L�{���X���ק�ɭP�쥻�����e���ŦX�w��?)
 * �t�~static�|�N���ܼƫŧi���@��, �p�G�o�򰵪���, �O�_�|���ͤ@�ǰ��D�O?
 * 2.�S��override toString(), ��������2��.
 * 3.�򥻤W�S����Ӥj���D, �i�H�Q�Q�ݸӫ��g�o���²�H�Q�A������@, ����u�}���{���iŪ��.
 * */

import java.util.*;

//��ĳ�ۦ�ظm��class��b�e��.
class rec {
	public static double width;
	
	//hight or height?
	public static double hight;
	
	//area�Pperimeter�i�H�z�Lwidth�Mheight����, ���O�_���B�~�ŧi�����n�O?
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
			System.out.println("�п�J����");
			rectangle1.width = scanner.nextDouble();
			System.out.println("�п�J�e��");
			rectangle1.hight = scanner.nextDouble();
			System.out.println("�п�JX");
			rectangle1.x = scanner.nextDouble();
			System.out.println("�п�Jy");
			rectangle1.y = scanner.nextDouble();
			System.out.println("x=" + rectangle1.x);
			System.out.println("y=" + rectangle1.y);
			rectangle1.area = rectangle1.width * rectangle1.hight;
			rectangle1.perimeter = 2 * (rectangle1.width + rectangle1.hight);
			System.out.println("area=" + rectangle1.area);
			System.out.println("perimeter=" + rectangle1.perimeter);
			rec rectangle2 = new rec();
			System.out.println("�п�J����");
			rectangle2.width = scanner.nextDouble();
			System.out.println("�п�J�e��");
			rectangle2.hight = scanner.nextDouble();
			System.out.println("�п�JX");
			rectangle2.x = scanner.nextDouble();
			System.out.println("�п�Jy");
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
