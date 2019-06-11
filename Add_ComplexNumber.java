package addComplexNum;

public class ComplexNumber {
	double real,img;
	public static void main(String args[]) {
		ComplexNumber c1 = new  ComplexNumber(5,2);
		ComplexNumber c2 = new  ComplexNumber(2,2);
		ComplexNumber sum = new  ComplexNumber(0,0);
		sum.real=c1.real+c2.real;
		sum.img=c1.img+c2.img;
		System.out.print("output: "+sum.real+"+"+sum.img);
		
	}
	ComplexNumber(double r, double i){
		this.real=r;
		this.img=i;
		
	}

}
