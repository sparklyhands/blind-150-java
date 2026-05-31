# DSA Quick‑Solution Toolkit
Core tools that unlock hard interview problems faster

| Tool | Use It When | What It Unlocks |
|------|-------------|-----------------|
| Hash Map | Need O(1) lookup, counts, indices, complements | Two Sum, frequency counts, prefix-sum lookups |
| Hash Set | Need fast membership or dedupe | Longest consecutive sequence, visited states, duplicate detection |
| Two Pointers | Array/string from both ends or slow-fast scan | 3Sum, valid palindrome, container with most water |
| Sliding Window | Need best subarray/substring under a constraint | Longest substring, min window, fixed-size windows |
| Prefix Sum | Repeated range-sum or cumulative-state queries | Subarray sum equals k, range queries, balance tricks |
| Monotonic Stack | Need next greater/smaller or boundary info | Daily temperatures, largest rectangle, next greater element |
| Heap / Priority Queue | Need top-k, best-first, running min/max | Top K frequent, merge k lists, scheduling |
| Binary Search | Search on sorted space or monotonic answer | Rotated array, first/last position, Koko bananas |
| BFS | Need shortest path in unweighted graph or level order | Number of islands, rotten oranges, word ladder |
| DFS | Need traversal, components, recursion exploration | Islands, path existence, tree recursion |
| Backtracking | Need all combinations, permutations, valid states | N-Queens, subsets, combination sum |
| Dynamic Programming | Overlapping subproblems and repeated states | Coin change, LIS, house robber |
| Greedy | Local best choice builds global answer | Jump game, interval scheduling, task selection |
| Union Find | Need dynamic connectivity / merging groups | Accounts merge, redundant connection, components |
| Topological Sort | Need dependency order in a DAG | Course schedule, build order, prerequisite graphs |
| Trie | Need prefix search or word branching | Word search II, autocomplete, prefix dictionary |
| Deque / Monotonic Queue | Need window max/min with fast updates | Sliding window maximum, constrained DP |
| Fast & Slow Pointers | Need cycle detection or midpoint logic | Linked list cycle, happy number, middle of list |
| Bit Manipulation | Need compact state or XOR tricks | Single number, subsets, masks, parity |
| Interval Sorting | Need merge/overlap/sweep logic | Merge intervals, meeting rooms, line sweep problems |


# Pattern → Problem → Difficulty → How to Solve

| Pattern | Problem | Difficulty | How to Solve (3–4 lines) |
|---------|---------|------------|---------------------------|
| Arrays & Hashing | [LC217 Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Easy | Use a HashSet to track seen numbers. If seen before → duplicate. Single pass O(n). |
| Arrays & Hashing | [LC242 Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Easy | Use 26‑freq array. Increment for s, decrement for t. Check all zeros. |
| Arrays & Hashing | [LC1 Two Sum](https://leetcode.com/problems/two-sum/) | Easy | HashMap: store value→index. Check complement each step. |
| Arrays & Hashing | [LC49 Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Medium | Build char‑freq signature. HashMap<signature, list>. Group words. |
| Arrays & Hashing | [LC347 Top K Frequent](https://leetcode.com/problems/top-k-frequent-elements/) | Medium | Count freq → bucket sort or min‑heap to extract top k. |
| Arrays & Hashing | [LC238 Product Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Medium | Prefix + suffix arrays. Multiply prefix[i] * suffix[i]. No division. |
| Arrays & Hashing | [LC53 Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Kadane’s algorithm: track current + global max. Reset when negative. |
| Arrays & Hashing | [LC152 Max Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) | Medium | Track max & min products (negatives flip). Update global max. |
| Arrays & Hashing | [LC153 Find Min Rotated Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | Binary search: move toward unsorted half. |
| Arrays & Hashing | [LC33 Search Rotated Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Identify sorted half; search inside it. |
| Arrays & Hashing | [LC15 3Sum](https://leetcode.com/problems/3sum/) | Medium | Sort → fix one → two pointers. Skip duplicates. |
| Arrays & Hashing | [LC11 Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | Two pointers; move smaller height inward. |
| Two Pointers | [LC125 Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy | Two pointers inward; skip non‑alphanumeric. Compare characters. |
| Two Pointers | [LC11 Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium | Move pointer at smaller height. Track max area. |
| Two Pointers | [LC15 3Sum](https://leetcode.com/problems/3sum/) | Medium | Sort + two pointers. Skip duplicates. |
| Two Pointers | [LC42 Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard | Track leftMax/rightMax; move smaller boundary. Add trapped water. |
| Sliding Window | [LC3 Longest Substring](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium | Expand window; shrink when duplicate appears. Track max length. |
| Sliding Window | [LC76 Minimum Window](https://leetcode.com/problems/minimum-window-substring/) | Hard | Expand until valid; shrink to minimize. Track best window. |
| Sliding Window | [LC567 Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium | Compare sliding window freq with target freq. |
| Sliding Window | [LC424 Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium | Track max freq; shrink when window-maxFreq > k. |
| Sliding Window | [LC438 Find All Anagrams](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium | Sliding window + freq arrays; record matches. |
| Binary Search | [LC704 Binary Search](https://leetcode.com/problems/binary-search/) | Easy | Classic binary search on sorted array. |
| Binary Search | [LC33 Search Rotated Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Medium | Identify sorted half; search inside it. |
| Binary Search | [LC153 Find Min Rotated Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | Medium | Move toward unsorted half. |
| Binary Search | [LC4 Median of Two Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard | Binary search on partitions. Ensure left partitions are valid. |
| Linked List | [LC141 Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy | Fast/slow pointers; detect meeting point. |
| Linked List | [LC21 Merge Two Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Merge using two pointers. |
| Linked List | [LC19 Remove Nth Node](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium | Two pointers with n‑gap. |
| Linked List | [LC143 Reorder List](https://leetcode.com/problems/reorder-list/) | Medium | Find mid → reverse → merge. |
| Linked List | [LC23 Merge k Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Hard | Min‑heap or divide‑and‑conquer. |
| Trees | [LC104 Max Depth](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Easy | DFS: 1 + max(left, right). |
| Trees | [LC100 Same Tree](https://leetcode.com/problems/same-tree/) | Easy | Recursively compare nodes + children. |
| Trees | [LC226 Invert Tree](https://leetcode.com/problems/invert-binary-tree/) | Easy | Swap left/right recursively. |
| Trees | [LC102 Level Order](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Medium | BFS queue; process levels. |
| Trees | [LC98 Validate BST](https://leetcode.com/problems/validate-binary-search-tree/) | Medium | Inorder must be sorted OR use min/max bounds. |
| Trees | [LC230 Kth Smallest](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Medium | Inorder traversal; count nodes. |
| Trees | [LC105 Build Tree](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | Medium | Use inorder index map; recursively build. |
| Trees | [LC124 Max Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/) | Hard | DFS returns max branch; track global max. |
| Graphs | [LC200 Number of Islands](https://leetcode.com/problems/number-of-islands/) | Medium | DFS/BFS flood fill marking visited. |
| Graphs | [LC133 Clone Graph](https://leetcode.com/problems/clone-graph/) | Medium | DFS/BFS + hashmap old→new. |
| Graphs | [LC207 Course Schedule](https://leetcode.com/problems/course-schedule/) | Medium | Topological sort with indegree. |
| Graphs | [LC417 Pacific Atlantic](https://leetcode.com/problems/pacific-atlantic-water-flow/) | Medium | BFS/DFS from borders; intersect reachability. |
| Graphs | [LC127 Word Ladder](https://leetcode.com/problems/word-ladder/) | Hard | BFS using pattern map. |
| Dynamic Programming | [LC70 Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Easy | DP: f(n)=f(n-1)+f(n-2). |
| Dynamic Programming | [LC198 House Robber](https://leetcode.com/problems/house-robber/) | Medium | DP: rob or skip; track prev and prev2. |
| Dynamic Programming | [LC213 House Robber II](https://leetcode.com/problems/house-robber-ii/) | Medium | Run twice: exclude first, exclude last. |
| Dynamic Programming | [LC322 Coin Change](https://leetcode.com/problems/coin-change/) | Medium | DP: min coins for each amount. |
| Dynamic Programming | [LC300 LIS](https://leetcode.com/problems/longest-increasing-subsequence/) | Medium | DP or binary search with tails array. |
| Dynamic Programming | [LC1143 LCS](https://leetcode.com/problems/longest-common-subsequence/) | Medium | 2D DP comparing characters. |
| Dynamic Programming | [LC72 Edit Distance](https://leetcode.com/problems/edit-distance/) | Hard | DP: insert/delete/replace. |
| Intervals | [LC56 Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Medium | Sort by start; merge overlaps. |
| Intervals | [LC57 Insert Interval](https://leetcode.com/problems/insert-interval/) | Medium | Insert → merge overlaps. |
| Intervals | [LC435 Non-overlapping](https://leetcode.com/problems/non-overlapping-intervals/) | Medium | Sort by end; greedily pick non‑overlapping. |
| Intervals | [LC252 Meeting Rooms](https://leetcode.com/problems/meeting-rooms/) | Easy | Sort by start; check overlaps. |
| Intervals | [LC253 Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii/) | Medium | Min‑heap of end times. |
| Backtracking | [LC46 Permutations](https://leetcode.com/problems/permutations/) | Medium | Choose → explore → unchoose. |
| Backtracking | [LC78 Subsets](https://leetcode.com/problems/subsets/) | Medium | Include/exclude each element. |
| Backtracking | [LC39 Combination Sum](https://leetcode.com/problems/combination-sum/) | Medium | Backtrack with index; reuse same element. |
| Backtracking | [LC131 Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Medium | Backtrack splitting string; check palindrome. |
| Recursion / Divide & Conquer | [LC21 Merge Two Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy | Recursively pick smaller head. |
| Recursion / Divide & Conquer | [LC206 Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Easy | Reverse rest; attach head at end. |
| Recursion / Divide & Conquer | [LC50 Pow(x, n)](https://leetcode.com/problems/powx-n/) | Medium | Fast exponentiation: half → square. |
| Recursion / Divide & Conquer | [LC169 Majority Element](https://leetcode.com/problems/majority-element/) | Easy | Divide & conquer or Boyer‑Moore. |
| Recursion / Divide & Conquer | [LC53 Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Medium | Divide into left, right, cross. |



