package com.ifywork.student_springboot.aspect;

import java.security.MessageDigest;

public class MD5Utils {
    public static String getPWD( String str ){
        StringBuffer sb = new StringBuffer();
        try{
            MessageDigest digest = MessageDigest.getInstance("MD5");

            byte[] bs = digest.digest(str.getBytes());

            for (byte b : bs) {
                int x = b & 255;
                String s = Integer.toHexString(x);
                if( x > 0 && x < 16 ){
                    sb.append("0");
                    sb.append(s);
                }else{
                    sb.append(s);
                }
            }

        }catch( Exception e){
            System.out.println("加密失败");
        }
        return sb.toString();
    }

}
