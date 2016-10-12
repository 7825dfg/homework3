import java.util.*;

 class B04 {
     double sal;
     double tax;
   
   void input(){
     Scanner A = new Scanner(System.in);
     System.out.println("연봉을 입력하시오.");
     this.sal = A.nextInt();
      output();
   }
   void output(){
	 if(sal<10000000) this.tax = sal*0.095;
	 else if(sal <40000000) this.tax = sal*0.19;
	 else if(sal <80000000) this.tax = sal*0.28;
	 else this.tax = sal*0.37;
	 
	 System.out.println("소득세는 "+(int)tax+" 원 입니다.");
	 
   }
   
   
   
	public static void main(String[] args) {
		new B04().input();

	}

}
