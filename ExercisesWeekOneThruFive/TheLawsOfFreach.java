class TheLawsOfFreach {
  public static void main(String[] args) {

    int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};
    int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.

    for (int index : array) {
      if (index < currentSmallest) {
        currentSmallest = array[index];
      }
    }
    System.out.println(currentSmallest);

    int total = 0;
    for (int index : array) {
      total += index;
    }

    double average = (double) total / array.length;
    System.out.println(average);
  }
}
