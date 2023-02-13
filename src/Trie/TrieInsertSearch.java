package Trie;

/*
Trie is an efficient information retrieval data structure. Use this data structure to store Strings and search strings.
Your task is to use TRIE data structure and search the given string A. If found print 1 else 0.

Example 1:

Input:
N = 8
key[] = {the,a,there,answer,any,by,
         bye,their}
search = the
Output: 1
Explanation: the is present in the given
string "the a there answer any by bye
their"
 */
public class TrieInsertSearch {

    public static void main(String[] args) {

//      //  int  N = 8;
//        String key[] = {the,a,there,answer,any,by, bye,their};
//
//        TrieNode root = new TrieNode();
//
//
//     insert(N,key);
    }

    static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }

        }
    };


    public static void insert(TrieNode root, String key){
        for(int i =0; i<key.length();i++){
            int index = key.charAt(i) -'a';
            if(root.children[index]==null){
                root.children[index]=new TrieNode();
            }
            root = root.children[index];
        }

        root.isEndOfWord=true;
    }

    public static boolean search(TrieNode root, String key){
        for(int  i   =0; i < key.length();i++){
            int index = key.charAt(i) -'a';
            root = root.children[index];
            if(root==null){
                return Boolean.FALSE;
            }
        }
        return root.isEndOfWord;
    }
}
