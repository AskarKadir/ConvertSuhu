/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.a.tiga;

/**
 *
 * @author Asus
 */

public class pemrosesanClass {
    public String ucapanSalam(){
        String result = "";
        
        result = "Selamat Datang";
        
        return result;
    }
    public String tampilkanhasil(String nim, String nama){
        String result = "";
        result = "NIM : "+ nim + "<br>" + "Nama : "  + nama;
        return result;
    }
    
    public double getHarga(double jumlahbeli, double hargasatuan){
        double hitung = 0.0;
        hitung = jumlahbeli * hargasatuan;
        return hitung;
    }
    
    public String suhuCelcius(double celcius,String pilihan){
        double farenheit = celcius * 9/5 + 32;
        double kelvin    = celcius + 273.15;
        double reamur    = celcius * 0.8;
        if (pilihan == "F" || pilihan == "f"){
            return "Suhu dari " + celcius + " Celcius ke Farenheit = " +String.valueOf(farenheit) + " Farenheit";
        }
        else if (pilihan == "K" || pilihan == "k"){
            return "Suhu dari " + celcius + " Celcius ke Kelvin = " +String.valueOf(kelvin) + " Kelvin";
        }
        else if (pilihan == "R" || pilihan == "r"){
            return "Suhu dari " + celcius + " Celcius ke Reamour = " +String.valueOf(reamur) + " Reamour";
        }
        else{
            return "Pilihan Tidak Ada ";
        }
    }
}
