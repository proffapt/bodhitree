'''
    Async is neither multithreading nor mutliprocessing
    It is rather a method via which we can run our code concurrently.
    In this, the code doesn't wait for some subrocess to complete.
'''
import time
import asyncio

# def function(s):
async def function(s):
    # time.sleep(s) 
    await asyncio.sleep(s) # For seeing the effects of task
    print(f'slept for {s} seconds')
    return s

# Normal Way - Without async - Total time taken = 7 seconds
'''
function(4)
function(2)
function(1)
'''

# Async functions
'''
async def main():
    await function(4)
    await function(2)
    await function(1)

asyncio.run(main())
'''
# This will change nothing from previous, will still run one by one
# Then how to?? - Via creating task

'''
    A task will run whenever it gets time to run
    That is when the function with argument 4 will be running, then obviously 
    the one with argument 2 will get time to run as well.
'''
async def tasker():
    task = asyncio.create_task(function(2))
    await function(4)
    await function(1)

asyncio.run(tasker())

# Yet another method - A lot better way
'''
    Will call every function one by one, without waiting for the others to stop before calling the next.
'''
async def gather():
    L = await asyncio.gather(
        function(4),
        function(2),
        function(1),
    )
    print(L)

asyncio.run(gather())
