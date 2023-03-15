package aproject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shinhan.dbutil.OracleUtil;

import aproject.vo.EmpVO;

//DAO(data access object) : db업무...CRUD..insert, select, update, delete
public class EmpDAO {
	Connection conn;  //필드는 new될때 자동생성이므로 초기화 안해도 됨
	Statement st;
	PreparedStatement pst;  //?지원 
	ResultSet rs;
	int resultCount;  //insert, update, delete건수
	
	public List<EmpVO> selectAll() {
		String sql ="select * from employees"; 
		List<EmpVO> emplist = new ArrayList<>();
		conn = OracleUtil.getConnection();
		try {
			st = conn.createStatement();  //통로 만들고
			rs = st.executeQuery(sql);  //sql실행
			while(rs.next()) {
				EmpVO emp = makeEmp(rs);
				emplist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			OracleUtil.dbDisconnect(rs, st, conn);
		}
		
		return emplist;
	}

	//특정직원 조회
	public EmpVO selectById(int empid) {
		EmpVO emp = null;
		String sql ="select * from employees where employee_id = "+empid; 
		conn = OracleUtil.getConnection();
		try {
			st = conn.createStatement();  //통로 만들고
			rs = st.executeQuery(sql);  //sql실행
			while(rs.next()) {
				emp = makeEmp(rs);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			OracleUtil.dbDisconnect(rs, st, conn);
		}
		return emp;
	}
	
	
	//특정 부서의 직원만 조회
	public List<EmpVO> selectByDept(int deptid) {
		String sql ="select * from employees where department_id = "+deptid; 
		List<EmpVO> emplist = new ArrayList<>();
		conn = OracleUtil.getConnection();
		try {
			st = conn.createStatement();  //통로 만들고
			rs = st.executeQuery(sql);  //sql실행
			while(rs.next()) {
				EmpVO emp = makeEmp(rs);
				emplist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			OracleUtil.dbDisconnect(rs, st, conn);
		}
		
		return emplist;
	}
	
	//특정부서, jobid, salary이상 직원조회
	public List<EmpVO> selectByCondition(int deptid, String jobid, double salary) {
		String sql ="select * "
				+ " from employees "
				+ " where department_id = ?"
				+ " and job_id = ?"
				+ " and salary >= ?"; 
		List<EmpVO> emplist = new ArrayList<>();
		conn = OracleUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);  //통로 만들고
			
			//?에 들어갈 값, 순서대로
			pst.setInt(1, deptid);
			pst.setString(2, jobid);
			pst.setDouble(3, salary);
			
			rs = pst.executeQuery();  //
			while(rs.next()) {
				EmpVO emp = makeEmp(rs);
				emplist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			OracleUtil.dbDisconnect(rs, pst, conn);
		}
		
		return emplist;
	}
	
	private EmpVO makeEmp(ResultSet rs) throws SQLException {
		EmpVO emp = new EmpVO();
		emp.setCommission_pct(rs.getDouble("Commission_pct"));
		emp.setDepartment_id(rs.getInt("Department_id"));
		emp.setEmail(rs.getString("Email"));
		emp.setEmployee_id(rs.getInt("Employee_id"));
		emp.setFirst_name(rs.getString("First_name"));
		emp.setHire_date(rs.getDate("Hire_date"));
		emp.setJob_id(rs.getString("Job_id"));
		emp.setLast_name(rs.getString("Last_name"));
		emp.setManager_id(rs.getInt("Manager_id"));
		emp.setPhone_number(rs.getString("Phone_number"));
		emp.setSalary(rs.getDouble("Salary"));
		
		return emp;
	}
}
