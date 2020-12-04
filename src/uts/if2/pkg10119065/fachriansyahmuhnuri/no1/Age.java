package uts.if2.pkg10119065.fachriansyahmuhnuri.no1;


public class Age {
    private int yearBirth, yearNow;
    private String red ="\u001B[31m";

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
       String keterangan;
       if(umur <= 0 || umur < 5)
       {
           keterangan = "LAGI LUCU-LUCU NYA";
       }else if(umur < 5 || umur <= 10)
       {
           keterangan = "Masih Anak Anak";
       }else if(umur < 10 || umur <= 13)
       {
           keterangan = "Masih Remaja";
       }else if(umur < 13 || umur <= 19)
       {
           keterangan = "Alay";
       }else if(umur < 19 || umur <= 29)
       {
           keterangan = "Lagi galau nyari jodoh";
       }else if(umur < 29 || umur <= 35)
       {
           keterangan = "Lagi sibuk nyari uang";
       }else if(umur < 35 || umur <= 150)
       {
           keterangan = "Sudah tua";
       }else
       {
           keterangan = "Tidak terdeteksi di kehidupan";
       }
       return red + keterangan;
    }
}
