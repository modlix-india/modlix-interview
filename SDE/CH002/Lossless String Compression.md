# Challenge: Lossless String Compression

## Problem Statement

You need to implement a program that compresses a given input string losslessly and then decompresses it back to its original form.

## Requirements

- Write a function to compress a string.
- Write another function to decompress the compressed output.
- Ensure that decompress(compress(s)) == s for all valid inputs.
- The compression should be lossless, meaning no data should be lost.

## Constraints

- The input string will contain only alphanumeric characters (a-z, A-Z, 0-9).
- The implementation should not use standard compression libraries.
- The solution should work efficiently for large strings (100,000+ characters).

## Bonus Challenges (Optional)

1. Support Unicode characters. I.e. input string can contain any Unicode characters.
2. Implement a different lossless compression algorithm (e.g., Huffman coding).