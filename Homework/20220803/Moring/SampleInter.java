package Moring;

public  class SampleInter implements Sample {
public static void main(String[] args) {
	System.out.println(pi);
	String a ="a";
	String b ="c";
	
	if(a==b) {
		System.out.println("출력");
	}
	if(a.equals(b)) {
		System.out.println("출력2");
	}
	StringBuilder sb = new StringBuilder();
	
	
	sb.append(b);
	
	System.out.println(sb.append(a));
	
	
}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int service() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
