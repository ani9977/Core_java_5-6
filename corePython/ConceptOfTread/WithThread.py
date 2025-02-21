# import threading
# #from WithoutThreading import *
#
# def hello():
#     for i in range(15):
#         print("Hello", i)
#
#
# def hi():
#     for i in range(15):
#         print("hi", i)
#
# t1 = threading.Thread(target=hello)
# t2 = threading.Thread(target=hi)
#
# t1.start()
# t2.start()


import threading

def hello():
    for i in range(15):
        print("Hello", i)

def hi():
    for i in range(15):
        print("hi", i)

# Create threads
hello_thread = threading.Thread(target=hello)
hi_thread = threading.Thread(target=hi)

# Start threads
hello_thread.start()
hi_thread.start()

# Main thread continues without waiting for the other threads to complete
print("\nThreads started\n")