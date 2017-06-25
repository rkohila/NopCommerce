package com.nop.api;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 17/06/17
 * Time: 23:54
 * To change this template use File | Settings | File Templates.
 */
public class MyPost {

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private int userId;
    private int id;
    private String title;
    private String body;
}
