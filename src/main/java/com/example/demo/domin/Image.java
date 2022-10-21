package com.example.demo.domin;
import lombok.Data;

@Data
public class Image {
    public int id;
    public String url;
    public String description;
    public int kinds;

    public Image(int id, String url, String description, int kinds) {
        this.id = id;
        this.url = url;
        this.description = description;
        this.kinds = kinds;
    }

    public Image(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public Image() {
    }
}
