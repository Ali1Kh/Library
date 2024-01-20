package summercourseproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataBase {

    private static Connection con;
    private static PreparedStatement pre;
    private static ResultSet rs;

    // Connect From Java To DataBase
    private static void setConnect() {
        FileReader fr;
        BufferedReader br;
        try {
            fr = new FileReader("database.txt");
            br = new BufferedReader(fr);
            String connection = br.readLine();
            String url = br.readLine();
            String user = br.readLine();
            String pass = br.readLine();
            
            Class.forName(connection);
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(true);
            br.close();
            fr.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "connection1 \n" + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "connection2 \n" + ex);
        } catch (Exception ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // login Admin Or Users
    public static boolean login(String userName, String password, String tblName) {
        DataBase.setConnect();
        boolean result;
        try {
            pre = con.prepareStatement("select * from " + tblName + " where userName = ? and password = ?");
            pre.setString(1, userName);
            pre.setString(2, password);
            rs = pre.executeQuery();
            if (rs.next()) {
                result = true;
            } else {
                result = false;
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "login \n" + ex);
            return false;
        }
        return result;
    }

    // Insert Into Table Users
    public static boolean insertsql(String name, String password, String address,
            String city, String email, String phone) {
        DataBase.setConnect();
        try {
            pre = con.prepareStatement("insert into users values (seq_user.nextval,?,?,?,?,?,?)");
            pre.setString(1, name);
            pre.setString(2, password);
            pre.setString(3, address);
            pre.setString(4, city);
            pre.setString(5, email);
            pre.setString(6, phone);
            int rows = pre.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "User Added");
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Failed To Add User");
            }

            con.close();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1) {
                JOptionPane.showMessageDialog(null, "Email Or Phone Is Already Exit");
            }
//            JOptionPane.showMessageDialog(null, "insert \n" + ex);
            return false;
        }
        return false;
    }

    // Select Users From User Tables
    public static ResultSet RunSelect(JTable tbl, String where) {
        DataBase.setConnect();

        try {
            if (where != null) {
                pre = con.prepareStatement("select * from users " + where);
            } else {
                pre = con.prepareStatement("select * from users ");
            }
            rs = pre.executeQuery();
            if (where == null) {
                while (rs.next()) {
                    String id = rs.getInt("id") + "";
                    String name = rs.getString("userName");
                    String pass = rs.getString("password");
                    String address = rs.getString("address");
                    String city = rs.getString("city");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    String[] data = {id, name, pass, address, city, email, phone};
                    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
                    model.addRow(data);
                }

                con.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Table \n" + ex);
        }
        return rs;

    }

    // Searching From Users Table 
    public static void RunSearch(String sql, JTable tbl) {
        DataBase.setConnect();
        try {
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id") + "",
                    rs.getString("userName"),
                    rs.getString("password"),
                    rs.getString("address"),
                    rs.getString("city"), rs.getString("email"),
                    rs.getString("phone")};
                model.addRow(row);
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "RunSearch \n" + ex);
        }
    }

    // Delete From Users Table
    public static void RunDelete(String role, int id, JTable tbl) {
        DataBase.setConnect();
        try {
            pre = con.prepareStatement("delete from " + role + " where id = " + id);
            int rows = pre.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            if (role == "books") {
                RunSelectbook(tbl, null);
            } else if (role == "users") {
                RunSelect(tbl, null);
            }
//            JOptionPane.showMessageDialog(null, "Deleted \n");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete \n" + ex);
        }
    }

    // Searching From Users Table 
    // Insert Into Books Table
    public static boolean insertBook(String call, String name, String auther, String pub, int quan, String date) {
        DataBase.setConnect();
        boolean result;
        try {
            pre = con.prepareStatement("insert into books values (seq_book.nextval,?,?,?,?,?,to_date(?,'dd-mm-yyyy'),1)");
            pre.setString(1, call);
            pre.setString(2, name);
            pre.setString(3, auther);
            pre.setString(4, pub);
            pre.setInt(5, quan);
            pre.setString(6, date);
            int rows = pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "Book Added");
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "insert2 \n" + ex);
            return false;
        }
        return true;
    }

    // View The Table Books
    public static void RunSelectbook(JTable tbl, String sql) {
        DataBase.setConnect();
        try {
            if (sql != null) {
                pre = con.prepareStatement("select id,callno,name,auther,publisher,quantity,Issued,to_char(ADDED_DATE,'dd-mm-yyyy') as pub_date from books " + sql);
            } else {
                pre = con.prepareStatement("select id,callno,name,auther,publisher,quantity,Issued,to_char(ADDED_DATE,'dd-mm-yyyy') as pub_date from books");
            }

            rs = pre.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                String id = rs.getInt("id") + "";
                String call = rs.getString("callno");
                String name = rs.getString("name");
                String auth = rs.getString("auther");
                String pub = rs.getString("publisher");
                String quan = rs.getString("quantity");
                String issued;
                if (Integer.parseInt(rs.getString("Issued")) == 0) {
                    issued = "Is Issued";
                } else {
                    issued = "Not Issued";
                }
                String date = rs.getString("pub_date");
                String[] data = {id, call, name, auth, pub, quan, issued, date};
                model.addRow(data);
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Table \n" + ex);
        }
    }

    public static int RunUpdate(JTable tbl, int id, int bool) throws SQLException {
        DataBase.setConnect();
        int rows;
        if (bool == 0) {
            pre = con.prepareStatement("update books set issued =" + bool + "where id=" + id + " and issued=1");
            rows = pre.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            RunSelectbook(tbl, null);
        } else {
            pre = con.prepareStatement("update books set issued =" + bool + "where id=" + id + " and issued=0");
            rows = pre.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            RunSelectbook(tbl, "where issued = 0");
        }

        con.close();
        return rows;
    }

    public static void updateUser(int id,String name,String  pass,String  address,String  city,String  email,String  phone) {
        DataBase.setConnect();
        try {
            pre = con.prepareStatement("update users set username = ? ,password = ?,address = ? , city = ? ,email = ? , phone = ?   where id = " + id);
            pre.setString(1, name);
            pre.setString(2, pass);
            pre.setString(3, address);
            pre.setString(4, city);
            pre.setString(5, email);
            pre.setString(6, phone);
            int rows = pre.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
