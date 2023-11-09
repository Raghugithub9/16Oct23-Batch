
public class twoDImensionalArray {

	public static void main(String[] args) {

			//row and column
int a[][]=new int[3][4];

a[0][0]=121;
a[0][1]=122;
a[0][2]=123;
a[0][3]=124;

a[1][0]=221;
a[1][1]=222;
a[1][2]=223;
a[1][3]=224;

a[2][0]=321;
a[2][1]=322;
a[2][2]=323;
a[2][3]=324;

System.out.println(a[1][1]);
System.out.println("********************");

for(int i=0;i<3;i++) {//i=0,1,2
	
	for(int j=0;j<4;j++) {//j=0,1,2...0,1,2
		System.out.print(a[i][j]+" ");
	}System.out.println();
}












		

	}

}
