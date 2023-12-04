package org.example;

import org.example.System.Systemcontroller;
import org.example.wiseSaying.WiseSayingcontroller;
import org.example.wiseSaying.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    Systemcontroller systemcontroller;
    WiseSayingcontroller wiseSayingcontroller;

    App() {

        this.wiseSayingcontroller = new WiseSayingcontroller();
        this.systemcontroller = new Systemcontroller();
    }

    void run() {

        System.out.println("==명언앱==");
        List<WiseSaying> wiseSayingList = new ArrayList<>();
        int lastId = 1;

        while (true) {
            System.out.print("명령) ");
            String command = container.getSc().nextLine().trim();

            if (command.equals("종료")) {
                systemcontroller.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayingcontroller.write();
            } else if (command.equals("목록")) {
                wiseSayingcontroller.list();
            }
        }
    }
}


