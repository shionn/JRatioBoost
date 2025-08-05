
import java.util.ArrayList;
import java.util.Timer;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * This class contains all the torrent data such as torrent name, size, tracker
 * info etc. It also contains the elements such as the thread objects so more than
 * one torrent can be spoofed at the same time.
 * 
 * @author karma
 * @version 1.0
 * 
 */
@Getter
@Setter
public class TorrentElement {
	
	private int index;			
	private long uploadAmount;
	private long downloadAmount;			
	private int uploadSpeed;			
	private int downloadSpeed;			
	private int timeLeft;				
	private long uploadSent;			
	private String port;				
	private String customUserAgent;
	private Timer timer;				
	private TorrentInfo tInfo;			
	private TrackerConnect tConn;			
	private ArrayList<String> numAnnouce;	
	private ArrayList<String> errorMsg;	
	
	/**
	 * Constructor that initialises all member variables to their default values
	 */
	public TorrentElement() {
		
		this.uploadAmount = 0;
		this.downloadAmount = 0;
		this.uploadSpeed = 40;
		this.downloadSpeed = 10;
		this.timeLeft = 0;
		this.uploadSent = 0;
		this.port = "6881";
		this.customUserAgent = null;
		this.numAnnouce = new ArrayList<>();
		this.errorMsg = new ArrayList<>();
	}
	

	/**
	 * This function sets the customUserAgent member variable. If an empty sting is given as a parameter
	 * it will set the member variable to null as a precaution.
	 * @param customUserAgent A String that represents the user agent string that is sent to the tracker 
	 */	
	public void setCustomUserAgent(String customUserAgent) {
	
		if (customUserAgent.isEmpty()) {
			
			this.customUserAgent = null;
		
		} else {
		
			this.customUserAgent = customUserAgent;
		}
	}
	
}
