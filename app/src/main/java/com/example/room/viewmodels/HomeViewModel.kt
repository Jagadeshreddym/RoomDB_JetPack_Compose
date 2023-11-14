package com.example.room.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.room.database.Employee
import com.example.room.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val employeeRepository: EmployeeRepository) :
    ViewModel() {

    fun getAllEmployees(){
        employeeRepository.getAllEmployees()
    }

    fun addEmployee(employee: Employee) {
        employeeRepository.addEmployee(employee)
        getAllEmployees()
    }

    fun updateEmployeeDetails(employee: Employee) {
        employeeRepository.updateEmployeeDetails(employee)
        getAllEmployees()
    }

    fun findEmployeeById(empId: String) {
        employeeRepository.findEmployeeById(empId)
    }

    fun deleteEmployee(employee: Employee) {
        employeeRepository.deleteEmployee(employee)
        getAllEmployees()
    }

    val employeeList: LiveData<List<Employee>> = employeeRepository.allEmployees

    val foundEmployee: LiveData<Employee> = employeeRepository.foundEmployee

}