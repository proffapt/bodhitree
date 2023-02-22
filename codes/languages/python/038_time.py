import time

start = time.time() # Gives the seconds since epoch till the time of execution of it
'''
    EPOCH = 1 January 1970
'''
print(f'Current time is {start}')
for i in range(50000):
    print(i)
end = time.time()
print(f'Time take by for loop = {end} - {start} = {end - start} seconds')

time.sleep(5) # sleeps for 5 seconds obviously
print("Up after 5 seconds")

# And yes, TIME FORMATTING
l_time = time.localtime()
print(l_time)
fmt_time = time.strftime("%Y-%m-%d") # CASE SENSITIVE!
print(fmt_time)
