# LeetCode Problem Solution

## Problem Information

- **Problem Number**: 3752
- **Problem Title**: Lexicographically Smallest Negated Permutation that Sums to Target
- **Difficulty**: Medium
- **Link**: [Problem Link](https://leetcode.com/problems/lexicographically-smallest-negated-permutation-that-sums-to-target/description/)

## Problem Description

You are given a positive integer n and an integer target.

Return the lexicographically smallest array of integers of size n such that:

The sum of its elements equals target.
The absolute values of its elements form a permutation of size n.
If no such array exists, return an empty array.

A permutation of size n is a rearrangement of integers 1, 2, ..., n.

##

### **Example 1**:

_Input_: n = 3, target = 0

_Output_: [-3,1,2]

**Explanation**:

The arrays that sum to 0 and whose absolute values form a permutation of size 3 are:

[-3, 1, 2]
[-3, 2, 1]
[-2, -1, 3]
[-2, 3, -1]
[-1, -2, 3]
[-1, 3, -2]
[1, -3, 2]
[1, 2, -3]
[2, -3, 1]
[2, 1, -3]
[3, -2, -1]
[3, -1, -2]
The lexicographically smallest one is [-3, 1, 2].

### **Example 2**:

_Input_: n = 1, target = 10000000000

_Output_: []

**Explanation**:

There are no arrays that sum to 10000000000 and whose absolute values form a permutation of size 1. Therefore, the answer is [].

### **Constraints**:

1 <= n <= 10^5  
-10^10 <= target <= 10^10

## Approach

The first step in solving the question is understanding it. Once understood properly, the problem can be broken down into simpler words:

- We have to produce an array containing a permutation of size **n**. (Elements can be positive or negative.)
- The array's elements must sum to **target**.
- The array should be of the smallest possible lexicographical value which satisfies both the above conditions.

To satisfy the above requirements we can take the following steps:

- To produce **target** as sum of elements, we can make some elements negative and keep the rest as positive.
- To produce the lowest possible value lexicographically, we must sort the array in non-decreasing order and we must try to have the lowest value element(s) possible.

Taking into account both these steps, the intuitive approach is to:  
 **find and negate the largest element(s) in the permutation of size _n_ that when negated would result in the sum of elements == _target_**.  
After this, the result can simply be sorted and returned.

## Algorithm

- Start with all positive elements, maintain sum of elements **sum**.
- If **target** > **sum** return empty array.
- Iterate down from n.
- At each element if (**sum** - 2\*element) < **target** , then negate the element and move to next element. Repeat till **sum**<=**target**
- If **sum**==**target**, sort by non-decreasing order and return array. Else return empty array.

## Complexity Analysis

- **Time Complexity**: O(n)
- **Space Complexity**: O(1) (excluding result array)

## Solution

See `solution.java` for the implementation.
