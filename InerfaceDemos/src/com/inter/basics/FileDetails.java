package com.inter.basics;

public class FileDetails {
    public  static  void main(String [] args) {
        ICompressor compressor=new JarCompressor();
    String[] file= compressor.compressFiles("java","python");
    for(String s:file)
    System.out.println(s);
    System.out.println();
    compressor=new ZipCompressor();
    }
}
