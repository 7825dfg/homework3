package homework;

import java.util.Scanner;

public class C03 {
	int month;
	int count=0;
	int day;
	
	
	 void input(){
		 Scanner A = new Scanner(System.in);
		 
		 System.out.println("�� �� �Է��ϼ���.");
		 this.month = A.nextInt();
		 System.out.println("�� �� �Է��ϼ���.");
		 this.day = A.nextInt();
		 
		 output();
		 }
	 void output(){
		 for(int i=1; i<this.month;i ++){
			 
			 if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i== 12) 
				 this.count +=31;
			 
			 else if(i==2) this.count +=28;
			 
			 else this.count +=30;
 		 }
		 count += this.day;
		 
		 System.out.println(month+"��"+day+"�� ������ �� ���� "+count+"�Դϴ�.");
	 }
	 
	
	
  
	public static void main(String[] args) {
		new C03().input();

	}

}
