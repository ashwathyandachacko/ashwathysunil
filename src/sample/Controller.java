//package sample;
//
//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
//import javafx.fxml.FXML;
//
//
//import javafx.scene.control.TextField;
//
//import java.sql.*;
//
//public class Controller {
//
//    @FXML
//    TextField text1, text2;
//
//    @FXML
//    public void buttonEvent(javafx.event.ActionEvent obj) throws ClassNotFoundException, SQLException {
//        try {
//            System.out.println("button clicked");
//            System.out.println(text1.getText());
//            System.out.println(text2.getText());
//
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","mysql");
//            PreparedStatement ps=connection.prepareStatement( "insert into product values(?,?,?,?)");
//            ps.setInt(1,Integer.parseInt(text1.getText()));
//            ps.setString(2,text2.getText());
//          ps.setString(3,"56");
//          ps.setString(4,"30");
//ps.executeUpdate();
//ResultSet rs=ps.executeQuery("select * from product");
//while(rs.next()){
//    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//}
//connection.close();

//            Statement statement=connection.createStatement();
//            int i = statement.executeUpdate("update product  set idProduct='text1.getText()' name='text2.getText()' where price='30');
//            ResultSet rs= statement.executeQuery("select * from product");
//            while(rs.next()){
//               System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
//            }
//            connection.close();
//        }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
