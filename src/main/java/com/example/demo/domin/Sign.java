package com.example.demo.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Sign {
    String username;
    String signtime;

//    @TableId(type = IdType.AUTO)
    int id;

    public Sign(String signtime) {
        this.signtime = signtime;
    }

    public Sign(String username, String signtime) {
        this.username = username;
        this.signtime = signtime;
    }

    public Sign(String username, String signtime, int id) {
        this.username = username;
        this.signtime = signtime;
        this.id = id;
    }
}
