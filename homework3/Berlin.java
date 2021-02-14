public class Berlin extends City implements Runnable {

    public Berlin(String name){

        setCityCode("MOW");
        setCityName(name);
        setGmt("GMT+2");


    }

    @Override
    public void run() {
        synchronized (this){
            this.showTime();
        }
    }
}
