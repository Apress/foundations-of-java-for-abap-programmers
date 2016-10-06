@Entity
@Table(name = "EMP")
public class Employee implements Serializable
{
  private int empNo;
  private String eName;
  private double sal;

  @Id
  @Column(name="EMPNO", primaryKey=true)
  public int getEmpNo()
  {
    return empNo;
  } 
// More code here
}
