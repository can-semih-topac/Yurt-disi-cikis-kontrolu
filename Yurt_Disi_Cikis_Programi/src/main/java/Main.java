






public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha gökçen havalaanına hoşgeldiniz");
        
        String sartlar = "yurtdışı çıkış kuralları...\n" 
                        +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor\n"
                        +"1500 tl harc bedelini yatırmanız gerekiyor\n"
                        +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor\n";
                
       String message = "yurt dışı çıkış şartlarından hepsini sağlamanız gerekiyor.";

                
        while(true) {
            System.out.println("*************************");
            System.out.println(message);
            System.out.println("*************");
       
            System.out.println(sartlar);
            
            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli Kontrol ediliyor");
            
            Thread.sleep( 3000); //ms cinsinden uyutuyor
            if(yolcu.yurtdisiHarci() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(3000);
            if(yolcu.siyasiYasak() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumu()== false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlmeleriniz tamamlanmıştır\n");
            System.out.println("Yurt dışına çıkabilirsiniz.");
            break;
            
        }
    }
}
