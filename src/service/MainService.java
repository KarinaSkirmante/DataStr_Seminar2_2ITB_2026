package service;

import java.util.Arrays;

import datastr.MyLinkedList;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		
		System.out.println("------DARBS AR SIMBOLIEM------");
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		
		try
		{
			System.out.println("-----PIEVIENOŠANA------");
			symbols.add('A');//A
			symbols.add('B');//B
			symbols.add('C');//C
			symbols.print();//A B C
			symbols.add('Z');//A B C Z
			symbols.print();//A B C Z
			symbols.add('X', 0);//X A B C Z
			symbols.print();//X A B C Z
			symbols.add('U', 5);//X A B C Z U
			symbols.print();//X A B C Z U
			symbols.add('Q', 2);//X A Q B C Z U
			symbols.print();//X A Q B C Z U
			System.out.println("-----DZĒŠANA------");
			symbols.remove(0);//A Q B C Z U
			symbols.print();//A Q B C Z U
			symbols.remove(5);//A Q B C Z
			symbols.print();//A Q B C Z
			symbols.remove(2);//A Q C Z
			symbols.print();//A Q C Z
			
			System.out.println("-----IEGŪŠANA PĒC POZĪCIJAS------");
			System.out.println(symbols.get(1));//Q
			System.out.println(symbols.get(3));//Z
			
			System.out.println("-----MEKLĒŠANA------");
			System.out.println(symbols.search('A'));//0
			symbols.add('Q');//A Q C Z Q
			symbols.add('Q');//A Q C Z Q Q
			System.out.println(symbols.search('Q'));//1 4 5
			
			System.out.println("-----ATBRIVOT SARAKSTU------");
			symbols.makeEmpty();
			symbols.add('E');//E
			symbols.print();//E
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("------DARBS AR STUDENTIEM----------");
		MyLinkedList<Student> allStudents = new MyLinkedList<Student>();
		Student s1 = new Student("Janis", "Berzins", "121212-67890");
		Student s2 = new Student("Baiba", "Jauka", "122323-23456");
		Student s3 = new Student("Liga", "Nejauka", "345675-34567");
		
		try
		{
			allStudents.add(s1);//Jānis
			allStudents.add(s2);//Jānis Baiba
			allStudents.add(s3,0);//Līga Jānis Baiba
			allStudents.print();
			System.out.println(allStudents.get(1));//Jānis
			System.out.println(allStudents.search(s3));//0 <-kura indeksā galbājās Līga
			
			allStudents.print();//Liga Baiba Janis
			allStudents.remove(2);//izdzēšu Baibu
			allStudents.print();//Liga Janis
			allStudents.makeEmpty();
			allStudents.add(new Student("Karina", "Skirmante", "121234-12212"));
			allStudents.print();//Karina
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
