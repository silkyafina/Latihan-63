/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat63;

/**
 *
 * @author User
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public interface GarisLurus {
    public double hitungGradien();
}
class Koordinat implements GarisLurus{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public Koordinat(int x1, int y1, int x2, int y2){
    this.x1= x1;
    this.y1= y1;
    this.x2 = x2;
    this.y2 = y2;
    } 
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
    @Override
    public double hitungGradien() {
       return (y2-y1)/(x2-x1); 
    }
    public static void main(String[]args){
        Koordinat k = new Koordinat(2, 10, 5, 7);
       System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %.2f%n", 
    k.getX1(), k.getY1(), k.getX2(), k.getY2(), k.hitungGradien());

        
        Koordinat l = new Koordinat(5,1,3,12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d) memiliki gradien sebesar %.2f%n", l.getX1(),l.getY1(), l.getX2(), l.getY2(), l.hitungGradien());
            
        }
    }

