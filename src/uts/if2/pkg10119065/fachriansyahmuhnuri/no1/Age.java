package uts.if2.pkg10119065.fachriansyahmuhnuri.no1;
import java.awt.Color;

public class Age {
    private int yearBirth, yearNow;
    private String red;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur()
    {
        return yearNow - yearBirth;
    }
    public String tandanyaKamu(int umur)
    {
       if(umur <= 0 || umur < 5)
       {
           return "LAGI LUCU-LUCU NYA";
       }else if(umur < 5 || umur <= 10)
       {
           return "Masih Anak Anak";
       }else if(umur < 10 || umur <= 13)
       {
           return "Masih Remaja";
       }else if(umur < 13 || umur <= 19)
       {
           return "Alay";
       }else if(umur < 19 || umur <= 29)
       {
           return "Lagi galau nyari jodoh";
       }else if(umur < 29 || umur <= 35)
       {
           return "Lagi sibuk nyari uang";
       }else if(umur < 35 || umur <= 150)
       {
           return "Sudah tua";
       }else
       {
           return "Tidak terdeteksi di kehidupan";
       }
    }
}
