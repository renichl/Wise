package org.example;

public class WiseSaying {
    private String content;
    private int lastId;
    private String author;

    WiseSaying(int lastId, String content, String author) {
        this.lastId = lastId;
        this.content = content;
        this.author = author;
    }

    public int getLastId() {
        return lastId;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
