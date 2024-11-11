import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TheadEx1Main {

	public static void main(String[] args) {
	    
		//음악 듣기
		for(int i=0; i< 300; i++) {
			System.out.print("-");
		}
		
		//비디오 보기
		for(int i=0; i< 300; i++) {
			System.out.print("+");
		}
		
	}
}
