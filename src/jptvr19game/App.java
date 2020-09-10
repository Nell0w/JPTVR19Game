/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Scanner;
import java.util.Random;
        
/**
 *
 * @author pupil
 */
public class App {
    public void run (){
        System.out.println("Привет.");
        System.out.println("Загадай максимальный и минимальный диапозон: ");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Минимальный: ");
        int userNumber1 = scanner.nextInt();
        System.out.println("Максимальный: ");
        int userNumber2 = scanner.nextInt();
        System.out.println("Программа загадала число от " + userNumber1 + " до " + userNumber2 + " ,угадай: ");
        int attempt = 0;
        do {
            int myNumber = random.nextInt((userNumber2 - userNumber1) + 1)+ userNumber1;
            System.out.println(myNumber);
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл! " + myNumber);
                break;
            }else{
                if (attempt > 1){
                System.out.println("Ты проиграл! Было задумано: " + myNumber);
                    break;
                }else{
                    System.out.println("Попробуй еще раз: ");
                }
                attempt++;

            }
        } while (true);
    }
}
