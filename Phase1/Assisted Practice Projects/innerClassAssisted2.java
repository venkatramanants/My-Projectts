package innerclass2;
public class innerClassAssisted2 {

private String msg="Hello";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	innerClassAssisted2  ob=new innerClassAssisted2 ();  
	ob.display();  
	}
}
