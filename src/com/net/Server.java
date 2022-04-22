/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.net;

import com.handle.ConfigurationLoader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoangdp
 */
public class Server extends Thread {

    private static Server _instance;
    private DatagramSocket datagramSocket;
    private int port;

    private Server() {
        try {
            this.port = Integer.parseInt(ConfigurationLoader.getInstance().getHostInfo()[1]);
            datagramSocket = new DatagramSocket(port);
        } catch (SocketException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static synchronized Server getInstance() {
        if (_instance == null) {
            _instance = new Server();
        }
        return _instance;
    }

    @Override
    public void run() {
        while (true) {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                datagramSocket.receive(packet);
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Client: " + new String(packet.getData()));
        }
    }

    public String getInetAddress() {
        return datagramSocket.getInetAddress().getHostAddress();
    }

    public int getPort() {
        return port;
    }

}
