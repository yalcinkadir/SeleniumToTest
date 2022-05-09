package com.kadir.collections;

public class MyFileNotFoundException extends RuntimeException {
    MyFileNotFoundException() {
        super("Hmm my file is not found!");
    }
}
