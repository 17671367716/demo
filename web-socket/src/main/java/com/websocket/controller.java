package com.websocket;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

@RestController
@CrossOrigin
@RequestMapping("/screen")
public class controller {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i = 0;i< list.size();i++){
            if (i == 1){
                list.remove(i);
            }else{
            }
        }
        for (int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }

//    @GetMapping(value = "/block")
//    public String block(){
//        return "123";
//    }
}
