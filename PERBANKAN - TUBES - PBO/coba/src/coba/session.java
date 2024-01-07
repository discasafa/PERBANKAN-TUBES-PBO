/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author nisaz
 */
public class session {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/perbankan";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static String loggedInNama;
    private static String loggedInUsername;
    private static String loggedInPassword;
    private static String loggedInPinBank;

    public static String getLoggedInNama() {
        String query = "SELECT nama FROM users =?" ;
        return loggedInNama;
    }

    public static void setLoggedInNama(String loggedInNama) {
        session.loggedInNama = loggedInNama;
    }

    public static String getLoggedInUsername() {
        return loggedInUsername;
    }

    public static void setLoggedInUsername(String loggedInUsername) {
        session.loggedInUsername = loggedInUsername;
    }

    public static String getLoggedInPassword() {
        return loggedInPassword;
    }

    public static void setLoggedInPassword(String loggedInPassword) {
        session.loggedInPassword = loggedInPassword;
    }

    public static String getLoggedInPinBank() {
        return loggedInPinBank;
    }

    public static void setLoggedInPinBank(String loggedInPinBank) {
        session.loggedInPinBank = loggedInPinBank;
    }
    
}
