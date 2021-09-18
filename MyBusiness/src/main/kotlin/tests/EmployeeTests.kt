package tests

import Employee
import Enum.EmployeeType
import Enum.Responsibilitys

fun main() {
    val rodrigo = Employee("Rodrigo", "Alves", 7000.00,
        EmployeeType.PARTNER, Responsibilitys.MANAGER)

    val carlos = Employee("Carlos", "Fulano", 5000.00,
        EmployeeType.NORMAL, Responsibilitys.ANALYST)

    val andre = Employee("Andre", "Fulano", 4000.00,
        EmployeeType.NORMAL, Responsibilitys.SALES_SUPPORT)

    println(rodrigo.getEmployeeInfos())
    println(carlos.getEmployeeInfos())
    println(andre.getEmployeeInfos())
}