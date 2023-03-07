# Process v/s Threads
'''
    Threads are lightweight.
    Threads are inside a Process itself.
'''
import multiprocessing
import time
from concurrent.futures import ProcessPoolExecutor

def func(s):
    time.sleep(s)
    print(f'slept for {s} seconds')
    return 2+s

if __name__ == "__main__": # Very important for creating new processes
    def multiprocessing_without_pool():
        p1 = multiprocessing.Process(target=func, args=[3])
        p2 = multiprocessing.Process(target=func, args=[4])
        p3 = multiprocessing.Process(target=func, args=[1])

        p1.start()
        p2.start()
        p3.start()

    with ProcessPoolExecutor() as executor:
        l = [3, 4, 1]
        future = executor.map(func, l)
        for result in future:
            print(result)

# The syntax and idea is exactly same as of MULTITHREADING, except the line #15
