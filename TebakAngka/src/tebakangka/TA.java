/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tebakangka;

/**
 *
 * @author Kirana
 */
import java.util.Random;
import java.util.Scanner;
 
public class TA {

    int acak(){
        Random x = new Random();
        return x.nextInt(101);
    }
    void tebakan(){
        int angkarandom = this.acak();
        Scanner input = new Scanner(System.in);
        int acaknih;
        do{
            System.out.print("Masukkan Angka : ");
            acaknih = input.nextInt();
            if (acaknih < angkarandom){
                System.out.println("Angka Kamu Kurang Kak Maaf :(");
            }
            if (acaknih > angkarandom){
                System.out.println("Angka Kamu Kelebihan Tsayy :(");
            }
            if (acaknih == angkarandom){
                System.out.println("Yeyyy Angka Kamu Benar!:)");
            }
        }while(acaknih != angkarandom);
    }
}
