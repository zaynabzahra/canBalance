import java.util.Arrays;
public class canBalance {


public boolean testBalance (int values[])
{
int[] val1;
int[] val2;

int length = values.length;
int temp = values[0];

val1[0] = temp;

for (int i= 1; i <= (length-1); i ++){

    temp = temp + values[i];

    val1[i] = temp;


}
 System.out.println(Arrays.toString(val1));

    return true;
}

}