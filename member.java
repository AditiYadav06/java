class member {
	String name;
	String address;
	String number;
	int age;
	int salary;
	
	public void printsalary(){
		System.out.println(salary);
	}
}

class manager extends member {
	String department;
}

class employee extends member{
		String specialization;
}

class details {
	public static void main (String[] args){
		manager m = new manager();
		m.name="Drishti Yadav";
		m.number="7023839303";
		m.age=23;
		m.address="7 Anmol Nagar";
		m.department="Service";
		m.salary=100000;
		
		employee e= new employee();
		e.name="Aditi Yadav";
		e.number="7023839303";
		e.age=20;
		e.address="7 Anmol Nagar";
		e.specialization="Engineer";
		e.salary=60000;
		
	}
}

		
	

	
	
	
	