package ObserverPattern;

public class ObserverImpl implements Observer{

	
	
	String ID;
	String Status;
	
	public ObserverImpl(String ID) {
		this.ID=ID;
	}
	
	
	@Override
	public void UpdateSubjects(Subject subject) {
		// TODO Auto-generated method stub
		this.Status= subject.getStatus();
		System.out.println("Observer recieved state change of subject ID : " + this.ID + "Status"+ this.Status);
	}

}
