package trabalhandothreads.uso.threads.timemusic;

import trabalhandothreads.uso.threads.media.Media;

public class TimeMusic implements Runnable {
Media med;
public TimeMusic(Media med) {
	this.med = med;
}
public void contarTempo() {
	try {
		med.time();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
@Override
public void run() {
	synchronized (this) {
		contarTempo();
	}
	
}
}
