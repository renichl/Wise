package org.example;

import java.util.Scanner;

public class App {
    Scanner sc;
    App(Scanner sc){
        this.sc = sc;
    }
    void run(){
        System.out.println("==명언앱==");
        while(true){
            System.out.print("명령) ");
            String command = sc.nextLine().trim();
            if(command.equals("종료")){
                break;
            } else if (command.equals("등록")) {
                System.out.print("등록) ");
                String content = sc.nextLine().trim();
                System.out.print("작가) ");
                String author = sc.nextLine().trim();
            }
        }
    }
}
