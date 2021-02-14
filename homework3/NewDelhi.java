public class NewDelhi extends City implements Runnable {
    public NewDelhi(String name){
        setCityCode("IN");
        setCityName(name);
        setGmt("GMT+5.5");
    }

    @Override
    public void run() {
        synchronized (this){
            this.showTime();
        }
    }
}
