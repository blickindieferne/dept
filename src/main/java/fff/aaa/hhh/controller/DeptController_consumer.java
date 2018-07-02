package fff.aaa.hhh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fff.aaa.pojo.Dept;
import com.fff.aaa.service.DeptClientservice;




@RestController
public class DeptController_consumer {
	
	
	@Autowired
	private DeptClientservice deptservice;
	
	@GetMapping("/consumer/dept/add")   //pring boot 会自动把？后面的值一一对应封装到dept里  然后传递
	public boolean add(Dept dept) {
		return deptservice.add(dept);

	}
	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return deptservice.get(id);
	}
	
	@GetMapping("/consumer/dept/list")
	public List<Dept> list() {
		System.out.print("123456");
		return deptservice.list();
	}
}
