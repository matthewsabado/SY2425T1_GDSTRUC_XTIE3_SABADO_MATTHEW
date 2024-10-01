public static void bubbleSort(int[] array)
{
    for (int pass = array.length - 1; pass >= 0; pass--)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            // if number on the left is bigger, swap places
            if(array[i] < array[i + 1])
            {
                System.out.println(array[i] + " is lower than " + array[i + 1] + ", switching");

                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        System.out.println("\nAfter pass " + pass);
        printArray(array);
    }
}

public static void printArray(int[] array)
{
    System.out.println("Printing array: ");
    for(int i = 0 ; i < array.length; i++)
    {
        System.out.println(array[i]);
    }
    System.out.println(" ");
}

public static void main(String[] args) {

    int[] numbers = new int[8];

    numbers[0] = 25;
    numbers[1] = 100;
    numbers[2] = 0;
    numbers[3] = 5;
    numbers[4] = 88;
    numbers[5] = 2;
    numbers[6] = 26;
    numbers[7] = 42;

    System.out.println("Before sorting");
    printArray(numbers);

    //System.out.println("\nAfter bubble sort\n");
    //bubbleSort(numbers);

    System.out.println("\nAfter bubble sort\n");
    bubbleSort(numbers);

    System.out.println("Bubble sort complete! ");
}


