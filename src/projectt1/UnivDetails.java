package projectt1;

public class UnivDetails extends Abstract{

	@Override
	public void ugMark() {
		System.out.println("72");
		
	}

	@Override
	public void pgMark() {
		System.out.println("92");		
		
	}
	public static void main(String[] args) {
		
UnivDetails k=new UnivDetails();
k.pgMark();
k.ugMark();
k.studentName();



}
}
