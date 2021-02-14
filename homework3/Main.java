import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {




    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Map<String, City> cityMap = new HashMap<String, City>();
        City Moskow = new City("Moskow", "MOW", "GMT+3");
        cityMap.put(Moskow.getCityCode(),Moskow);
        City Newyork = new City("Newyork", "NYC", "Gmt-5");
        cityMap.put(Newyork.getCityCode(), Newyork);
        City London = new City("London", "LON", "Gmt");
        cityMap.put(London.getCityCode(), London);
        City Berlin = new City("Berlin", "BER", "Gmt+2");
        cityMap.put(Berlin.getCityCode(), Berlin);
        City Newdelhi = new City("New Delhi", "IN", "Gmt+5.5");
        cityMap.put(Newdelhi.getCityCode(),Newdelhi);

        List<City> CityName = new ArrayList<>(cityMap.values());
        Collections.sort(CityName);
        for(City c : CityName){
            System.out.println(c.getCityCode() + ":" + c.getCityName());

        }

        Scanner input = new Scanner(System.in);
        String citycode = input.next();
        switch (citycode){
            case "BER":
                Thread runnableBerlin = new Thread(Berlin);
                executorService.execute(runnableBerlin);
                break;
            case "LON":
                Thread runnableLondon = new Thread(London);
                executorService.execute(runnableLondon);
                break;
            case "MOW":
                Thread runnableMoskow = new Thread(Moskow);
                executorService.execute(runnableMoskow);
                break;
            case "IN":
                Thread runnableNewdelhi = new Thread(Newdelhi);
                executorService.execute(runnableNewdelhi);
                break;
            case "NYC":
                Thread runnableNewyork = new Thread(Newyork);
                executorService.execute(runnableNewyork);
                break;
            default:
                System.out.println("Wrong city code please try again");

        }


















    }
}




















