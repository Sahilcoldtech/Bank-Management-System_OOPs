package BankManagementSystem;

import java.io.*;
import java.util.ArrayList;

public class Database {

    File folder;
    File file;

    public Database() {

        folder = new File("Files");
        if (!folder.exists()) {
            folder.mkdirs();   // <-- create the folder if missing
        }

        file = new File(folder, "Data");

        try {
            if (!file.exists()) {
                file.createNewFile();   // <-- now file is safely created
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Account> getAccounts() {

        ArrayList<Account> accounts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            StringBuilder fullText = new StringBuilder();

            while ((line = br.readLine()) != null) {
                fullText.append(line);
            }

            String text = fullText.toString();

            if (text.isEmpty()) {
                return accounts;
            }

            String[] array1 = text.split("<NewAccount/>");

            for (String v : array1) {
                if (!v.trim().isEmpty()) {

                    String[] array2 = v.split("<A/>");

                    Account a = new Account();
                    a.setFirstName(array2[0]);
                    a.setLastName(array2[1]);
                    a.setAccid(Integer.parseInt(array2[2]));
                    a.setBalance(Double.parseDouble(array2[3]));
                    a.setPasscode(Integer.parseInt(array2[4]));

                    accounts.add(a);   // <-- YOU FORGOT THIS EARLIER
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return accounts;
    }



    public void saveAccounts(ArrayList<Account> accounts) {

        StringBuilder sb = new StringBuilder();

        for (Account a : accounts) {
            sb.append(a.getFirstName()).append("<A/>");
            sb.append(a.getLastName()).append("<A/>");
            sb.append(a.getAccid()).append("<A/>");
            sb.append(a.getBalance()).append("<A/>");
            sb.append(a.getPasscode()).append("<A/>");
            sb.append("<NewAccount/>\n");
        }

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.print(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
