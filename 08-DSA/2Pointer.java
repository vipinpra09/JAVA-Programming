Two Pointer Method in C and Java
1. Opposite Direction (Converging Pointers)
Example: Two Sum (Sorted Array)
C Implementation:

C

#include <stdio.h>

void twoSum(int arr[], int n, int target) {
    int left = 0;
    int right = n - 1;
    
    while (left < right) {
        int sum = arr[left] + arr[right];
        
        if (sum == target) {
            printf("Pair found: [%d, %d] at indices [%d, %d]\n", 
                   arr[left], arr[right], left, right);
            return;
        }
        else if (sum < target) {
            left++;      // Need larger sum
        }
        else {
            right--;     // Need smaller sum
        }
    }
    
    printf("No pair found\n");
}

int main() {
    int arr[] = {1, 2, 3, 4, 6, 8, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    twoSum(arr, n, 10);  // Output: Pair found: [1, 9] at indices [0, 6]
    return 0;
}
Java Implementation:

Java

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return new int[]{left, right};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        
        return new int[]{-1, -1};  // No pair found
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 8, 9};
        int[] result = twoSum(arr, 10);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
Example: Reverse a String
C Implementation:

C

#include <stdio.h>
#include <string.h>

void reverseString(char str[]) {
    int left = 0;
    int right = strlen(str) - 1;
    
    while (left < right) {
        // Swap characters
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
        
        left++;
        right--;
    }
}

int main() {
    char str[] = "hello";
    printf("Original: %s\n", str);
    reverseString(str);
    printf("Reversed: %s\n", str);  // Output: olleh
    return 0;
}
Java Implementation:

Java

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original: " + new String(str));
        reverseString(str);
        System.out.println("Reversed: " + new String(str));
    }
}
Example: Valid Palindrome
C Implementation:

C

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isPalindrome(char str[]) {
    int left = 0;
    int right = strlen(str) - 1;
    
    while (left < right) {
        if (str[left] != str[right]) {
            return false;
        }
        left++;
        right--;
    }
    
    return true;
}

int main() {
    char str1[] = "racecar";
    char str2[] = "hello";
    
    printf("%s is %s\n", str1, isPalindrome(str1) ? "palindrome" : "not palindrome");
    printf("%s is %s\n", str2, isPalindrome(str2) ? "palindrome" : "not palindrome");
    
    return 0;
}
Java Implementation:

Java

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));  // true
        System.out.println(isPalindrome("hello"));    // false
    }
}
2. Same Direction (Fast & Slow Pointers)
Example: Remove Duplicates from Sorted Array
C Implementation:

C

#include <stdio.h>

int removeDuplicates(int arr[], int n) {
    if (n == 0) return 0;
    
    int slow = 0;  // Points to last unique element
    
    for (int fast = 1; fast < n; fast++) {
        if (arr[fast] != arr[slow]) {
            slow++;
            arr[slow] = arr[fast];
        }
    }
    
    return slow + 1;  // New length
}

int main() {
    int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    int newLength = removeDuplicates(arr, n);
    
    printf("Unique elements: ");
    for (int i = 0; i < newLength; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");  // Output: 1 2 3 4 5
    
    return 0;
}
Java Implementation:

Java

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int slow = 0;
        
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        
        return slow + 1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(arr);
        
        System.out.print("Unique elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
Example: Move Zeros to End
C Implementation:

C

#include <stdio.h>

void moveZeros(int arr[], int n) {
    int slow = 0;  // Position to place next non-zero
    
    // Move all non-zero elements to the front
    for (int fast = 0; fast < n; fast++) {
        if (arr[fast] != 0) {
            arr[slow] = arr[fast];
            slow++;
        }
    }
    
    // Fill remaining positions with zeros
    while (slow < n) {
        arr[slow] = 0;
        slow++;
    }
}

int main() {
    int arr[] = {0, 1, 0, 3, 12, 0, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    moveZeros(arr, n);
    
    printf("After moving zeros: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");  // Output: 1 3 12 5 0 0 0
    
    return 0;
}
Java Implementation:

Java

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int slow = 0;
        
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        
        while (slow < nums.length) {
            nums[slow] = 0;
            slow++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        moveZeroes(arr);
        
        System.out.print("After moving zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
Example: Linked List Cycle Detection (Floyd's Algorithm)
C Implementation:

C

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

struct Node {
    int data;
    struct Node* next;
};

bool hasCycle(struct Node* head) {
    if (head == NULL) return false;
    
    struct Node* slow = head;
    struct Node* fast = head;
    
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;           // Move 1 step
        fast = fast->next->next;     // Move 2 steps
        
        if (slow == fast) {
            return true;  // Cycle detected
        }
    }
    
    return false;
}

// Helper function to create a node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

int main() {
    struct Node* head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    head->next->next->next = createNode(4);
    
    // Create cycle: 4 -> 2
    head->next->next->next->next = head->next;
    
    printf("Has cycle: %s\n", hasCycle(head) ? "Yes" : "No");
    
    return 0;
}
Java Implementation:

Java

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        // Create cycle: 4 -> 2
        head.next.next.next.next = head.next;
        
        System.out.println("Has cycle: " + hasCycle(head));
    }
}
Example: Find Middle of Linked List
C Implementation:

C

#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* findMiddle(struct Node* head) {
    struct Node* slow = head;
    struct Node* fast = head;
    
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }
    
    return slow;  // Slow is at middle
}

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

int main() {
    struct Node* head = createNode(1);
    head->next = createNode(2);
    head->next->next = createNode(3);
    head->next->next->next = createNode(4);
    head->next->next->next->next = createNode(5);
    
    struct Node* middle = findMiddle(head);
    printf("Middle element: %d\n", middle->data);  // Output: 3
    
    return 0;
}
Java Implementation:

Java

public class FindMiddle {
    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode middle = findMiddle(head);
        System.out.println("Middle element: " + middle.val);
    }
}
3. Sliding Window Variant
Example: Longest Substring Without Repeating Characters
C Implementation:

C

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int lengthOfLongestSubstring(char* s) {
    int n = strlen(s);
    int maxLen = 0;
    int left = 0;
    bool charSet[128] = {false};  // ASCII characters
    
    for (int right = 0; right < n; right++) {
        // Shrink window until no duplicate
        while (charSet[s[right]]) {
            charSet[s[left]] = false;
            left++;
        }
        
        charSet[s[right]] = true;
        int currentLen = right - left + 1;
        if (currentLen > maxLen) {
            maxLen = currentLen;
        }
    }
    
    return maxLen;
}

int main() {
    char str[] = "abcabcbb";
    printf("Length of longest substring: %d\n", 
           lengthOfLongestSubstring(str));  // Output: 3 (abc)
    return 0;
}
Java Implementation:

Java

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length: " + lengthOfLongestSubstring(s));
    }
}
4. Container With Most Water
C Implementation:

C

#include <stdio.h>

int min(int a, int b) {
    return a < b ? a : b;
}

int max(int a, int b) {
    return a > b ? a : b;
}

int maxArea(int height[], int n) {
    int left = 0;
    int right = n - 1;
    int maxWater = 0;
    
    while (left < right) {
        int width = right - left;
        int minHeight = min(height[left], height[right]);
        int area = width * minHeight;
        maxWater = max(maxWater, area);
        
        // Move pointer with smaller height
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxWater;
}

int main() {
    int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int n = sizeof(height) / sizeof(height[0]);
    
    printf("Max water: %d\n", maxArea(height, n));  // Output: 49
    return 0;
}
Java Implementation:

Java

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxWater = Math.max(maxWater, area);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
    
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max water: " + maxArea(height));
    }
}
5. Three Sum Problem
C Implementation:

C

#include <stdio.h>
#include <stdlib.h>

// Comparison function for qsort
int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

void threeSum(int nums[], int n) {
    qsort(nums, n, sizeof(int), compare);
    
    for (int i = 0; i < n - 2; i++) {
        // Skip duplicates
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        
        int left = i + 1;
        int right = n - 1;
        
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            
            if (sum == 0) {
                printf("[%d, %d, %d]\n", nums[i], nums[left], nums[right]);
                left++;
                right--;
                
                // Skip duplicates
                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right + 1]) right--;
            }
            else if (sum < 0) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}

int main() {
    int nums[] = {-1, 0, 1, 2, -1, -4};
    int n = sizeof(nums) / sizeof(nums[0]);
    
    printf("Triplets that sum to 0:\n");
    threeSum(nums, n);
    
    return 0;
}
Java Implementation:

Java

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Triplets: " + result);
    }
}
Summary Table
Problem	C Code Lines	Java Code Lines	Time	Space
Two Sum	~30	~25	O(n)	O(1)
Reverse String	~25	~20	O(n)	O(1)
Remove Duplicates	~30	~25	O(n)	O(1)
Linked List Cycle	~40	~30	O(n)	O(1)
Container With Water	~35	~25	O(n)	O(1)
Three Sum	~50	~40	O(n²)	O(1)
Key Points
✅ C: Manual memory management, pointer arithmetic
✅ Java: Automatic garbage collection, object-oriented
✅ Both: Same algorithmic logic, O(n) vs O(n²) improvement
✅ Practice: LeetCode, HackerRank for more problems






only in c and java


Max


Two Pointer Method in DSA
The Two Pointer technique uses two pointers (indices) to traverse a data structure (usually an array or linked list) to solve problems efficiently, often reducing time complexity from O(n²) to O(n).

Types of Two Pointer Approaches
text

1. Opposite Direction (Converging)    →  ← 
   - Pointers start from both ends and move toward each other

2. Same Direction (Fast & Slow)       →  →
   - Both pointers move in the same direction at different speeds

3. Sliding Window (Special Case)      [→    →]
   - Two pointers define a window that expands/shrinks
1. Opposite Direction (Converging Pointers)
Example: Two Sum (Sorted Array)
Find two numbers in a sorted array that add up to a target.

Python

def two_sum_sorted(arr, target):
    left = 0
    right = len(arr) - 1

    while left < right:
        current_sum = arr[left] + arr[right]

        if current_sum == target:
            return [left, right]       # Found the pair
        elif current_sum < target:
            left += 1                  # Need larger sum
        else:
            right -= 1                # Need smaller sum

    return [-1, -1]  # No pair found

# Example
arr = [1, 2, 3, 4, 6, 8, 9]
print(two_sum_sorted(arr, 10))  # Output: [2, 5] → (3 + 8 = 10, but actually indices)
text

Array:  [1, 2, 3, 4, 6, 8, 9]    Target = 10
         L→                ←R

Step 1:  1 + 9 = 10 ✓  Found!
Time: O(n) | Space: O(1)

Example: Reverse a String
Python

def reverse_string(s):
    s = list(s)
    left, right = 0, len(s) - 1

    while left < right:
        s[left], s[right] = s[right], s[left]   # Swap
        left += 1
        right -= 1

    return ''.join(s)

print(reverse_string("hello"))  # Output: "olleh"
Example: Valid Palindrome
Python

def is_palindrome(s):
    left, right = 0, len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1

    return True

print(is_palindrome("racecar"))  # Output: True
print(is_palindrome("hello"))    # Output: False
2. Same Direction (Fast & Slow Pointers)
Example: Remove Duplicates from Sorted Array
Python

def remove_duplicates(arr):
    if not arr:
        return 0

    slow = 0                          # Points to last unique element

    for fast in range(1, len(arr)):   # Scans ahead
        if arr[fast] != arr[slow]:
            slow += 1
            arr[slow] = arr[fast]

    return slow + 1   # Length of unique portion

arr = [1, 1, 2, 2, 3, 4, 4, 5]
length = remove_duplicates(arr)
print(arr[:length])  # Output: [1, 2, 3, 4, 5]
text

[1, 1, 2, 2, 3, 4, 4, 5]
 S
    F                        → 1 == 1, skip
       F                     → 2 != 1, move S, copy
          F                  → 2 == 2, skip
             F               → 3 != 2, move S, copy
                ...
Example: Linked List Cycle Detection (Floyd's Algorithm)
Python

def has_cycle(head):
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next          # Moves 1 step
        fast = fast.next.next     # Moves 2 steps

        if slow == fast:
            return True           # Cycle detected

    return False
text

No Cycle:    1 → 2 → 3 → 4 → None
                              fast reaches None

Cycle:       1 → 2 → 3 → 4
                 ↑         ↓
                 ← ← ← ← ←
             slow and fast will eventually meet
Example: Find Middle of Linked List
Python

def find_middle(head):
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

    return slow  # slow is at the middle
3. Sliding Window Variant
Example: Longest Substring Without Repeating Characters
Python

def longest_unique_substring(s):
    seen = set()
    left = 0
    max_length = 0

    for right in range(len(s)):
        while s[right] in seen:
            seen.remove(s[left])
            left += 1               # Shrink window

        seen.add(s[right])
        max_length = max(max_length, right - left + 1)

    return max_length

print(longest_unique_substring("abcabcbb"))  # Output: 3 ("abc")
4. Three Pointers (Extension)
Example: 3Sum Problem
Python

def three_sum(nums, target=0):
    nums.sort()
    result = []

    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i - 1]:
            continue  # Skip duplicates

        left = i + 1
        right = len(nums) - 1

        while left < right:
            total = nums[i] + nums[left] + nums[right]

            if total == target:
                result.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1
                while left < right and nums[left] == nums[left - 1]:
                    left += 1
            elif total < target:
                left += 1
            else:
                right -= 1

    return result

print(three_sum([-1, 0, 1, 2, -1, -4]))  # Output: [[-1, -1, 2], [-1, 0, 1]]
Summary Table
Problem	Type	Time	Space
Two Sum (Sorted)	Opposite	O(n)	O(1)
Reverse String	Opposite	O(n)	O(1)
Valid Palindrome	Opposite	O(n)	O(1)
Remove Duplicates	Same Direction	O(n)	O(1)
Cycle Detection	Fast & Slow	O(n)	O(1)
Find Middle Node	Fast & Slow	O(n)	O(1)
Container With Most Water	Opposite	O(n)	O(1)
3Sum	Opposite + Loop	O(n²)	O(1)
Trapping Rain Water	Opposite	O(n)	O(1)
Merge Sorted Arrays	Same Direction	O(n+m)	O(1)
When to Use Two Pointers?
text

✅ Array/String is SORTED (or can be sorted)
✅ Need to find PAIRS or TRIPLETS
✅ Need to compare elements from BOTH ENDS
✅ Need to detect CYCLES in Linked Lists
✅ Need to remove/process IN-PLACE
✅ Subarray/substring problems
✅ Want to reduce O(n²) → O(n)
Key Takeaway
text

Brute Force:  Two nested loops     → O(n²)
Two Pointer:  Smart traversal      → O(n)

The key insight: Use STRUCTURE (sorted order, direction)
to eliminate unnecessary comparisons.




two pointer method in dsa

Ask followup…




Inputs are processed by third-party AI and responses may be inaccurate.

