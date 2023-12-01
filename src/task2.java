public class task2 {

        public  void findbug() {
            System.out.println("The sum of the numbers in the array is:"
                    + calcSumArray(new int[]{4, 1, 2, 3, 4}));
        }
        public  int calcSumArray (int[] arr){
            int result = 0;
            for (int i=0; i < arr.length; i++)//the bug is in the initial number of "i" it should start with 0
            {
                result += arr[i];
            }
            return result;
        }
    }

