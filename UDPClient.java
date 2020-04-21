package com.Vaibhav.udpSocket;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds =new DatagramSocket();
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        byte [] b=(i+"").getBytes();
        InetAddress ia =InetAddress.getLocalHost();
        DatagramPacket dp =new DatagramPacket(b,b.length,ia,9999);
        ds.send(dp);
        byte [] b1 =new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b,b.length);
        ds.receive(dp1);
        String str =new String(dp1.getData());
    }
}
