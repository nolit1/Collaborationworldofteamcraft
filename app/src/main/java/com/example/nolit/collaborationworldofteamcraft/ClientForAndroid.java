package com.example.nolit.collaborationworldofteamcraft;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientForAndroid implements Runnable {
    private String mServerMessage;
    private boolean mRun = false; // флаг, определяющий, запущен ли сервер
    private PrintWriter mBufferOut;
    private BufferedReader mBufferIn;
    private Socket socket;
    private String address;

    public ClientForAndroid(Socket server) throws InterruptedException {
        this.socket=server;
        Thread thread = new Thread(this, "Net");
        System.out.println("check" + thread);
        thread.start();
        Thread.sleep(20);
    }

    public void sendMessage(String message) throws InterruptedException {
        if (mBufferOut != null && !mBufferOut.checkError()) {
            mBufferOut.println(message);
            mBufferOut.flush();
        }
        Thread.sleep(20);
    }

    public void stopClient() throws IOException, InterruptedException {
        sendMessage("Client is close");

        mRun = false;

        if (mBufferOut != null) {
            mBufferOut.flush();
            mBufferOut.close();
        }

        mBufferIn = null;
        mBufferOut = null;
        mServerMessage = null;
    }

    @Override
    public void run() {
        try {
            System.out.println("Connect to server");
            try {
//                socket = new Socket("localhost", 15233);
                mRun = true;
                mBufferOut =
                        new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),
                                true);
                mBufferIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                // ждем ответа
                while (mRun) {
                    if (mBufferOut.checkError()) {
                        mRun = false;
                    }

                    mServerMessage = mBufferIn.readLine();
                    if(mServerMessage.equalsIgnoreCase("quit")){
                        sendMessage("quit");
                        socket.close();
                    }

                }
            } catch (Exception ignored) {
            } finally {
                if (socket != null && socket.isConnected()) {
                    socket.close();
                }
            }
        } catch (Exception e) {
        }
    }

    public boolean isConnected() {
        return socket != null && socket.isConnected();
    }

    public boolean isRunning() {
        return mRun;
    }

    public String getmServerMessage() throws InterruptedException {
        Thread.sleep(20);
        return mServerMessage;
    }



    //в приложение
    public void   joinProject(String projct){
        //todo
    }

    public String listProject(){
        String jsonout = null;
        return jsonout;
    }


    public String search(String json){
        // TODO: 12.03.2018
        return json;
    }

    public static void createProject(String json){
        // TODO: 12.03.2018
    }
}