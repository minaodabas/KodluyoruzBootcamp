public class NewYork extends City implements Runnable{
    public NewYork(String name){
        setCityCode("NYC");
        setCityName(name);
        setGmt("GMT-5");
    }

    @Override
    public void run() {
        synchronized (this){
            this.showTime();
        }
    }
}
