package advenced.ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<6; i++) {
            try {
                System.out.println("음악을 재생합니다.");
                Thread.sleep(1000);
            } catch (InterruptedException  e) {
                e.printStackTrace();
            }
        }
    }
}
