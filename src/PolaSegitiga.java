
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
    
    
    
    
        
    
}
