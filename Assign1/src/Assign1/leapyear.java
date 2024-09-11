package Assign1;

public class lp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int year=2023;
    System.out.println((year % 400== 0) ? true : (year % 100 == 0) ? false : (year % 4 == 0) ? true: false);
	}

}
