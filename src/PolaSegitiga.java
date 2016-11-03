
import java.util.Scanner;

public class PolaSegitiga {
    private int batasan;

    public int getBatasan() {
        return batasan;
    }

    public void setBatasan(int batasan) {
        this.batasan = batasan;
    }
    
    public int inputBatasan (int batas){
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan batas karakter : ");
        batas = masukan.nextInt();
        
        return (this.batasan = batas);
    }
    
    public void choices(){
        System.out.println("Pilihan bentu karakter : \n "
                + "1. Segitiga Kanan \n "
                + "2. Segitiga Terbalik Kanan \n "
                + "3. Segitiga Kiri \n "
                + "4. Segitiga Terbalik Kiri \n "
                + "5. Segitiga Sama Kaki \n ");
        
        
        
    }
    
    
    
        
    
}
