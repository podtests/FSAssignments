public class JavaAssignment1 {
    public static void main(String[] args) {

        JavaAssignment1 j1 = new JavaAssignment1();

        //Question1:
        System.out.println("Reversed number is:"+ j1.reverseNumber(1012));

        //Question2:
        j1.findDivisors(54);

        //Question3
        j1.printChristmasTreePattern(7);

        //Question4
        j1.printHorizontalChristmasTreePattern(9);

        //Question5:
        j1.nestedRectanglePattern(7);

    }

    public int reverseNumber(int num) {
        int reversedNum = 0;
        int len = countDigit(num) -1;
        int remainder = 0;
        while(num!=0) {
            remainder = num%10;
            reversedNum = reversedNum+ (int) (remainder*Math.pow((double) 10, (double) len));
            len--;
            num =num/10;
        }
        return reversedNum;
    }

    public int countDigit(int num) {
        int count = 0;
        while(num != 0) {
            num = num/10;
            count++;
        }
        return count;
    }

    public void findDivisors(int num) {
        System.out.println("Divisors of Number "+num+" are: ");
        System.out.print(1);
        int i =2;
        while (i <= num/2) {
            if(num %i == 0) {
                System.out.print(" "+i);
            }
            i++;
        }
        System.out.print(" "+num);
    }

    public void printChristmasTreePattern(int rowCount) {

        int leftSpaceCount =0;
        int charCount =0;
        System.out.println();
        for(int i =1; i<=rowCount; i++) {
            leftSpaceCount = rowCount-i;
            charCount = i*2-1;
            while(leftSpaceCount!=0) {
                System.out.print(" ");
                leftSpaceCount--;
            }
            while(charCount!=0){
                System.out.print("*");
                charCount--;
            }
            System.out.println();
        }

    }

    public void printHorizontalChristmasTreePattern(int rowCount) {
        int upperPatternRowCount = rowCount/2 +1;
        int lowerPatternRowCount = rowCount - upperPatternRowCount;

        for(int i=1; i<=upperPatternRowCount; i++) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=lowerPatternRowCount; i >=1;i-- ){
            for(int j=1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void nestedRectanglePattern(int rowCount) {

        for(int i = 1; i<=rowCount; i++) {
            for(int j=1; j<=rowCount; j++) {
                if( i==1 || i==7 || (j==1 && (i!=1 || i!=7)) || (j==7 && (i!=1 || i!=7) )) {
                    System.out.print("4");
                }
                else if(i==2 || i==6 || (j==2 && (i!=2 || i!=6)) || (j==6 && (i!=2 || i!=6) )) {
                    System.out.print("3");
                }
                else if(i==3 || i==5 || (j==3 && (i!=3 || i!=5)) || (j==5 && (i!=3 || i!=5) )){
                    System.out.print("2");
                }
                else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }


}
