/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandingan2nilai;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Membandingkan dua buah nilai
 *
 * @author LENOVO
 */
public class Perbandingan2nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Status;
        int n1,n2;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Masukkan Nilai Pertama = ");
            n1=input.nextInt();
            System.out.print("Masukkan Nilai Kedua = ");
            n2=input.nextInt();
            System.out.println("");
            
            if(n1 == n2){
                System.out.println(n1+" Sama Dengan "+n2);
            }else
             if(n1 > n2){
                 System.out.println(n1+" Lebih Besar Dari "+n2);
            }else{
                System.out.println(n1+" Lebih Kecil Dari  "+n2);
            }
            
            System.out.print("Ulangi Aktivitas? (ya/tidak) : ");
            Status =input.next();
            System.out.println("");
        }while(Status.equals("Ya") || Status.equals("ya"));
    }
    
}
