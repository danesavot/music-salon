package mum.edu.logging;

public class Logger implements ILogger{

	public void log(String logstring) {
		java.util.logging.Logger.getLogger("MusicSalonLogger").info(logstring);		
	}

}
