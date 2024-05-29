package classqspider.build;

public class StringLengthMethod {
    public static void main(String[] args) {
        String size="java";
        System.out.println(size.length());

        String size1="Java";
        System.out.println(size.equals(size1));  //false  check  all view
        System.out.println(size.equalsIgnoreCase(size1)); //true ignore upper and lowercase
      System.out.println(size.charAt(2)); // length of index 2 means index length os size=java---i[0]=j,i[1]=a,i[2]=va
        // System.out.println(size.toCharArray());// convert string into array
        char[] ch=size.toCharArray();
        for(int i=0; i<ch.length;i++){
            System.out.println(ch[i]);
        }
        String name="banu";
        char[] ch1=name.toCharArray();
        for(int j=0; j<ch1.length;j++){
            System.out.println(ch1[j]);
        }
// index num strat from i[0],i[1]
        //size=java; size[0]=j,[1]=a,[2]=v
        System.out.println(size.indexOf('v'));  // oitput is 2---index num v is size[2]
        System.out.println(size.indexOf('j',0));//output is 0,j is size[0] , 1 means
        System.out.println(size.indexOf("ava"));  // output is 1--bcs size=java  we have balance 1 letter

        //split method
 String data="MAIN DATA";
        String[] st=data.split("M");  // it removing M from "MAIN DATA" out put is AIN DATA
        System.out.println(st[1]);
       /* for(int i=0;i< st.length;i++){
            System.out.println(st[i]);
        }*/

        }
    }

