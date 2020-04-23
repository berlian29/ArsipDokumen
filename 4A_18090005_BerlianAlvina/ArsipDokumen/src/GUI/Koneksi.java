/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author LENOVO
 */
public class Koneksi {

    public static Connection MySQL() {
        try {
            /*karena di(localhost/phpmyadmin) saya eror tidak bisa 
            membuat user baru jadi saya menggunakan user yang ada yaitu perpustakaan*/
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("perpustakaan");
            ds.setPassword("admin");
            ds.setServerName("localhost");
            ds.setDatabaseName("arsip");
            ds.setServerTimezone("Asia/Jakarta");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            return c;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
