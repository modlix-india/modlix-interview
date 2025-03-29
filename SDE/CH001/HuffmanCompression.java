import java.util.*;



class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class HuffmanCompression {
    private static Map<Character, String> huffmanCodes = new HashMap<>();
    private static HuffmanNode root;

    public static String compress(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll(), right = pq.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.freq + right.freq);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        root = pq.poll();
        buildHuffmanCodes(root, "");
        StringBuilder compressed = new StringBuilder();
        for (char ch : s.toCharArray()) {
            compressed.append(huffmanCodes.get(ch));
        }
        return compressed.toString();
    }

    private static void buildHuffmanCodes(HuffmanNode node, String code) {
        if (node == null) return;
        if (node.ch != '\0') {
            huffmanCodes.put(node.ch, code);
        }
        buildHuffmanCodes(node.left, code + "0");
        buildHuffmanCodes(node.right, code + "1");
    }

    public static String decompress(String compressed) {
        StringBuilder decompressed = new StringBuilder();
        HuffmanNode current = root;
        for (char bit : compressed.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;
            if (current.left == null && current.right == null) {
                decompressed.append(current.ch);
                current = root;
            }
        }
        return decompressed.toString();
    }

    public static void main(String[] args) {
        String testStr = "hello 😊 world 😊😊😊";
        String compressedStr = compress(testStr);
        String decompressedStr = decompress(compressedStr);
        System.out.println("Original: " + testStr);
        System.out.println("Compressed: " + compressedStr);
        System.out.println("Decompressed: " + decompressedStr);
        assert decompressedStr.equals(testStr);
    }
}
