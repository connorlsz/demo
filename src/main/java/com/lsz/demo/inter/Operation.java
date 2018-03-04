package com.lsz.demo.inter;

public class Operation implements Callback {

    private Task task;

    public Operation(Task task) {
        this.task = task;
    }

    public void ask(){
        task.run("sdfsafsdfgbdfgsdfg", this);
    }
    @Override
    public void callBack(String a) {
        System.out.println("回调：" + a);
    }
}
