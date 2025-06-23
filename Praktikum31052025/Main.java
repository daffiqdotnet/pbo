/*
 * Nama : Daffiq Trie Octorino
 * NIM : 2401083003
 * Kelas : TK-1A
 * Mata Kuliah : Pemrograman Berbasis Objek
 */
package Praktikum31052025;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int userId, currentUser;
        userId = 1;
        currentUser = 0;
        
        User[] registeredUser = new User[100];
        registeredUser[0] = new UserBRI("Admin", "admin1234", 0, null);
        
        Bank[] customer = new Bank[100];
        
        int[] logCount = new int[100];
        
        boolean loginState = false;
        boolean runProgram = true;
        
        while(runProgram){
            if(loginState){
                
                boolean runService = true;
                int totalTransfer = 0;
                while(runService){
                    // Hitung total login
                    logCount[currentUser]++;
                    
                    int fee, limit;
                    fee = 0;
                    
                    String account;
                    account = "";
                    
                    // Tentukan bank nasabah
                    if(registeredUser[currentUser].getBank().equals("BRI")){
                        fee = ((BRI) customer[currentUser]).transferFee();
                        account = ((BRI) customer[currentUser]).virtualAccount();
                        
                        if(logCount[currentUser] % 3 == 0){
                            System.out.println("Bunga cair: Rp" + ((BRI) customer[currentUser]).getInterest());
                            
                            int addInt;
                            addInt = registeredUser[currentUser].getBalance() + ((BRI) customer[currentUser]).getInterest();
                            registeredUser[currentUser].setBalance(addInt);
                        }
                    }
                    else if(registeredUser[currentUser].getBank().equals("Mandiri")){
                        fee = ((Mandiri) customer[currentUser]).transferFee();
                        account = ((Mandiri) customer[currentUser]).virtualAccount();
                        
                        if(logCount[currentUser] % 3 == 0){
                            System.out.println("Bunga cair: Rp" + ((Mandiri) customer[currentUser]).getInterest());
                            
                            int addInt;
                            addInt = registeredUser[currentUser].getBalance() + ((Mandiri) customer[currentUser]).getInterest();
                            registeredUser[currentUser].setBalance(addInt);
                        }
                    }
                    else if(registeredUser[currentUser].getBank().equals("BNI")){
                        fee = ((BNI) customer[currentUser]).transferFee();
                        account = ((BNI) customer[currentUser]).virtualAccount();
                        
                        if(logCount[currentUser] % 3 == 0){
                            System.out.println("Bunga cair: Rp" + ((BNI) customer[currentUser]).getInterest());
                            
                            int addInt;
                            addInt = registeredUser[currentUser].getBalance() + ((BNI) customer[currentUser]).getInterest();
                            registeredUser[currentUser].setBalance(addInt);
                        }
                    }
                    
                    limit = registeredUser[currentUser].limitTransfer();
                    
                    // Menu admin
                    if(currentUser == 0){
                        System.out.println("Aku admin, kalian member");
                        break;
                    }
                    // Menu nasabah
                    else{
                        
                        boolean runMenu = true;
                        while(runMenu){
                            System.out.println("Menu\n1. Setor\n2. Tarik\n3. Transfer\n4. Informasi\n5. Log Out");
                            int menuOpt;
                            
                            System.out.print("Pilihan: ");
                            menuOpt = in.nextInt();
                            in.nextLine();
                            
                            // Setor
                            if(menuOpt == 1){
                                int nominal;
                                
                                System.out.print("Nominal (0 = Batal): ");
                                nominal = in.nextInt();
                                in.nextLine();
                                
                                if(nominal != 0){
                                    nominal = nominal + registeredUser[currentUser].getBalance();
                                    registeredUser[currentUser].setBalance(nominal);
                                }
                                
                                System.out.println("Setor berhasil!");
                            }
                            // Tarik
                            else if(menuOpt == 2){
                                int nominal;
                                
                                boolean runDraw = true;
                                while(runDraw){
                                    System.out.print("Nominal (0 = Batal): ");
                                    nominal = in.nextInt();
                                    in.nextLine();
                                    
                                    if(nominal == 0){
                                        break;
                                    }
                                    else if(nominal < registeredUser[currentUser].getBalance()){
                                        System.out.println("Berhasil menarik Rp" + nominal);
                                        nominal = registeredUser[currentUser].getBalance() - nominal;
                                        registeredUser[currentUser].setBalance(nominal);
                                        runDraw = false;
                                    }
                                    else{
                                        System.out.println("Saldo tidak cukup atau tabungan tidak boleh kosong");
                                    }
                                }
                            }
                            // Transfer
                            else if(menuOpt == 3){
                                String destination;
                                int nominal;
                                
                                boolean runTransfer = true;
                                boolean runMethod = true;
                                while(runTransfer){
                                    // Menu transfer
                                    System.out.print("Tujuan: ");
                                    destination = in.nextLine();

                                    System.out.print("Nominal: ");
                                    nominal = in.nextInt();
                                    in.nextLine();
                                    
                                    if(nominal < registeredUser[currentUser].getBalance() && totalTransfer <= limit){
                                        for(int i = 0; i < userId; i++){
                                            if(destination.equals(registeredUser[i].getName())){
                                                while(runMethod){
                                                    // Metode pembayaran
                                                    System.out.println("Metode Pembayaran:\n0. Batal\n1. Kredit\n2. Virtual Account\n3. M-Banking");
                                                    
                                                    int optMethod;
                                                    System.out.print("Pilihan: ");
                                                    optMethod = in.nextInt();
                                                    in.nextLine();
                                                    
                                                    if(optMethod == 0){
                                                        runMethod = false;
                                                        runTransfer = false;
                                                    }
                                                    else if(optMethod == 1){
                                                        int cashOut;
                                                        cashOut = registeredUser[currentUser].getBalance() - nominal - fee;
                                                        registeredUser[currentUser].setBalance(cashOut);
                                                        
                                                        int cashIn;
                                                        cashIn = registeredUser[i].getBalance() + nominal;
                                                        registeredUser[i].setBalance(cashIn);
                                                        
                                                        System.out.println("Transfer berhasil!");
                                                        runMethod = false;
                                                        runTransfer = false;
                                                    }
                                                    else if(optMethod == 2){
                                                        int cashOut;
                                                        cashOut = registeredUser[currentUser].getBalance() - nominal - fee;
                                                        registeredUser[currentUser].setBalance(cashOut);
                                                        
                                                        int cashIn;
                                                        cashIn = registeredUser[i].getBalance() + nominal;
                                                        registeredUser[i].setBalance(cashIn);
                                                        
                                                        System.out.println("Transfer berhasil melalui akun " + account);
                                                        runMethod = false;
                                                        runTransfer = false;
                                                    }
                                                    else if(optMethod == 3){
                                                        int cashOut;
                                                        cashOut = registeredUser[currentUser].getBalance() - nominal;
                                                        registeredUser[currentUser].setBalance(cashOut);
                                                        
                                                        int cashIn;
                                                        cashIn = registeredUser[i].getBalance() + nominal;
                                                        registeredUser[i].setBalance(cashIn);
                                                        
                                                        System.out.println("Transfer berhasil!");
                                                        runMethod = false;
                                                        runTransfer = false;
                                                    }
                                                    else{
                                                        System.out.println("Terjadi kesalahan");
                                                    }
                                                }
                                            }
                                            else if(i == userId){
                                                System.out.println("Pengguna tidak ditemukan");
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("Saldo tidak cukup atau tabungan tidak boleh kosong");
                                    }
                                }
                                
                                
                            }
                            else if(menuOpt == 4){
                                System.out.println("Tabungan: Rp" + registeredUser[currentUser].getBalance());
                            }
                            else if(menuOpt == 5){
                                runMenu = false;
                                runService = false;
                                loginState = false;
                            }
                        }
                    }
                }
            }
            else{
                
                // Menu akun
                boolean runGreet = true;
                while(runGreet){
                    System.out.println("Anda sedang log out\n1. Register\n2. Log In\n3. Keluar");
                    System.out.print("Pilihan: ");
                    int opt;
                    opt = in.nextInt();
                    in.nextLine();
                    
                    // Registrasi pengguna baru
                    if(opt == 1){
                        String userName, userPassword;
                        int userBank, userBalance, bankId;
                        boolean eligible;
                        eligible = false;
                        
                        while(true){
                            
                            // Pilih bank
                            System.out.println("Pilih Bank:\n1. BRI\n2. Mandiri\n3. BNI");
                            System.out.print("Pilihan: ");
                            userBank = in.nextInt();
                            in.nextLine();
                            
                            if(userBank == 1){
                                bankId = 1;
                                eligible = true;
                                break;
                            }
                            else if(userBank == 2){
                                bankId = 2;
                                eligible = true;
                                break;
                            }
                            else if(userBank == 3){
                                bankId = 3;
                                eligible = true;
                                break;
                            }
                            else{
                                System.out.println("Bank tidak terdaftar");
                            }
                            
                        }
                        
                        // Pendaftaran
                        while(eligible){
                            System.out.print("Nama: ");
                            userName = in.nextLine();
                            
                            // Khusus admin
                            if(userName.equals("Admin")){
                                System.out.println("Nama tidak dapat digunakan | Anda member");
                            }
                            else{
                                System.out.print("Password: ");
                                userPassword = in.nextLine();
                                
                                System.out.print("Saldo: ");
                                userBalance = in.nextInt();
                                
                                if(bankId == 1){
                                    User newUser = new UserBRI(userName, userPassword, userBalance, "BRI");
                                    registeredUser[userId] = newUser;
                                    
                                    // Jenis tabungan
                                    while(true){
                                        System.out.println("Pilih jenis tabungan:\n1. Reguler\n2. Pelajar");
                                        int saving;
                                        
                                        System.out.print("Pilihan: ");
                                        saving = in.nextInt();
                                        in.nextLine();
                                        
                                        if(saving == 1){
                                            Bank newCust = new BRI("BRI");
                                            newCust.regSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else if(saving == 2){
                                            Bank newCust = new BRI("BRI");
                                            newCust.eduSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else{
                                            System.out.println("Terjadi kesalahan!");
                                        }
                                    }
                                    logCount[userId] = 0;
                                    userId++;
                                    break;
                                }
                                else if(bankId == 2){
                                    User newUser = new UserMandiri(userName, userPassword, userBalance, "Mandiri");
                                    registeredUser[userId] = newUser;
                                    
                                    while(true){
                                        System.out.println("Pilih jenis tabungan:\n1. Reguler\n2. Pelajar");
                                        int saving;
                                        
                                        System.out.print("Pilihan: ");
                                        saving = in.nextInt();
                                        in.nextLine();
                                        
                                        if(saving == 1){
                                            Bank newCust = new Mandiri("Mandiri");
                                            newCust.regSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else if(saving == 2){
                                            Bank newCust = new Mandiri("Mandiri");
                                            newCust.eduSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else{
                                            System.out.println("Terjadi kesalahan!");
                                        }
                                    }
                                    logCount[userId] = 0;
                                    userId++;
                                    break;
                                }
                                else if(bankId == 3){
                                    User newUser = new UserBNI(userName, userPassword, userBalance, "BNI");
                                    registeredUser[userId] = newUser;
                                    
                                    while(true){
                                        System.out.println("Pilih jenis tabungan:\n1. Reguler\n2. Pelajar");
                                        int saving;
                                        
                                        System.out.print("Pilihan: ");
                                        saving = in.nextInt();
                                        in.nextLine();
                                        
                                        if(saving == 1){
                                            Bank newCust = new BNI("BNI");
                                            newCust.regSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else if(saving == 2){
                                            Bank newCust = new Mandiri("BNI");
                                            newCust.eduSaving(true);
                                            customer[userId] = newCust;
                                            break;
                                        }
                                        else{
                                            System.out.println("Terjadi kesalahan!");
                                        }
                                    }
                                    logCount[userId] = 0;
                                    userId++;
                                    break;
                                }
                                else{
                                    break;
                                }
                            }
                        }
                        
                        System.out.println("Anda telah terdaftar!");
                        
                    }
                    // Log in
                    else if(opt == 2){
                        String logName, logPass;
                        boolean logDone;
                        logDone = false;
                        
                        System.out.print("Nama: ");
                        logName = in.nextLine();
                        
                        System.out.print("Password: ");
                        logPass = in.nextLine();
                        
                        for(int i = 0; i < userId; i++){
                            if(logName.equals(registeredUser[i].getName())){
                                if(logPass.equals(registeredUser[i].getPassword())){
                                    System.out.println("Selamat datang " + registeredUser[i].getName() + "!");
                                    logDone = true;
                                    currentUser = i;
                                    break;
                                }
                                else{
                                    System.out.println("Password tidak sesuai!");
                                    break;
                                }
                            }
                            else if(i == userId){
                                System.out.println("Pengguna tidak ditemukan");
                            }
                        }
                        
                        if(logDone == true){
                            loginState = true;
                            break;
                        }
                    }
                    // Modar
                    else if(opt == 3){
                        System.out.println("Terima kasih telah menggunakan layanan kami!");
                        runGreet = false;
                        runProgram = false;
                    }
                    else{
                        System.out.println("Terjadi kesalahan!");
                    }
                }
            }
        }
    }
}
