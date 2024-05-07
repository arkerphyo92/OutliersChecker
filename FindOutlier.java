public class FindOutlier {
  static int find(int[] integers) {
    //receive an integer arrary list from parameter
    int[] myOutliers = integers;
    //each item from array is divided or not
    //if it can be divided by 2 = print item and even number
    //if it can't be divided by 2 = print item and odd number
    //assign with number +=
    //count divided by 2 with ++
    int evenNumber = 0;
    int oddNumber = 0;
    int evenCount = 0;
    int oddCount = 0;
    for(int number : myOutliers){
      if (number % 2 == 0){
        evenNumber += number;
        evenCount++;
      }else{
        oddNumber += number;
        oddCount++;
        continue;
      }
    }
    //return assign with += with ternary opperator 
    int result = (evenCount > oddCount) ? oddNumber : evenNumber;    
    return result;
  }
}
