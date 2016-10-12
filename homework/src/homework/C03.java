package homework;

import java.util.Scanner;

public class C03 {
	int month;
	int count=0;
	int day;
	
	
	 void input(){
		 Scanner A = new Scanner(System.in);
		 
		 System.out.println("월 을 입력하세요.");
		 this.month = A.nextInt();
		 System.out.println("일 을 입력하세요.");
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
		 
		 System.out.println(month+"월"+day+"일 까지의 날 수는 "+count+"입니다.");
	 }
	 
	
	
  
	public static void main(String[] args) {
		new C03().input();

	}

}
