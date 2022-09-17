package com.darshan.java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class VarApp {
    
    public void before() throws IOException {
        URL url = new URL("http://www.oracle.com");
        URLConnection  con = url.openConnection();
        InputStreamReader is = new InputStreamReader(con.getInputStream());
        Reader reader = new BufferedReader(is);
    }

    public void after() throws IOException {
        var url = new URL("http://www.oracle.com");
        var  con = url.openConnection();
        var is = new InputStreamReader(con.getInputStream());
        var reader = new BufferedReader(is);
    }

    public static void main(String[] args)  {
        
    }

}
