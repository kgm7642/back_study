package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      1번 : 학생 정보를 모두 출력하세요
        PersonDTO[] students = {
            new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
            new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
            new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
        };
        for(PersonDTO student : students) {
            System.out.println(student.information());
        }

//      2번 : 사원정보를 입력받고 기록 할 수 있게 하세요
        EmployeeDTO[] employees = new EmployeeDTO[10];
        int cnt = 0;
        while(true) {
            if(cnt>=10) break;

            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("나이: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("신장: ");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("몸무게: ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.print("급여: ");
            int salary = Integer.parseInt(sc.nextLine());
            System.out.print("부서: ");
            String dept = sc.nextLine();

            employees[cnt++] = new EmployeeDTO(name, age, height, weight, salary, dept);

            System.out.println("계속 추가하시겠습니까??");
            String answer = sc.nextLine();
            if(!answer.equalsIgnoreCase("y")) break;
        }
        for(int i=0; i<cnt; i++) {
            System.out.println(employees[i].information());
        }
    }
}
