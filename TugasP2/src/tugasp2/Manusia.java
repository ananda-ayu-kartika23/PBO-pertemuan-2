/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasp2;

/**
 *
 * @author ANANDA AYU KARTIKA S
 */
public class Manusia {

    /**
     * @return the Umur
     */
    protected int getUmur() {
        return Umur;
    }

    /**
     * @param Umur the Umur to set
     */
    protected void setUmur(int Umur) {
        this.Umur = Umur;
    }

    /**
     * @return the Alamat
     */
    protected String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    protected void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    private int Umur;
    private String Alamat;

    public Manusia(int Umur, String Alamat) {
        this.Umur = Umur;
        this.Alamat = Alamat;
    }   
    
}
