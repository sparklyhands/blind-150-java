# blind-150-java
My Java solutions for Blind 150 / LeetCode practice. Clean, structured, and interview-ready.

<h2>✅ Arrays & Hashing</h2>

| Problem | Title | Level | How to Solve (Short Notes) | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC217 | Contains Duplicate | Easy | Use a **HashSet**; return true if element repeats | O(n) | O(n) |
| LC242 | Valid Anagram | Easy | Use **int[26] frequency array**; increment for ``a``, decrement for ``b`` | O(n) | O(1) |
| LC1 | Two Sum | Easy | HashMap: store value → index; check complement | O(n) | O(n) |
| LC49 | Group Anagrams | Medium | HashMap: key = **sorted string** or **char count signature** | O(n·k log k) | O(n·k) |
| LC347 | Top K Frequent Elements | Medium | HashMap freq + **bucket sort** or **min‑heap** | O(n) | O(n) |
| LC238 | Product of Array Except Self | Medium | Prefix + suffix products without division | O(n) | O(1) |
| LC53 | Maximum Subarray | Medium | Kadane’s algorithm: running max | O(n) | O(1) |
| LC152 | Max Product Subarray | Medium | Track max & min products | O(n) | O(1) |
| LC153 | Find Min in Rotated Sorted Array | Medium | Binary search on pivot | O(log n) | O(1) |
| LC33 | Search in Rotated Sorted Array | Medium | Binary search with sorted‑half logic | O(log n) | O(1) |
| LC15 | 3Sum | Medium | Sort + two pointers | O(n²) | O(1) |
| LC11 | Container With Most Water | Medium | Two pointers from ends inward | O(n) | O(1) |

<h2>✅ Sliding Window </h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC3 | Longest Substring Without Repeating Characters | Medium | Sliding window + HashSet | O(n) | O(n) |
| LC76 | Minimum Window Substring | Hard | Sliding window + freq maps + match count | O(n) | O(n) |
| LC567 | Permutation in String | Medium | Sliding window + freq arrays | O(n) | O(1) |
| LC424 | Longest Repeating Character Replacement | Medium | Sliding window + max freq | O(n) | O(1) |
| LC438 | Find All Anagrams in a String | Medium | Sliding window + freq arrays | O(n) | O(1) |

<h2>✅ Two Pointers </h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC125 | Valid Palindrome | Easy | Two pointers inward | O(n) | O(1) |
| LC11 | Container With Most Water | Medium | Two pointers; move smaller height | O(n) | O(1) |
| LC15 | 3Sum | Medium | Sort + two pointers | O(n²) | O(1) |
| LC42 | Trapping Rain Water | Hard | Two pointers + leftMax/rightMax | O(n) | O(1) |

<h2>✅ Binary Search</h2>

| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC704 | Binary Search | Easy | Classic binary search | O(log n) | O(1) |
| LC33 | Search in Rotated Sorted Array | Medium | Binary search with sorted half | O(log n) | O(1) |
| LC153 | Find Min in Rotated Sorted Array | Medium | Binary search pivot | O(log n) | O(1) |
| LC4 | Median of Two Sorted Arrays | Hard | Binary search on partitions | O(log(min(n,m))) | O(1) |

<h2>✅ Linked List</h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC141 | Linked List Cycle | Easy | Fast/slow pointers | O(n) | O(1) |
| LC21 | Merge Two Sorted Lists | Easy | Two pointers merge | O(n) | O(1) |
| LC19 | Remove Nth Node From End | Medium | Two pointers with gap | O(n) | O(1) |
| LC143 | Reorder List | Medium | Find mid + reverse + merge | O(n) | O(1) |
| LC23 | Merge k Sorted Lists | Hard | Min‑heap or divide & conquer | O(n log k) | O(k) |

<h2>✅Trees</h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC104 | Max Depth of Binary Tree | Easy | DFS or BFS | O(n) | O(h) |
| LC100 | Same Tree | Easy | DFS compare | O(n) | O(h) |
| LC226 | Invert Binary Tree | Easy | DFS swap children | O(n) | O(h) |
| LC102 | Level Order Traversal | Medium | BFS queue | O(n) | O(n) |
| LC98 | Validate BST | Medium | Inorder traversal | O(n) | O(h) |
| LC230 | Kth Smallest in BST | Medium | Inorder traversal | O(n) | O(h) |
| LC105 | Build Tree from Preorder + Inorder | Medium | Recursion + hashmap | O(n) | O(n) |
| LC124 | Binary Tree Max Path Sum | Hard | DFS return max branch sum | O(n) | O(h) |

<h2>✅ Graphs</h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC200 | Number of Islands | Medium | DFS/BFS flood fill | O(m·n) | O(m·n) |
| LC133 | Clone Graph | Medium | DFS/BFS + hashmap | O(n) | O(n) |
| LC207 | Course Schedule | Medium | Topological sort | O(V+E) | O(V+E) |
| LC417 | Pacific Atlantic Water Flow | Medium | BFS/DFS from borders | O(m·n) | O(m·n) |
| LC127 | Word Ladder | Hard | BFS + pattern map | O(n·L²) | O(n·L) |

<h2>✅ Dynamic Programming</h2>
| Problem | Title | Level | How to Solve | Time | Space |
| --- | --- | --- | --- | --- | --- |
| LC70 | Climbing Stairs | Easy | DP: f(n)=f(n-1)+f(n-2) | O(n) | O(1) |
| LC198 | House Robber | Medium | DP: rob or skip | O(n) | O(1) |
| LC213 | House Robber II | Medium | Two passes (exclude first/last) | O(n) | O(1) |
| LC322 | Coin Change | Medium | DP: min coins for each amount | O(n·amount) | O(amount) |
| LC300 | LIS | Medium | DP or binary search | O(n log n) | O(n) |
| LC1143 | LCS | Medium | 2D DP | O(m·n) | O(m·n) |
| LC72 | Edit Distance | Hard | 2D DP | O(m·n) | O(m·n) |

