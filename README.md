# TripleK

Kenny Lin, Kenny Li, Kendrick Liang  
APCS2 pd 1  
Lab #0 But What Does the Data Say?  

## Hypothesis
Searching for the worst case scenario with preset matrices of varying sizes should result in a linear runtime. 

## Background 
We are using preset matrices that vary in size for our experiment. The plots for each slot will increment by 1.

Example: A 4x4 matrix will look like this   
|0  1  2  3    
|4  5  6  7   
|8  9  10 11  
|12 13 14 15  

## Experimental Methology
Our experimental apparatus is to populate various set matrixes from sizes of 1000 to 10000, increasing in size by 100 every iteration. We will conduct a search for the worst case scenario each time, the bottom left most location, 10 times each for every iteration. The 10 runs will be averaged into one value for that matrix size. This way we will have a consistent search method each time. 

## Results 
![Data](data.pdf)  

## Conclusions 
Overall the data proved that our hypothesis was correct. With a set matrix and constant search of the worst case scenario, the only thing that was different was the size of the matrix. This linear relationship shows that our algorithm has a run time efficiency of O(n). Similar to Peter's QAF post, we also saw a relatively huge spike in nanoseconds for the first 5 iterations of the algorithm that decreased over time. After those 5 iterations, however, it started increasing steadily to form a linear relationship.
