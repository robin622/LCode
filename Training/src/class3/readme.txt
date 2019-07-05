What is recursion ?
Big problem boils down to smaller problem. 
1, base case
2, recursion rule

recursion 时间复杂度和空间复杂度分析 
draw recursion tree
多次触底反弹的过程

TC: 所有node花费的总时间, 而不只是node个数

For Solution 1:
public int pow(int a, int b){
    if(b==0) return 1;
    if(b==1) return a;
    return pow(a, b/2) + pow(a, b-b/2);
}

TC: by analyzing the recursion tree, 
1 + 2^1 + 2^2 + ... + 2 ^ log(b) = O(n)
the last entry is b, (1+2^1+2^2+...2^log(b-1)<2^log(b)), so total is O(n). 


virtual memory: 
https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=3&cad=rja&uact=8&ved=2ahUKEwjSstq1hI_hAhXr44MKHalVAl8QFjACegQIBBAB&url=https%3A%2F%2Fzhuanlan.zhihu.com%2Fp%2F31999953&usg=AOvVaw17ZVd_3JVPYpd7Ej5uNR5G


等比数列
geometric sequence

等差数列
arithmetic sequence

Math.randome() : greater than or equal to 0.0 and less than 1.0. 

how to discuss the code with interviewer ?
1, Document yours assumptions.
2, Explain your approach and how you intend to solve the problem.
3, Provide code comments where applicable.
4, Explain the big-O run time complexity of your solution, Justify your answer. 
5, Identify any additional data structures you used and justify why you used them. 
6, Only provide your best answer to each part of the questions. 

 



