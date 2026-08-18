ASCII Values of Alphabets & Their Use in DSA
📊 ASCII Value Table
Uppercase Letters (A-Z)
text

Character:  A   B   C   D   E   F   G   H   I   J   K   L   M
ASCII:      65  66  67  68  69  70  71  72  73  74  75  76  77

Character:  N   O   P   Q   R   S   T   U   V   W   X   Y   Z
ASCII:      78  79  80  81  82  83  84  85  86  87  88  89  90
Lowercase Letters (a-z)
text

Character:  a   b   c   d   e   f   g   h   i   j   k   l   m
ASCII:      97  98  99 100 101 102 103 104 105 106 107 108 109

Character:  n   o   p   q   r   s   t   u   v   w   x   y   z
ASCII:     110 111 112 113 114 115 116 117 118 119 120 121 122
Digits (0-9)
text

Character:  0   1   2   3   4   5   6   7   8   9
ASCII:      48  49  50  51  52  53  54  55  56  57
Key Special Characters
text

Space = 32    !  = 33    @  = 64    #  = 35
$  = 36       %  = 37    &  = 38    *  = 42
+  = 43       -  = 45    .  = 46    /  = 47
🔑 Important Relationships to Remember
text

┌─────────────────────────────────────────────────────────┐
│  'A' = 65,  'Z' = 90   → 26 uppercase letters          │
│  'a' = 97,  'z' = 122  → 26 lowercase letters          │
│  '0' = 48,  '9' = 57   → 10 digits                     │
│                                                         │
│  'a' - 'A' = 32   (difference between cases)            │
│  'a' - 'a' = 0    (index of 'a' → 0)                   │
│  'z' - 'a' = 25   (index of 'z' → 25)                  │
└─────────────────────────────────────────────────────────┘
🚀 Uses in DSA (Data Structures & Algorithms)
1. Character Frequency Counting (Hashing)
Most commonly used technique in string problems

Java

// Count frequency of each lowercase letter
String s = "hello";
int[] freq = new int[26]; // array of size 26

for (char c : s.toCharArray()) {
    freq[c - 'a']++;  // 'h'-'a' = 7 → index 7
}

// freq[7] = 1 (h)
// freq[4] = 1 (e)
// freq[11] = 2 (l)
// freq[14] = 1 (o)
How it works:

text

'a' - 'a' = 97 - 97 = 0   → index 0
'b' - 'a' = 98 - 97 = 1   → index 1
'c' - 'a' = 99 - 97 = 2   → index 2
...
'z' - 'a' = 122 - 97 = 25 → index 25
DSA Problems: Anagram Check, First Non-Repeating Character, Valid Pangram

2. Case Conversion
Java

// Lowercase to Uppercase
char lower = 'a';          // ASCII 97
char upper = (char)(lower - 32);  // ASCII 65 = 'A'

// Uppercase to Lowercase
char upper2 = 'A';         // ASCII 65
char lower2 = (char)(upper2 + 32); // ASCII 97 = 'a'

// Toggle Case using XOR (Bit Manipulation)
char toggled = (char)(lower ^ 32);  // 'a' → 'A'
char toggled2 = (char)(upper2 ^ 32); // 'A' → 'a'
Why XOR 32 works:

text

'A' = 0100 0001 (65)
 32 = 0010 0000
XOR = 0110 0001 (97) = 'a'

'a' = 0110 0001 (97)
 32 = 0010 0000
XOR = 0100 0001 (65) = 'A'
3. Check Character Type
Java

// Is Lowercase?
boolean isLower = (c >= 'a' && c <= 'z');  // 97-122

// Is Uppercase?
boolean isUpper = (c >= 'A' && c <= 'Z');  // 65-90

// Is Digit?
boolean isDigit = (c >= '0' && c <= '9');  // 48-57

// Is Alphabet?
boolean isAlpha = isLower || isUpper;

// Convert char digit to int
int num = c - '0';  // '5' - '0' = 53 - 48 = 5
4. Anagram Detection
Java

public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) return false;
    
    int[] count = new int[26];
    
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;   // increment for s
        count[t.charAt(i) - 'a']--;   // decrement for t
    }
    
    for (int c : count) {
        if (c != 0) return false;
    }
    return true;
}

// "listen" and "silent" → true
5. Hashing Strings (Hash Functions)
Java

// Simple polynomial hash function
public int hash(String s) {
    int hashValue = 0;
    int base = 31;  // prime number
    int mod = 1_000_000_007;
    
    for (char c : s.toCharArray()) {
        hashValue = (int)((hashValue * (long)base + (c - 'a' + 1)) % mod);
    }
    return hashValue;
}
Used in: Rabin-Karp Algorithm, Rolling Hash, String Matching

6. Caesar Cipher / String Rotation
Java

// Shift each character by k positions
public String caesarCipher(String s, int k) {
    StringBuilder result = new StringBuilder();
    
    for (char c : s.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            result.append((char)('a' + (c - 'a' + k) % 26));
        } else if (c >= 'A' && c <= 'Z') {
            result.append((char)('A' + (c - 'A' + k) % 26));
        } else {
            result.append(c);
        }
    }
    return result.toString();
}

// caesarCipher("abc", 3) → "def"
// caesarCipher("xyz", 3) → "abc"  (wraps around)
7. Trie (Prefix Tree) - Index Mapping
Java

class TrieNode {
    TrieNode[] children = new TrieNode[26]; // 26 slots for a-z
    boolean isEnd = false;
}

class Trie {
    TrieNode root = new TrieNode();
    
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';  // ASCII used here!
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
}
8. Sorting Strings (Lexicographic Order)
Java

// ASCII values determine natural ordering
// 'A'(65) < 'B'(66) < ... < 'Z'(90) < 'a'(97) < 'b'(98) < ... < 'z'(122)

// Counting Sort for characters
public String sortString(String s) {
    int[] count = new int[128]; // all ASCII characters
    
    for (char c : s.toCharArray()) {
        count[c]++;
    }
    
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 128; i++) {
        while (count[i]-- > 0) {
            result.append((char) i);
        }
    }
    return result.toString();
}
// Time: O(n), Space: O(1) - since fixed 128 size
9. Bit Manipulation with ASCII
Java

// Track seen lowercase letters using a single integer (26 bits)
public boolean hasAllUniqueChars(String s) {
    int checker = 0;
    
    for (char c : s.toCharArray()) {
        int bit = c - 'a';        // position 0-25
        if ((checker & (1 << bit)) != 0) {
            return false;          // already seen
        }
        checker |= (1 << bit);    // mark as seen
    }
    return true;
}

// Uses only O(1) space instead of boolean[26]!
10. Graph Problems with Characters
Java

// Alien Dictionary - build graph using character nodes
// Node represented as index: c - 'a'

int[][] adjMatrix = new int[26][26];

// Edge from 'a' to 'b'
adjMatrix['a' - 'a']['b' - 'a'] = 1;  // adjMatrix[0][1] = 1
📋 Quick Reference Cheat Sheet
text

╔══════════════════════════════════════════════════════════╗
║  OPERATION                    CODE                       ║
╠══════════════════════════════════════════════════════════╣
║  Char → Index (a=0)          c - 'a'                    ║
║  Index → Char                (char)('a' + index)        ║
║  Char → Int digit            c - '0'                    ║
║  Int → Char digit            (char)('0' + num)          ║
║  To Uppercase                c - 32  or  c & ~32        ║
║  To Lowercase                c + 32  or  c | 32         ║
║  Toggle Case                 c ^ 32                     ║
║  Is Lowercase?               c >= 'a' && c <= 'z'       ║
║  Is Uppercase?               c >= 'A' && c <= 'Z'       ║
║  Is Digit?                   c >= '0' && c <= '9'       ║
║  Is Same (ignore case)?      (c1 ^ c2) == 0 || 32      ║
╚══════════════════════════════════════════════════════════╝
🎯 Common DSA Problems Using ASCII
Problem	Technique	ASCII Usage
Valid Anagram	Frequency Array	c - 'a' as index
First Unique Character	Frequency Array	c - 'a' as index
Pangram Check	Boolean Array/Bitmask	c - 'a' for bit position
String Compression	Counting	Character comparison
Group Anagrams	Hashing/Sorting	Counting sort with ASCII
Isomorphic Strings	Mapping	ASCII as array index
Rabin-Karp	Rolling Hash	c - 'a' + 1 in hash
Trie Operations	Prefix Tree	c - 'a' for children index
Caesar Cipher	Modular Arithmetic	Shift & wrap using ASCII
Alien Dictionary	Topological Sort	c - 'a' as graph node
Key Takeaway: ASCII values let us map characters to array indices in O(1) time, avoiding the overhead of HashMaps and enabling space-efficient solutions using fixed-size arrays (26 or 128).






ascii value of alphabet and use in dsa

Ask followup…




Inputs are processed by third-party AI and responses may be inaccurate.

