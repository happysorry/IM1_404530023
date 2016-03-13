import java.util.*;


public class rectangletest
{
	
	
	public static void main(String[]args){
		try{
			rec rectangle1=new rec();
	Scanner scanner=new Scanner(System.in);
	System.out.println("請輸入長度");
	rectangle1.width=scanner.nextDouble();
System.out.println("請輸入寬度");
rectangle1.hight=scanner.nextDouble();
System.out.println("請輸入X");
rectangle1.x=scanner.nextDouble();
System.out.println("請輸入y");
rectangle1.y=scanner.nextDouble();
System.out.println("x="+rectangle1.x);
System.out.println("y="+rectangle1.y);
rectangle1.area=rectangle1.width*rectangle1.hight;
rectangle1.perimeter=2*(rectangle1.width+rectangle1.hight);
System.out.println("area="+rectangle1.area);
System.out.println("perimeter="+rectangle1.perimeter);
rec rectangle2=new rec();
System.out.println("請輸入長度");
rectangle2.width=scanner.nextDouble();
System.out.println("請輸入寬度");
rectangle2.hight=scanner.nextDouble();
System.out.println("請輸入X");
rectangle2.x=scanner.nextDouble();
System.out.println("請輸入y");
rectangle2.y=scanner.nextDouble();
System.out.println("x="+rectangle2.x);
System.out.println("y="+rectangle2.y);
rectangle2.area=rectangle1.width*rectangle1.hight;
rectangle2.perimeter=2*(rectangle2.width+rectangle2.hight);
System.out.println("area="+rectangle2.area);
System.out.println("perimeter="+rectangle2.perimeter);

}
		catch(Exception e){
	System.exit(1);
}


	}
}
	 class rec
	{
		public static double width;
		public static double hight;
		public static double area;
		public static double perimeter;
		public static double x;
		public static double y;
		

		 public double getwidth()
		 {
			return width; 
		 }
		 public double gethight()
		 {
			 return hight;
		 }
		 public double getx()
		 {
			 return x;
		 }
		 public double gety()
		 {
			 return y;
		 }
	
	 }





