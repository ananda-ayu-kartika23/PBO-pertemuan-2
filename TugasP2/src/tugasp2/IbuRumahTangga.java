/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp2;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class IbuRumahTangga extends Manusia implements MengurusAnak, Memasak,MengaturKeuangan {

    /**
     * @return the nama
     */
    protected String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the JumlahAnak
     */
    protected String getJumlahAnak() {
        return JumlahAnak;
    }

    /**
     * @param JumlahAnak the JumlahAnak to set
     */
    protected void setJumlahAnak(String JumlahAnak) {
        this.JumlahAnak = JumlahAnak;
    }

    /**
     * @return the Hobi
     */
    protected String getHobi() {
        return Hobi;
    }

    /**
     * @param Hobi the Hobi to set
     */
    protected void setHobi(String Hobi) {
        this.Hobi = Hobi;
    }
    
    private String nama;
    private String JumlahAnak;
    private String Hobi;

    public IbuRumahTangga(String nama, String JumlahAnak, String Hobi, int Umur, String Alamat) {
        super(Umur, Alamat);
        this.nama = nama;
        this.JumlahAnak = JumlahAnak;
        this.Hobi = Hobi;
    }
   
    public void MemberiASI() {
        System.out.println(nama + "memberi asi Di Pagi Hari");
    }
    
    public void MenggantiPopok() {
        System.out.println(nama + " sedang mengganti popok bayinya setelah buang air");
    }

    public void MenemaniBermain() {
        System.out.println(nama + " menemani bayinya bermain saat senggang");
    }

    public void MembeliBahanMasak() {
        System.out.println(nama + " sedang membeli bahan masak di pasar");
    }

    public void MemasakMakanan() {
        System.out.println(nama + " sedang memasak makanan untuk keluarga di dapur");
    }

    public void MencuciAlatMakan() {
        System.out.println(nama + " sedang mencuci alat makan setelah digunakan");
    }
    
     
    public void MencatatUangMasuk() {
        System.out.println(nama + " mencatat pemasukan bulanan keluarga");
    }

    
    public void MencatatUangKeluar() {
        System.out.println(nama + " mencatat semua pengeluaran rumah tangga");
    }

    
    public void MengisiTabungan() {
        System.out.println(nama + " menyisihkan uang untuk tabungan keluarga");
    }
    
    public static void main(String[] args) {
        
        IbuRumahTangga ibu = new IbuRumahTangga("siti", "1", "Menonton drakor", 25,"Lamongan");
        
        System.out.println("DATA IBU RUMAH TANGGA ");
        System.out.println("Nama        : " + ibu.getNama());
        System.out.println("Umur        : " + ibu.getUmur());
        System.out.println("Alamat      : " + ibu.getAlamat());
        System.out.println("Jumlah Anak : " + ibu.getJumlahAnak());
        System.out.println("Hobi        : " + ibu.getHobi());
        System.out.println();
        
        
        System.out.println("Kegiatan Mengurus Anak");
        ibu.MemberiASI();
        ibu.MenggantiPopok();
        ibu.MenemaniBermain();
        System.out.println();

        System.out.println("Kegiatan Memasak");
        ibu.MembeliBahanMasak();
        ibu.MemasakMakanan();
        ibu.MencuciAlatMakan();
        System.out.println();

        System.out.println("Kegiatan Mengatur Keuangan");
        ibu.MencatatUangMasuk();
        ibu.MencatatUangKeluar();
        ibu.MengisiTabungan();




        


    }



    
}  


