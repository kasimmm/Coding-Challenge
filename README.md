# Stacked Glasses
* Build and Execute
  * run "gradle jar" to generate the jar file under ~/build/libs/
  * execute the jar by running "java -jar (name).jar (arguments)"
  * arguments are 3 non-negative numbers seperated by whitespace: 
    * first: K litres, type is double
    * second: i-th row, type is int
    * third: j-th glass, type is int
  * output example "Result is 0.25 litre"
* Algorithm
  * Simple recursion to calculate the input from upper level where half from upper left and half upper right
* Some thoughts
  * Add a 2D array to store the results of calculated glasses as a cache
  * Handle overflow inputs
  * Other algos, (top-down to fill the 2d array ?)