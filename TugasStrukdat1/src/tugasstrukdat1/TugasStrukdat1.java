/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstrukdat1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasStrukdat1 {

    public void hitungpersegi(){
        double sisi, keliling,luas;
        Scanner input=new Scanner(System.in);
        System.out.println("masukan sisi persegi yang akan di hitung :");
        sisi=input.nextDouble();
       
        keliling=4*sisi;
        luas=sisi*sisi;
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
    
     public void hitungpersegipanjang(){
        double panjang,lebar,keliling,luas;
        Scanner input=new Scanner(System.in);
        System.out.println("masukan panjang persegi panjang yang akan di hitung :");
        panjang=input.nextDouble();
        System.out.println("masukan lebar persegi panjang yang akan di hitung :");
        lebar=input.nextDouble();
        
        keliling=(2*panjang)+(2*lebar);
        luas=panjang*lebar;
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
    
       public void hitungjajargenjang(){
        double panjang,lebar,alas,tinggi,keliling,luas;
        Scanner input=new Scanner(System.in);
        System.out.println("masukan panjang jajargenjang yang akan di hitung :");
        panjang=input.nextDouble();
        System.out.println("masukan lebar jajargenjang yang akan di hitung :");
        lebar=input.nextDouble();
        System.out.println("masukan alas jajargenjang yang akan di hitung :");
        alas=input.nextDouble();
        System.out.println("masukan tinggi jajargenjang yang akan di hitung :");
        tinggi=input.nextDouble();
        
        
        keliling=(2*panjang)+(2*lebar);
        luas=alas*tinggi;
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
     
        public void hitungtrapesium(){
        double[] sisi = new double[5];
        double tinggi,keliling = 0,luas = 0;
        Scanner input=new Scanner(System.in);
        
        for(int i=1;i<=4;i++){
        System.out.println("masukan sisi jajargenjang yang akan di hitung "+"ke-"+i+":");
        sisi[i]=input.nextDouble();
        
        }
          
        System.out.println("masukan tinggi jajargenjang yang akan di hitung :");
        tinggi=input.nextInt();
        
      
        
        for(int i=1;i<=4;i++){
        keliling=keliling+sisi[i];
        luas=(sisi[1]+sisi[2])*tinggi/2;
        }
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
        
        
      public void hitungbelahketupat(){
        double[] diagonal = new double[3];
        double sisi,luas = 0, keliling;
        Scanner input=new Scanner(System.in);
        
        for(int i=1;i<=2;i++){
        System.out.println("masukan diagonal belah ketupat yang akan di hitung "+"ke-"+i+":");
        diagonal[i]=input.nextDouble();
        
        }
          
        System.out.println("masukan sisi belah ketupat yang akan di hitung :");
        sisi=input.nextInt();
        
      
        keliling=4*sisi;
        
        for(int i=1;i<=2;i++){
        luas=(diagonal[1]+diagonal[2])/2;
        }
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
        
          
      public void hitunglayanglayang(){
        double[] diagonal = new double[3];
        double panjang,lebar,luas = 0, keliling;
        Scanner input=new Scanner(System.in);
        
        
        
        for(int i=1;i<=2;i++){
        System.out.println("masukan diagonal layang-layang yang akan di hitung "+"ke-"+i+":");
        diagonal[i]=input.nextDouble();
        
        }
          
        System.out.println("masukan panjang layang-layang yang akan di hitung :");
        panjang=input.nextDouble();
        System.out.println("masukan lebar layang-layang yang akan di hitung :");
        lebar=input.nextDouble();
      
        keliling=(2*panjang)+(2*lebar);
        
        for(int i=1;i<=2;i++){
        luas=(diagonal[1]+diagonal[2])/2;
        }
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
        
       public void hitungsegitga(){
        double[] sisi = new double[4];
        double alas,tinggi,luas = 0, keliling = 0;
        Scanner input=new Scanner(System.in);
        
        
        
        for(int i=1;i<=3;i++){
        System.out.println("masukan sisi segitiga yang akan di hitung "+"ke-"+i+":");
        sisi[i]=input.nextDouble();
        
        }
          
        System.out.println("masukan alas segitiga yang akan di hitung :");
        alas=input.nextDouble();
        System.out.println("masukan tinggi segitiga yang akan di hitung :");
        tinggi=input.nextDouble();
      
       
          luas=(alas*tinggi)/2;
        for(int i=1;i<=3;i++){
           keliling=keliling+sisi[i];
        }
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }
        
       
       public void hitunglingakaran(){
        double pi = 3.14;
        double jarijari,luas = 0, keliling = 0;
        Scanner input=new Scanner(System.in);
        
        
        
       
          
        System.out.println("masukan jari- jari lingakaran  yang akan di hitung :");
        jarijari=input.nextDouble();
     
       
          luas=pi*jarijari*jarijari;
        
           keliling=2*pi*jarijari;
        
        
        System.out.println("luas : "+" "+luas+"cm");
        System.out.println("keliling : "+" "+keliling+"cm^2");
        
    }  
     
   public String menu(){
        String masukan;
        Scanner input=new Scanner(System.in);  
        System.out.println("1.Persegi");
        System.out.println("2.Persegi panjang");
        System.out.println("3.Jajargenjang");
        System.out.println("4.Trapesium siku-siku");
        System.out.println("5.Belah Ketupat");
        System.out.println("6.Layang-layang");
        System.out.println("7.Segitiga Sembarang");
        System.out.println("8.Lingkaran");
        System.out.print("9.exit\n");
        System.out.println("Tulis menu menggunakan tulisan yang tersedia :");
        masukan=input.nextLine().toLowerCase();
        return masukan;
   }
    
    public static void main(String[] args) {
       
        boolean masukan2 = false;
        Scanner input=new Scanner(System.in);  
        TugasStrukdat1 tugas=new TugasStrukdat1();
        
       
       
       
       
while(masukan2!=true){
       switch (tugas.menu()) {
            case "persegi":
            tugas.hitungpersegi();
             break;
            case "persegi panjang":
             tugas.hitungpersegipanjang();
             break;
            case "jajargenjang":
              tugas.hitungjajargenjang();
              break;  
            case "trapesium siku-siku":
              tugas.hitungtrapesium();
              break;              
            case "belah ketupat":
               tugas.hitungbelahketupat();
              break;
            case "layang-layang":
               tugas.hitunglayanglayang();
              break;
            case "segitiga sembarang":
                tugas.hitungsegitga();
              break;
            case "lingkaran":
                tugas.hitunglingakaran();
              break;
            case"exit":
              masukan2=true;
              System.out.println("telah keluar dari program ");
              break;
            default:
              System.out.println("input bangunan tidak ada");
              break;
          }
        }
       }
 
}

