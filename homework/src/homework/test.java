package homework;

import java.util.*;
public class test {
	 double sal;
     double tax;
   
   void input(){
     Scanner A = new Scanner(System.in);
     System.out.println("������ �Է��Ͻÿ�.");
     this.sal = A.nextInt();
     output();
   }
   void output(){
	 if(sal<10000000) this.tax = sal*0.095;
	 else if(sal <40000000) this.tax = sal * 0.19;
	 else if(sal <80000000) this.tax = sal * 0.28;
	 else this.tax = sal*0.37;
	 
	 System.out.println("�ҵ漼�� "+(int)tax+" �� �Դϴ�.");
	 
   }
   
   
   
	public static void main(String[] args) {
		new test().input();

	}

}
