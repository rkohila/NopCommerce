package com.nop.api;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 17/06/17
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
public class MyPosts {

    private List<MyPost> myPostList;

    public List<MyPost> getMyPostList() {
        return myPostList;
    }

    public void setMyPostList(List<MyPost> myPostList) {
        this.myPostList = myPostList;
    }
}
