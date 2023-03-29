package kavya;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student1 {
	private int id;
	private String name;
	List<Integer> studentid;
	Set<String> studentname;
	Map<Integer,String>collegeidname;
	public Student1(int id, String name, List<Integer> studentid, Set<String> studentname,
			Map<Integer, String> collegeidname) {
		super();
		this.id = id;
		this.name = name;
		this.studentid = studentid;
		this.studentname = studentname;
		this.collegeidname = collegeidname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getStudentid() {
		return studentid;
	}
	public void setStudentid(List<Integer> studentid) {
		this.studentid = studentid;
	}
	public Set<String> getStudentname() {
		return studentname;
	}
	public void setStudentname(Set<String> studentname) {
		this.studentname = studentname;
	}
	public Map<Integer, String> getCollegeidname() {
		return collegeidname;
	}
	public void setCollegeidname(Map<Integer, String> collegeidname) {
		this.collegeidname = collegeidname;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", studentid=" + studentid + ", studentname=" + studentname
				+ ", collegeidname=" + collegeidname + "]";
	}
	public Student1 getbean() {
		return null;
	}
	public Student1 getBean(String string) {
		return null;
	}
	


}
