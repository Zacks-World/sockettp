# Java Socket Programming

Welcome to the **Java Socket Programming** repository! This repository contains educational materials and practical examples for understanding and implementing socket programming in Java. The content includes both theoretical explanations and hands-on exercises.

## 📄 Contents

### 1. Course Material
- **Introduction to Socket Programming**:
  - Overview of sockets and how they enable communication over a network.
  - Explanation of `Socket` and `ServerSocket` classes in Java.
  - Methods for data transmission between a client and a server.

- **Core Concepts**:
  - Creating a simple client-server application.
  - Handling multiple clients with threading.
  - Implementing data transfer protocols using input/output streams.

### 2. Practical Exercises
#### **Exercise 1**: Magic Number Game
Develop a Java-based game where:
1. The server generates a **magic number** (random number between 0 and 100).
2. Clients attempt to guess the number by sending their guesses to the server.
3. The server responds to each guess, indicating if it is too high or too low.
4. The game continues until a client guesses the correct number.

#### **Exercise 2**: Multi-Client File Server
Build a simple file server that supports multiple clients simultaneously:
1. **Server Functionality**:
   - Listen for incoming connections on a specific port.
   - Handle multiple clients concurrently using threads.
2. **Client Functionality**:
   - Connect to the server and request a specific file.
   - Receive the file content if it exists; otherwise, handle errors gracefully.
3. **File Handling**:
   - The server verifies the existence of requested files.
   - If a file exists, its content is sent to the client via output streams.

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later.
- Basic understanding of Java programming and networking concepts.

### Running the Examples
1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/Java-Socket-Programming.git
