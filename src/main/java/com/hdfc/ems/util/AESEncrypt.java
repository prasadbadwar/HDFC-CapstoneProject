/* =========================
@Author : Er.Prasad B.Badwar.
@Date : 24/04/2023
@Description : AESEncrypt is class build for encryption date of birth.
*===========================*/
package com.hdfc.ems.util;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypt {
	
	private static final String ALGORITHM = "AES";
    private static final String KEY = "mysecretkey12345";

    public static byte[] encrypt(LocalDate date) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return cipher.doFinal(date.toString().getBytes(StandardCharsets.UTF_8));
    }
	
    
    
    
    
    
    
    
    
    
    
    
    
//	private static final String SECRET_KEY = "my_super_secret_key";
//	private static final String SALT = "ssshhhhhhhhhhh!!!!";
//	public static byte[] encrypt(LocalDate date) throws EmpNotFound {
//	try {
//		
//	      byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//	      IvParameterSpec ivspec = new IvParameterSpec(iv);
//	 
//	      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
//	      KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
//	      SecretKey tmp = factory.generateSecret(spec);
//	      SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
//	 
//	      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//	      cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
//	      return cipher.doFinal(date.toString().getBytes(StandardCharsets.UTF_8));
//	    } catch (Exception e) {
//	     throw new EmpNotFound("Error to encrypt value");
//	    }
//
//
//	  }
}
