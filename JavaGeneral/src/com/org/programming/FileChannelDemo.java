package com.org.programming;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

    public static void main(String args[]) {
        Tablet ipad = new Tablet("Apple", true, 1000);
        System.out.println("Writing into RandomAcessFile : " + ipad);
        write("tablet.store", ipad);
        Tablet fromStore = new Tablet();
        read("tablet.store", fromStore);
        System.out.println("Object read from RandomAcessFile : " + fromStore);
    }

    /* * Method to write data into File using FileChannel and ByteBuffeer */
    public static void write(String filename, Persistable object) {
        try{
            // Creating RandomAccessFile for writing
            RandomAccessFile store = new RandomAccessFile("tablet", "rw");
            FileChannel channel = store.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(2048);
            object.persist(buffer);
            buffer.flip();
            channel.write(buffer);
            channel.close();
            store.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String fileName, Persistable object) {
        try {
            RandomAccessFile store = new RandomAccessFile("tablet", "rw");
            FileChannel channel = store.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            channel.read(buffer);
            buffer.flip();
            object.recover(buffer);
            channel.close();
            store.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Tablet implements Persistable {
    private String brand;
    private boolean isCellular;
    private long cost; // in US Dollars

    public Tablet() {
        brand = "";
    }

    public Tablet(String brand, boolean isCellular, long cost) {
        this.brand = brand;
        this.isCellular = isCellular;
        this.cost = cost;
    }

    public final String getBrand() {
        return brand;
    }

    public final boolean isCellular() {
        return isCellular;
    }

    public final long getCost() {
        return cost;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final void setCellular(boolean isCellular) {
        this.isCellular = isCellular;
    }

    public final void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public void persist(ByteBuffer buffer) {
        byte[] strBytes = brand.getBytes();
        buffer.putInt(strBytes.length);
        buffer.put(strBytes, 0, strBytes.length);
        buffer.put(isCellular == true ? (byte) 1 : (byte) 0);
        buffer.putLong(cost);
    }

    @Override
    public void recover(ByteBuffer buffer) {
        int size = buffer.getInt();
        byte[] rawBytes = new byte[size];
        buffer.get(rawBytes, 0, size);
        this.brand = new String(rawBytes);
        this.isCellular = buffer.get() == 1 ? true : false;
        this.cost = buffer.getLong();
    }

    @Override
    public String toString() {
        return "Tablet [brand=" + brand + ", isCellular=" + isCellular + ", cost=" + cost + "]";
    }
}

interface Persistable {
    public void persist(ByteBuffer buffer);

    public void recover(ByteBuffer buffer);
}
