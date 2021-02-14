package Homework2;

public class Telefon {
     private String modeladi;
     private String imeinumarasi;
     private String versiyonnumarasi;
     private int bellekkapasitesi;
     private double ekranboyutu;
     public Telefon(){

     }

     public Telefon(String modeladi,String imeinumarasi,String versiyonnumarasi,int bellekkapasitesi,double ekranboyutu){
          this.modeladi = modeladi;
          this.imeinumarasi = imeinumarasi;
          this.versiyonnumarasi = versiyonnumarasi;
          this.bellekkapasitesi = bellekkapasitesi;
          this.ekranboyutu = ekranboyutu;

     }

     public void BilgileriGoster(){
          System.out.println("Model adi:" +modeladi);
          System.out.println("Imei Numarasi:" +imeinumarasi);
          System.out.println("Versiyon numarasi:" +versiyonnumarasi);
          System.out.println("Bellek Kapasitesi:" +bellekkapasitesi);
          System.out.println("Ekran Boyutu:" +ekranboyutu);
     }


     public String getModeladi() {
          return modeladi;
     }

     public void setModeladideladi(String modeladi) {
          this.modeladi = modeladi;
     }

     public String getImeinumarasi() {
          return imeinumarasi;
     }

     public void setImeinumarasi(String imeinumarasi) {
          this.imeinumarasi = imeinumarasi;
     }

     public String getVersiyonnumarasi() {
          return versiyonnumarasi;
     }

     public void setVersiyonnumarasi(String versiyonnumarasi) {
          this.versiyonnumarasi = versiyonnumarasi;
     }

     public int getBellekkapasitesi() {
          return bellekkapasitesi;
     }

     public void setBellekkapasitesi(int bellekkapasitesi) {
          this.bellekkapasitesi = bellekkapasitesi;
     }

     public double getEkranboyutu() {
          return ekranboyutu;
     }

     public void setEkranboyutu(double ekranboyutu) {
          this.ekranboyutu = ekranboyutu;
     }
}
