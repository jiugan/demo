package com.example.demo.domin;


import lombok.Data;

@Data
public class Ch {
    public String ch1;
    public String ch2;
    public String ch3;

    public Ch(String ch1, String ch2, String ch3) {
        this.ch1 = ch1;
        this.ch2 = ch2;
        this.ch3 = ch3;
    }
}
