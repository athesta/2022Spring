package Sandbox;

public class exam4Check {

	int a;

	public void f1(int x) {

		int b = 10;

		if (a > 10) { // 1

			int e = 10;

			b += x; // 2

			//b += c; // 3

			if (a > 20) { // 4

				int d = 10;

				b += x; // 5

				//b += c; // 6

				b += d; // 7

				b += e;// 8

			} else {

				int c = 10;

				b += x;// 9

				b += c;// 10

				//b += d;// 11

				b += e;// 12

			}

		}

		b += x;// 13

		//b += c;// 14

		//b += d;// 15

		//b += e;// 17

	}

}