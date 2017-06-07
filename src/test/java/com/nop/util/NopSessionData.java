package com.nop.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 28/05/17
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */
public class NopSessionData {


        private final Map<String, String> map = new HashMap<String, String>();

        private static final NopSessionData sessionData = new NopSessionData();

        private NopSessionData(){
            if (sessionData != null) {
                throw new IllegalStateException("Already instantiated");
            }
        }

        public static NopSessionData getInstance(){
            return sessionData;
        }

        public void put(String key, String value){
            map.put(key,value);
        }

        public String get(String key){
            return map.get(key);
        }
    }

