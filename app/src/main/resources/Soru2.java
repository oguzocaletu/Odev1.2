public class Soru2{

    public static int multiplation(int[] array]){
        int result=1;
        if(array==null){
            throw IllegalArgumentException;
        }
        if(array.length==0){
            throw IllegalArgumentException;
        }
        for(int numbers :array){
            result*=numbers;
        }
        return result;
    }

}