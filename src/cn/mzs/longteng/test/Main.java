package cn.mzs.longteng.test;

/*
 * �ڱ��γ�����ƹ����������˺ܶ����⡣����0-100���������β�����
 * ��δ����������⣻
 * ���д������Ϊ�㼰��ʽ�������ΪС�������⣻
 * ���з���֮���ѡ��
 * Ϊ�˴�����ʽ��������в��ܲ���С�����������������ޣ���Ƶĳ����󽵵��˳��������ԡ�
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	int a, b, c, d, e, f, m;
	static int n;
	int[] s = new int[n];
	String[] st = new String[n];
	String[] ts = new String[n];


	public Main() {

	}

	// ��������������㣺
	public void Num() throws FileNotFoundException {

		FileOutputStream os = new FileOutputStream(new File("src/cn/mzs/longteng/test/result.txt"));
		PrintStream p = new PrintStream(os);
		p.println("201571030322");
		p.println("----------------------------");

		for (int k = 0; k < n; k++) {
			a = (int) (Math.random() * 100 + 1);
			b = (int) (Math.random() * 100 + 1);
			c = (int) (Math.random() * 100 + 1);
			e = (int) (Math.random() * 10 + 1);
			m = (int) (Math.random() * 6);
			d = m * e;
			f = (int) (Math.random() * 3);
			if (f == 0) {
				s[k] = a * b - d / e + c;
				// ��������
				if (a * b - d / e >= 0) {
					ts[k] = a + "*" + b + "-" + d + "/" + e + "+" + c + "=";
					st[k] = a + "*" + b + "-" + d + "/" + e + "+" + c + "=" + s[k];
					System.out.println(ts[k] + "\n");
				} else {
					s[k] = d / e - a * b + c;
					ts[k] = d + "/" + e + "-" + a + "*" + b + "+" + c + "=";
					st[k] = d + "/" + e + "-" + a + "*" + b + "+" + c + "=" + s[k];
					System.out.println(ts[k] + "\n");
				}
			} else if (f == 1) {
				s[k] = a + b * d / e - c;
				// ��������
				if (b * d / e - c >= 0) {
					ts[k] = a + "+" + b + "*" + d + "/" + e + "-" + c + "=";
					st[k] = a + "+" + b + "*" + d + "/" + e + "-" + c + "=" + s[k];
					System.out.println(ts[k] + "\n");
				} else {
					s[k] = c - b * d / e + a;
					ts[k] = c + "-" + b + "*" + d + "/" + e + "+" + a + "=";
					st[k] = c + "-" + b + "*" + d + "/" + e + "+" + a + "=" + s[k];
					System.out.println(ts[k] + "\n");
				}
			} else if (f == 2) {
				s[k] = d / e - a * c + b;
				// ��������
				if (d / e - a * c >= 0) {
					ts[k] = d + "/" + e + "-" + a + "*" + c + "+" + b + "=";
					st[k] = d + "/" + e + "-" + a + "*" + c + "+" + b + "=" + s[k];
					System.out.println(ts[k] + "\n");
				} else {
					s[k] = a * c - d / e + b;
					ts[k] = a + "*" + c + "-" + d + "/" + e + "+" + b + "=";
					st[k] = a + "*" + c + "-" + d + "/" + e + "+" + b + "=" + s[k];
					System.out.println(ts[k] + "\n");
				}
			}

			p.println(st[k] + "\n");
		}
		p.println("-----------------------------");
		p.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ������ٵ���");
		n = input.nextInt();
		System.out.println("\n");
		System.out.println("201571030322");
		System.out.println("====================");
		Main a = new Main();
		a.Num();
		System.out.println("====================");
	}

}