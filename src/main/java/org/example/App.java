package org.example;

import org.example.System.Systemcontroller;
import org.example.wiseSaying.WiseSayingcontroller;
import org.example.wiseSaying.WiseSaying;

import java.util.*;

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
            } else if (command.startsWith("삭제")) {
                System.out.println(command);
                String[] commandList = command.split("\\?", 2);
                //["삭제","id=1"]

                String actionCode = commandList[0];//삭제
                String[] paramsList = commandList[1].split("&");//id=1

                Map<String, String> params = new HashMap<>();
                for (String paramsRow : paramsList){
                   String[] paramsStr =  paramsRow.split("=",2);

                   String key = paramsStr[0];
                   String value = paramsStr[1];

                   params.put(key,value);
                }

                System.out.println("actionCode : " + actionCode);
                System.out.println("params : "+ params);


                //wiseSayingcontroller.delete();


            }
        }
    }
}


