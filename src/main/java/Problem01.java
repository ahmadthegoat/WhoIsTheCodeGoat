public class Problem01 {
    public String problem01(int n){
        String result = "";
        for(int i= 2; i<n; i++){
            if(i==2){
                result += i + " ";
            }
            if(i == 3){
                result += i + " ";
            }
            if(i % 2 != 0) {
                if (i % 3 != 0) {
                    result += i + " ";
                }
            }
        }

        return result;

}}
