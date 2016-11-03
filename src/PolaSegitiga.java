
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
        System.out.println("Pilihan bentuk karakter : \n "
                + "1. Segitiga Kanan \n "
                + "2. Segitiga Terbalik Kanan \n "
                + "3. Segitiga Kiri \n "
                + "4. Segitiga Terbalik Kiri \n "
                + "5. Segitiga Sama Kaki \n ");
        
        Scanner pilihan = new Scanner(System.in);
        System.out.println("Pilih bentuk karakter yang ingin tampil : ");
        int pil = pilihan.nextInt();
        
        switch(pil){
            case 1 : SegitgaKanan();
            case 2 : SegitigaTerbalikKanan();
            case 3 : SegitigaKiri();
            case 4 : SegitigaTerbalikKiri();
            case 5 : SegitigaSamaKaki();
        }
        
    }

    private void SegitgaKanan() {
        inputBatasan(batasan);
        
        for(int i = 0; i <= batasan; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    private void SegitigaTerbalikKanan() {
        inputBatasan(batasan);
        
        for(int a = 6; a > 0; a--)
        {
            for(int b = a; b > 0; b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void SegitigaKiri() {
        
    }

    private void SegitigaTerbalikKiri() {
        
    }

    private void SegitigaSamaKaki() {
        
    }
    
    
    
    
    
        
    
}
