@Stateless
public class EmployeeFacadeBean implements EmployeeFacade
{
  @Resource
  private EntityManager em;
  private Employee emp;

  public Employee findEmployeeByEmpNo(int empNo) 
  {
    return ((Employee) em.find("Employee",empNo)); 
  }

  public void addEmployee(int empNo, String eName, double sal) 
  {
    if (emp == null) 
    {
      emp = new Employee();
    }

     . . . 

     em.persist(emp); 
  } 

  . . .

} 
