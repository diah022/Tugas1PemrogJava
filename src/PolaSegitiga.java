
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
                    break;
            case 2 : SegitigaTerbalikKanan();
                    break;
            
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
        
        for(int a = batasan; a > 0; a--)
        {
            for(int b = a; b > 0; b--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void SegitigaKiri() {
        inputBatasan(batasan);
        
        for(int c = 1; c <= batasan; c++)
        {
            for(int d = 1; d <= batasan-c; d++)
            {
                System.out.print(" ");
            }
            for(int e = 1; e <= c-1; e++)
            {
                System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
        }
    }

    private void SegitigaTerbalikKiri() {
        inputBatasan(batasan);
        
        for(int f = batasan; f > 0; f--)
        {
            for(int g = 1; g > f-batasan; g--)
            {
                System.out.print(" ");
            }
            for(int h = 1; h > 1-f; h--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void SegitigaSamaKaki() {
       inputBatasan(batasan); 
       
       for(int f = 1; f <= batasan; f++)
       {
          for(int g = 1; g <= batasan-f; g++)
          {
            System.out.print(" ");
          } 
          for(int h = 1; h <= f-1; h++)
          {
            System.out.print("*");
          }
          for(int k = 1; k <= f-1; k++)
          {
            System.out.print("*");
          }
          System.out.print("*");
          System.out.println();
       }
    }
    
    
    
    
    
        
    
}
