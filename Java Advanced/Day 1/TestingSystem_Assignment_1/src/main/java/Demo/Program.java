package Demo;


import java.util.Date;

import Repository.AccountRepository;
import Repository.AnswerRepository;
import Repository.CategoryQuestionRepository;
import Repository.DepartmentRepository;
import Repository.ExamRepository;
import Repository.GroupRepository;
import Repository.PositionRepository;
import Repository.SalaryRepository;
import Repository.TypeQuestionRepository;

import java.util.List;
import entity.*;
import entity.Position.PositionName;
import entity.Salary.SalaryName;
import entity.TypeQuestion.TypeName;

public class Program {

	
	public static void main(String[] args) {
		SalaryRepository repository = new SalaryRepository();
		System.out.println(repository.getAllSalaries());
		Salary salary = new Salary(SalaryName.SCRUM_MASTER);
		repository.createSalary(salary);
		System.out.println(repository.getAllSalaries());

		



		
		
		



		
	}	
}
