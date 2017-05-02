package com.ding;

import java.security.MessageDigest;
import java.util.Formatter;
import java.util.Random;

public class AuthHelper {

    public static String sign(String ticket, String nonceStr, long timeStamp, String url) throws Exception {
        String plain = "jsapi_ticket=" + ticket + "&noncestr=" + nonceStr + "&timestamp=" + String.valueOf(timeStamp)
                + "&url=" + url;
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.reset();
        sha1.update(plain.getBytes("UTF-8"));
        return bytesToHex(sha1.digest());
    }

    private static String bytesToHex(byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception{
        String gu = "gu1505082";
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        sha1.reset();
        sha1.update(gu.getBytes("UTF-8"));
        System.out.println(bytesToHex(sha1.digest()));

    }
}
