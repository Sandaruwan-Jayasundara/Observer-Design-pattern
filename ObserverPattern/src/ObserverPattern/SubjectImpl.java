package ObserverPattern;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SubjectImpl implements Subject {

	ArrayList<Observer> list=new ArrayList<>();
	
	private String Status;
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	@Override
	public void setStatus(String Status) {
		this.Status = Status;
		notifyObservers();
	}

	@Override
	public String getStatus() {
		
		return "";
	}
	
	public void notifyObservers(){
	
	
		Iterator<Observer> notif = list.iterator();
		
		while (notif.hasNext()){
			Observer observer = (Observer)notif.next();
			observer.UpdateSubjects(this);
		}
}	


}
