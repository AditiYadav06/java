class finaluse{
	final int enrolment_no;
	final String student_name;
	final String date_of_birth;
	
	finaluse(int en,String sn, String d){
		enrolment_no=en;
		student_name=sn;
		date_of_birth=d;
	}
	void disply(){
		System.out.println("Enrolment Number:"+enrolment_no);
		System.out.println("Name:"+student_name);
		System.out.println("Dob:"+date_of_birth);
	}
	public static void main (String [] args){
		finaluse f= new finaluse(5376,"Aditi Yadav","6/04/2000");
		f.disply();
	}
}
