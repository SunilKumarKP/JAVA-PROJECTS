package com.org;

public class ConcurrentHashMap {
    public final Segment[] segments = new Segment[32];

    protected static final class Segment {
        protected int count;

        protected synchronized int getCount() {
            return this.count;
        }

        protected synchronized void sync() {

        }
    }

    public static void main(String[] args) {
        final int MAXIMUM_CAPACITY = 1 << 30;
        int x = -1600;
        System.out.println(x >> 4);
        int y = 1600;
        System.out.println(y >> 4);
    }
}
