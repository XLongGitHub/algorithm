package newke.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.princeton.cs.algs4.StdOut;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 
 * @author Xulong
 *
 */
public class Nu {

	public void FindNumersAppearOnce(int[] array, int num1[], int num2[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if (array.length < 2)
			return;
		for (int i = 0; i < array.length; i++) {
			// map.put(array[i], map.get(array[i]) + 1);
			map.put(array[i], 0);
		}
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.get(array[i]) + 1);
		}

		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				if (count == 0) {
					num1[0] = entry.getKey();
					count++;
				} else if (count == 1) {
					num2[0] = entry.getKey();
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 4, 3, 6, 3, 2, 5, 5 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		Nu nu = new Nu();
		nu.FindNumersAppearOnce(array, num1, num2);
		StdOut.println("num1 = " + num1[0] + " num2 = " + num2[0]);
		int[] arr = {1,2,4,7,11,15}; int sum = 15;
		int[] arr1 = {1,2,4,7,11,16};int sum1 = 10;
		ArrayList<Integer> al = nu.FindNumbersWithSum(arr1, sum1);
		for(Integer i : al)
			StdOut.println(i);
		

	}
//类型相匹配
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		
	//	if(array.length < 2) return null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(array.length < 2) return al;
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j< array.length; j++) {
				if (array[i] + array[j] == sum) {
					min = array[i];
					max = array[j];
				}
			}
		}
		if (max==0) return al;
		if (max > min) {
            al.add(min);
			al.add(max);
        } else {
            al.add(max);
			al.add(min);
        }
		return al;
	}
	
	public String ReverseSentence(String str) {
		if (str.length() == 0) return str;
		String[] ss = str.split(" ");
		String sb = "";
		for (int i=ss.length-1; i>=0; i-- ) {
			sb += ss[i]+" ";
		}
		
		/*if (sb.trim().equals("")) 
            return " ";	
        else return sb.trim();*/
		if (sb.trim().length() == 0) {
			sb = " ";
		} else {
			sb = sb.trim();
		}
		return sb;
    }
}
