package com.lsz.demo.inter;

public class TaskOperation implements Task {
    @Override
    public void run(String str, Callback callback) {
        System.out.println("执行任务：" + str);
        callback.callBack(str + "任务执行完毕");
    }
}
