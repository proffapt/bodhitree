import os

print("Current working dir:", os.getcwd())
os.chdir("/Users/proffapt/sandbox/")
print("Current working dir:", os.getcwd())
print("Contents of sandbox:", os.listdir("/Users/proffapt/sandbox/"))
if (not os.path.exists("/Users/proffapt/sandbox/os_dir")):
    os.mkdir("/Users/proffapt/sandbox/os_dir")
    # os.mkdir("~/sandbox/os_dir") #-> Won't work, because ~ won't expand here!

print("Contents of sandbox:", os.listdir("/Users/proffapt/sandbox/"))
os.rename("/Users/proffapt/sandbox/os_dir", "/Users/proffapt/sandbox/osdir")
print("Contents of sandbox:", os.listdir("/Users/proffapt/sandbox/"))
os.rmdir("/Users/proffapt/sandbox/osdir")
print("Contents of sandbox:", os.listdir("/Users/proffapt/sandbox/"))
