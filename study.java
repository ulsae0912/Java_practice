import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
public class study {
//연습문제 1
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원화를 입력하세요(단위 원)>>");
        int num= scanner.nextInt();
        int result=num/1100;
        System.out.println(num+"은 $"+result+"입니다.");

        scanner.close();
    }*/
    //연습문제 2
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2자리수 정수 입력(10~99)>>");
        int num=scanner.nextInt();
        int ten=num/10;
        int one=num%10;
        if(ten==one)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        scanner.close();
    }*/
//연습문제 3
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하시오>>");
        int money = scanner.nextInt();
        int oman= money/50000;
        int man=money/10000;
        int cheon=money/1000;
        int beak=money/100;

}*/
    //연습문제3
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오.");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3=scanner.nextInt();
        int middle=0;
        if(num1>num2)
            middle=num1;
        else if (num2>num1)
            middle=num2;
        else if (middle>num3)
            middle=num3;
        System.out.println("중간값 정수>>"+middle);

        scanner.close();
    }*/
//연습문제 4
    /*
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 3개를 입력하시오.");
    int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    int num3=scanner.nextInt();
    if(num1+num2<num3)
        System.out.println("삼각형이 될 수 없습니다");
    else if(num1+num3<num2)
        System.out.println("삼각형이 될 수 없습니다.");
    else if (num2+num3<num1)
        System.out.println("삼각형이 될 수 없습니다.");
    scanner.close();

}*/
/*
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("세 정수 a,b,c를 입력");
    int a= scanner.nextInt();
    int b= scanner.nextInt();
    int c= scanner.nextInt();
    if(a%2==0)
        System.out.println(a);
    if (b%2==0) {
        System.out.println(b);
    }
    if(c%2==0){
        System.out.println(c);
    }
    scanner.close();
}

 */
    /*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력하시오.");
    int num=scanner.nextInt();
    if(num<0){
        System.out.println("minus");
        if(num%2==0) {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
    else {
        System.out.println("plus");
        if(num%2==0) {
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
    }

     */
    /*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("평가를 출력할 점수(정수, 0~100)를 입력하시오. ");
    int score=scanner.nextInt();
    if(score>=90&&score<=100){
        System.out.println("A");
    } else if (score<=89&&score>=70) {
        System.out.println("B");
    } else if (score<=69&&score>=40) {
        System.out.println("C");
    } else if (score<=39&&score>=0) {
        System.out.println("D");
    }
    scanner.close();
}*/
    /*
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("정수를 입력하시오.: ");
    int num= scanner.nextInt();
    if(num<10)
        System.out.println("small");
    scanner.close();
}*/
    /*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a= scanner.nextInt();
    int b= scanner.nextInt();
    if(a>b)
        System.out.println(">");
    else if(a<b)
        System.out.println("<");
    else if(a==b)
        System.out.println("=");
    scanner.close();
}
     */
/*public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int a= scanner.nextInt();
    int b= scanner.nextInt();
    if(a>b)
        System.out.println(a-b);
    else if (a<b)
        System.out.println(b-a);
    scanner.close();
}*/
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num= scanner.nextInt();
    if(num%7==0)
        System.out.println("multiple");
    else
        System.out.println("not multiple");
    scanner.close();
}*/
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num=scanner.nextInt();
    if(num%2==0)
        System.out.println("even");
    else
        System.out.println("odd");
    scanner.close();
}*/
    /*
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("시작 단과 마지막 단을 입력하라.(정수 1~9)");
    int Fdan=scanner.nextInt();
    int Ldan=scanner.nextInt();

    if(Fdan<Ldan) {
        for (int i = 1; i < 10; i++) {
            System.out.println(Fdan + "*" + i);
        }
          
    else
        for(int i=1;i<10;i++){
            System.out.println(Ldan+"*"+i);
        }
    }
    scanner.close();
}

     */
/*

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
*/
   /* public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[24];
        *//*for(int i=0; i<a.length;i++) {
            a[i] = i + 1;
        }

         *//*
        int randomNumber= random.nextInt(24);
        System.out.println("출석부른 번호는 "+randomNumber+"입니다");

}*/
/*
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a=new int[24];
    System.out.print("개수를 입력하시오 : ");
    int num=scanner.nextInt();
    System.out.print("해당 개수만큼 입력하시오 : ");
    for(int i=1;i<=num;i++){
        System.out.print("");
        int t= scanner.nextInt();
        a[t]=a[t]+1;
    }
    for(int i=1;i<=23;i++){
        System.out.print(a[i]+" ");
    }
    scanner.close();
}
*/

/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a=new int[24];
    System.out.print("개수를 입력하시오 : ");
    int num=scanner.nextInt();
    System.out.print("해당 개수만큼 입력하시오 : ");
    for(int i=1;i<=num;i++){
        System.out.print("");
        int t= scanner.nextInt();
        a[t]=a[t]+1;
    }
    for(int i=23;i>=1;i--){
        System.out.print(a[t]+" ");
    }
    scanner.close();
}*/
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("세 수를 오름차순 정렬하겠습니다. : ");
    int num1= scanner.nextInt();
    int num2= scanner.nextInt();
    int num3= scanner.nextInt();

    if(num1>num2){
        int temp=num1;
        num1=num2;
        num2=temp;
    }

}*/
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("학생 수를 입력하시오. : ");
    int student= scanner.nextInt();//배열의 크기 설정 1
    int[] num=new int[student];//배열의 크기 설정 2
    for(int i=0;i<=student;i++){
        System.out.print("학생의 이름과 정보 성적을 입력하시오. : ");
        int name=scanner.nextInt();
        int score=scanner.nextInt();
    }

} */
/*public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);
    System.out.print("단어 하나를 입력하시오. : ");
    int size=scanner.nextInt();
    String[] a= new String[size];

}
*/
/*1406-love
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("영단어 하나를 입력하시오. : ");
    String str = scanner.nextLine();
    if(str.equals("love")){
        System.out.println("I love you.");
    }
    scanner.close();
}
 */
/*1295-알파벳 대소문자 변환
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("하나 줄의 공백없는 문장을 입력하시오.");
    String str= scanner.nextLine();
    char[] chtostr=new char[str.length()];

    for(int i=0; i<str.length();i++){
        char currentChar = str.charAt(i);
        int asciiValue = (int) currentChar;
        if(asciiValue<91){
                chtostr[i]=(char)(asciiValue+32);
        }
        else if(asciiValue>94)
        {
            chtostr[i]=(char)(asciiValue-32);
        }
        System.out.print(chtostr[i]);
    }

    scanner.close();
}
 */
/*1407-공백문자_제거하기
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("공백이 포함된 문자열을 입력하시오. : ");
    String str = scanner.nextLine();

    String reStr=str.replaceAll("\\s+","");
    scanner.close();
    System.out.println(reStr);
}*/
/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("문자열을 입력하시오. : ");
    String str = scanner.nextLine();
}
 */
//1096-바둑판에 흰 돌 놓기
    public static void main(String[] args) {
    int[][]a=new int [19][19];
    Scanner scanner = new Scanner(System.in);
    System.out.print("몇 개의 흰돌이 놓여졌는지 말하시오. : ");
    int num= scanner.nextInt();
    for(int i=1;i<=num;i++){
        System.out.print("흰 돌이 놓여진 위치를 입력하시오. : ");
        int x = scanner.nextInt();
        int y= scanner.nextInt();
            a[x][y]=1;
    }
    for(int i=1;i<=19;i++){
        for(int j=1;j<=19;j++){
            System.out.print(a[i][j]);
        }
        System.out.println();
    }
}
}


