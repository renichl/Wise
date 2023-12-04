package org.example.wiseSaying;

import org.example.container;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingcontroller {

    Scanner sc;
    List<WiseSaying> wiseSayingList = new ArrayList<>();
    int lastId = 1;

    public WiseSayingcontroller() {
        this.sc = sc;
    }

    public void write() {
        System.out.print("등록) ");
        String content = container.getSc().nextLine().trim();
        System.out.print("작가) ");
        String author = container.getSc().nextLine().trim();

        WiseSaying ws = new WiseSaying(lastId, content, author);
        wiseSayingList.add(ws);

        System.out.printf("%d번 명언이 등록 되었습니다\n", lastId);
        lastId++;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        for (WiseSaying ws : wiseSayingList) {
            System.out.println(ws.getLastId() + "/" + ws.getAuthor() + "/" + ws.getContent());
        }
    }
    public void delete(){

    }

}
