package com.tr.first_plugins;

import com.tr.first_plugins.Utils.ReportProjectDetails;
import com.tr.first_plugins.Utils.Utils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class FirstPluginsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstPluginsApplication.class, args);

        String dir = System.getProperty("user.dir");
        System.out.println("dir -- "+dir+"\\src\\main\\java");
        dir=dir+"\\src\\main\\java";
        List<File> files=new ArrayList<>();
        files=Utils.listf(dir,files);



    }


}