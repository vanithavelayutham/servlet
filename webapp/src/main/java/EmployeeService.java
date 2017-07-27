

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * 
 * @author Dinesh Krishnan
 *
 */

public class EmployeeService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// defining the PrintWriter object
		PrintWriter out = response.getWriter();
		
		// setting the response type
		response.setContentType("application/json");
		
		// creating employee object
		Employee employee = new Employee();
		
		// setting the attributes
		employee.setEmpId(101);
		employee.setEmpName("Dinesh Krishnan");
		employee.setEmpAge(25);
		employee.setEmpQualifcation(new String[]{"MS", "MBA"});
		employee.setEmpEmailId("dinesh@dineshkrish.com");
		employee.setEmpPhone("+91 8989898989");
		
		// converting object to json using Gson api.
		out.println(JSONConverter.convert(employee));
		
		out.close();
	}

	
}