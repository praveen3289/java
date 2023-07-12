import java.io.*;
import java.util.*;
// Read only region start
class UserMainCode
{
    public int nfactorial (int input1){
        	if (input1 <= 0) {
            throw new IllegalArgumentException("Input number must be greater than 0");
        }

        int factorial = 1;
        for (int i = 1; i <= input1; i++) {
            factorial *= i;
        }

        return factorial;
    }
}