/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.net;

import com.handle.ConfigurationLoader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoangdp
 */
public class Client extends Thread {

    private InetAddress address;
    private DatagramSocket datagramSocket;
    private int port;
    private static Client _instance;

    @SuppressWarnings("empty-statement")
    private Client() {
        try {
            this.address = InetAddress.getByName(ConfigurationLoader.getInstance().getHostInfo()[0]);;
            this.port = Integer.parseInt(ConfigurationLoader.getInstance().getHostInfo()[1]);
            datagramSocket = new DatagramSocket();
        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        while (true) {
            byte[] data = new byte[1024];

            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                datagramSocket.receive(packet);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Server: " + new String(packet.getData()));
        }
    }

    public void sendData(byte[] data) {
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        try {
            datagramSocket.send(packet);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public synchronized static Client getInstance() {
        if (_instance == null) {
            _instance = new Client();
        }
        return _instance;
    }

}
