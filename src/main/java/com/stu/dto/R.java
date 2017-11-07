package com.stu.dto;

/**
 * Created by Administrator on 2017/11/7.
 */
public class R<T> {
    private boolean state;
    private String msg;
    private T data;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public R ok(T data) {
        this.state = true;
        this.data = data;
        return this;
    }

    public R error(String msg) {
        this.state = false;
        this.msg = msg;
        return this;
    }

    public R ok(String msg) {
        this.state = true;
        this.msg = msg;
        return this;
    }
}
