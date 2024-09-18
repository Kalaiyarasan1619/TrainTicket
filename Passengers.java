package home.trainpassengers.com;

class Train {
	// states
	int train_no;
	String train_name;

	// constructors
	public Train(int train_no, String train_name) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
	}

}

public class Passengers extends Train {
	// states
	int passenger_id;
	String passenger_name;
	String passenger_travel;
	long passenger_phone;

	// constructors
	public Passengers(int train_no, String train_name, int passenger_id, String passenger_name, String passenger_travel,
			long passenger_phone) {
		super(train_no, train_name);
		this.passenger_id = passenger_id;
		this.passenger_name = passenger_name;
		this.passenger_travel = passenger_travel;
		this.passenger_phone = passenger_phone;
	}

}