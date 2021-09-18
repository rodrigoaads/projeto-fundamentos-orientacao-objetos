import Enum.EmployeeType
import Enum.Responsibilitys

/*FUNCIONARIO*/
class Employee(name: String,
               surname: String,
               val salary: Double,
               val employeeType: EmployeeType,
               val responsibilitys: Responsibilitys
) : People(name, surname) {

    fun getEmployeeInfos() : String = "Name: $name, Surname: $surname, " +
            "Total Salary: R$${salary + getbonus()} (Salary: $salary, Bonus: ${getbonus()}), " +
            "Employee Type: $employeeType, Responsibility: $responsibilitys"


    fun getbonus(): Double {
        return when(responsibilitys){
            Responsibilitys.MANAGER -> salary * 0.05
            Responsibilitys.ANALYST -> salary * 0.04
            Responsibilitys.SALES_SUPPORT -> salary * 0.03
        }
    }
}