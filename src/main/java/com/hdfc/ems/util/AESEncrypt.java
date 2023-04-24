package com.hdfc.ems.util;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.time.LocalDate;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import com.hdfc.ems.exception.EmpNotFound;

public class AESEncrypt {
	private static final String SECRET_KEY = "my_super_secret_key";
	private static final String SALT = "ssshhhhhhhhhhh!!!!";
	public static byte[] encrypt(LocalDate date) throws EmpNotFound {
	try {
		
	      byte[] iv = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	      IvParameterSpec ivspec = new IvParameterSpec(iv);
	 
	      SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	      KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
	      SecretKey tmp = factory.generateSecret(spec);
	      SecretKeySpec secretKey = new SecretKeySpec(tmp.getEncoded(), "AES");
	 
	      Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	      cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivspec);
	      return cipher.doFinal(date.toString().getBytes(StandardCharsets.UTF_8));
	    } catch (Exception e) {
	     throw new EmpNotFound("Error to encrypt value");
	    }


	  }
}
