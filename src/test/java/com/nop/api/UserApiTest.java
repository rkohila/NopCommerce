package com.nop.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 12/06/17
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */

public class UserApiTest {

    String endPoint = "https://jsonplaceholder.typicode.com/posts";

    @Test
    public void getUsersByExchange(){

        HttpEntity<?> entity = getHttpEntity();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.exchange(endPoint, HttpMethod.GET, entity, String.class);
        System.out.println("forEntity = " + forEntity);
    }


    @Test
    public void getUsersByEntity(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<MyPost> forEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", MyPost.class);
        Assert.assertTrue(forEntity.getStatusCode().is2xxSuccessful());
        Assert.assertEquals(forEntity.getStatusCode(),HttpStatus.OK);

        MyPost body = forEntity.getBody();

        System.out.println("id = " + body.getId());
        System.out.println("user id = " + body.getUserId());
        System.out.println("title = " + body.getTitle());
        System.out.println("body = " + body.getBody());

    }


    @Test
    public void getUsersByEntityWithJson(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", String.class);
        Assert.assertTrue(forEntity.getStatusCode().is2xxSuccessful());
        Assert.assertEquals(forEntity.getStatusCode(),HttpStatus.OK);

        System.out.println("forEntity.getBody() = " + forEntity.getBody());

        JsonParser parser = new JsonParser();
        JsonObject jo = (JsonObject) parser.parse(forEntity.getBody());
        String title  = jo.get("title").getAsString();
        System.out.println("title = " + title);

    }


    @Test
    public void postUsersByExchange(){

        MyPost myPost = new MyPost();
        myPost.setUserId(100);
        myPost.setId(100);
        myPost.setTitle("my 100th post title");
        myPost.setBody("my 100th post title body");


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.postForEntity(endPoint,myPost,String.class);
        System.out.println("forEntity = " + forEntity);
    }



    private HttpEntity<?> getHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        return new HttpEntity(headers);
    }
}
