package homework;

import java.util.Scanner;

public class C01 {
     
	int num1, num2, num3;
     int max, min;
     
     
	void input(){
		Scanner A = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		this.num1 = A.nextInt();
		
		System.out.println("�ι��� ���ڸ� �Է��ϼ���.");
		this.num2 = A.nextInt();
		
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		this.num3 = A.nextInt();
		
		output();
	
	}
	 
	 void output(){
		 
		 if(num1>num2){
			 this.max = num1;
			 this.min = num2;
			}
		 
		 else{
			 this.max = num2;
			 this.min = num1;
			}
		if(max<num3){
			this.max=num3;
		}
		if(num3<min){
			this.min = num3;
		}
		
		System.out.println("�ִ밪�� "+max+" �Դϴ�.");
		System.out.println("�ּҰ��� "+min+" �Դϴ�.");
			
			
		}
	
	 
	public static void main(String[] args) {
		new C01().input();

	}

}
