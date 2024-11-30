package com.springdidemo2.main;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdidemo2.entity.Candidate;
import com.springdidemo2.entity.ClassRoom;
import com.springdidemo2.entity.Container;
import com.springdidemo2.entity.DbDetails;
import com.springdidemo2.entity.Playlist;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		
		Container container=context.getBean("cntr",Container.class);
		System.out.println(container.getRef1().getX());
		System.out.println(container.getRef2().getY()); 
		
		//List Example
	/*	ClassRoom classRoom = context.getBean("clr", ClassRoom.class);
		System.out.println("Name of all student are:- ");
		classRoom.getStudentName().forEach(System.out::println);
	*/
		
		//Map Example
	/*	DbDetails db=context.getBean("dbDetails",DbDetails.class);
		Set<Entry<String, String>> str=db.getDbDetails().entrySet();
		
		for (Entry<String, String> entry : str) {
			System.out.println(entry);
		}
	*/
		
		//Set Example
	/*	Playlist songList=context.getBean("list",Playlist.class);
		System.out.println("All songs are:- ");
		songList.getSongList().forEach(System.out::println);
	*/
		
		//Property Class Example
		Candidate candidate=context.getBean("interview",Candidate.class);
		System.out.println(candidate.getInterviews());
		
		
		
	}
}
