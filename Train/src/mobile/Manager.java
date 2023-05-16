package mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
public class Manager {
	
	public static void main(String[] args) {
		
		List<Iphone> iphoneList = new ArrayList<>();
		
		Iphone iphone1 = new Iphone();
		Iphone iphone2 = new Iphone();
		Iphone iphone3 = new Iphone();
		
		//add 3 iphone
		
		iphoneList.add(iphone1);
		iphoneList.add(iphone2);
		iphoneList.add(iphone3);
		
		for (Iphone iphone : iphoneList) {
			System.out.println(iphone);
		}
		
		
		Iphone iphone4 = new Iphone();
		Iphone iphone5 = new Iphone();
		Iphone iphone6 = new Iphone();
		
		Map<String, Iphone> phoneMapping = new HashMap<>();
		phoneMapping.put("123-456-7890", iphone4);
		phoneMapping.put("012-345-6789", iphone5);
		phoneMapping.put("098-765-4321", iphone6);
		
		for(Map.Entry m:phoneMapping.entrySet()) {
			System.out.println(m.getKey()+ " " +m.getValue());
		}
		
		System.out.println("Iphone 1");
		String playSong = iphone1.playSong("รองเท้าเก่า");
		System.out.println("Song is Playing : " + playSong);
		String playVideo = iphone1.playVideo("พี่เต้ vs แตงโม");
		System.out.println("Video is Playing : " + playVideo);
		
		System.out.println("iphone4");
		iphone4.makeCall("098-765-4321");
		System.out.println("iphone6");
		iphone6.receiveCall("123-456-7890");
		
		System.out.println("iphone 2 Slide to Unlock ");
		iphone2.slideToUnlock();
		System.out.println("iphone 3 Installing App ");
		iphone3.installApplication("Spring");
		
		
		System.out.println("Iphone 5 at ");
		System.out.println(iphone5.getLocation());
	}
}
