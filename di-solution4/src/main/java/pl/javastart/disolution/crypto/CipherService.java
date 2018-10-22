package pl.javastart.disolution.crypto;

public interface CipherService {
    String encrypt(String text);
    String decrypt(String cipher);
}