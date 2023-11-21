class Patient{
	int idNo,age;
	String bloodData;
	Patient(){
		idNo = 0;
		age = 0;
		bloodData = "0";
	}
	Patient(int idNo, int age, String bloodData){
		this.idNo = idNo;
		this.age = age;
		this.bloodData = bloodData;
	}
	void getData(){
		System.out.println("***** Patient Data *****");
		System.out.println("Id no :- "+idNo);
		System.out.println("Age :- "+age);
		System.out.println("Blood Group :- "+bloodData);
	}
}
public class TestPatient{
	public static void main(String[] args){
		Patient patientOne = new Patient();
		patientOne.getData();
		Patient patientTwo = new Patient(1011,23,"B+");
		patientTwo.getData();
	}
}
