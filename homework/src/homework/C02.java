package homework;

import java.util.Scanner;

public class C02 {
    double pyung;
    double m2;
    
    void input(){
    	Scanner A = new Scanner(System.in);
    
    	System.out.println("������ �Է��ϼ���. ");
    	this.m2 = A.nextDouble();
    	output();
    	
    }
	
    void output(){
    	this.pyung = m2/3.305;
    	if(pyung<15){
    		System.out.printf("%.1f ��, ���� ����Ʈ �Դϴ�.", pyung);
    	}
    	
    	else if(pyung<30){
    		System.out.printf("%.1f ��, �߼��� ����Ʈ �Դϴ�.", pyung);
    	}
    	else if(pyung<50){
    		System.out.printf("%.1f ��, ���� ����Ʈ �Դϴ�.", pyung);
    	}
    	else System.out.printf("%.1f ��, ���� ����Ʈ �Դϴ�.", pyung);
    	
    	
    }
	
	
	
	public static void main(String[] args) {
		new C02().input();
	
	}

}
