package com.lsz.demo.inter;

public class TestControl {
    public static void main(String[] args) {
        Task task = new TaskOperation();
        Operation callback = new Operation(task);
        callback.ask();
    }
}
