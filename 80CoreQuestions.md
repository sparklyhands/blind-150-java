# 80 DSA Questions – Long‑Term TODO Table

| # | Category | Problem | Difficulty | LeetCode Link | How to Solve (short steps) |
|---|----------|---------|------------|---------------|----------------------------|
| 1 | Arrays & Strings | Two Sum | Easy | https://leetcode.com/problems/two-sum/ | Use a hash map of value → index; for each num, check if target - num exists; return indices. |
| 2 | Arrays & Strings | Three Sum (3Sum) | Medium | https://leetcode.com/problems/3sum/ | Sort array; fix one index; use two pointers to find pairs summing to -nums[i]; skip duplicates. |
| 3 | Arrays & Strings | Four Sum (4Sum) | Medium | https://leetcode.com/problems/4sum/ | Sort; fix two indices; use two pointers for remaining two; skip duplicates; watch overflow and pruning. |
| 4 | Arrays & Strings | Maximum Subarray | Easy | https://leetcode.com/problems/maximum-subarray/ | Kadane’s: track current sum and global max; reset current sum to 0 when it becomes negative. |
| 5 | Arrays & Strings | Best Time to Buy and Sell Stock | Easy | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | Track minimum price so far; at each day compute profit = price - minPrice; keep max profit. |
| 6 | Arrays & Strings | Move Zeroes | Easy | https://leetcode.com/problems/move-zeroes/ | Two pointers: write non‑zeros forward, then fill remaining positions with zeros in place. |
| 7 | Arrays & Strings | Merge Intervals | Medium | https://leetcode.com/problems/merge-intervals/ | Sort intervals by start; iterate and merge when current start ≤ last merged end; otherwise start new interval. |
| 8 | Arrays & Strings | Product of Array Except Self | Medium | https://leetcode.com/problems/product-of-array-except-self/ | Build prefix products, then suffix products; result[i] = prefix[i] * suffix[i]; no division. |
| 9 | Arrays & Strings | Longest Substring Without Repeating Characters | Medium | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Sliding window with set/map; expand right, shrink left when duplicate appears; track max length. |
| 10 | Arrays & Strings | Minimum Window Substring | Hard | https://leetcode.com/problems/minimum-window-substring/ | Sliding window with freq maps; expand until window covers target; then shrink to minimize while valid. |
|---|----------|---------|------------|---------------|----------------------------|
| 11 | Trees & Binary Trees | Inorder Traversal | Easy | https://leetcode.com/problems/binary-tree-inorder-traversal/ | Recursive or iterative stack; visit left, node, right; collect values in list. |
| 12 | Trees & Binary Trees | Preorder Traversal | Easy | https://leetcode.com/problems/binary-tree-preorder-traversal/ | Recursive or stack; visit node, then left, then right; push children appropriately. |
| 13 | Trees & Binary Trees | Postorder Traversal | Easy | https://leetcode.com/problems/binary-tree-postorder-traversal/ | Recursive or two‑stack trick; visit left, right, then node; or reverse modified preorder. |
| 14 | Trees & Binary Trees | Level Order Traversal | Medium | https://leetcode.com/problems/binary-tree-level-order-traversal/ | BFS with queue; process nodes level by level, pushing children into queue. |
| 15 | Trees & Binary Trees | Maximum Depth of Binary Tree | Easy | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | DFS: depth = 1 + max(depth(left), depth(right)); base case null → 0. |
| 16 | Trees & Binary Trees | Diameter of Binary Tree | Easy | https://leetcode.com/problems/diameter-of-binary-tree/ | DFS returns height; at each node, update global diameter = leftHeight + rightHeight. |
| 17 | Trees & Binary Trees | Lowest Common Ancestor (LCA) | Medium | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/ | DFS: if node is p or q, return it; recurse left/right; if both non‑null, current is LCA. |
| 18 | Trees & Binary Trees | Validate Binary Search Tree | Medium | https://leetcode.com/problems/validate-binary-search-tree/ | DFS with min/max bounds; each node must be in (min, max); propagate constraints down. |
| 19 | Trees & Binary Trees | Kth Smallest Element in BST | Medium | https://leetcode.com/problems/kth-smallest-element-in-a-bst/ | Inorder traversal (sorted order); count nodes until k; return kth visited value. |
| 20 | Trees & Binary Trees | Serialize and Deserialize Binary Tree | Hard | https://leetcode.com/problems/serialize-and-deserialize-binary-tree/ | Use preorder or level‑order with null markers; encode to string; decode by rebuilding tree in same order. |
|---|----------|---------|------------|---------------|----------------------------|
| 21 | Linked Lists | Reverse a Linked List | Easy | https://leetcode.com/problems/reverse-linked-list/ | Iteratively rewire next pointers using prev, curr, next; or use recursion returning new head. |
| 22 | Linked Lists | Detect Cycle in a Linked List | Easy | https://leetcode.com/problems/linked-list-cycle/ | Floyd’s fast/slow pointers; if they ever meet, there is a cycle; otherwise end reached. |
| 23 | Linked Lists | Merge Two Sorted Linked Lists | Easy | https://leetcode.com/problems/merge-two-sorted-lists/ | Use dummy head; compare heads of both lists, append smaller, advance pointer; attach remainder. |
| 24 | Linked Lists | Remove Nth Node From End | Medium | https://leetcode.com/problems/remove-nth-node-from-end-of-list/ | Two pointers with n‑gap; move both until fast hits end; delete node after slow. |
| 25 | Linked Lists | Intersection of Two Linked Lists | Easy | https://leetcode.com/problems/intersection-of-two-linked-lists/ | Two pointers switching heads when reaching end; they meet at intersection or null. |
| 26 | Linked Lists | Add Two Numbers | Medium | https://leetcode.com/problems/add-two-numbers/ | Traverse both lists, sum digits + carry; create new nodes; handle final carry. |
| 27 | Linked Lists | Palindrome Linked List | Easy | https://leetcode.com/problems/palindrome-linked-list/ | Find middle; reverse second half; compare halves; optionally restore list. |
| 28 | Linked Lists | Reorder List | Medium | https://leetcode.com/problems/reorder-list/ | Find middle; reverse second half; merge nodes alternately from first and second halves. |
| 29 | Linked Lists | Rotate List | Medium | https://leetcode.com/problems/rotate-list/ | Compute length; connect tail to head (circle); move (len - k % len - 1) steps; break circle. |
|---|----------|---------|------------|---------------|----------------------------|
| 30 | Stacks & Queues | Valid Parentheses | Easy | https://leetcode.com/problems/valid-parentheses/ | Use stack; push opening; on closing, check top matches; valid if stack empty at end. |
| 31 | Stacks & Queues | Min Stack | Medium | https://leetcode.com/problems/min-stack/ | Maintain stack of values and stack (or encoded) mins; update min on push/pop. |
| 32 | Stacks & Queues | Evaluate Reverse Polish Notation | Medium | https://leetcode.com/problems/evaluate-reverse-polish-notation/ | Use stack; push numbers; on operator, pop two, apply op, push result; final stack top is answer. |
| 33 | Stacks & Queues | Next Greater Element | Easy | https://leetcode.com/problems/next-greater-element-i/ | Use monotonic stack from right; for each element, pop smaller; top is next greater or -1. |
| 34 | Stacks & Queues | Daily Temperatures | Medium | https://leetcode.com/problems/daily-temperatures/ | Monotonic decreasing stack of indices; for each day, pop until warmer found; compute distance. |
| 35 | Stacks & Queues | Largest Rectangle in Histogram | Hard | https://leetcode.com/problems/largest-rectangle-in-histogram/ | Monotonic stack of indices; when height decreases, pop and compute area using popped height as min. |
| 36 | Stacks & Queues | Implement Queue using Stacks | Easy | https://leetcode.com/problems/implement-queue-using-stacks/ | Use two stacks: in and out; push to in; for pop/peek, move from in to out when out is empty. |
| 37 | Stacks & Queues | Sliding Window Maximum | Hard | https://leetcode.com/problems/sliding-window-maximum/ | Use deque storing indices in decreasing value order; front is max; remove out‑of‑window and smaller elements. |
| 38 | Stacks & Queues | Design Circular Queue | Medium | https://leetcode.com/problems/design-circular-queue/ | Implement circular buffer with array, head, tail, size; wrap indices with modulo. |
|---|----------|---------|------------|---------------|----------------------------|
| 39 | Searching & Sorting | Binary Search | Easy | https://leetcode.com/problems/binary-search/ | Classic binary search on sorted array; adjust left/right based on mid comparison. |
| 40 | Searching & Sorting | Search in Rotated Sorted Array | Medium | https://leetcode.com/problems/search-in-rotated-sorted-array/ | Binary search while identifying which half is sorted; decide which side to search. |
| 41 | Searching & Sorting | Find Peak Element | Medium | https://leetcode.com/problems/find-peak-element/ | Binary search using mid vs neighbors; move toward side with larger neighbor. |
| 42 | Searching & Sorting | Kth Largest Element in an Array | Medium | https://leetcode.com/problems/kth-largest-element-in-an-array/ | Use quickselect (partition) or min‑heap of size k to track k largest elements. |
| 43 | Searching & Sorting | Merge Sort | — | — | Implement divide‑and‑conquer: split array, recursively sort halves, then merge two sorted arrays. |
| 44 | Searching & Sorting | Quick Sort | — | — | Choose pivot, partition array into <, =, > pivot; recursively sort partitions; in‑place partitioning. |
| 45 | Searching & Sorting | Sort Colors | Medium | https://leetcode.com/problems/sort-colors/ | Dutch national flag: three pointers (low, mid, high); swap 0s to front, 2s to back. |
|---|----------|---------|------------|---------------|----------------------------|
| 46 | Dynamic Programming | Fibonacci Number | Easy | https://leetcode.com/problems/fibonacci-number/ | Iterative DP: track two previous values; F(n) = F(n-1) + F(n-2); O(1) space. |
| 47 | Dynamic Programming | Climbing Stairs | Easy | https://leetcode.com/problems/climbing-stairs/ | Same as Fibonacci: ways[n] = ways[n-1] + ways[n-2]; can compress to two variables. |
| 48 | Dynamic Programming | Coin Change | Medium | https://leetcode.com/problems/coin-change/ | DP over amount; dp[a] = min(dp[a], dp[a - coin] + 1); initialize with large value. |
| 49 | Dynamic Programming | Longest Increasing Subsequence | Medium | https://leetcode.com/problems/longest-increasing-subsequence/ | O(n log n) tails array; for each num, binary search position in tails to replace/extend. |
| 50 | Dynamic Programming | Longest Common Subsequence | Medium | https://leetcode.com/problems/longest-common-subsequence/ | 2D DP: if chars match, 1 + dp[i-1][j-1]; else max of left/up; answer at dp[m][n]. |
| 51 | Dynamic Programming | 0/1 Knapsack | — | — | DP over items and capacity; dp[i][w] = max of taking item i or skipping; or 1D capacity‑descending DP. |
| 52 | Dynamic Programming | Edit Distance | Hard | https://leetcode.com/problems/edit-distance/ | 2D DP: dp[i][j] = min(insert, delete, replace) + 1 when chars differ; carry over when equal. |
| 53 | Dynamic Programming | Unique Paths | Medium | https://leetcode.com/problems/unique-paths/ | Grid DP: dp[i][j] = dp[i-1][j] + dp[i][j-1]; start at (0,0); obstacles variant similar. |
| 54 | Dynamic Programming | Partition Equal Subset Sum | Medium | https://leetcode.com/problems/partition-equal-subset-sum/ | Subset‑sum DP to check if any subset sums to total/2; 1D boolean DP over sum. |
| 55 | Dynamic Programming | House Robber | Medium | https://leetcode.com/problems/house-robber/ | DP: rob[i] = max(rob[i-1], rob[i-2] + nums[i]); can compress to two variables. |
|---|----------|---------|------------|---------------|----------------------------|
| 56 | Graphs | BFS Traversal | — | — | Use queue; start from source; visit neighbors level by level; mark visited to avoid repeats. |
| 57 | Graphs | DFS Traversal | — | — | Recursive or stack‑based DFS; visit node, then neighbors; track visited set. |
| 58 | Graphs | Number of Islands | Medium | https://leetcode.com/problems/number-of-islands/ | Count components; for each unvisited land cell, DFS/BFS to mark entire island; increment count. |
| 59 | Graphs | Detect Cycle in an Undirected Graph | — | — | DFS with parent tracking or union‑find; if visiting an already visited node not parent → cycle. |
| 60 | Graphs | Detect Cycle in a Directed Graph | — | — | DFS with recursion stack (colors); back‑edge to “visiting” node indicates cycle. |
| 61 | Graphs | Topological Sort | — | — | Kahn’s algorithm (BFS with indegree) or DFS postorder; only for DAGs. |
| 62 | Graphs | Dijkstra’s Algorithm | — | — | Use min‑heap (priority queue); relax edges from current min‑distance node; update distances. |
| 63 | Graphs | Course Schedule | Medium | https://leetcode.com/problems/course-schedule/ | Build graph; use topological sort or DFS cycle detection; if cycle exists, cannot finish. |
| 64 | Graphs | Strongly Connected Components | — | — | Use Kosaraju’s or Tarjan’s algorithm; DFS passes to group nodes into SCCs. |
|---|----------|---------|------------|---------------|----------------------------|
| 65 | Recursion & Backtracking | Subsets (Power Set) | Medium | https://leetcode.com/problems/subsets/ | Backtrack: at each index, choose to include or exclude; collect all combinations. |
| 66 | Recursion & Backtracking | Permutations | Medium | https://leetcode.com/problems/permutations/ | Backtrack with swapping or visited array; build permutations by choosing unused elements. |
| 67 | Recursion & Backtracking | Combination Sum | Medium | https://leetcode.com/problems/combination-sum/ | Backtrack with index; choose candidate multiple times or skip; stop when sum exceeds target. |
| 68 | Recursion & Backtracking | N-Queens | Hard | https://leetcode.com/problems/n-queens/ | Backtrack row by row; track columns and diagonals; place queens only in safe positions. |
| 69 | Recursion & Backtracking | Sudoku Solver | Hard | https://leetcode.com/problems/sudoku-solver/ | Backtrack over empty cells; try digits 1–9; check row/col/box validity; backtrack on conflicts. |
| 70 | Recursion & Backtracking | Generate Parentheses | Medium | https://leetcode.com/problems/generate-parentheses/ | Backtrack with counts of open/close; only add close when close < open; stop at length 2n. |
| 71 | Recursion & Backtracking | Word Search | Medium | https://leetcode.com/problems/word-search/ | DFS from each cell; mark visited; match characters sequentially; backtrack after exploring. |
| 72 | Recursion & Backtracking | Rat in a Maze | — | — | Backtrack on grid from start to end; move in allowed directions; mark path; backtrack on dead ends. |
|---|----------|---------|------------|---------------|----------------------------|
| 73 | Greedy | Activity Selection | — | — | Sort intervals by end time; greedily pick earliest finishing compatible activities. |
| 74 | Greedy | Jump Game | Medium | https://leetcode.com/problems/jump-game/ | Greedy from left; track farthest reachable index; if i > farthest, fail; if farthest ≥ last, succeed. |
| 75 | Greedy | Gas Station | Medium | https://leetcode.com/problems/gas-station/ | If total gas < total cost, impossible; otherwise, track running tank and reset start when tank < 0. |
| 76 | Greedy | Fractional Knapsack | — | — | Sort items by value/weight ratio; take as much as possible of each until capacity is full. |
|---|----------|---------|------------|---------------|----------------------------|
| 77 | Bit Manipulation | Single Number | Easy | https://leetcode.com/problems/single-number/ | XOR all numbers; pairs cancel out, leaving the unique element. |
| 78 | Bit Manipulation | Count Set Bits (Counting Bits) | Easy | https://leetcode.com/problems/counting-bits/ | DP: bits[i] = bits[i >> 1] + (i & 1); build from 0 to n. |
| 79 | Bit Manipulation | Power of Two | Easy | https://leetcode.com/problems/power-of-two/ | n > 0 and (n & (n - 1)) == 0 means exactly one bit set → power of two. |
| 80 | Bit Manipulation | Missing Number | Easy | https://leetcode.com/problems/missing-number/ | XOR all indices and values, or use sum formula; difference gives missing number. |
|---|----------|---------|------------|---------------|----------------------------|
