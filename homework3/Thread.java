public class Thread implements Runnable {
    private City city;

    public Thread(City city){
        this.city = city;
    }

    @Override
    public void run() {
        city.showTime();

    }
}
