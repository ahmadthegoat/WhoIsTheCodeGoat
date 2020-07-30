public class Problem04 {
    public Integer[] problem04(Integer[] intarray){
        Integer[] sumarray = new Integer[intarray.length];
        int count = 0;
        for(int index: intarray){
            arrayBuilder(index,intarray, sumarray,count);
            count++;
        }
        return sumarray;
    }

    public Integer[] arrayBuilder(int index, Integer[] intarray, Integer[] sumarray, int count){
        int amount = 1;
        for(int i = 0; i<intarray.length; i++){
            if(intarray[i] != index){
                amount *= intarray[i];
            }
        }
        sumarray[count]= amount;
        return sumarray;
    }
}

