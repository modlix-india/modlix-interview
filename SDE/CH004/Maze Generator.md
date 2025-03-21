# Challenge: Maze Generator

## Problem Statement

You need to implement a program that generates a random maze of size N × M, where N is the number of rows and M is the number of columns. The maze should have:
- Walls (#) and open paths (.)
- A single entrance and a single exit
- A solvable path from the entrance to the exit

## Requirements

The program should take N (rows) and M (columns) as input.
Generate a randomized maze with only one solution.

The maze should have:
- `#` for walls
- `.` for open paths
- `S` for the start (top-left)
- `E` for the exit (bottom-right)

Output the maze in a grid-like format.

## Example Usage

### Input
N = 7, M = 7

### Possible Maze Output
<div style="text-align: left;">
<pre>
#######
#S...##
#.###.#
#.#...#
#.#####
#....E#
#######
</pre>
</div>
(Here, S is the start, E is the exit, # are walls, and . are open paths.)

## Output Format

The maze should be printable in a simple text-based format.

## Constraints

- The maze must be solvable (at least one valid path from S to E)
- N and M are odd numbers (5 ≤ N, M ≤ 101) to ensure proper walls
- No external maze-generation libraries allowed

## Bonus Challenges (Optional)

1. Use DFS (Depth-First Search) or Prim's algorithm to generate the maze
2. Add a solver function to find the shortest path