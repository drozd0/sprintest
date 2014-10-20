package ru.test.spring;

import javax.annotation.PostConstruct;

/**
 * Created by dm on 20.10.14.
 */
@Profiling
public class TerminatorQuater {

    @InjectRandomInt(min = 2, max = 9)
    private int repeat;

    private String message;

    @PostConstruct
    public void initMethod(){
        System.out.println("Phase 2");
        System.out.println(repeat);

    }

    public TerminatorQuater() {
        System.out.println("Phase 1");
    }

    public void sayQuater(){
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
