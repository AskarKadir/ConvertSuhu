/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.a.tiga;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import praktikum.ti.praktikum.java.a.tiga.pemrosesanClass;
import service.project.serviceAccess;
/**
 *
 * @author Asus
 */
@Controller
@ResponseBody
public class projectController{
    pemrosesanClass proses = new pemrosesanClass();
    @RequestMapping("/salam")
    public String greeting(){
        String kalimat = proses.ucapanSalam();
        return kalimat; 
    }
    
    @RequestMapping("/viewdata")
    public String tampilkan(){
        String result = "";
        //nim dan nama
        result = proses.tampilkanhasil("20200140101", "Askar Kadir");
        return result;
    }
    
    @RequestMapping("/prosesharga")
    public String tampilHarga(){
        String harga = "";
        //jumlah beli & harga satuan = total
        harga = String.valueOf(proses.getHarga(125, 1500));
        // convert double to strng    
        return "Total Harga Bayar : " + harga;
    }
    
    @RequestMapping("/suhu")
    public String getsuhu(){
        String suhu = "";
        // pilihan pada parameter kedua dapat berupa "F","K","R:
        suhu = String.valueOf(proses.suhuCelcius(100,"f"));
        return suhu;
    }
    serviceAccess serviceAccess = new serviceAccess();
    @RequestMapping("/checkname")
    public String viewNama(){
        String result = "";
        result = serviceAccess.cekNama();
        return result;
    }
    
    @RequestMapping("/checkumur")
    public String viewumur(){
        return "Umur sekarang adalah " + String.valueOf(serviceAccess.umur(2002,2020));
    }
    
    @RequestMapping("/namaumur")
    public String namaumur(){
        return "Nama : " +serviceAccess.cekNama() + "<br>" + "Umur : " 
                + String.valueOf(serviceAccess.umur(2002,2020))+" Tahun<br>"
                + "Status : "+serviceAccess.cekStatus();
    }
    
    @RequestMapping("/profile")
    public String profile(){
        String dataprofile = "";
        dataprofile = "Nama : " +serviceAccess.cekNama() + "<br>" + "Umur : " 
                + String.valueOf(serviceAccess.umur(2002,2020))+" Tahun<br>"
                + "Status : "+serviceAccess.cekStatus();
        return dataprofile;
    }
    }