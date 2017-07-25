import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/**
 * 求文件中所有数据的平均数，使用IO数据流
 * @author Xulong
 *
 */
public class Average {

	public static void main(String[] args) {
//		Object sum;
		double sum = 0.0;        //数据和
		int cnt = 0; 			//数据数目
		
		/*while(! StdIn.isEmpty()) {
			sum += StdIn.readDouble();
			cnt++;
		}*/
		
		FileInputStream  fis;
		
		try {
			//文件流和buffered配合使用
			fis = new FileInputStream("d:/share/java/data.txt");
			BufferedInputStream bis = new BufferedInputStream(fis); 
			int c = 0;
			for (; (c = bis.read())!=-1; cnt++) {
				sum += c;
				System.out.println(c);
				
			}
			StdOut.println("nihao");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		double avg = sum / cnt;
		StdOut.printf("Average is %.5f\n", avg);
	}

}
