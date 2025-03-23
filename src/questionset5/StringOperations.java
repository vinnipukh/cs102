package questionset5;

public class StringOperations {
    public StringOperations(){

    }
    public String concat(String str1,String str2){
        return str1 + " " + str2;
    }
    public String concat(String str1,String str2,String str3){
        return str1 + " " + str2 + " " + str3;
    }
    public String concat(String[] arr){
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str);
        }
        return sb.toString();
    }
}
