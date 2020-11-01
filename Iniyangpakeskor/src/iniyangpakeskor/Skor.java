/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniyangpakeskor;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Kirana
 */
public class Skor {
    int acak(){
        Random x = new Random();
        return x.nextInt(101);
    }
    void tebakan(){
        int angkarandom = this.acak();
        Scanner input = new Scanner(System.in);
        int nilai = 100;
        int coba = 1;
        int acaknih;
        do{
            System.out.print("\n Masukkan Angka : ");
            acaknih = input.nextInt();
            if(nilai == 0){
                System.out.println("Game Over !! Skor Kamu 0!");
                break;
            }
            if (acaknih < angkarandom){
                nilai -= 2;
                System.out.println(" Angka Kamu Kurang Kak Maaf :(. Nilai = "+nilai);
            }
            else if (acaknih > angkarandom){
                nilai -= 2;
                System.out.println(" Angka Kamu Kelebihan Tsayy :(. Nilai = "+nilai);
            }
            else{
                System.out.println(" Yeyyy Angka Kamu Benar!:)");
                if(coba <= 5){
                    nilai += 50;
                    System.out.println(" Yey Kamu Sangat Cerdas! Nilai kamu +50");
                }
                System.out.println("\n Nilai Kamu : "+nilai);
            }
            coba +=1;
        }while(acaknih != angkarandom);
    }
}
