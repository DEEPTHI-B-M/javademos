package threadingdemo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class executorframework {
	public static void main(String[]args) {
		VideoProcessingTask[]tasks= {
			new VideoProcessingTask("bank");
			new VideoProcessingTask("school");
			new VideoProcessingTask("conference");
			new VideoProcessingTask("homesecurity");
			
		ExecutorService newFixedThreadPool=Executors.newFixedThreadPool(4);
		for (VideoProcessingTask vptask:tasks) {
			newFixedThreadPool.submit(vptask);
		}
		newFixedThreadPool.shutdown();
	}
}
class VideoProcessingTask implements Runnable{
	String sourceName;
	public VideoProcessingTask(String source) {
		this.sourceName=source;
	}
	public void run() {
		utils.printmessage("processing video from"+sourceName+"started");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		utils.printmessage("processing video from"+sourceName+"ended...");
	}
}
