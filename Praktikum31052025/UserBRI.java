/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum31052025;

public class UserBRI extends User {
    private String transferLog[];
    
    public UserBRI(String name, String password, int balance, String bankName){
        super(name, password, balance, bankName);
    }

    public String[] getTransferLog() {
        return transferLog;
    }

    public void setTransferLog(String log, int logId) {
        this.transferLog[logId] = log;
    }
    
    @Override
    public int limitTransfer(){
        return 10000000;
    }
}
