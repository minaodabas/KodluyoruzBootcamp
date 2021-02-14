package Homework2;

public class SamsungMarka extends Telefon implements Arama,Sms,Klavye {

    public SamsungMarka(){

    }
    public SamsungMarka(String modeladi,String imeinumarasi,String versiyonnumarasi,int bellekkapasitesi,double ekranboyutu){
        super(modeladi,imeinumarasi,versiyonnumarasi,bellekkapasitesi,ekranboyutu);
    }



    @Override
    public void arama() {
        System.out.println("Arama yapiliyor..");

    }

    @Override
    public void sms() {
        System.out.println("Sms gonderiliyor..");

    }
    public void DosyaPaylasimi(){
        System.out.println("Dosya paylasimi yapiliyor..");

    }
    public void Mp3(){
        System.out.println("Mp3 basliyor..");

    }

    @Override
    public void klavyeBilgisi() {
        System.out.println("Tuslu klavye");
    }
}
