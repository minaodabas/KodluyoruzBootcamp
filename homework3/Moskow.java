public class Moskow extends City implements Runnable{
    public Moskow(String name){
        setCityCode("MOW");
        setCityName(name);
        setGmt("GMT+3");
    }

    @Override
    public void run() {
        synchronized (this){
            this.showTime();
        }
    }
}
