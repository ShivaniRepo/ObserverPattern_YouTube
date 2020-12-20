
public class Subscriber 
{
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) 
	{
		super();
		this.name = name;
	}

	//This will be called when the channel is notifying all the subscribers.
	//Pushing from subject to the observers
	public void update()
	{
		System.out.println( name + ", Video uploaded. " + channel.title);
	}
	
	
	public void subcribeChannel( Channel ch )
	{
		channel = ch;
	}
}
