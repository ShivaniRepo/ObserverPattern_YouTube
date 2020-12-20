import java.util.ArrayList;
import java.util.List;

public class Channel 
{
	//Channel should know how many subscriber.
	private List<Subscriber> subs = new ArrayList<>();
	public String title;
	
	public void subscribe( Subscriber sub )
	{
		subs.add( sub );
	}
	
	
	public void unSubscribe( Subscriber sub )
	{
		subs.remove( sub );
	}
	
	//Notify all subscribers
	public void notifySubscribers()
	{
		for( Subscriber sub : subs )
		{
			sub.update();
		}
	}
	
	public void upload( String title )
	{
		this.title = title;
		notifySubscribers();
	}
}
