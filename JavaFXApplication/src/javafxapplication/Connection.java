/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication;

/**
 *
 * @author Dinodzo
 */
public class Connection {
        public static void Connection(String[] args) {
        try {
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver O.K.");

          String url = "jdbc:mysql://localhost:3306/bdd_sdzee";
          String user = "root";
          String passwd = "azerty";

          Connection conn = DriverManager.getConnection(url, user, passwd);
          System.out.println("Connexion effective !");         

        } catch (Exception e) {
          e.printStackTrace();
        }      
    }
}
