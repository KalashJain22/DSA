public class StringCompression {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String str = "aaabbcccdd";
        String newStr = "";

        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1) {
                sb.append(Integer.toString(count));
            }
        }
        System.out.println(sb.toString());
    }
}
