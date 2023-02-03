## TIME COMPLEXITY

Time taken by algorithm as a function of length of input.<br>
Basically, it tells how the time taken by the algorithm grows as the length of input given to it grows.

#### Why?
- To judge the efficiency of an algorithm, obviously `¯\_(ツ)_/¯`
- But why this only? Say you ran a `slow algorithm` on `fast pc` and `faster algorithm` on `slow pc`. Whatever you will get is a misleading result. That's why!

#### Big-O Notation
- Time taken by the algorithm in the worst case.
- Gives the `upper bound`.
- **Preferred notation.**

#### Omega Notation
- Time taken by the algorithm in the best case.
- Gives the `lower bound`

#### Thetha Notation
- Exact range of time, the algorithm can take.
- Gives the `exact bound`.
- Big-O + Omega = Thetha

> Trick to memorize:
Remember the symbol of thetha, has two sections hence representing lower and upper bound of the time taken by the algorithm.

## Recursive functions & their Time Complexity
```c
	fun(n)
		if (n == 0)
			return
		for(int i==0; i<n; i++){
			// Does some task which takes a constant time of `c`
		}
		fun(n/2)
		fun(n/2)
```

### Steps to find the TC of a recursive function
1. Convert the given code into a `Time function`.
	- f(n) - The function call is represented as T(n)
	- f is replaced by T wherever found with given argument
		> If it was f(n/2); f(n/4) => T(n/2) + T(n/4)

```graphql
T(n/2) = recursive function call
                ^
                |
	T(n) = 2T(n/2) + nC
	 |     |          |
	 |     |          --> (number of times the loop ran)*(Time taken for one loop iteration)
	 |     --> (function was called twice)
	 --> The function
 ```
2. Using the `Tree method` instead of `master's algorithm`
	1. Write the non-recursive part as the root of the tree.
	2. Then recursive calls are it's children, simultaneous or multiple calls will be siblings to each other.
	3. Repeat the above step until you see a pattern
	4. Write total of the operations performed for every steps
	5. Now use basic maths to get the total time taken.
	   > Total time taken = Length of tree * Number of consta operationsfor each iteration

```graphql
               nC               - nC
            /      \
        (n/2)C      (n/2)C      - nC
      /     \       /     \
  (n/4)C   (n/4)C (n/4)C (n/4)C - nC
```
> Here, length = log2(n)<br>
Thus, Time taken = log2(n)\*nC<br>
Hence, O(nlog2(n))

## Online judge & constraints
> **NOTE** Just follow the 10^8 Operations rule<br>
It says: (Input Constraint) * (Time Complexity) < 10^8
If the inequality doesn't hold true, you will get TLE (Time limit exceeded) error

#### Some pre-calculated time complexities
| Length | Time Complexity |
|:------:|:---------------:|
|$<=[10..11]$|$O(n!), O(n^6)$|
|$<=[15..18]$|$O(n^2*2^n)$|
|$<100$|$O(n^4)$|
|$<400$|$O(n^3)$|
|$<2000$|$O(n^2*log(n))$|
|$<10^4$|$O(n^2)$|
|$<10^6$|$O(n*log(n))$|
|$<10^8$|$O(n), O(log(n))$|
