package After;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StringTest {
	public static void main(String[] args) {
		//입력//대소문자//총길이//단어자르기1//단어자르기2
		Scanner scn = new Scanner(System.in);
		List<String> arl = new ArrayList<>();
		int menu = 0;
		
	while(menu!=99) {
	System.out.println("1.단어넣기 2.대문자 3.소문자 4.단어길이 5.단어자르기1 6.단어자르기2 종료 99");
			 menu = Integer.parseInt(scn.nextLine());
		switch(menu)	{
		
		case 1:
//			int menu2 = Integer.parseInt(scn.nextLine());
			
			while(true) {
				System.out.print("입력 > (나가기'ㅂ')");
				String menu2= scn.nextLine();		
					if(menu2.equals("ㅂ")) {break;}
				arl.add(menu2);
			}
			break;
		case 2:
			if(arl.isEmpty()) {System.out.println("값이없습니다.");
			continue;
		}
			System.out.println("대문자로 반환합니다.");
			for(String s : arl) {
				System.out.println(s.toUpperCase());
			}
			break;
		case 3:
			if(arl.isEmpty()) {System.out.println("값이없습니다.");
			continue;
		}
			System.out.println("소문자로 반환합니다.");
			for(String s : arl) {
				System.out.println(s.toLowerCase());
			}
			break;
		case 4:
			StringBuilder sb = new StringBuilder();
			
			for(int i =0; i < arl.size();i++) {
				sb.append(arl.get(i));
			}
			
			System.out.println("총길이는 "+sb.length());
			break;
		case 5:
			if(arl.isEmpty()) {System.out.println("값이없습니다.");
			continue;
		}
			int i=0;
			for(String str : arl) {
				System.out.println(i+"번째 단어 : "+str);
				i++;
			}
			
			System.out.print("몇번째 단어를 가져올까요>");
			int index = Integer.parseInt(scn.nextLine());
			
			String word =arl.get(index);
			//index가 총길이
			System.out.println(word.substring(Math.round(word.length()/2)));
			//(int)(word.length()/2);
			
			
			break;
		case 6 :
			System.out.print("단어 입력 >");
			String str = scn.nextLine();
			System.out.println("단어확인 " + str);
			
//			split
			System.out.print("구분자 입력 : ");
			String spl = scn.nextLine();
			String [] token = str.split(spl);
			
			for(String str2 : token) {
				System.out.println(str2);
			}
			
			break;
		} 
		
	
	
	
	
	
	
	}
	}
	
	}
