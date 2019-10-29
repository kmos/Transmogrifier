# Transmogrifier

Transmogrifier - Java NIO and Non-Blocking IO: Course [created by Dr. kabutz](https://javaspecialists.teachable.com/p/java-nio-and-non-blocking-io-with-the-transmogrifier-and-design-patterns)

## Idea

The repository is created with the purpose to have a place where I can put my progress and practices of course. The main idea is to organize Chapters in branches.

## Topic

The Course starts with an introduction on the "old" Java.IO works by writing three different servers.

Then the idea is to move over to Java.NIO, which stands for "New IO", not as most people think "Non-blocking IO". The first example uses a blocking Java.NIO server, to show this.

After learn a polling non-blocking Java.NIO server, which consumes a lot of CPU, but is able to support more sockets than the blocking varieties.

Finally, the course show two slightly different non-blocking servers using the Selector to react to events that might happen on our sockets. 

## Index

1. [Welcome](http://)
2. Single-threaded Blocking Server With Old Java.IO
3. Multi-Threaded Blocking Server
4. ExecutorService Blocking Service
5. Java NIO Blocking Server with Channels
6. Polling Non-Blocking Server
7. Non-Blocking Server with Selector
8. Work-Pool for Transmogrifying

## Dependencies

* [openjdk9](https://openjdk.java.net/projects/jdk9/)
* [Maven](https://maven.apache.org/)

## Author

* **Giovanni Panice** - *BMC Software* - [mosfet.io](https://mosfet.io)

