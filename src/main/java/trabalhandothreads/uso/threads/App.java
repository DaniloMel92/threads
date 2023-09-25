package trabalhandothreads.uso.threads;

import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import trabalhandothreads.uso.threads.media.Media;
import trabalhandothreads.uso.threads.timemusic.TimeMusic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, JavaLayerException
    {
    	Media m = new Media("c:/users/danilo/desktop/ache.mp3");
    	 TimeMusic t = new TimeMusic(m);
    	 Thread t1 = new Thread(m);
    	 Thread t2 = new Thread(t);
    	 t1.start();
    	 t2.start();
               
    }
}
