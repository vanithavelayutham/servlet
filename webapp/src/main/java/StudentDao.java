import java.util.*;  
import java.sql.*;
public class StudentDao
{
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "");
        }catch(Exception e){System.out.println(e);}  
        return con;  
}
public static int insert(Student s)
{
    int n=0;
    try
    {
  
    Connection con=StudentDao.getConnection();
    PreparedStatement ps=con.prepareStatement("insert into servlet(id,name) values(?,?)");
ps.setInt(1,s.getId());
ps.setString(2,s.getName());
    n=ps.executeUpdate();
    con.close();
}
catch(Exception ex){ex.printStackTrace();}
return n;
}


public static List<Student> select()
{
    List<Student> l=new ArrayList<Student>();
    //int c=0;
    try
    {
  
    Connection con=StudentDao.getConnection();
    PreparedStatement ps=con.prepareStatement("select * from servlet");
    ResultSet rs=ps.executeQuery();
    while(rs.next()){  
                Student s=new Student();  
                s.setId(rs.getInt(1));  
                s.setName(rs.getString(2));
                l.add(s);  
            }  
            con.close();  

}
catch(Exception ex){ex.printStackTrace();}
return l;
}
public static int delete(int id)
{
    int n1=0;
    try
    {
  
    Connection con=StudentDao.getConnection();
    PreparedStatement ps=con.prepareStatement("delete from servlet where id=?");
ps.setInt(1,id); 
n1=ps.executeUpdate();
con.close();
    }
  catch(Exception ex){ex.printStackTrace();}
return n1;  
}
public static Student updateGet(int id){  
        Student s=new Student();  
          
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from servlet where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                s.setId(rs.getInt(1));  
                s.setName(rs.getString(2));  
                 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return s;  
    }  
    public static int update(Student e){  
        int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update servlet set id=?,name=? where id=?");  
           ps.setInt(1,e.getId());  
           ps.setString(2,e.getName());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
}