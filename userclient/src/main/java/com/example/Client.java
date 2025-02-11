package com.example;

import com.example.S3Uploader;

public class Client {
    public static void main(String[] args) {
        S3Uploader uploader = new S3Uploader("java-sdk1-sdk2-bucket");
        uploader.uploadFile("example.txt");
    }
}
