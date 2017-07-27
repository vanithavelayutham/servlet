import java.util.*;  
import java.sql.*;  
  
public class AccDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(Bacc b){  
        int status=0;  
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into bank(id,name,pan,phone,email,street,dist,state,country,type) values (?,?,?,?,?,?,?,?,?,?)"); 
            ps.setInt(1,b.getId()); 
            ps.setString(2,b.getName());
             ps.setInt(3,b.getPan());
              ps.setInt(4,b.getPhone());  
            ps.setString(5,b.getEmail()); 
             ps.setString(6,b.getStreet()); 
              ps.setString(7,b.getDist()); 
               ps.setString(8,b.getState());  
            ps.setString(9,b.getCountry());  
               ps.setString(10,b.getType()); 
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static List<Bacc> getAllEmployees(){  
        List<Bacc> list=new ArrayList<Bacc>();  
          
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from bank");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Bacc b=new Bacc();  
                b.setId(rs.getInt(1));  
                b.setName(rs.getString(2));  
                b.setPan(rs.getInt(3));  
                b.setPhone(rs.getInt(4));  
                 b.setEmail(rs.getString(5));
                  b.setStreet(rs.getString(6));
                   b.setDist(rs.getString(7));
                b.setState(rs.getString(8)); 
                 b.setCountry(rs.getString(9));
                  b.setType(rs.getString(10)); 
                list.add(b);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from bank where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    } 
    public static int update(Bacc b){  
        int status=0;  
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update bank set name=?,pan=?,phone=?,email=?,street=?,dist=?,state=?,country=?,type=? where id=?");  
             
             ps.setString(1,b.getName());  
            ps.setInt(2,b.getPan()); 
            ps.setInt(3,b.getPhone());
            ps.setString(4,b.getEmail());  
            ps.setString(5,b.getStreet());
            ps.setString(6,b.getDist());              
        ps.setString(7,b.getState());
        ps.setString(8,b.getCountry());
        ps.setString(9,b.getType());
              ps.setInt(10,b.getId());
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static Bacc getEmployeeById(int id){  
        Bacc e=new Bacc();  
          
        try{  
            Connection con=AccDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from bank where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2)); 
                 e.setPan(rs.getInt(3));  
                  e.setPhone(rs.getInt(4));  
                e.setEmail(rs.getString(5));
                e.setStreet(rs.getString(6));  
                e.setDist(rs.getString(7)); 
                e.setState(rs.getString(8));     
                e.setCountry(rs.getString(9)); 
                e.setType(rs.getString(10));   
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }
}