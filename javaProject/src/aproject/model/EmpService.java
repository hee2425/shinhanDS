package aproject.model;

import java.util.List;

import aproject.vo.EmpVO;

//Service : 업무로직담당
public class EmpService {
	
	EmpDAO empDao = new EmpDAO();
	
	public List<EmpVO> selectAll() {
		return empDao.selectAll();
	}
	
	public EmpVO selectById(int empid) {
		return empDao.selectById(empid);
	}
	
	public List<EmpVO> selectByDept(int deptid) {
		return empDao.selectByDept(deptid);
	}
	
	public List<EmpVO> selectByCondition(int deptid, String jobid, double salary) {
		return empDao.selectByCondition(deptid, jobid, salary);
	}
}
