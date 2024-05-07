# OutliersChecker Challenge
Checking the outliers from integer array


How do we get the outliers?
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)
[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)


We have given array (which will have a length of at least 3 but could be very large) containing integers. The array is entirely comprised of odd integers or even integers except for a single integer N. To Write a method that takes the array as an argument and returns this "outlier".

The following test is my logic before starting the code. There may be much better ways to get the output

    //receive an arrary list from parameter
    //each item from array is divided or not
    //if it can be divided by 2 = print item and even number
    //if it can't be divided by 2 = print item and odd number
    //assign with number +=
    //count divided by 2 with ++
    //return assign with += with ternary opperator 
