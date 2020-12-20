
public class YouTube 
{

	public static void main(String[] args) 
	{
		//Create Channel
		Channel danceChannel = new Channel();

		//Create subscriber
		Subscriber s1 = new Subscriber( "Shivani" );
		Subscriber s2 = new Subscriber( "Mary" );
		Subscriber s3 = new Subscriber( "John" );
		Subscriber s4 = new Subscriber( "David" );
		Subscriber s5 = new Subscriber( "Ken" );
		
		//Add the subscriber to the channel.
		danceChannel.subscribe(s1);
		danceChannel.subscribe(s2);
		danceChannel.subscribe(s3);
		danceChannel.subscribe(s4);
		danceChannel.subscribe(s5);
		
		//Subscribers should also know which channel they have subscribed
		s1.subcribeChannel( danceChannel );
		s2.subcribeChannel( danceChannel );
		s3.subcribeChannel( danceChannel );
		s4.subcribeChannel( danceChannel );
		s5.subcribeChannel( danceChannel );
		
		//Channel uploaded a video, time to notify subscribers
		danceChannel.upload("New video");
		
	}

}
