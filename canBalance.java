import java.util.Arrays;
public class canBalance {

public boolean testBalance (int values[])
{

int[] val1 = new int[values.length-1];

int[] val2 = new int[values.length-1];


int length = values.length;
int temp1 = values[0];

 val1[0] = temp1;

for (int i= 1; i <= (length-2); i ++){

    temp1 = temp1 + values[i];

    val1[i] = temp1;

}

int temp2 = values[values.length-1];

val2[values.length-2] = temp2;

for (int j =values.length-3 ; j >=0; j--){

    
    temp2 = temp2 + values[j+1];

    val2[j] = temp2;

}

int k = 0;

boolean check = false;

do {
    
    if(val1[k] == val2[k]){
        
        check = true;
        
    }

    k ++;

} while (k <= values.length -2);
 

return check;

//System.out.println(Arrays.toString(val1));
//System.out.println(Arrays.toString(val2));

}

}