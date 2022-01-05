/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.project;

/**
 *
 * @author Asus
 */
public class serviceAccess {
    int tahunTemp;
    public String cekNama(){
        return "Askar";
    }
    
    public int umur(int tahunKelahiran,int tahunIni){
        int umurSekarang;
        
        int tahunLahir = tahunKelahiran;
        int tahunSekarang = tahunIni;
        
        umurSekarang = tahunSekarang - tahunLahir;
        tahunTemp = umurSekarang;
        return umurSekarang;
    }
    
    public String cekStatus(){
        String status = "";
        int usia = tahunTemp;
        if(usia >= 17){
            status = "Memiliki KTP";
        }else{
            status = "Tidak punya KTP";
        }
        
        return status;
    }
}
