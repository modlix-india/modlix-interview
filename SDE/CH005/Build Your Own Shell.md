# Challenge: Build Your Own Shell

## Problem Statement
A shell is a command-line interface that allows users to execute commands, run programs, and manage processes. Your task is to build a simplified POSIX-compliant shell.

You can use external libraries to create this. Example spring shell or similar ones. Your shell should read user input, parse commands, and execute them correctly.

## Requirements

### Core Features
Implement a read-eval-print loop (REPL) to continuously take user input.

### Built-in Commands
Implement at least the following built-in commands:

- `help`: Should list all commands and their description with usages
- `cd <directory>`: Change directory
- `pwd`: Print current directory
- `ls`: List all files and directory
- `echo <text>`: Print text to stdout
- `type <file>`: Print the type of file
- `exit`: Terminate the shell

### Error Handling
- Handle invalid commands
- Prevent crashes from incorrect input

## Example Session

Input & Output:
```shell
$ pwd
/home/user

$ cd /usr
$ pwd
/usr

$ echo "Hello, World!"
Hello, World!

$ ls
(total files and directories displayed)

$ invalidcommand
shell: command not found: invalidcommand

$ exit
Goodbye!
```

## Constraints & Assumptions
- You can use external libraries for command execution
- The shell should handle multiple words in commands (e.g., `ls /home/user`)

## Bonus Challenges (Optional)
1. Handle relative paths in cd command
2. Handle SIGINT (Ctrl+C) gracefully without terminating the shell immediately
3. Add some sort of command completion