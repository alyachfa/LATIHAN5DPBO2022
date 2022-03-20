/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String tnim;
    private String tnama;
    private String tmatkul;
    private String tnilai;
    
    public Mahasiswa(String n1, String n2, String n3, String n4){
        tnim = n1;
        tnama = n2;
        tmatkul = n3;
        tnilai = n4;
    }
    
    public void setNim(String n) {
        tnim = n;
    }
    
    public void setNama(String n) {
        tnama = n;
    }

    public void setMatkul(String n) {
        tmatkul = n;
    }
    
    public void setNilai(String n) {
        tnilai = n;
    }
    
    public String getNim() {
        return tnim;
    }
    
    public String getNama() {
        return tnama;
    }
    
    public String getMatkul() {
        return tmatkul;
    }
    
    public String getNilai() {
        return tnilai;
    }
}
