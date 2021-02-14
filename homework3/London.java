public class London extends City implements Runnable {
    public London(String name){

        setCityCode("LON");
        setCityName(name);
        setGmt("GMT");

    }
    @Override
    public void run() {
        synchronized (this){
            this.showTime();
        }

    }
}
