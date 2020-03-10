package com.company;

import java.io.IOException;
import java.net.*;

public class Main {

    public static void main(String[] args) throws IOException {


        InetAddress[] addresses = new InetAddress[2];

        addresses[0] = InetAddress.getLoopbackAddress();
        addresses[1] = InetAddress.getByName("moodle.elpuig.xeill.net");

        String addressHostName = addresses[1].getCanonicalHostName();

        byte [] address = addresses[1].getAddress();

        System.out.println("DIRECTION IN BYTES "+InetAddress.getByAddress(address));

        System.out.println("HOSTNAME + DIRECTION LOOPBACK "+ Inet4Address.getLocalHost());


        System.out.println(""+addressHostName);

        System.out.println(address);

        for(InetAddress adress: addresses){
            if(adress.isLoopbackAddress()){
                System.out.println(adress.getHostName() + " té una adreça loopback");
            }else{
                System.out.println(adress.getHostName() + " no té una adreça loopback");
            }
        }
        System.out.println("--------------------------------------");

        URL url = new URL("https://moodle.elpuig.xeill.net/login/index.php");

        System.out.println("\nURL");
        System.out.println("--------------------------------------");
        System.out.println(""+url.getAuthority());
        System.out.println(""+url.getFile());
        System.out.println(""+url.getHost());
        System.out.println(""+url.getPath());
        System.out.println(""+url.getQuery());
        System.out.println(""+url.getProtocol());
        System.out.println(""+url.getRef());
        System.out.println(""+url.getUserInfo());
        System.out.println(""+url.getContent());
        System.out.println(""+url.getPort());
    }
}
