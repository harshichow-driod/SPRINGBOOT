package com.EmployeePayrollApp1Application;



@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeePayrollService service;

    @GetMapping("/")
    public List<EmployeePayrollData> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/get/{id}")
    public EmployeePayrollData getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/create")
    public EmployeePayrollData createEmployee(@RequestBody EmployeePayrollDTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/update/{id}")
    public EmployeePayrollData updateEmployee(@PathVariable int id, @RequestBody EmployeePayrollDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted successfully!";
    }
}