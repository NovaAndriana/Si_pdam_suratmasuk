/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITBPFI
 */
public class UserID {
    private static String IdUsername;
     private static String username;
    
    public static void setUserLogin(String username){
        UserID.username = username;
    }
    public static void setIdUserLogin(String IdUsername){
        UserID.IdUsername = IdUsername;
    }
    public static String getUserLogin(){
    return username;
    }
    public static String getIdUserLogin(){
    return IdUsername;
    }
}
