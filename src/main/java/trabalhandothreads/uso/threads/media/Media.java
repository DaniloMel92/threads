package trabalhandothreads.uso.threads.media;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Media implements Runnable {
	private InputStream file;
	private Player music;
	public boolean terminated;
	
public Media(String file)throws IOException,JavaLayerException{
	this.file = new FileInputStream(file);
    music = new Player(this.file);
	
}

public void tocar() throws JavaLayerException {
	music.play();
	
	}
public void time() throws InterruptedException {
	Thread.sleep(900);
	while(!music.isComplete()) {
		int m = music.getPosition()/1000/60;
		int s = music.getPosition()/1000-60*m;
		Thread.sleep(900);
		System.err.println(m+":"+s);
	}
}
@Override
	public void run() {
	synchronized(this) {
		try {
		tocar();
		} catch (JavaLayerException e) {
			
		}
		
		
	}
		
	}

}
