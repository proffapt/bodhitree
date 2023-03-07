import threading
import time
from concurrent.futures import ThreadPoolExecutor

def func(s):
    time.sleep(s)
    print(f'slept for {s} seconds')
    return s*69

# Normal way - total time taken = 8 seconds
'''
func(3)
func(4)
func(1)
'''

def manual_multi_threading():
    t1 = threading.Thread(target=func, args=[3])
    t2 = threading.Thread(target=func, args=[4])
    t3 = threading.Thread(target=func, args=[1])

    t1.start()
    t2.start()
    t3.start()

    t1.join()
    t2.join()
    t3.join()
    '''
        Without joining, the interpreter won't stop for the threads to return and will continue to the next 
        section of the code

        So basically, without join - heheh will be printed first and others later.
    '''
    print('heheh')

# A better syntax Multiple Threads via Thread Pool
'''
    Handles all shit for creating threads, starting and joining them
'''
def pool_without_map():
    with ThreadPoolExecutor() as executor:
        future = executor.submit(func, 3)
        print(future.result())
        future = executor.submit(func, 4)
        print(future.result())
        future = executor.submit(func, 1)
        print(future.result())

# BEST SYNTAX FOR AUTOMATED MULTI THREADING
with ThreadPoolExecutor() as executor:
    l = [3, 4, 1]
    future = executor.map(func, l)
    for result in future:
        print(result)
