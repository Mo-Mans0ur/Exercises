package Algorithm;

public class BinarySearchMain {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();

        int[] toSearch = generator.getNumbers();

        binarySearch(toSearch, 8);
    }

    public static int binarySearch(int[] arrayToSearch, int numberToFind){
        int start = 0;
        int end = arrayToSearch.length -1;
        int middle = end/2;

         //[1][2][3][4][5][6][7][8][9][10]
        // [0][1][2][3][4][5][6][7][8][9]

        //target = 4
        //Middle = 4
        //Start = 0
        //End = 9


        while (true) {
            if (arrayToSearch[middle] == numberToFind) {
                System.out.println("Yay great success");
                return middle;


            }else if (arrayToSearch[middle] < numberToFind) { //Større end
                //return binarySearch(arrayToSearch, middle - 1);
                start = middle +1;
                middle = (start + end) / 2;

            }else if (arrayToSearch[middle] > numberToFind) { // Mindre end
                //return binarySearch(arrayToSearch, middle + 1);
                end = middle -1;
                middle = end /2;

            }

        }


    }
}
