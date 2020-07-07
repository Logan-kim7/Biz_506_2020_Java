package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV4 extends StudentServiceImplV2{
	public StudentServiceImplV4() {
		
		outPut = System.out;
	}

	/*
	 * V2는 V1을 상속받아서 studentList() method를 재정의(Override)해 놓은 상태이다
	 * V3에서는 V2를 상속받아서 V2에 구현된 studentList() method는 그대로 사용하고
	 * V1에 있는 inputStudent() method만 재정의하여 V3를 만들겠다 라는 의미
	 * 
	 * V3에서는 student.txt 파일을 읽어서
	 * 학생정보를 가져오고 studentList() method사용하여 출력해보기
	 */
	@Override
	public boolean inputStudent() {
	
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		
		FileReader fileReader = null;
		
		BufferedReader buffer = null;
		
		try {
			
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader= "";
			while(true) {
				
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// System.out.println(reader);
				
				// 읽어들인 라인에서 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				studentList.add(sVO);
			}
			
			//파일을 읽기쓰기로 열었으면 모두 닫아서 종료해 주어야한다.
			// 닫는순서는 열었던 순서 반대로
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return true;
	}

	
	
}
