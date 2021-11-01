public class countCode {

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-3; i++){
            String charC = str.substring(i, i+1);
            String charO = str.substring(i+1, i+2);
            String charE = str.substring(i+3, i+4);
            if ( charC.equals("c") && charO.equals("o") && charE.equals("e") ){
                count++;
            }
        } return count;
    }


    public static void main(String[] args){
        System.out.println(countCode("aaacodebbb") + "...should be 1");
        System.out.println(countCode("codexxcode") + "..should be 2");
        System.out.println(countCode("cozexxcope") + "...should be 2");
    }
}
