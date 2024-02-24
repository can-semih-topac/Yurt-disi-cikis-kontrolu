
import java.util.Scanner;


public class Yolcu implements Yurt_disi_kurallari{
private int harc;
private boolean siyasiYasak;
private boolean vizeDurumu;
public Yolcu(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yatırdığınız harc bedeli:");
    this.harc = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("Siyasi yasağınız bulunuyor mu?");
    String cevap = scanner.nextLine();
    if(cevap.equals("evet")){
        this.siyasiYasak = true;
    }
    else{
        this.siyasiYasak = false;
    }
    System.out.println("Vizeniz bulunuyor mu?");
    String cevap2 = scanner.nextLine();
    if(cevap2.equals("evet")){
        this.vizeDurumu = true;
    }
    else{
        this.vizeDurumu = false;
    }
    
    
    
    
    
    
}
    @Override
    public boolean yurtdisiHarci() {
        if(this.harc<15){
            System.out.println("Yurt dışı harcını tam yatırın");
            return false;
        }else{
            System.out.println("Yurt dışı harcı tamamdır");
            return true;
            
        }
    }

    @Override
    public boolean siyasiYasak() {
        if(this.siyasiYasak== true){
            System.out.println("Siyasi yasask bulunuor çıkamazsınız");
            return false;
                   
        }else{
            System.out.println("Siyasi yasak bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if(this.vizeDurumu== true){
            System.out.println("Vize işlemleri tamamdıur");
            return true;
        }else {
            System.out.println("Vizeniz gideceğiniz ğlkeye bulunmamaktadır");
            
           return false;
                  
        }
        
    }
    
    
}
